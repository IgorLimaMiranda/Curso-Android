package igor.miranda.primeironivelamentojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import igor.miranda.primeironivelamentojava.model.Cliente;

public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente( "Igor Miranda", "teste@teste.com", "67992291122", 23, true);

        Log.i(TAG, "onCreate: objCliente Nome "+objCliente.getNome());
        Log.i(TAG, "onCreate: objCliente Email "+objCliente.getEmail());
        Log.i(TAG, "onCreate: objCliente Telefone "+objCliente.getTelefone());
        Log.i(TAG, "onCreate: objCliente Idade "+objCliente.getIdade());
        Log.i(TAG, "onCreate: objCliente Sexo "+objCliente.isSexo());
    }
}