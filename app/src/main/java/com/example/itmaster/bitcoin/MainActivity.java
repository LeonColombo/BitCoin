package com.example.itmaster.bitcoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verBitcoin(View view) {
        Intent bitcoin = new Intent(this, BitCoinActivity.class);
        startActivity(bitcoin);

    }
}
