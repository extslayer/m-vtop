package com.shreyxnsh.vtop;

import static androidx.databinding.DataBindingUtil.setContentView;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebVIew extends AppCompatActivity {
    private WebView webView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        // Enable JavaScript (if needed)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load the website URL
        webView.loadUrl("https://vtop.vitbhopal.ac.in/vtop/initialProcess");  // Replace with your website URL
    }

    // Handle back navigation within the WebView
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
