package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Frame_Layout extends AppCompatActivity {

    private Button fnext,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        fnext=findViewById(R.id.f_next);
        home=findViewById(R.id.f_home);

        fnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Frame_Layout.this, "Back Home ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Frame_Layout.this,MainActivity.class));
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Frame_Layout.this, "Back Home", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Frame_Layout.this,MainActivity.class));
            }
        });


    }
}