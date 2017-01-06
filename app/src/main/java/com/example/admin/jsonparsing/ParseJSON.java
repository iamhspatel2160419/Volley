package com.example.admin.jsonparsing;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ParseJSON {
    public static String[] id;
    public static String[] name;
    public static String[] email;
    public static String[] image;
    public static String[] street;
    public static String[] area;
    public static String[] city;
    public static String[] postalCode;
    public static String[] callingNote;
    public static String[] mobileNo;
    public static String[] custStatus;
    public static String[] ipAddress;
    public static String[] regDate;


    public static final String JSON_OBJECT = null;
    public static final String KEY_ID = "trc_id";
    public static final String KEY_NAME = "trc_full_name";
    public static final String KEY_EMAIL = "trc_email";
    public static final String KEY_IMAGE = "trc_profile_pic";
    public static final String KEY_STREET = "trc_address";
    public static final String KEY_AREA = "trc_address1";
    public static final String KEY_CITY = "trc_city";
    public static final String KEY_POSTAL_CODE = "trc_postcode";
    public static final String KEY_CALLING_NOTE = "trc_calling_note";
    public static final String KEY_MOBILE_NO = "trc_mobile_no";
    public static final String KEY_CUST_STATUS = "trc_cust_status";
    public static final String KEY_IP_ADDRESS = "trc_cust_ip_address";
    public static final String KEY_REG_DATE = "trc_reg_date";
    public int jsonArraySize;
    private JSONArray users = null;

    private String json;

    public ParseJSON(String json) {
        this.json = json;
    }

    protected void parseJSON() {
       // JSONArray jsonArray = null;
        try {
            users = new JSONArray(json);

            jsonArraySize=users.length();
            id = new String[jsonArraySize];
            name = new String[jsonArraySize];
            email = new String[jsonArraySize];
            image = new String[jsonArraySize];
            street= new String[jsonArraySize];
            area = new String[jsonArraySize];
            city = new String[jsonArraySize];
            postalCode = new String[jsonArraySize];
            callingNote = new String[jsonArraySize];
            mobileNo = new String[jsonArraySize];
            custStatus = new String[jsonArraySize];
            ipAddress = new String[jsonArraySize];
            regDate = new String[jsonArraySize];

            for (int i = 0; i < users.length(); i++) {
                JSONObject jo = users.getJSONObject(i);
                id[i] = jo.getString((KEY_ID));
                name[i] = jo.getString((KEY_NAME));
                email[i] = jo.getString((KEY_EMAIL));
                image[i] = jo.getString((KEY_IMAGE));
                street[i] = jo.getString((KEY_STREET));
                area[i] = jo.getString((KEY_AREA));
                city[i] = jo.getString((KEY_CITY));
                postalCode[i] = jo.getString((KEY_POSTAL_CODE));
                callingNote[i] = jo.getString((KEY_CALLING_NOTE));
                mobileNo[i] = jo.getString((KEY_MOBILE_NO));
                custStatus[i] = jo.getString((KEY_CUST_STATUS));
                ipAddress[i] = jo.getString((KEY_IP_ADDRESS));
                regDate[i] = jo.getString((KEY_REG_DATE));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}