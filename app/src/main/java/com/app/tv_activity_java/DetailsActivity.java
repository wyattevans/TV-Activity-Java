package com.app.tv_activity_java;

import android.app.Activity;
import android.os.Bundle;

public class DetailsActivity extends Activity {
    public static final String SHARED_ELEMENT_NAME = "hero";
    public static final String MOVIE = "Movie";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
}
