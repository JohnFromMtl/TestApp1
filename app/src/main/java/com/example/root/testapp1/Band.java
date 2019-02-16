package com.example.root.testapp1;


import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.net.URI;

public class Band extends AppCompatActivity implements Parcelable {





    public static String PACKAGE_NAME;
    private String bName;
    ConstraintLayout bView;
    ListView bList;
    Uri path;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PACKAGE_NAME = getApplicationContext().getPackageName();
        Uri path = Uri.parse("android.resource:" + PACKAGE_NAME + R.drawable.ghostbandgrammy);

        Bundle data = getIntent().getExtras();
        Band band = (Band) data.getParcelable("Band");
        band.setView();

    }

    private void setView() {
       setContentView(R.layout.activity_main);
    }


    public Band(String bName) {

        this.bName = bName;

    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
