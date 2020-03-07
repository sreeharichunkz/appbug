package com.example.android.kerala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class tourism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<com.example.android.kerala.word>  numbers= new ArrayList<com.example.android.kerala.word>();
        numbers.add(new com.example.android.kerala.word("Thekkadi",R.drawable.tourism_thekkadi,R.layout.activity_thekkadi));
        numbers.add(new com.example.android.kerala.word("Kovalam",R.drawable.kovalam_tourism,R.layout.activity_kovalam));
        numbers.add(new com.example.android.kerala.word("backwater",R.drawable.backwater_tourism,R.layout.activity_backwater));
        numbers.add(new com.example.android.kerala.word("munnar",R.drawable.munnar_tourism,R.layout.activity_munnar));
        numbers.add(new com.example.android.kerala.word("Bakel Fort",R.drawable.bakelfort_tourism,R.layout.activity_bakelfort));
        numbers.add(new com.example.android.kerala.word("Padmanaswamy Temple",R.drawable.padmanaswamy_tourism,R.layout.activity_padmanaswamy));
        numbers.add(new com.example.android.kerala.word("Wagamon",R.drawable.wagamon_tourism,R.layout.activity_wagamon));



        com.example.android.kerala.wordadapter Adapter = new com.example.android.kerala.wordadapter(this, numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);


    }
}