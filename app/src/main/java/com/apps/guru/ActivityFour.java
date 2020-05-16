package com.apps.guru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

public class ActivityFour extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataSantriAdapter adapter;
    private ArrayList<DataSantri> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_two);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Data Jurnal Santri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_keyboard_backspace_green_24dp));

        addData();
        recyclerView = findViewById(R.id.recycler_dataSantri    );
        adapter = new DataSantriAdapter(arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ActivityFour.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        // Clickable Item List
        adapter.setOnItemClickListener(new DataSantriAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                arrayList.get(position);
                adapter.notifyItemChanged(position);
                if(position == 0){
                    Intent intent = new Intent(ActivityFour.this, ActivityFive.class);
                    startActivity(intent);
                }
            }
        });
    }

    void addData(){
        arrayList = new ArrayList<>();
        arrayList.add(new DataSantri("Danil Arya", "Umar Bin Khatab", "29/04/2020"));
        arrayList.add(new DataSantri("Lorem Ipsum", "Dolor sit amet", "00/00/2020"));
        arrayList.add(new DataSantri("Lorem Ipsum", "Dolor sit amet", "00/00/2020"));
        arrayList.add(new DataSantri("Lorem Ipsum", "Dolor sit amet", "00/00/2020"));
        arrayList.add(new DataSantri("Lorem Ipsum", "Dolor sit amet", "00/00/2020"));
        arrayList.add(new DataSantri("Lorem Ipsum", "Dolor sit amet", "00/00/2020"));
        arrayList.add(new DataSantri("Lorem Ipsum", "Dolor sit amet", "00/00/2020"));
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), ActivityTwo.class);
        startActivity(myIntent);
        finish();
        return true;
    }
}
