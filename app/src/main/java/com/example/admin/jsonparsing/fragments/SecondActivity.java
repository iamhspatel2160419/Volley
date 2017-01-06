package com.example.admin.jsonparsing.fragments;

import android.app.*;

import android.content.Intent;

import android.os.Bundle;

import com.example.admin.jsonparsing.R;

public class SecondActivity extends Activity {

    SecondFragment secondFragment;
    android.app.FragmentManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        manager=getFragmentManager();
        secondFragment= (SecondFragment) manager.findFragmentById(R.id.fragment2);

        secondFragment.setData(message);


    }
}
