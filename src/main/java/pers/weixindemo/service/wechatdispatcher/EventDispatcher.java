package pers.weixindemo.service.wechatdispatcher;

import net.sf.json.JSONObject;
import pers.weixindemo.entity.Image;
import pers.weixindemo.entity.response.RespImageMessage;
import pers.weixindemo.util.wechat.HttpPostUploadUtil;
import pers.weixindemo.util.wechat.WeChatMessageUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: EventDispatcher
 * @Description: 事件消息业务分发器
 * @author JackyRowe
 * @date 2017/10/23
 */
public class EventDispatcher {
    public static String processEvent(Map<String, String> map) {
        String openid=map.get("FromUserName"); //用户 openid
        String mpid=map.get("ToUserName");   //公众号原始 ID

        if (map.get("Event").equals(WeChatMessageUtil.EVENT_TYPE_SUBSCRIBE)) { //关注事件
            RespImageMessage imgmsg = new RespImageMessage();
            imgmsg.setToUserName(openid);
            imgmsg.setFromUserName(mpid);
            imgmsg.setCreateTime(String.valueOf(new Date().getTime()).substring(0,10));
            imgmsg.setMsgType(WeChatMessageUtil.RESP_MESSAGE_TYPE_IMAGE);

            System.out.println("==============这是关注事件！");
            Image img = new Image();
            HttpPostUploadUtil util=new HttpPostUploadUtil();
            String filepath="H:\\1.jpg";
            Map<String, String> textMap = new HashMap<String, String>();
            textMap.put("name", "testname");
            Map<String, String> fileMap = new HashMap<String, String>();
            fileMap.put("userfile", filepath);
            String mediaidrs = util.formUpload(textMap, fileMap);
            System.out.println(mediaidrs);
            String mediaid= JSONObject.fromObject(mediaidrs).getString("media_id");
            img.setMediaId(mediaid);
            imgmsg.setImage(img);
            return WeChatMessageUtil.imageMessageToXml(imgmsg);
        }

        if (map.get("Event").equals(WeChatMessageUtil.EVENT_TYPE_UNSUBSCRIBE)) { //取消关注事件
            System.out.println("==============这是取消关注事件！");
        }

        if (map.get("Event").equals(WeChatMessageUtil.EVENT_TYPE_SCAN)) { //扫描二维码事件
            System.out.println("==============这是扫描二维码事件！");
        }

        if (map.get("Event").equals(WeChatMessageUtil.EVENT_TYPE_LOCATION)) { //位置上报事件
            System.out.println("==============这是位置上报事件！");
        }

        if (map.get("Event").equals(WeChatMessageUtil.EVENT_TYPE_CLICK)) { //自定义菜单点击事件
            System.out.println("==============这是自定义菜单点击事件！");
        }

        if (map.get("Event").equals(WeChatMessageUtil.EVENT_TYPE_VIEW)) { //自定义菜单 View 事件
            System.out.println("==============这是自定义菜单 View 事件！");
        }

        return null;
    }
}
