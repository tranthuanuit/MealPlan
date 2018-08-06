package com.thuan.mealplan;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Toolbar extends RelativeLayout {

    private ImageView btnBack;
    private TextView tvTitle;

    public Toolbar(Context context) {
        super(context);
        init(context);
    }

    public Toolbar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Toolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.tool_bar,this,true);
        mapView();
    }

    private void mapView() {
        btnBack = findViewById(R.id.backButton);
        tvTitle = findViewById(R.id.toolBarTitle);
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setOnClickBack(OnClickListener myListener) {
        btnBack.setOnClickListener(myListener);
    }
}
