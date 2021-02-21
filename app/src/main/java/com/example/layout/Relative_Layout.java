package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Relative_Layout extends AppCompatActivity {

    private Button rnext,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        rnext=findViewById(R.id.r_next);
        home=findViewById(R.id.r_home);

        rnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Relative_Layout.this, "Linear Layout", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Relative_Layout.this, Linear_Layout.class));
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Relative_Layout.this, "Back Home", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Relative_Layout.this,MainActivity.class));
            }
        });
    }
}