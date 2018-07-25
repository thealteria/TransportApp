package com.thealteria.transportappdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class TransporterActivity extends AppCompatActivity {

    Toolbar toolbar;
    EditText mName, mPhone, mVehicleNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporter);

        mName = findViewById(R.id.tName);
        mPhone = findViewById(R.id.tmobile);
        mVehicleNo = findViewById(R.id.tvehicle);

        toolbar = findViewById(R.id.cust_appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.transporter_registration);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void register(View view) {

        Intent intent = new Intent(TransporterActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
