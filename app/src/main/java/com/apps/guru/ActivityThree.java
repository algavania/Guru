package com.apps.guru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_one);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Isi Jurnal Santri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_keyboard_backspace_green_24dp));

        // Kelompok Belajar
        Spinner dropdown = findViewById(R.id.spinner_kelompokBelajarJurnal);
        String[] items = new String[]{"Umar Bin Khattab", "Lorem ipsum", "Dolor sit amet"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        // Nama Santri
        Spinner dropdown_two = findViewById(R.id.spinner_namaSantriJurnal);
        String[] items_two = new String[]{"Danil Arya", "Lorem Ipsum", "Dolor Sit Amet"};
        ArrayAdapter<String> adapter_two = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items_two);
        dropdown_two.setAdapter(adapter_two);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), ActivityTwo.class);
        startActivity(myIntent);
        finish();
        return true;
    }
}
