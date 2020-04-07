package com.example.nac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Americanas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americanas);

        WebView american = findViewById(R.id.american);
        american.setWebViewClient(new WebViewClient());
        american.getSettings().setJavaScriptEnabled(true);
        american.loadUrl("https://www.americanas.com.br");
    }
}
