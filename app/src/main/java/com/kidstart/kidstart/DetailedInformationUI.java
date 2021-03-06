package com.kidstart.kidstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class DetailedInformationUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_information_ui);

        // System Back button enable
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        HashMap<String, String> hashMap = (HashMap<String, String>) intent.getSerializableExtra("hashMapMessage");

        TextView infoNameText = findViewById(R.id.infoName);
        infoNameText.setText(hashMap.get("centreName"));
        TextView infoNameText1 = findViewById(R.id.infoName1);
        infoNameText1.setText(hashMap.get("centreAddress"));
        TextView infoNameText2 = findViewById(R.id.infoName2);
        infoNameText2.setText(hashMap.get("centreWebsite"));
    }
}
