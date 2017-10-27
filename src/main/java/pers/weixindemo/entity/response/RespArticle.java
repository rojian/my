package pers.weixindemo.entity.response;

/**
 * ClassName: RespNewsMessage
 * @Description: 回复微信图文消息对象
 * @author JackyRowe
 * @date 2017/10/23
 */
public class RespArticle {
    //是  图文消息标题
    private String Title;
    //是	  图文消息描述
    private String Description;
    //是	  图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
    private String PicUrl;
    //是  点击图文消息跳转链接
    private String Url;

    public RespArticle() {
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

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
