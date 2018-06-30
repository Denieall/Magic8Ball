package com.denieall.magic8ball;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting button
        Button btn_shake = findViewById(R.id.button);

        // Registering onclick listener to btn_shake
        btn_shake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Getting Image View
                ImageView imageView = findViewById(R.id.ball_imageView);

                // Generate random number from 0 - 7 then add 1
                Random rng = new Random();
                int number = rng.nextInt(8) + 1;

                // Setting image resource based on random number generated
                imageView.setImageResource(getResources().getIdentifier("magic_ball_" + Integer.toString(number), "drawable",getPackageName()));

            }
        });


    }
}
