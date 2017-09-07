package com.example.fragmentbasepractice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewContentActivity extends AppCompatActivity {
    public static void actionStart(Context context, String newsTitle, String newsContent) {
        Intent intent = new Intent();
        intent.putExtra("newsTitle", newsTitle);
        intent.putExtra("newsContent", newsContent);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_content_activity);
        String newsTitle = getIntent().getStringExtra("new_title");
        String newsContent = getIntent().getStringExtra("new_content");
        NewsContentFragment newsContentFragment = (NewsContentFragment) getSupportFragmentManager
                ().findFragmentById(R.id.news_content_fragment);
        newsContentFragment.refresh(newsTitle, newsContent);
    }
}
