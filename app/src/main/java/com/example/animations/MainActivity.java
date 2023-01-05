package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isFirstVisible = true;
    public void doremon(View view){
        ImageView dr1 = findViewById(R.id.dr1);
        ImageView dr2 = findViewById(R.id.dr2);
        if (isFirstVisible) {

            dr1.animate().alpha(0f).setDuration(2000);
            dr2.animate().alpha(1f).setDuration(2000);
            isFirstVisible=false;
        }else{
            dr1.animate().alpha(1f).setDuration(2000);
            dr2.animate().alpha(0f).setDuration(2000);
            isFirstVisible=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}