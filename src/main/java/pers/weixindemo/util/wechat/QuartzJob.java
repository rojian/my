package pers.weixindemo.util.wechat;


import org.apache.log4j.Logger;

/**
 * ClassName: QuartzJob
 * @Description: 任务执行获取 token
 * @author JackyRowe
 * @date 2017/11/1
 */
public class QuartzJob {
    private static Logger logger = Logger.getLogger(QuartzJob.class);
    /**
     * @Description: 任务执行获取 token
     * @param
     * @author JackyRowe
     * @date 2017/11/1
     */
    public void workForToken() {
        try {
            WeChatTask timer = new WeChatTask();
            timer.getToken_getTicket();
        } catch (Exception e) {
            logger.error(e, e);
        }
    }
}
