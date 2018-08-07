package com.thuan.mealplan.birthday;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import com.thuan.mealplan.R;
import com.thuan.mealplan.base.BaseActivity;
import com.thuan.mealplan.height.HeightActivity;

public class BirthDayActivity extends BaseActivity implements BirthDayView {

    private BirthDayPresenter presenter;
    private ImageView imAppIcon;
    private TextView tvAppTitle;
    private CalendarView calendarView;
    private Button btnContinue;
    @Override
    public void mappingView() {
        imAppIcon = findViewById(R.id.appIcon);
        tvAppTitle = findViewById(R.id.appTitle);
//        calendarView = findViewById(R.id.calendar);
        btnContinue = findViewById(R.id.btnContinue);
    }

    @Override
    public void setupListener() {
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.navigateToHeightActivity();
            }
        });
    }

    @Override
    public void initData() {
        presenter = new BirthDayPresenterImpl(this);
    }

    @Override
    public int getLayoutResource() {
        return R.layout.activity_birthday;
    }

    @Override
    public void navigateToHeightActivity() {
        Intent intent = new Intent(BirthDayActivity.this, HeightActivity.class);
        startActivity(intent);
    }
}
