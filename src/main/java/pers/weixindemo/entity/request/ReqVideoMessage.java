package pers.weixindemo.entity.request;

/**
 * ClassName: ReqVideoMessage
 * @Description: 接收微信小视频消息对象
 * @author JackyRowe
 * @date 2017/10/12
 */
public class ReqVideoMessage extends ReqBaseMessage {
    //视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String MediaId;
    //视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
    private String privateThumbMediaId;

    public ReqVideoMessage() {
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getPrivateThumbMediaId() {
        return privateThumbMediaId;
    }

    public void setPrivateThumbMediaId(String privateThumbMediaId) {
        this.privateThumbMediaId = privateThumbMediaId;
    }
}
