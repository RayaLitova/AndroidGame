package com.example.androidgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.WidgetContainer;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Observable;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MENU
        Button shop_btn=(Button) findViewById(R.id.shop_btn);
        Button store_btn=(Button) findViewById(R.id.store_btn);
        Button settings_btn=(Button) findViewById(R.id.settings_btn);
        TextView menu_wdgt =(TextView) findViewById(R.id.menu_wdgt);
        Button[] menu_btns = {shop_btn,store_btn,settings_btn};
        TextView[] menu_Wdgts = {menu_wdgt};

        //WORKER HOUSE
        TextView house_wdgt =(TextView) findViewById(R.id.house_wdgt);
        ImageButton workerBtn1=(ImageButton) findViewById(R.id.workerBtn1);
        ImageButton workerBtn2=(ImageButton) findViewById(R.id.workerBtn2);
        ImageButton[] house_btns = {workerBtn1,workerBtn2};
        TextView[] house_Wdgts = {house_wdgt};


        findViewById(R.id.menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!menu_wdgt.isShown()) {
                    set_butt_vis_on(menu_btns);
                    set_wdgt_vis_on(menu_Wdgts);
                    set_wdgt_vis_off(house_Wdgts);
                    set_imgbutt_vis_off(house_btns);
                }else{
                    set_butt_vis_off(menu_btns);
                    set_wdgt_vis_off(menu_Wdgts);
                }
            }
        });

        findViewById(R.id.worker_house).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (menu_wdgt.isShown()) {
                    set_butt_vis_off(menu_btns);
                    set_wdgt_vis_off(menu_Wdgts);
                }
                if (!house_wdgt.isShown()) {
                    set_wdgt_vis_on(house_Wdgts);
                    set_imgbutt_vis_on(house_btns);
                } else {
                    set_wdgt_vis_off(house_Wdgts);
                    set_imgbutt_vis_off(house_btns);
                }
            }
        });
    }
    private void set_butt_vis_on(Button[] args){
        for(Button next:args){
            next.setVisibility(View.VISIBLE);
        }
    }
    private void set_wdgt_vis_on(TextView[] args){
        for(TextView next:args){
            next.setVisibility(View.VISIBLE);
        }
    }
    private void set_butt_vis_off(Button[] args){
        for(Button next:args){
            next.setVisibility(View.GONE);
        }
    }
    private void set_wdgt_vis_off(TextView[] args){
        for(TextView next:args){
            next.setVisibility(View.GONE);
        }
    }
    private void set_imgbutt_vis_on(ImageButton[] args){
        for(ImageButton next:args){
            next.setVisibility(View.VISIBLE);
        }
    }
    private void set_imgbutt_vis_off(ImageButton[] args){
        for(ImageButton next:args){
            next.setVisibility(View.GONE);
        }
    }

}

