package android.carpior.blogreader;

public class BlogPost {
    public final String title;
    public final String url;
    public final String date;
    public final String author;

    public BlogPost(String title, String url, String date, String author) {
        this.title = title;
        this.url = url;
        this.date = date;
        this.author = author;
    }
}
