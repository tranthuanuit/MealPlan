
package com.thuan.mealplan.height;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.thuan.mealplan.R;

public class HeightActivity extends AppCompatActivity implements HeightView {

    private ImageView imgHeihgtIcon;
    private TextView tvHeightTitle;
    private RecyclerView rcHeightList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);
    }

    @Override
    public void navigateToWeight() {

    }

    @Override
    public void mappingView() {

    }

    @Override
    public void setupListener() {

    }
}
