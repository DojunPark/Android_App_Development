package com.scjun.junny.app_1101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = (WebView) this.findViewById(R.id.web1);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true); // 웹뷰에서 자바스트립스 실행을 허용합니다.

        web.loadUrl("http://m.daum.net");

        Button btn0 = (Button) findViewById(R.id.button0);

        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);

        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);




        btn0.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                web.loadUrl("http://m.seoul.go.kr/traffic/RoadInfoMain.do");


            }
        });


        btn1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                web.loadUrl("http://m.work.go.kr/");


            }
        });


        btn2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                web.loadUrl("http://m.kma.go.kr/m/index.jsp");
            }
        });


        btn3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                web.loadUrl("https://maps.google.co.kr/");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                web.goBack();
            }
        });


        btn5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                web.reload();
            }
        });


        btn6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                web.goForward();
            }
        });



    }



}

