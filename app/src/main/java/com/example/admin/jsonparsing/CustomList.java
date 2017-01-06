package com.example.admin.jsonparsing;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

public class CustomList extends ArrayAdapter<String> {
    private String[] id;
    private String[] name;
    private String[] email;
    private String[] street;
    private String[] area;
    private String[] city;
    private String[] postalCode;
    private String[] callingNote;
    private String[] mobileNo;
    private String[] custStatus;
    private String[] ipAddress;
    private String[] regDate;
    private String[] imagePic;
    private Activity context;

    public CustomList(Activity context, String[] id, String[] name, String[] email, String[] imagePic, String[] street, String[] area, String[] city
    , String[] postalCode, String[] callingNote, String[] mobileNo, String[] custStatus, String[] ipAddress, String[] regDate) {
        super(context, R.layout.list_view_layout, id);
        this.context = context;
        this.id = id;
        this.name = name;
        this.email = email;
        this.imagePic = imagePic;
        this.street = street;
        this.area = area;
        this.city = city;
        this.postalCode = postalCode;
        this.callingNote = callingNote;
        this.mobileNo = mobileNo;
        this.custStatus = custStatus;
        this.ipAddress = ipAddress;
        this.regDate = regDate;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_view_layout, null, true);

        TextView Id = (TextView) listViewItem.findViewById(R.id.Id);
        TextView Name = (TextView) listViewItem.findViewById(R.id.Name);
        TextView Email = (TextView) listViewItem.findViewById(R.id.Email);
        ImageView ProfilePic = (ImageView) listViewItem.findViewById(R.id.ProfilePic);
        TextView Street = (TextView) listViewItem.findViewById(R.id.Street);
        TextView Area = (TextView) listViewItem.findViewById(R.id.Area);
        TextView City = (TextView) listViewItem.findViewById(R.id.City);
        TextView PostalCode = (TextView) listViewItem.findViewById(R.id.PostalCode);
        TextView CallingNote = (TextView) listViewItem.findViewById(R.id.CallingNote);
        TextView MobileNo = (TextView) listViewItem.findViewById(R.id.MobileNo);
        TextView CustomerStatus = (TextView) listViewItem.findViewById(R.id.CustomerStatus);
        TextView IPAddress = (TextView) listViewItem.findViewById(R.id.IPAddress);
        TextView RegDate = (TextView) listViewItem.findViewById(R.id.RegDate);

        Id.setText(id[position]);
        Name.setText(name[position]);
        Email.setText(email[position]);
        ProfilePic.setImageDrawable(Drawable.createFromPath(imagePic[position]));
        Street.setText(street[position]);
        Area.setText(area[position]);
        City.setText(city[position]);
        PostalCode.setText(postalCode[position]);
        CallingNote.setText(callingNote[position]);
        MobileNo.setText(mobileNo[position]);
        CustomerStatus.setText(custStatus[position]);
        IPAddress.setText(ipAddress[position]);
        RegDate.setText(regDate[position]);


        return listViewItem;
    }
}