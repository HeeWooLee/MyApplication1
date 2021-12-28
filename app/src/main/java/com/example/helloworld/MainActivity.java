package com.example.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton1Clicked(View v) {
        Toast.makeText(this, "내 맴", Toast.LENGTH_LONG).show(); // Toast는 간단한 메세지를 잠깐 보여주는 역할을 수행한다.
    }

    public void onButton2Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }
    public void onButton3Clicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1230-1230"));
        startActivity(myIntent);
    }
}