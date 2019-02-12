package com.example.myapplication;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.toast);
        b.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"Toast is clicked", Toast.LENGTH_SHORT).show();


    }
}
