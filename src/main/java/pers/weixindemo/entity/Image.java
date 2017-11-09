package pers.weixindemo.entity;

/**
 * ClassName: Image
 * @Description: 图片
 * @author JackyRowe
 * @date 2017/11/09
 */
public class Image {
    //是（表示是否必须）  通过素材管理中的接口上传多媒体文件，得到的id。
    private String MediaId;

    public Image() {
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
