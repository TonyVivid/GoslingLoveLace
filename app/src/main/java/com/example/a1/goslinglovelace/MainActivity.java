package com.example.a1.goslinglovelace;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Resources resources = getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration config = resources.getConfiguration();
        String country = resources.getConfiguration().locale.getCountry();
        Log.d("TAG",country);
        int orientation = getResources().getConfiguration().orientation;
        if(orientation==Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.land);
            changeLanguage2(country);

        }
        if(orientation==Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.port);
            changeLanguage1(country);
        }

    }
    public void changeLanguage1(String country){

        if(country.equals("CN"))
        {
            TextView viewada =findViewById(R.id.ada);
            //TextView viewjames=findViewById(R.id.james);
            String adac=getString(R.string.adaC).toString();
            //String jamesc=getString(R.string.jamesC).toString();
            Log.d("TAG",adac);
            viewada.setText(adac);
            //viewjames.setText(jamesc);

        }
        else {
            TextView viewada =findViewById(R.id.ada);
            //TextView viewjames=findViewById(R.id.james);
            String adaE=getString(R.string.adaE).toString();
            //String jamesE=getString(R.string.jamesE).toString();
            viewada.setText(adaE);
            //viewjames.setText(jamesE);

        }


    }
    public void changeLanguage2(String country) {

        if (country.equals("CN")) {
            // TextView viewada =findViewById(R.id.ada);
            TextView viewjames = findViewById(R.id.james);
            //String adac=getString(R.string.adaC).toString();
            String jamesc = getString(R.string.jamesC).toString();
            //Log.d("TAG",adac);
            //viewada.setText(adac);
            viewjames.setText(jamesc);

        } else {
            // TextView viewada =findViewById(R.id.ada);
            TextView viewjames = findViewById(R.id.james);
            //String adaE=getString(R.string.adaE).toString();
            String jamesE = getString(R.string.jamesE).toString();
            //viewada.setText(adaE);
            viewjames.setText(jamesE);

        }
    }
        public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {

            Log.d("TAG","shu pin");
        } else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.land);
            Log.d("TAG","heng pin");
        }
    }
}



