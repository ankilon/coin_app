package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import android.content.Intent;

import android.util.Log;
import android.widget.Button;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;




public class DetailActivity extends AppCompatActivity {

    public static final String TAG = "DetailActivity";

    private TextView nameOfCurrency;
    private TextView currencyInitial;
    private TextView valueNum;
    private TextView changePercent1;
    private TextView changePercent2;
    private TextView changePercent3;
    private TextView marketCapNum;
    private TextView volumeNum;
    String message1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nameOfCurrency = findViewById(R.id.nameOfCurrency);
        currencyInitial = findViewById(R.id.currencyInitial);
        valueNum = findViewById(R.id.valueNum);
        changePercent1 =findViewById(R.id.changePercent2);
        changePercent2 = findViewById(R.id.changePercent3);
        marketCapNum= findViewById(R.id.marketCapNum);
        volumeNum = findViewById(R.id.volumeNum);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        Coin coin = Coin.searchCoin(message);

        nameOfCurrency.setText(coin.getName());
        currencyInitial.setText(coin.getSymbol().toString());
        valueNum.setText(Double.toString(coin.getValue()));
        changePercent1.setText(Double.toString(coin.getChange1h()));
        changePercent2.setText(Double.toString(coin.getChange24h()));
        changePercent3.setText(Double.toString(coin.getChange7d()));
        marketCapNum.setText(Double.toString(coin.getMarketcap()));
        volumeNum.setText(Double.toString(coin.getVolume()));

        message1 = message;






        //TextView textView = findViewById (R.id.textView2);
        //textView.setText(message);

        //Button btn = findViewById(R.id.button2);
       // btn.setText("Show Vid");

        //Log.d(TAG, "video button");
        ImageView search = findViewById(R.id.search);



    }

    public void showVideo(View view){


        Log.d(TAG, "showVideo: starting METHODdjhflakhfajklbdla");
        Uri uri = Uri.parse("https://www.google.com.au/search?q="+message1);
        Log.d(TAG, "showVideo: uri working");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        Log.d(TAG, "showVideo: new intent");
        view.getContext().startActivity(intent);
        Log.d(TAG, "showVideo: start intent");
        Log.d(TAG, "load video");
    }


}
