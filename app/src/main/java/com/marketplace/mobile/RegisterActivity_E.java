package com.marketplace.mobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity_E  extends AppCompatActivity implements View.OnClickListener  {
    private TextView tv_ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_e);

        tv_ok = (TextView)findViewById(R.id.tv_ok);

        tv_ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id)
        {
            case R.id.tv_ok:
                Intent intent = new Intent(this, ActivityCongratulation.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
