package com.marketplace.mobile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.marketplace.mobile.Utils.*;

public class ActivitySelectProducts  extends AppCompatActivity implements View.OnClickListener {
    private EditText et_search;
    private ImageView iv_search;
    private TextView tv_clearall, tv_cancel, tv_ok;
    private LinearLayout ll_products;
    private LayoutInflater inflater;
    public Point mScrSize = new Point(0, 0);
    private PopupWindow m_popupWindow = null;
    private int m_nWidth, m_nHeight;
    private View m_parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        m_parent = inflater.inflate(R.layout.activity_selectproducts, null);
        setContentView(m_parent);

        m_nWidth = getWindowManager().getDefaultDisplay().getWidth();
        m_nHeight = getWindowManager().getDefaultDisplay().getHeight();

        et_search = (EditText)findViewById(R.id.et_search);
        iv_search = (ImageView)findViewById(R.id.iv_search);
        tv_clearall = (TextView)findViewById(R.id.tv_clearall);
        tv_cancel = (TextView)findViewById(R.id.tv_cancel);
        tv_ok = (TextView)findViewById(R.id.tv_ok);

        iv_search.setOnClickListener(this);
        tv_clearall.setOnClickListener(this);
        tv_cancel.setOnClickListener(this);
        tv_ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        final Intent intent = null;
        switch (id)
        {
            case R.id.tv_ok:
                final View view = inflater.inflate(R.layout.layout_product_confirm, null);
                ResolutionSet.instance.iterateChild(view, mScrSize.x, mScrSize.y);

                m_popupWindow = new PopupWindow(view, m_nWidth, m_nHeight, true);
                LinearLayout ll_selectedproduct = (LinearLayout)view.findViewById(R.id.ll_selectedproducts);
                TextView tv_edit = (TextView)view.findViewById(R.id.tv_edit);
                TextView tv_confirm = (TextView)view.findViewById(R.id.tv_confirm);
                tv_edit.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        m_popupWindow.dismiss();
                    }
                });
                tv_confirm.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        showPendingPage();
                    }
                });
                m_popupWindow.showAtLocation(m_parent, Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                break;

        }
    }

    private void showPendingPage()
    {
        Intent intent = new Intent(this, RegisterActivity_D.class);
        startActivity(intent);
    }
}
