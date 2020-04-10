package com.scjun.junny.app_0802;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    SoundPool soundf;  // 사운드풀 타입을 선언합니다.
    Button btn;  // 버튼 타입을 선언합니다.
    int tom;   // 정수형 변수를 선언합니다.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundf = new SoundPool(1, AudioManager.STREAM_MUSIC,0); // 자바 학습을 하시면서 객체생성에 대해 학습하시기 바랍니다.
        tom = soundf.load(this,R.raw.drum1,0);  // 음원 파일의 경로를 적습니다.

        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                soundf.play(tom, 1, 1, 0, 0, 1); // 플레이되는 음원의 속성을 정의합니다.

            }
        });
    }
    }

