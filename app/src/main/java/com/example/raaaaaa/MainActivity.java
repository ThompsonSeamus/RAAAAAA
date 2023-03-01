package com.example.raaaaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mamaWeight;
    boolean displayingHerWeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        int yoMamaWeightTons = Integer.MAX_VALUE;

        boolean isVisible = true; //??????????nerd-emoji????????
        displayingHerWeight = false;

        mamaWeight = findViewById(R.id.yo_mama_weight_button);
        mamaWeight.setOnClickListener(new View.OnClickListener() {
            //Boolean displayingHerWeight =
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!displayingHerWeight){
                    mamaWeight.setText(R.string.yo_mamas_weight);
                    displayingHerWeight = true;
                }else{
                    mamaWeight.setText(yoMamaWeightTons + "");
                    displayingHerWeight = false;
                }
            }
        });



    }

}