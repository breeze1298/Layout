package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Linear_Layout extends AppCompatActivity {

    Button lnext,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        lnext=findViewById(R.id.l_next);
        home=findViewById(R.id.l_home);
        lnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Linear_Layout.this, "Frame Layout", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Linear_Layout.this, Frame_Layout.class));
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Linear_Layout.this, "Back Home", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Linear_Layout.this,MainActivity.class));
            }
        });
    }
}