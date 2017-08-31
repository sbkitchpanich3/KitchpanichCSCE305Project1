package com.sbkitchpanich.kitchpanichcsce305project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PageOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);
    }

    public void onToPageTwo(View view) {
        Intent getPageTwoIntent = new Intent(this, PageTwo.class);

        //final int result = 1;

        startActivity(getPageTwoIntent);
    }
}
