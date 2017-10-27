package pers.weixindemo.entity.request;

/**
 * ClassName: ReqBaseMessage
 * @Description: 接收微信消息对象
 * @author JackyRowe
 * @date 2017/10/12
 */
public class ReqBaseMessage {
    //开发者微信号
    private String ToUserName;
    //发送方帐号（一个OpenID）
    private String FromUserName;
    //消息创建时间 （整型）
    private String CreateTime;
    //text、imgae、voice、shortvideo（小视频）、location（地理位置）、link（链接）
    private String MsgType;
    //消息id，64位整型
    private String MsgId;

    public ReqBaseMessage() {
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }
}
