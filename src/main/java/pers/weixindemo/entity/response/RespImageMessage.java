package pers.weixindemo.entity.response;

import pers.weixindemo.entity.Image;

/**
 * ClassName: RespImageMessage
 * @Description: 回复微信图片消息对象
 * @author JackyRowe
 * @date 2017/10/23
 */
public class RespImageMessage extends RespBaseMessage{
    //是（表示是否必须）  图片
    private Image Image;

    public RespImageMessage() {
    }

    public Image getImage() {
        return Image;
    }

    public void setImage(Image image) {
        Image = image;
    }
}
