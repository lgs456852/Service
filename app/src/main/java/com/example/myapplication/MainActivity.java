package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newscontroller);
    }
    public void mOnClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.newsstart:
                intent = new Intent(this, NewService.class);
                startService(intent);
                break;
            case R.id.newsend:
                intent = new Intent(this, NewService.class);
                stopService(intent);
                break;
        }
    }
}
