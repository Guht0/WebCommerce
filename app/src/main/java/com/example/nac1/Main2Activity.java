package com.example.nac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.magazineluiza.com.br/?partner_id=974&gclid=CjwKCAjw4KD0BRBUEiwA7MFNTdauMbmSK2TPAHIrpDAcRRwLZCHQiQG9_zK9v3iKQSgzN1cdtim3ARoCOqAQAvD_BwE");

    }
}
