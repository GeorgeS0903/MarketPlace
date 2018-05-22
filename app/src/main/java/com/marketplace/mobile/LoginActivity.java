package com.marketplace.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText et_mobilenumber, et_password;
    private TextView tv_login, tv_register;
    private TextView tv_forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_mobilenumber = (EditText)findViewById(R.id.et_mobilenumber);
        et_password = (EditText)findViewById(R.id.et_password);
        tv_login = (TextView)findViewById(R.id.tv_login);
        tv_register = (TextView)findViewById(R.id.tv_register);
        tv_forgot = (TextView)findViewById(R.id.tv_forgot);

        tv_login.setOnClickListener(this);
        tv_register.setOnClickListener(this);
        tv_forgot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id)
        {
            case R.id.tv_login:

                break;
            case R.id.tv_register:
                Intent intent = new Intent(this, RegisterAcitivt_A.class);
                startActivity(intent);
                break;
            case R.id.tv_forgot:
                break;
        }
    }
}
