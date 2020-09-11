package com.example.foodmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button food,med,zom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        food=findViewById(R.id.foodbutton);
        med=findViewById(R.id.medbutton);
        zom=findViewById(R.id.foodsbutton);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfood();
            }
        });
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmed();
            }
        });
        zom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openzom();
            }
        });


    }
    public void openfood(){
        Intent intent=new Intent(this,Medical.class);
        startActivity(intent);
    }
    public void openmed(){
        Intent intent=new Intent(this,Food.class);
        startActivity(intent);
    }
    public void openzom(){
        Intent intent=new Intent(this,Zomato.class);
        startActivity(intent);
    }

}