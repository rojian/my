package pers.weixindemo.entity.response;

/**
 * ClassName: RespTextMessage
 * @Description: 回复微信文本消息对象
 * @author JackyRowe
 * @date 2017/10/23
 */
public class RespTextMessage extends RespBaseMessage{
    //是（表示是否必须）  回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
    private String Content;

    public RespTextMessage() {
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
