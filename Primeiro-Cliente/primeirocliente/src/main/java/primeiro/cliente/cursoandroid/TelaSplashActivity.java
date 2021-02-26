package primeiro.cliente.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaSplashActivity extends AppCompatActivity {

    String TAG = "PRIMEIRO_CLIENTE";

    ImageView image;

    TextView txtNomeApp;
    TextView txtAppVersion;

    int tempoDeEspera = 1000 * 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        Log.d(TAG, "onCreate: Tela Splash carregada...");

        image = findViewById(R.id.imgLogo);

        txtNomeApp = findViewById(R.id.textNomeApp);
        txtAppVersion = findViewById(R.id.textAppVersion);

        trocarTela();
    }

    private void trocarTela() {

        Log.d(TAG, "trocarTela: Mudando para tela principal...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.d(TAG, "trocarTela: Esperando um tempo...");
                Intent trocarDeTela = new Intent(TelaSplashActivity.this,MainActivity.class);
                startActivity(trocarDeTela);
                finish();

            }
        },tempoDeEspera);


    }
}