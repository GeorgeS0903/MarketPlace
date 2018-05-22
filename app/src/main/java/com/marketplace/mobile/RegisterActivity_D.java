package com.marketplace.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class RegisterActivity_D extends AppCompatActivity implements View.OnClickListener   {
    private ImageView iv_back, iv_showpw;
    private LinearLayout ll_frontside, ll_backside, ll_check;
    private TextView tv_readhelp, tv_register;
    private EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_d);

        iv_back = (ImageView)findViewById(R.id.iv_back);
        ll_frontside = (LinearLayout)findViewById(R.id.ll_frontside);
        ll_backside = (LinearLayout)findViewById(R.id.ll_backside);
        ll_check = (LinearLayout)findViewById(R.id.ll_check);
        tv_readhelp = (TextView)findViewById(R.id.tv_readhelp);
        tv_register = (TextView)findViewById(R.id.tv_register);
        iv_showpw = (ImageView)findViewById(R.id.iv_showpw);
        et_password = (EditText)findViewById(R.id.et_password);

        iv_back.setOnClickListener(this);
        ll_frontside.setOnClickListener(this);
        ll_backside.setOnClickListener(this);
        ll_check.setOnClickListener(this);
        tv_readhelp.setOnClickListener(this);
        tv_register.setOnClickListener(this);
        iv_showpw.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id)
        {
            case R.id.iv_back:
                onBackPressed();
                break;
            case R.id.tv_register:
                Intent intent = new Intent(this, RegisterActivity_E.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
