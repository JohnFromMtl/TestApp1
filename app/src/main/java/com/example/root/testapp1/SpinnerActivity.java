package com.example.root.testapp1;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    private static final String TAG = "SpinnerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Log.i(TAG,"onCreate ok");

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        Resources res= getResources();
        String [] band = res.getStringArray(R.array.band);

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, band);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        Log.i(TAG,"onItemSelectd ok");
        String item = parent.getItemAtPosition(position).toString();
        // Get element position
        int pos = parent.getSelectedItemPosition();
        Intent intent = new Intent(SpinnerActivity.this,BandActivity.class);
        // Showing selected spinner item
        switch (pos){
            case 0:
                Toast.makeText(parent.getContext(), "Choose a band ", Toast.LENGTH_LONG).show();
                break;
            case 1:
                Toast.makeText(parent.getContext(), "Selected: " + item + "Position: " + pos, Toast.LENGTH_LONG).show();
                intent.putExtra("Position",pos);
                startActivity(intent);
                break;
            case 2:
                Toast.makeText(parent.getContext(), "Selected: " + item + "Position: " + pos, Toast.LENGTH_LONG).show();
                intent.putExtra("Position",pos);
                startActivity(intent);
                break;
            case 3:
                Toast.makeText(parent.getContext(), "Selected: " + item + "Position: " + pos, Toast.LENGTH_LONG).show();
                intent.putExtra("Position",pos);
                startActivity(intent);
                break;
            case 4:
                Toast.makeText(parent.getContext(), "Selected: " + item + "Position: " + pos, Toast.LENGTH_LONG).show();
                intent.putExtra("Position",pos);
                startActivity(intent);
                break;
            case 5:
                Toast.makeText(parent.getContext(), "Selected: " + item + "Position: " + pos, Toast.LENGTH_LONG).show();
                intent.putExtra("Position",pos);
                startActivity(intent);
                break;


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
