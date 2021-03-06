package pers.weixindemo.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import pers.weixindemo.entity.menu.ClickButton;
import pers.weixindemo.entity.menu.ViewButton;
import pers.weixindemo.util.wechat.WeChatHttpUtils;

/**
 * ClassName: EventDispatcher
 * @Description: 自定义菜单的创建
 * @author JackyRowe
 * @date 2017/11/13
 */
public class MenuMain {
    public static void main(String[] args) {

        ClickButton cbt=new ClickButton();
        cbt.setKey("image");
        cbt.setName("回复图片");
        cbt.setType("click");

        ViewButton vbt=new ViewButton();
        vbt.setUrl("http://www.cuiyongzhi.com");
        vbt.setName("博客");
        vbt.setType("view");

        JSONArray sub_button=new JSONArray();
        sub_button.add(cbt);
        sub_button.add(vbt);

        JSONObject buttonOne=new JSONObject();
        buttonOne.put("name", "菜单");
        buttonOne.put("sub_button", sub_button);

        JSONArray button=new JSONArray();
        button.add(vbt);
        button.add(buttonOne);
        button.add(cbt);

        JSONObject menujson=new JSONObject();
        menujson.put("button", button);
        String m=menujson.toString();
        System.out.println(menujson);
        //这里为请求接口的 url   +号后面的是 token，这里就不做过多对 token 获取的方法解释
        String url="https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+
                "upeDW-2pWrHgLx3fGqgsvAvf-HkQBA--5uHOo9OW16uNdL9zNPnnuIN01UDFXh_5d-QdcnBxux9tXigFwm1z0SInbdkXEKa1pMhTqaZVxK7sCPj7421YQGI0v3evwiwiWALjAHASWH";

        try{
            String rs= WeChatHttpUtils.sendPostBuffer(url, menujson.toString());
            System.out.println(rs);
        }catch(Exception e){
            System.out.println("请求错误！");
        }

    }

}
