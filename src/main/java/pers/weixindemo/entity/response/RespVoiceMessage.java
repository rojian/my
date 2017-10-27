package pers.weixindemo.entity.response;

/**
 * ClassName: RespVoiceMessage
 * @Description: 回复微信语音消息对象
 * @author JackyRowe
 * @date 2017/10/23
 */
public class RespVoiceMessage extends RespBaseMessage{
    //是（表示是否必须）  通过素材管理中的接口上传多媒体文件，得到的id
    private String MediaId;

    public RespVoiceMessage() {
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
