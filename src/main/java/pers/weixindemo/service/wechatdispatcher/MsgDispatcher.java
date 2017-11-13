package pers.weixindemo.service.wechatdispatcher;

import pers.weixindemo.entity.Article;
import pers.weixindemo.entity.response.RespNewsMessage;
import pers.weixindemo.entity.response.RespTextMessage;
import pers.weixindemo.util.wechat.WeChatMessageUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * ClassName: MsgDispatcher
 * @Description: 微信消息业务处理分发器
 * @author JackyRowe
 * @date 2017/10/23
 */
public class MsgDispatcher {
    public static String processMessage(Map<String, String> map) {
        String openid=map.get("FromUserName"); //用户 openid
        String mpid=map.get("ToUserName");   //公众号原始 ID

        if (map.get("MsgType").equals(WeChatMessageUtil.REQ_MESSAGE_TYPE_TEXT)) { // 文本消息
            //普通文本消息
            RespTextMessage txtmsg=new RespTextMessage();
            txtmsg.setToUserName(openid);
            txtmsg.setFromUserName(mpid);
            txtmsg.setCreateTime(String.valueOf(new Date().getTime()).substring(0,10));
            txtmsg.setMsgType(WeChatMessageUtil.RESP_MESSAGE_TYPE_TEXT);
            String content=map.get("Content");   //内容
            if("1".equals(content)){
                txtmsg.setContent("你好，你发送的内容是 1！");
            }else if("2".equals(content)){
                txtmsg.setContent("你好，你发送的内容是 2！");
            }else if("3".equals(content)){
                txtmsg.setContent("你好，你发送的内容是 3！");
            }else{
                txtmsg.setContent("你好，这里是罗健开发测试账号！");
            }
            System.out.println("==============这是文本消息！");
            return WeChatMessageUtil.textMessageToXml(txtmsg);

        }

        if (map.get("MsgType").equals(WeChatMessageUtil.REQ_MESSAGE_TYPE_IMAGE)) { // 图片消息
            //普通文本消息
            RespNewsMessage newsmsg=new RespNewsMessage();
            newsmsg.setToUserName(openid);
            newsmsg.setFromUserName(mpid);
            newsmsg.setCreateTime(String.valueOf(new Date().getTime()).substring(0,10));
            newsmsg.setMsgType(WeChatMessageUtil.RESP_MESSAGE_TYPE_NEWS);
            Article respArticle=new Article();
            respArticle.setDescription("微信项目开发结构");
            respArticle.setPicUrl("http://res.cuiyongzhi.com/2016/03/201603086749_6850.png");
            respArticle.setTitle("图文消息");
            respArticle.setUrl("http://www.cuiyongzhi.com");
            List<Article> newsmsglist=new ArrayList<Article>();
            newsmsglist.add(respArticle);
            newsmsg.setArticles(newsmsglist);
            newsmsg.setArticleCount(String.valueOf(newsmsglist.size()));
            System.out.println("==============这是图片消息！回复图文消息！");
            return WeChatMessageUtil.newsMessageToXml(newsmsg);
        }

        if (map.get("MsgType").equals(WeChatMessageUtil.REQ_MESSAGE_TYPE_LINK)) { // 链接消息
            System.out.println("==============这是链接消息！");
        }

        if (map.get("MsgType").equals(WeChatMessageUtil.REQ_MESSAGE_TYPE_LOCATION)) { // 位置消息
            System.out.println("==============这是位置消息！");
        }

        if (map.get("MsgType").equals(WeChatMessageUtil.REQ_MESSAGE_TYPE_VIDEO)) { // 视频消息
            System.out.println("==============这是视频消息！");
        }

        if (map.get("MsgType").equals(WeChatMessageUtil.REQ_MESSAGE_TYPE_VOICE)) { // 语音消息
            System.out.println("==============这是语音消息！");
        }

        return null;
    }
}
