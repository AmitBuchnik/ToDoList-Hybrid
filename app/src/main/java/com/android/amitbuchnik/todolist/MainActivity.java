package com.android.amitbuchnik.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView.setWebContentsDebuggingEnabled(true);
        WebView webView =  new WebView(this);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true); // allow local storage
        webSettings.setAllowUniversalAccessFromFileURLs(true); //allow ajax from file url
        webView.loadUrl("file:///android_asset/www/todolist.html");
        setContentView(webView);
    }
}
