package saxobyte.web.utsakb;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

//Tanggal Pembuatan : 8 Mei 2020
// Nama  : Dzicko Pasuci Ramandes
// NIM   : 10117247
// Kelas : IF-8

public class activity_home extends AppCompatActivity {
    Toolbar mToolbar;
    ViewPager mViewPager;
    TabLayout mTabLayout;
    TabPageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mToolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setSubtitle("Created by: Dziko Pasuci Ramandes");
        mViewPager = findViewById(R.id.main_viewpager);
        mAdapter = new TabPageAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mTabLayout = findViewById(R.id.main_tab_layout);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public void OpenGmail (View view){
        String url = "mailto:dzikopasuci125@gmail.com";
        Intent bukaGmail = new Intent(Intent.ACTION_VIEW);
        bukaGmail.setData(Uri.parse(url));
        startActivity(bukaGmail);
    }

    public void OpenWhatsapp (View view){
        String url = "https://api.whatsapp.com/send?phone=6285314588833";
        Intent bukaWhatsapp = new Intent(Intent.ACTION_VIEW);
        bukaWhatsapp.setData(Uri.parse(url));
        startActivity(bukaWhatsapp);
    }

    public void OpenInstagram (View view){
        String url = "https://www.instagram.com/dzikopasuci/";
        Intent bukaInstagram = new Intent(Intent.ACTION_VIEW);
        bukaInstagram.setData(Uri.parse(url));
        startActivity(bukaInstagram);
    }

    public void OpenFacebook (View view){
        String url = "https://www.facebook.com/IminxX";
        Intent bukaGmail = new Intent(Intent.ACTION_VIEW);
        bukaGmail.setData(Uri.parse(url));
        startActivity(bukaGmail);
    }
}
