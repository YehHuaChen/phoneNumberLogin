package com.example.yehhuachen.phonenumberlogin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        setTitle(R.string.activity_verify_title);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                Intent intent = new Intent();
                intent.setClass(VerifyActivity.this, LoginActivity.class);
                startActivity(intent);
                VerifyActivity.this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
