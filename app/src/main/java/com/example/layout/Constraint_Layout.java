package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Constraint_Layout extends AppCompatActivity {

    private Button cnext,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        cnext=findViewById(R.id.c_next);
        home=findViewById(R.id.c_home);

        cnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Constraint_Layout.this, "Relative Layout", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Constraint_Layout.this, Relative_Layout.class));
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Constraint_Layout.this, "Back Home", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Constraint_Layout.this,MainActivity.class));
            }
        });


    }
}