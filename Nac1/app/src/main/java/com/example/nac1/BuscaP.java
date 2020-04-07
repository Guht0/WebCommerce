package com.example.nac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BuscaP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_p);

        WebView buscan = findViewById(R.id.Buscando);
        buscan.setWebViewClient(new WebViewClient());
        buscan.getSettings().setJavaScriptEnabled(true);
        buscan.loadUrl("https://www.buscape.com.br/?og=19220&gclid=CjwKCAjw4KD0BRBUEiwA7MFNTVj6hnjJA1abnA-v3rTKrU9kBnhKkfnchih6tAuyCF6kQB9nBTlgVhoCHDYQAvD_BwE");
    }
}
