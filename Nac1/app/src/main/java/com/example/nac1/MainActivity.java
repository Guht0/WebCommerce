package com.example.nac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMalu(View view){
        Intent pagMalu = new Intent(this,Main2Activity.class);
        startActivity(pagMalu);
    }

    public void onWeb(View view){
        Intent pagWeb = new Intent(this,web.class);
        startActivity(pagWeb);
    }

    public void onAmerica(View view){
        Intent pagAmerica = new Intent(this,Americanas.class);
        startActivity(pagAmerica);
    }

    public void onBusca(View view){
        Intent pagBusca = new Intent(this,BuscaP.class);
        startActivity(pagBusca);
    }

    public void onSobre(View view){
        Intent pagSobre = new Intent(this,Sobre.class);
        startActivity(pagSobre);
    }

}
