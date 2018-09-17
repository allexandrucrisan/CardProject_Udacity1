package com.example.minipc.card;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton ytRedirect;
    ImageButton fbRedirect;
    ImageButton wwwRedirect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ytRedirect = (ImageButton) findViewById(R.id.ytButton);
        ytRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCM0kcPims3a4RFmGtx92M7Q"));
                startActivity(browserIntent);
            }
        });


        wwwRedirect = (ImageButton) findViewById(R.id.wwButon);
        wwwRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bisericabetel.com"));
                startActivity(browserIntent);
            }
        });

        fbRedirect = (ImageButton) findViewById(R.id.fbButton);
        fbRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/betelmanastur/"));
                startActivity(browserIntent);
            }
        });






    }
}
