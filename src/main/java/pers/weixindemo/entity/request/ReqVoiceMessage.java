package pers.weixindemo.entity.request;

/**
 * ClassName: ReqVoiceMessage
 * @Description: 接收微信语音消息对象
 * @author JackyRowe
 * @date 2017/10/12
 */
public class ReqVoiceMessage extends ReqBaseMessage {
    //语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String MediaId;
    //语音格式，如amr，speex等
    private String Format;

    public ReqVoiceMessage() {
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }
}
