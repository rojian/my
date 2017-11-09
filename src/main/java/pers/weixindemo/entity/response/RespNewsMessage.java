package pers.weixindemo.entity.response;

import pers.weixindemo.entity.Article;

import java.util.List;

/**
 * ClassName: RespNewsMessage
 * @Description: 回复微信多条图文消息对象
 * @author JackyRowe
 * @date 2017/10/23
 */
public class RespNewsMessage extends RespBaseMessage{
    //是（表示为是否必须）	  图文消息个数，限制为8条以内
    private String ArticleCount;
    //是	  多条图文消息信息，默认第一个item为大图,注意，如果图文数超过8，则将会无响应
    private List<Article> Articles;

    public RespNewsMessage() {
    }

    public String getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(String articleCount) {
        ArticleCount = articleCount;
    }

    public List<Article> getArticles() {
        return Articles;
    }

    public void setArticles(List<Article> articles) {
        Articles = articles;
    }
}
