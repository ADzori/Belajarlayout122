package com.example.belajarlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class belajarlayout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajarlayout2);
    }
    public void Halaman1(View view) {
        Intent Intent = new Intent(belajarlayout2.this, MainActivity.class);
        startActivity(Intent);
    }
    public void Halaman3(View view) {
        Intent Intent = new Intent(belajarlayout2.this, belajarlayout3.class);
        startActivity(Intent);
    }
    public void Halaman4(View view) {
        Intent Intent = new Intent(belajarlayout2.this, taglayoutweight.class);
        startActivity(Intent);
    }
}
