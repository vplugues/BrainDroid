package com.example.vanessa.finalproject2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by f on 10/28/2015.
 */
public class About_Page extends FragmentActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
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

    public void onAboutUsClick(boolean checked) {
        int color;
        AboutUsFrag textFragment = (AboutUsFrag) getSupportFragmentManager().findFragmentById(R.id.aboutusfrag);
        if(checked){ color = Color.BLUE;}else{color = Color.BLACK;}
        textFragment.changeText(color);
    }

    public void onAboutAppClick(boolean checked) {
        int color;
        AboutAppFrag textFragment = (AboutAppFrag) getSupportFragmentManager().findFragmentById(R.id.aboutappfrag);
        if(checked){ color = Color.BLUE;}else{color = Color.BLACK;}
        textFragment.changeText(color);
    }
}
