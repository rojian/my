package pers.weixindemo.entity.response;

/**
 * ClassName: RespImageMessage
 * @Description: 回复微信图片消息对象
 * @author JackyRowe
 * @date 2017/10/23
 */
public class RespImageMessage extends RespBaseMessage{
    //是（表示是否必须）  通过素材管理中的接口上传多媒体文件，得到的id。
    private String MediaId;

    public RespImageMessage() {
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
