package pers.weixindemo.entity.request;

/**
 * ClassName: ReqTextMessage
 * @Description: 接收微信文本消息对象
 * @author JackyRowe
 * @date 2017/10/12
 */
public class ReqTextMessage extends ReqBaseMessage {
    //文本消息内容
    private String Content;

    public ReqTextMessage() {
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
