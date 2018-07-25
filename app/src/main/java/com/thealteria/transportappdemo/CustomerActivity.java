package com.thealteria.transportappdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class CustomerActivity extends AppCompatActivity {

    EditText mName, mMobile, mPan, mGst;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        mName = findViewById(R.id.cName);
        mMobile = findViewById(R.id.cMobile);
        mPan = findViewById(R.id.cPan);
        mGst = findViewById(R.id.cGST);

        toolbar = findViewById(R.id.cust_appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.customer_registration);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void cRegister(View view) {
        Intent intent = new Intent(CustomerActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
