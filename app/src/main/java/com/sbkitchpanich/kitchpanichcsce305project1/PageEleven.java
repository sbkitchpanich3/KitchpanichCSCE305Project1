package com.sbkitchpanich.kitchpanichcsce305project1;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PageEleven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pageeleven);
    }

    public void onToPageZero(View view) {
        Intent getPageZeroIntent = new Intent(this, PageZero.class);

        //final int result = 1;

        startActivity(getPageZeroIntent);
        finish();
    }

    public void onToPageTen(View view) {
        Intent getPageTenIntent = new Intent(this, PageTen.class);

        //final int result = 1;

        startActivity(getPageTenIntent);
        finish();
    }
}
