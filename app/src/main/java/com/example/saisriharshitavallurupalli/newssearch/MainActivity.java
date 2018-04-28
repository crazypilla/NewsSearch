package com.example.saisriharshitavallurupalli.newssearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String searchText="SEARCH_TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button search=(Button) findViewById(R.id.searchButton);
        final EditText text=(EditText) findViewById(R.id.searchText);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("searchText",text.getText().toString());

                goToPage(text.getText().toString());
            }
        });
    }
    public void goToPage(String text)
    {
        Intent newIntent=new Intent(this,SearchRes.class);
        newIntent.putExtra(searchText,text);
        startActivity(newIntent);
    }
}

