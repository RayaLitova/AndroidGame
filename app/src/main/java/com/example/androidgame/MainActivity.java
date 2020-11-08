package com.example.androidgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.WidgetContainer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shop_btn=(Button) findViewById(R.id.shop_btn);
        Button store_btn=(Button) findViewById(R.id.store_btn);
        Button settings_btn=(Button) findViewById(R.id.settings_btn);

        findViewById(R.id.menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!findViewById(R.id.menu_wdgt).isShown()) {
                    findViewById(R.id.menu_wdgt).setVisibility(View.VISIBLE);
                    shop_btn.setVisibility(View.VISIBLE);
                    store_btn.setVisibility(View.VISIBLE);
                    settings_btn.setVisibility(View.VISIBLE);
                }else{
                    findViewById(R.id.menu_wdgt).setVisibility(View.GONE);
                    shop_btn.setVisibility(View.GONE);
                    store_btn.setVisibility(View.GONE);
                    settings_btn.setVisibility(View.GONE);
                }
            }
        });
    }
}