package com.sbkitchpanich.kitchpanichcsce305project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PageFour extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pagefour);
    }


    public void onToPageFive(View view) {
        Intent getPageFiveIntent = new Intent(this, PageFive.class);

        //final int result = 1;

        startActivity(getPageFiveIntent);
    }
}
