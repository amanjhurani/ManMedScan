package com.example.hemang.manmedscan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get input from the user.
        EditText et_username = findViewById(R.id.et_username);
        EditText et_password = findViewById(R.id.et_password);

        String username = et_username.getText().toString();
        String password = et_password.getText().toString();


    }
}
