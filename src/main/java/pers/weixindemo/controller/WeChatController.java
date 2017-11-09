package pers.weixindemo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pers.weixindemo.util.wechat.WeChatSiguUtil;
import pers.weixindemo.util.wechat.WeChatMessageUtil;
import pers.weixindemo.service.wechatdispatcher.EventDispatcher;
import pers.weixindemo.service.wechatdispatcher.MsgDispatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

/**
 * ClassName: WeixinController
 * @Description: 微信控制器
 * @author JackyRowe
 * @date 2017/10/12
 */
@Controller
@RequestMapping("/wechat")
public class WeChatController {
    private static Logger logger = Logger.getLogger(WeChatController.class);

    /**
     * @Description: 用于接收 get 参数，返回验证参数
     * @param @param request
     * @param @param response
     * @param @param signature
     * @param @param timestamp
     * @param @param nonce
     * @param @param echostr
     * @author JackyRowe
     * @date 2017/10/13
     */
    @RequestMapping(value = "/security", method = RequestMethod.GET)
    public void loginYangzhengGet(
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam(value = "signature", required = true) String signature,
            @RequestParam(value = "timestamp", required = true) String timestamp,
            @RequestParam(value = "nonce", required = true) String nonce,
            @RequestParam(value = "echostr", required = true) String echostr) {
        try {
            if (WeChatSiguUtil.checkSignature(signature, timestamp, nonce)) {
                PrintWriter out = response.getWriter();
                out.print(echostr);
                out.close();
            } else {
                logger.info("这里存在非法请求！");
            }
        } catch (Exception e) {
            logger.error(e, e);
        }
    }

    /**
     * @Description: 用于接收 post 参数
     * @param @param request
     * @param @param response
     * @author JackyRowe
     * @date 2017/10/13
     */
    @RequestMapping(value = "security", method = RequestMethod.POST)
    public void DoPost(HttpServletRequest request,HttpServletResponse response) {
        try{
            Map<String, String> map=WeChatMessageUtil.parseXml(request);
            String msgtype=map.get("MsgType");
            if(WeChatMessageUtil.REQ_MESSAGE_TYPE_EVENT.equals(msgtype)){
                 EventDispatcher.processEvent(map); //进入事件处理
            }else{
                String respMessage = MsgDispatcher.processMessage(map); //进入消息处理
                response.setCharacterEncoding("utf-8");
                PrintWriter out = response.getWriter();
                out.print(respMessage);
                out.flush();
                out.close();
            }
        }catch(Exception e){
            logger.error(e,e);
        }
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        System.out.println("这是 测试 方法！");
        return "login";
    }
}


