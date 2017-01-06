package com.example.admin.jsonparsing.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

import com.example.admin.jsonparsing.R;

public class FragmentActivity extends Activity implements MyFirstFragment.Communicator{


    MyFirstFragment myFirstFragment;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);


        manager=getFragmentManager();
        myFirstFragment= (MyFirstFragment) manager.findFragmentById(R.id.fragment1);

        myFirstFragment.setCoomunicator(this);




    }

    @Override
    public void shareToActivity(String s) {
        Toast.makeText(FragmentActivity.this, s+"", Toast.LENGTH_SHORT).show();
        Intent toActivity = new Intent(FragmentActivity.this,SecondActivity.class);
        toActivity.putExtra("message", s);
        startActivity(toActivity);
    }
}
