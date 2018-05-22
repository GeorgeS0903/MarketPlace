package com.marketplace.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterAcitivt_A extends AppCompatActivity implements View.OnClickListener {
    private EditText et_mobilenumber, et_name;
    private ImageView iv_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_a);

        et_mobilenumber = (EditText)findViewById(R.id.et_mobilenumber);
        et_name = (EditText)findViewById(R.id.et_name);
        iv_next = (ImageView)findViewById(R.id.iv_next);

        iv_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id)
        {
            case R.id.iv_next:
                Intent intent = new Intent(this, RegisterActivity_B.class);
                startActivity(intent);
                break;

        }
    }
}
