package com.lfk.enginedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity implements View.OnClickListener {

    private Button btn_activitygame;
    private Button btn_viewgame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        initView();
    }

    private void initView() {
        btn_activitygame = (Button) findViewById(R.id.btn_activitygame);
        btn_viewgame = (Button) findViewById(R.id.btn_viewgame);

        btn_activitygame.setOnClickListener(this);
        btn_viewgame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_activitygame:
                Intent intent = new Intent(FirstActivity.this,Game.class);
                startActivity(intent);
                break;
            case R.id.btn_viewgame:
                Intent intent2 = new Intent(FirstActivity.this,EngineViewActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
