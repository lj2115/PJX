package com.newtouch.pjx.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.newtouch.pjx.R;
import com.newtouch.pjx.fragment.LocationHistoryFragment;

/**
 * Created by chen on 2016-08-19.
 */
public class LocationActivity extends FragmentActivity {
    EditText et_searchkey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   SDKInitializer.initialize(getApplicationContext());  //百度地图
        setContentView(R.layout.activity_location);
        et_searchkey = (EditText) findViewById(R.id.et_searchkey);

        LocationHistoryFragment locationHistory = new LocationHistoryFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.ll_frg, locationHistory).commit();

        et_searchkey.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() <= 0) {
                    LocationHistoryFragment locationHistory = new LocationHistoryFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.ll_frg, locationHistory).commit();
                }else {
//                    Frg_LocationNow locationNow = new Frg_LocationNow();
//                    getSupportFragmentManager().beginTransaction().replace(R.id.ll_frg, locationNow).commit();
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}


