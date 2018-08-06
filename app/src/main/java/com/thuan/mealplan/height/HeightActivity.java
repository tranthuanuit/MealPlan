
package com.thuan.mealplan.height;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.thuan.mealplan.R;
import com.thuan.mealplan.Toolbar;

public class HeightActivity extends AppCompatActivity implements HeightView {

    private HeightPresenter presenter;
    private ImageView imgHeihgtIcon;
    private TextView tvHeightTitle;
    private RecyclerView rcHeightList;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);
        presenter = new HeightPresenterImpl(this);
        presenter.mappingView();
    }

    @Override
    public void navigateToWeight() {
        presenter.navigateToWeightActivity();
    }

    @Override
    public void mappingView() {
        toolbar = findViewById(R.id.toolBar);
        toolbar.setTitle("ABC");
    }

    @Override
    public void setupListener() {
        toolbar.setOnClickBack(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
