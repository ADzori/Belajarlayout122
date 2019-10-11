package com.example.belajarlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class belajarlayout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajarlayout3);
    }
    public void Halaman1(View view) {
        Intent Intent = new Intent(belajarlayout3.this, MainActivity.class);
        startActivity(Intent);
    }
    public void Halaman2(View view) {
        Intent Intent = new Intent(belajarlayout3.this, belajarlayout2.class);
        startActivity(Intent);
    }
    public void Halaman4(View view) {
        Intent Intent = new Intent(belajarlayout3.this, taglayoutweight.class);
        startActivity(Intent);
    }
}
