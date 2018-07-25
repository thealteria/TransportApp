package com.thealteria.transportappdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.github.florent37.materialtextfield.MaterialTextField;

public class ChooseYourAccount extends AppCompatActivity {

    EditText mEmail, mPassword;
    String email, pass;
    CheckBox rshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_account);

        mEmail = findViewById(R.id.regemail);
        mPassword = findViewById(R.id.regpassword);
        rshow = findViewById(R.id.showPass);

        email = mEmail.getText().toString();
        pass = mPassword.getText().toString();

        showPass();

    }

    public void showPass(){
        rshow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    mPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    mPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });
    }


    public void regCustomer(View view) {
//        if (email.isEmpty() || pass.isEmpty()) {
//
//            Toast.makeText(getApplicationContext(), R.string.enter_details, Toast.LENGTH_LONG).show();
//        }
//        else {
            Intent intent = new Intent(ChooseYourAccount.this, CustomerActivity.class);
            startActivity(intent);

        //}

    }

    public void regTransporter(View view) {
//        if (email.equals("") || pass.equals("")) {
//
//            Toast.makeText(getApplicationContext(), R.string.enter_details, Toast.LENGTH_LONG).show();
//        }
//        else {
            Intent intent = new Intent(ChooseYourAccount.this, TransporterActivity.class);
            startActivity(intent);
            finish();
        //}
    }
}
