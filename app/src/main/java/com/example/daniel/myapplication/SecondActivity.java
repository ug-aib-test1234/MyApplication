package com.example.daniel.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText phoneNumberView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle intentExtras = getIntent().getExtras();
        String username = intentExtras.getString("username");
        TextView helloView = (TextView)findViewById(R.id.hello);
        helloView.setText("Witaj " + username + "!");
        phoneNumberView = (EditText) findViewById(R.id.phoneNumber);
    }

    public void dialClicked(View view) {
        String phoneNumber = phoneNumberView.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(intent);
    }

}
