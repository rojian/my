package pers.weixindemo.entity.request;

/**
 * ClassName: ReqImageMessage
 * @Description: 接收微信图片消息对象
 * @author JackyRowe
 * @date 2017/10/12
 */
public class ReqImageMessage extends ReqBaseMessage {
    //图片链接（由系统生成）
    private String PicUrl;
    //图片消息媒体id，可以调用多媒体文件下载接口拉取数据
    private String MediaId;

    public ReqImageMessage() {
    }

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
