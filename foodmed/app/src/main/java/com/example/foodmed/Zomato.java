package com.example.foodmed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Zomato extends AppCompatActivity {
    WebView zomato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zomato);
        zomato=findViewById(R.id.zomato);
        WebSettings webSettings=zomato.getSettings();
        webSettings.setJavaScriptEnabled(true);
        zomato.setWebViewClient(new calls());
        zomato.loadUrl("https://www.zomato.com");
    }

    private class calls extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false ;

        }
    }
}