package com.example.foodmed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Food extends AppCompatActivity {
    WebView food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        food=findViewById(R.id.food);
        WebSettings webSettings = food.getSettings();
        webSettings.setJavaScriptEnabled(true);
        food.setWebViewClient(new call());
        food.loadUrl("https://www.medlife.com");
    }


    private class call extends WebViewClient {
            @Override
            public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
                return false;
            }
    }
}