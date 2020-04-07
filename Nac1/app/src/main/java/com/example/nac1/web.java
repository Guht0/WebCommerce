package com.example.nac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView webmot = findViewById(R.id.webM);
        webmot.setWebViewClient(new WebViewClient());
        webmot.getSettings().setJavaScriptEnabled(true);
        webmot.loadUrl("https://www.webmotors.com.br/?gclid=CjwKCAjw4KD0BRBUEiwA7MFNTbvlMoR7Ez1CJNHdm1Fk-msWLLRysx31_4rZzRnwjrymktl4yP5tLxoCCeYQAvD_BwE&ef_id=CjwKCAjw4KD0BRBUEiwA7MFNTbvlMoR7Ez1CJNHdm1Fk-msWLLRysx31_4rZzRnwjrymktl4yP5tLxoCCeYQAvD_BwE:G:s&s_kwcid=AL!664!3!346649830018!p!!g!!web%20motors");

    }
}
