package com.example.asus.zocaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button btStart;
    Button btInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btStart = (Button)findViewById(R.id.btStart);
        btStart.setOnClickListener(this);

        btInfo = (Button)findViewById(R.id.btInfo);
        btInfo.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {

            case R.id.btStart:
                Intent i2 = new Intent(getApplicationContext(), Fase1.class);
                //i2.putExtra("fase",1);
                startActivity(i2);
                break;

            case R.id.btInfo:
                Intent i3 = new Intent(getApplicationContext(),InformacoesActivity.class);
                startActivity(i3);
                break;
        }

    }
}
