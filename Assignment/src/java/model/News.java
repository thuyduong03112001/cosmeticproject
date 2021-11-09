package model;

public class News {
      private int newsId;
      private String title;
      private String content;

    public News() {
    }

    public News(int newsId, String title, String content) {
        this.newsId = newsId;
        this.title = title;
        this.content = content;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
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
      
}
