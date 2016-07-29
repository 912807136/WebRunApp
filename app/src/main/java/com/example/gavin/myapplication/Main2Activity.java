package com.example.gavin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private  String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        string = getIntent().getDataString();

        initView();
    }

    private void initView() {
        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setText(string);
    }
}
