package com.sbkitchpanich.kitchpanichcsce305project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PageSeven extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pageseven);
    }


    public void onToPageEight(View view) {
        Intent getPageEightIntent = new Intent(this, PageEight.class);

        //final int result = 1;

        startActivity(getPageEightIntent);
    }
}
