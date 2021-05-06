package com.weimingfa.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view){
        Intent intent=null;
        switch (view.getId()){
            case R.id.button0:
                intent=new Intent(MainActivity.this, FrameActivity.class);

                break;
            case R.id.button1:
                intent=new Intent(MainActivity.this, RelativeActivity.class);

                break;
            case R.id.button2:
                intent=new Intent(MainActivity.this, LinearActivity.class);

                break;
            case R.id.button3:
                intent=new Intent(MainActivity.this, TableActivity.class);
                break;
        }
        startActivity(intent);
    }
}