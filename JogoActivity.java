package com.example.asus.zocaapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class JogoActivity extends AppCompatActivity implements View.OnClickListener {

    Button btVoltar;
    Button btWin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        btVoltar = (Button) findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(this);

        btWin = (Button) findViewById(R.id.btWin);
        btWin.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jogo, menu);
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
            case R.id.btVoltar:
                Intent i6= new Intent(getApplicationContext(), MainActivity.class);
                //i2.putExtra("title",title);
                startActivity(i6);
                break;

            case R.id.btWin:
                Intent i7 = new Intent(getApplicationContext(), WinActivity.class);
                //i2.putExtra("title",title);
                startActivity(i7);
                break;
        }

    }
}