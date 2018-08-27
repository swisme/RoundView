package com.sw.roundviewdemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sw.style.ViewStyleSetter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View fl_main = findViewById(R.id.fl_main);
        ViewStyleSetter viewStyleSetter = new ViewStyleSetter(fl_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            viewStyleSetter.setOval();
        }
    }
}
