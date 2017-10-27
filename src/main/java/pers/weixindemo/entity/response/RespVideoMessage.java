package pers.weixindemo.entity.response;

/**
 * ClassName: RespVideoMessage
 * @Description: 回复微信视频消息对象
 * @author JackyRowe
 * @date 2017/10/23
 */
public class RespVideoMessage {
    //是（表示为是否必须） 通过素材管理中的接口上传多媒体文件，得到的id
    private String MediaId;
    //否  视频消息的标题
    private String Title;
    //否	  视频消息的描述
    private String Description;

    public RespVideoMessage() {
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
