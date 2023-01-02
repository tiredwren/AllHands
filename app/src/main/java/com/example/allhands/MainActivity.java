package com.example.allhands;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lstSearch;
    private EditText edtSearch;
    private ArrayAdapter<String> adapter;

    String data[]={
            "hello world",
            "goodbye"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstSearch=(ListView) findViewById(R.id.lstSearch);
        edtSearch=(EditText) findViewById(R.id.edtSearch);
        adapter=new ArrayAdapter<String>(this, R.layout.list_item, R.id.textView, data);
        lstSearch.setAdapter(adapter);
    }
}

