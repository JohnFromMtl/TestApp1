package com.example.root.testapp1;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class BandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent mIntent = getIntent();
        int position = mIntent.getIntExtra("Position", 0);
        switch(position){
            case 0 :
                break;
            case 1:
                Toast.makeText(getApplicationContext(),
                        " Position: " + position, Toast.LENGTH_LONG).show();
                setContentView(R.layout.activity_main);
                break;
            case 2:
                Toast.makeText(getApplicationContext(),
                        " Position: " + position, Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(getApplicationContext(),
                        " Position: " + position, Toast.LENGTH_LONG).show();
                break;

        };

    }

    public BandActivity() {
    }


}
