package com.keroles.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Intent i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i2=getIntent();
        String un=i2.getStringExtra("user_name");
        Toast.makeText(MainActivity2.this,un,Toast.LENGTH_SHORT).show();
    }
}