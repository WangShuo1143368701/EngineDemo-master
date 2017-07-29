package com.lfk.enginedemo;


import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class EngineViewActivity extends Activity {

    private AirplaneGameView airplaneGameView;
    private LinearLayout root_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_engine_view);

        root_view = (LinearLayout) findViewById(R.id.root_view);
        airplaneGameView = new AirplaneGameView(EngineViewActivity.this);
        root_view.addView(airplaneGameView);
        airplaneGameView.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        airplaneGameView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        airplaneGameView.onPause();
    }
}
