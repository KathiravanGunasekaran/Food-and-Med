package com.example.foodmed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Medical extends AppCompatActivity {
    WebView medic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        medic=findViewById(R.id.medic);
        WebSettings webSettings= medic.getSettings();
        webSettings.setJavaScriptEnabled(true);
        medic.setWebViewClient(new Callback());
        medic.loadUrl("https://www.swiggy.com");

    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}