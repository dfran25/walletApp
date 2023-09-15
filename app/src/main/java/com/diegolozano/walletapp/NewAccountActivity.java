package com.diegolozano.walletapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NewAccountActivity extends AppCompatActivity {

    private ImageView ivback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);

        ivback=findViewById(R.id.iv_back);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(NewAccountActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });


    }


}