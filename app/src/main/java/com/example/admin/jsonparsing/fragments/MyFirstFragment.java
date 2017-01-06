package com.example.admin.jsonparsing.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.admin.jsonparsing.R;

///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link MyFirstFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link MyFirstFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class MyFirstFragment extends android.app.Fragment implements View.OnClickListener {

    Communicator communicator;
    EditText name;
    Button send;

    public MyFirstFragment() {
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        name= (EditText) view.findViewById(R.id.etName);
        send= (Button) view.findViewById(R.id.btnSend);
    return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        send.setOnClickListener(this);
    }
    public void setCoomunicator(Communicator coomunicator)
    {
        this.communicator=coomunicator;
    }

    @Override
    public void onClick(View v) {
        String n=name.getText().toString();
        this.communicator.shareToActivity(n);


    }
public interface Communicator
{
void shareToActivity(String s);

}
}
