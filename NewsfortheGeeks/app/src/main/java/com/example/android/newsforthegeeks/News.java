package com.example.android.newsforthegeeks;

public class News {
    private String mTitle;

    private String mDate;

    private String mUrl;

    private String mSection;

    public News(String title, String date, String url, String section) {
        mTitle = title;
        mDate = date;
        mUrl = url;
        mSection=section;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getmSection(){ return mSection;}


}
