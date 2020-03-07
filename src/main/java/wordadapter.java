package com.example.android.kerala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;



import java.util.ArrayList;

public class wordadapter extends ArrayAdapter<com.example.android.kerala.word>{

    public wordadapter(Activity context, ArrayList<com.example.android.kerala.word>words){
        super(context,0,words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView =convertView;
        if(listItemView==null) {
            listItemView= LayoutInflater.from(getContext()).inflate
                    (R.layout.list_item,parent,false);
        }

        // Get the {@link Word} object located at this position in the list
        com.example.android.kerala.word currentWord = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView tourismTextView = (TextView) listItemView.findViewById(R.id.tourism_placename);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        tourismTextView.setText(currentWord.getMtourismPlacename());

        // Find the ImageView in the list_item.xml layout with the ID image.

        // Set the ImageView to the image resource specified in the current Word

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.tourism_image);
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        imageView.setImageResource(currentWord.getImageResourceId());
        return listItemView;

        ListView listsview=(ListView) listItemView.findViewById(R.id.tourism_layout);
        listsview.setText(currentWord.getMtourismdiscription());
        return listItemView;
    }
    }

