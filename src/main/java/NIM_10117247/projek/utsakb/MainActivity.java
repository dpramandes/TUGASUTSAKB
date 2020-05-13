package NIM_10117247.projek.utsakb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Tanggal Pembuatan : 8 Mei 2020
// Nama  : Dzicko Pasuci Ramandes
// NIM   : 10117247
// Kelas : IF-8

public class MainActivity extends AppCompatActivity {

    private int waktu_loading=3000;

    //3000=3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler = new Handler();
         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke home activity

                Intent home=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}
