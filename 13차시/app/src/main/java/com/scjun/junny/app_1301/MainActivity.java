package com.scjun.junny.app_1301;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    SoundPool soundf;
    Button btn1,btn2,btn3,btn4;
    int tom1,tom2,tom3,tom4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundf = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        tom1 = soundf.load(this, R.raw.sound11, 1);   // 음원 파일명을 적습니다.
        tom2 = soundf.load(this, R.raw.sound22, 1);   // 음원 파일명을 적습니다.
        tom3 = soundf.load(this, R.raw.sound33, 1);   // 음원 파일명을 적습니다.
        tom4 = soundf.load(this, R.raw.sound44, 1);   // 음원 파일명을 적습니다.


        btn1 = (Button)findViewById(R.id.bbb1);
        btn2 = (Button)findViewById(R.id.bbb2);
        btn3 = (Button)findViewById(R.id.bbb3);
        btn4 = (Button)findViewById(R.id.bbb4);


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                soundf.play(tom1, 1, 1, 0, 0, 1);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                soundf.play(tom2, 1, 1, 0, 0, 1);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                soundf.play(tom3, 1, 1, 0, 0, 1);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                soundf.play(tom4, 1, 1, 0, 0, 1);

            }
        });


    }

}
