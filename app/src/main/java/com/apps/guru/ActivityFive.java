package com.apps.guru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class ActivityFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_three);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Detail Jurnal Santri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_keyboard_backspace_green_24dp));

    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), ActivityTwo.class);
        startActivity(myIntent);
        finish();
        return true;
    }
}
