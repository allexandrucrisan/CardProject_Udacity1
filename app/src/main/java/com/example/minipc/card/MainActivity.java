package com.example.minipc.card;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageButton youtubeRedirect;
    ImageButton facebookRedirect;
    ImageButton wwwRedirect;

    private final String FACEBOOK_URL = "https://www.facebook.com/betelmanastur/";
    private final String YOUTUBE_URL = "https://www.youtube.com/channel/UCM0kcPims3a4RFmGtx92M7Q";
    private final String WEBSITE_URL = "https://www.bisericabetel.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        youtubeRedirect = (ImageButton) findViewById(R.id.youtubeButton);
        youtubeRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(YOUTUBE_URL));
                startActivity(browserIntent);
            }
        });

        wwwRedirect = (ImageButton) findViewById(R.id.wwwButon);
        wwwRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(WEBSITE_URL));
                startActivity(browserIntent);
            }
        });

        facebookRedirect = (ImageButton) findViewById(R.id.facebookButton);
        facebookRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(FACEBOOK_URL));
                startActivity(browserIntent);
            }
        });


    }
}
