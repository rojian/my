package pers.weixindemo.util.wechat;

import net.sf.json.JSONObject;
import pers.weixindemo.util.PropertiesLoaderUtils;;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * ClassName: WeChatTask
 * @Description: 微信两小时定时任务体
 * @author JackyRowe
 * @date 2017/11/1
 */
public class WeChatTask {
    private static final String APPID= PropertiesLoaderUtils.getConfiguration("wechat.properties","appid");
    private static final String SECRET= PropertiesLoaderUtils.getConfiguration("wechat.properties","AppSecret");
    private static final String TOKENURL= PropertiesLoaderUtils.getConfiguration("interface_url.properties","tokenUrl");

    /**
     * @Description: 任务执行体
     * @param @throws Exception
     * @author JackyRowe
     * @date 2017/11/1
     */
    public void getToken_getTicket() throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("grant_type", "client_credential");
        params.put("appid", APPID);
        params.put("secret", SECRET);
        String jstoken = WeChatHttpUtils.sendGet(TOKENURL, params);
        // 获取到 token 并赋值保存
        String access_token = JSONObject.fromObject(jstoken).getString("access_token");
        PropertiesLoaderUtils.setConfiguration("wechat.properties","access_token",access_token);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"token 为=============================="+access_token);
    }

}