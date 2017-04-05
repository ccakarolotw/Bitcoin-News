package com.example.android.newsforthegeeks;

/**
 * Created by ftf-icn on 3/23/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        String title = currentNews.getmTitle();
        titleView.setText(title);

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        String dateObject = currentNews.getmDate();
        dateView.setText(dateObject.substring(0, 10));

        TextView sectionView= (TextView) listItemView.findViewById(R.id.section);
        String section=currentNews.getmSection();
        sectionView.setText(section);

        return listItemView;
    }
}

