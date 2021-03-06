package com.sbkitchpanich.kitchpanichcsce305project1;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PageZero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagezero);
    }

    public void onToPageOne(View view) {
        Intent getPageOneIntent = new Intent(this, PageOne.class);

        //final int result = 1;

        startActivity(getPageOneIntent);
        finish();
    }

    public void onToPageEleven(View view) {
        Intent getPageElevenIntent = new Intent(this, PageEleven.class);

        //final int result = 1;

        startActivity(getPageElevenIntent);
        finish();
    }
}
