package com.superOOP.collection_;

import java.util.ArrayList;

/**
 * @author mzm
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("曼城第一！最新足坛俱乐部排名，最大黑马进前五，大巴黎第八"));
        arrayList.add(new News("恭喜张康阳！国米高管集体发声！短短9字球迷感动，共渡2.7亿危机"));

        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            News news = (News) arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
    }
    // 写一个方法处理新闻标题
    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }
        if (title.length() > 15) {
            return title.substring(0, 15) + "..."; // [ 0 , 15 )
        } else {
            return title;
        }
    }
}
class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}