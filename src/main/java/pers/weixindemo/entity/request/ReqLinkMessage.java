package pers.weixindemo.entity.request;

/**
 * ClassName: ReqLinkMessage
 * @Description: 接收微信链接消息对象
 * @author JackyRowe
 * @date 2017/10/12
 */
public class ReqLinkMessage extends ReqBaseMessage {
    //消息标题
    private String Title;
    //消息描述
    private String Description;
    //消息链接
    private String Url;

    public ReqLinkMessage() {
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

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
