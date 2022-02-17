package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Vendas_Online extends AppCompatActivity {
    WebView wvwsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendas_online);
        wvwsite = (WebView) findViewById(R.id.WvWsite);
        wvwsite.setWebViewClient(new WebViewClient());
        wvwsite.loadUrl("http://10.0.2.2/conexão_web/");
        WebSettings webSettings = wvwsite.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (wvwsite.canGoBack()) {
            wvwsite.goBack();
        } else{
        super.onBackPressed();
    }}
}
