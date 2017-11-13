package pers.weixindemo.entity.menu;

/**
 * ClassName: EventDispatcher
 * @Description: 视图型菜单事件
 * @author JackyRowe
 * @date 2017/11/13
 */
public class ViewButton {
    private String type;
    private String name;
    private String url;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
