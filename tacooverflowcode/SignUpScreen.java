package com.example.tacooverflowcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class SignUpScreen extends AppCompatActivity {

    private Button sign_Up_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_screen);

        EditText username = (EditText) findViewById(R.id.username);

        MaterialButton regbtn = (MaterialButton) findViewById(R.id.sign_up_btn);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1 = username.getText().toString();
                Toast.makeText(SignUpScreen.this, "Username is" + username1, Toast.LENGTH_SHORT ).show();
            }
        });

        sign_Up_Btn=findViewById(R.id.sign_up_btn);
        sign_Up_Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpScreen.this, Account.class);
                startActivity(intent);
            }
        });



    }
}