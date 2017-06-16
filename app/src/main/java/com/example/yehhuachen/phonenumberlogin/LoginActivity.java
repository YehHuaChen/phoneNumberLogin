package com.example.yehhuachen.phonenumberlogin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(R.string.activity_login_title);

        Button button = (Button)findViewById(R.id.btn_login_get_verify_code);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(LoginActivity.this, VerifyActivity.class);
                startActivity(intent);
                LoginActivity.this.finish();
            }
        });
    }
}
