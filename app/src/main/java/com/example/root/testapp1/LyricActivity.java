package com.example.root.testapp1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class LyricActivity extends AppCompatActivity {

    ListView ghostList;
    TextView txtView;
    Resources res= getResources();

    String [] bestOfGhost = res.getStringArray(R.array.ghostSongsItem);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ghostList = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1, android.R.id.text1,bestOfGhost );
        ghostList.setAdapter(adapter);
        ghostList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) ghostList.getItemAtPosition(position);

                switch(position){
                    case 0:
                        Toast.makeText(getApplicationContext(),
                                " Position: " + itemValue, Toast.LENGTH_LONG).show();
                        setContentView(R.layout.square_hammer_lyric);
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(),
                                " Position: " + itemValue, Toast.LENGTH_LONG).show();
                        setContentView(R.layout.cirice_lyric);
                        break;
                    case 2:
                        break;
                }

            }
        });
    }
}
