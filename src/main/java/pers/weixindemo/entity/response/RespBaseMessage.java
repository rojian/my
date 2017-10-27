package pers.weixindemo.entity.response;

/**
 * ClassName: RespBaseMessage
 * @Description: 回复微信消息对象
 * @author JackyRowe
 * @date 2017/10/23
 */
public class RespBaseMessage {
    //是（表示为是否必须）  接收方帐号（收到的OpenID）
    private String ToUserName;
    //是  开发者微信号
    private String FromUserName;
    //是  消息创建时间 （整型）
    private String CreateTime;
    //是  text、imgae、voice、music、news、video
    private String MsgType;

    public RespBaseMessage() {
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

}

