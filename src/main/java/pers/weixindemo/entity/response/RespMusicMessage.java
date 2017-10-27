package pers.weixindemo.entity.response;

/**
 * ClassName: RespMusicMessage
 * @Description: 回复微信音乐消息对象
 * @author JackyRowe
 * @date 2017/10/23
 */
public class RespMusicMessage extends RespBaseMessage{
    //否（表示是否必须）  音乐标题
    private String Title;
    //否  音乐描述
    private String Description;
    //否  音乐链接
    private String MusicURL;
    //否  高质量音乐链接，WIFI环境优先使用该链接播放音乐
    private String HQMusicUrl;
    //是  缩略图的媒体id，通过素材管理中的接口上传多媒体文件，得到的id
    private String ThumbMediaId;

    public RespMusicMessage() {
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

    public String getMusicURL() {
        return MusicURL;
    }

    public void setMusicURL(String musicURL) {
        MusicURL = musicURL;
    }

    public String getHQMusicUrl() {
        return HQMusicUrl;
    }

    public void setHQMusicUrl(String HQMusicUrl) {
        this.HQMusicUrl = HQMusicUrl;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
