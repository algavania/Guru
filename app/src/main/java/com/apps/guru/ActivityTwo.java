package com.apps.guru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class ActivityTwo extends AppCompatActivity {

    RelativeLayout btn_isiJurnal;
    Button btn_dataJurnal, btn_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btn_isiJurnal = findViewById(R.id.btn_isiJurnal);
        btn_dataJurnal = findViewById(R.id.btn_dataJurnal);
        btn_detail = findViewById(R.id.btn_detail);

        // Click Listener
        btn_isiJurnal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this, ActivityThree.class);
                startActivity(intent);
            }
        });

        btn_dataJurnal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this, ActivityFour.class);
                startActivity(intent);
            }
        });

        btn_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this, ActivitySix.class);
                startActivity(intent);
            }
        });
    }
}
