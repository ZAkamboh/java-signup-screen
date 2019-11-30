package com.ovais.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment();
        secondFragment();
        thirdFragment();

    }

    public void myButton(View view) {

//        Button btn;
//        btn=findViewById(R.id.myFragmentButton);
//        Intent intent=new Intent(this,Main2Activity.class);
//        startActivity(intent);
    }




    public void button01(View view) {
        firstFragment();


    }

    public void button02(View view) {
        secondFragment();
    }

    public void button03(View view) {
        thirdFragment();
    }


    public void firstFragment() {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        FragmentOne fragmentOne=new FragmentOne();
        fragmentTransaction.add(R.id.fragmentContainer,fragmentOne);
        fragmentTransaction.commit();
    }

    public void secondFragment() {

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        FragmentTwo fragmentTwo=new FragmentTwo();
        fragmentTransaction.add(R.id.fragmentContainer,fragmentTwo);
        fragmentTransaction.commit();
    }

    public void thirdFragment() {

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        FragmentThree fragmentThree=new FragmentThree();
        fragmentTransaction.add(R.id.fragmentContainer,fragmentThree);
        fragmentTransaction.commit();
    }
}
