package com.frandog.a20180209_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

//    可在網上搜尋"Google admob"，並配合上方tools/firebase來掛廣告，或可利用其他廣告商，例如"Vpon"、"google adsence"
//        網路上中文版快速入門有些已經不適用，例如gradle，manifests中只要開2個網路權限
//    要注意測試時不能點真的廣告，不然會被判斷自肥而被禁帳號，要用測試廣告ID或是"Add your test device"在code中寫進測試手機的編碼
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
