package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.det_toolbar);
        setSupportActionBar(toolbar);
        setTitle("Pocket Formulas");
        findViewById(R.id.layout1).setOnClickListener(this);
        findViewById(R.id.layout2).setOnClickListener(this);
        findViewById(R.id.layout3).setOnClickListener(this);
        findViewById(R.id.layout4).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, DetailsActivity.class);
        switch(v.getId())
        {
            case R.id.layout1:
                intent.putExtra("type", 0);
                break;
            case R.id.layout2:
                intent.putExtra("type", 1);
                break;
            case R.id.layout3:
                intent.putExtra("type", 2);
                break;
            case R.id.layout4:
                intent.putExtra("type", 3);
                break;
        }
        startActivity(intent);

    }
}
