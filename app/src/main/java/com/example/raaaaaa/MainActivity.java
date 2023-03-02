package com.example.raaaaaa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fabEvan;
    Button mamaWeight;
    boolean displayingHerWeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabEvan = this.findViewById(R.id.fabEvan);
        int yoMamaWeightTons = Integer.MAX_VALUE;

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

        fabEvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(v.getContext());
                dialog.setTitle("fire whip");
                dialog.setIcon(R.drawable.fire_whip);
                dialog.setPositiveButton("fr so fire", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("not fire", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.create().show();

            }
        });
    }

}