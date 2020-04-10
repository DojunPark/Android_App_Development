package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //실행 구간

        //버튼 1
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 메세지 띄우기
                Toast.makeText(getApplicationContext(),"버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();

                // 링크 열기
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(intent1);

            }
        });

        // 버튼 2
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 페이지 이동
                Intent intent2 = new Intent(MainActivity.this, OneActivity.class);
                startActivity(intent2);

            }
        });

        // 버튼 3
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 페이지 이동
                Intent intent3 = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent3);

            }
        });


    }
}
