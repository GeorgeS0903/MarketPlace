package com.marketplace.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class RegisterActivity_C extends AppCompatActivity implements View.OnClickListener  {
    private LinearLayout ll_select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_c);

        ll_select = (LinearLayout)findViewById(R.id.ll_select);

        ll_select.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id)
        {
            case R.id.ll_select:
                Intent intent = new Intent(this, ActivitySelectProducts.class);
                startActivity(intent);
                break;

        }
    }
}
