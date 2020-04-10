package com.scjun.junny.app_0801;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = (WebView) this.findViewById(R.id.web1);   // 웹뷰에 아이디를 부여하고 웹뷰를 찾습니다.
        web.setWebViewClient(new WebViewClient());

        web.loadUrl("http://m.daum.net");   // 해당 주소로 사이트가 이동합니다.



    }
}
