package com.example.belajarlayout;

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
    public void Halaman2(View view) {
        Intent Intent = new Intent(MainActivity.this, belajarlayout2.class);
        startActivity(Intent);
    }
    public void Halaman3(View view) {
        Intent Intent = new Intent(MainActivity.this, belajarlayout3.class);
        startActivity(Intent);
    }
    public void Halaman4(View view) {
        Intent Intent = new Intent(MainActivity.this, taglayoutweight.class);
        startActivity(Intent);
    }
    public void RelLayout(View view) {
        Intent Intent = new Intent(MainActivity.this, relativelatout.class);
        startActivity(Intent);
    }
}
