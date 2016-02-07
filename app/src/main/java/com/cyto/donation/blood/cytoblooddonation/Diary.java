package com.cyto.donation.blood.cytoblooddonation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Diary extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //turn title off
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_diary);
    }
}
