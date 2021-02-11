package igor.lima.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    int tempoDeEspera = 1000 * 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "onCreate: Tela Splash carregada...");

        trocarTela();
    }

    private void trocarTela() {

        Log.d(TAG, "trocarTela: Mudando para tela principal...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.d(TAG, "trocarTela: Esperando um tempo...");

                Intent trocalDeTela = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(trocalDeTela);
                finish();
            }
        },tempoDeEspera);
    }
}