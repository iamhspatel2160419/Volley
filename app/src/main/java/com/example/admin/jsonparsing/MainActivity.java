package com.example.admin.jsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String JSON_URL = "http://froggymails.com/andpract/userlist_view.php";

    private Button buttonGet;

    private ListView listView;

    private ImageLoader mImageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGet = (Button) findViewById(R.id.buttonGet);
        buttonGet.setOnClickListener(this);
        listView = (ListView) findViewById(R.id.listView);
    }



    private void sendRequest() {
        StringRequest stringRequest = new StringRequest(Request.Method.POST,JSON_URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        showJSON(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.getMessage()/*"Error"*/, Toast.LENGTH_LONG).show();
                        error.printStackTrace();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String json) {
        ParseJSON pj = new ParseJSON(json);
        pj.parseJSON();
        CustomList users = new CustomList(this, ParseJSON.id, ParseJSON.name, ParseJSON.email, ParseJSON.image, ParseJSON.street,
                ParseJSON.area, ParseJSON.city, ParseJSON.postalCode, ParseJSON.callingNote, ParseJSON.mobileNo, ParseJSON.custStatus,
                ParseJSON.ipAddress, ParseJSON.regDate);
        listView.setAdapter(users);
    }

    @Override
    public void onClick(View v) {
        sendRequest();
    }
}