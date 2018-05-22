package com.marketplace.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class RegisterActivity_B extends AppCompatActivity implements View.OnClickListener {
    private Spinner sp_state, sp_city, sp_township;
    private ImageView iv_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_b);

        sp_state = (Spinner)findViewById(R.id.sp_state);
        sp_city = (Spinner)findViewById(R.id.sp_city);
        sp_township = (Spinner)findViewById(R.id.sp_township);
        iv_next = (ImageView)findViewById(R.id.iv_next);

        iv_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id)
        {
            case R.id.iv_next:
                Intent intent = new Intent(this, RegisterActivity_C.class);
                startActivity(intent);
                break;

        }
    }
}
