package com.example.asus.zocaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ASUS on 04/09/2015.
 */
public class Fase1 extends ActionBarActivity implements View.OnClickListener
{
    Button btHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btHome = (Button) findViewById(R.id.btStart);
        btHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btHome:
                Intent i4 = new Intent(getApplicationContext(), MainActivity.class);
                //i2.putExtra("title",title);
                startActivity(i4);
                break;
        }

    }


}
