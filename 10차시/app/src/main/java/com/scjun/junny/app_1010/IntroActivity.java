package com.scjun.junny.app_1010;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        Handler handler = new Handler(); // 안드로이드 핸들러 함수에 대해 웹검색을 통해 학습하시기 바랍니다.
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this,MainActivity.class); // 자기 자신을 this 로 표현합니다. 자기 자신에서 MainActivity 화면으로 넘어가게하는 코딩입니다.
                startActivity(intent);
                finish();

            }
        },3000);  // 3초 뒤에 화면 전환이 이루어 집니다.



    }
}

