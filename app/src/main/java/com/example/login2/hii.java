package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hii extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hii);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlogin();
            }
        });
    }
    public void openlogin(){
        Intent intent=new Intent(this, login.class);
        startActivity(intent);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensign();
            }
        });
    }
    public void opensign(){
        Intent intent=new Intent(this, signup.class);
        startActivity(intent);
    }

}