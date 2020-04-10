package com.scjun.junny.app_1201;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.Button1);
        Button btn2 = (Button) findViewById(R.id.Button2);


        btn1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-111-1111"));  // 안드로이드 인텐트에 대해서 웹검색으로 학습하시기 바랍니다.
                startActivity(intent);   // 넘겨온 intent 를 실행합니다.
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-222-2222"));
                startActivity(intent);
            }
        });


    }
}


// manifests 폴더의 AndroidManifest.xml 파일에 <uses-permission android:name="android.permission.CALL_PHONE"/> 코드를 추가해야 합니다.