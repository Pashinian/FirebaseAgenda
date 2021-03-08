package com.example.primer.firebaseagenda;

import android.os.Bundle;
import android.widget.TextView;

public class View extends MainActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        setAmbientEnabled();
    }

    private void setAmbientEnabled() {
    }
}