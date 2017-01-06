package com.example.admin.jsonparsing.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.jsonparsing.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends android.app.Fragment {

    TextView showData;

    public SecondFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view= inflater.inflate(R.layout.fragment_second, container, false);
        showData= (TextView) view.findViewById(R.id.showText);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
    public void setData(String data)
    {
        showData.setText(data);

    }
}
