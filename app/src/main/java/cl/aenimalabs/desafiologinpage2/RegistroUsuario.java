package cl.aenimalabs.desafiologinpage2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroUsuario extends AppCompatActivity {

    private Spinner spinner;
    private EditText txt_us, txt_email, txt_pass, txt_confirmpass;
    private RadioButton rb_mas, rb_fem;
    private Button boton_registrar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txt_us=findViewById(R.id.usuario_registro);
        txt_email= findViewById(R.id.email);
        txt_pass = findViewById(R.id.pass_registro);
        txt_confirmpass= findViewById(R.id.confirm_pass);

        final Button bt_registro= findViewById(R.id.registro_reg);
        final Context context = getApplicationContext();

        bt_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuariotexto = txt_us.getText().toString();
                String passtexto = txt_pass.getText().toString();
                String email = txt_email.getText().toString();
                String confirmpass = txt_confirmpass.getText().toString();
                if (passtexto.equals(confirmpass)){
                    if (!passtexto.isEmpty() && !usuariotexto.isEmpty() && !email.isEmpty()  && !confirmpass.isEmpty()){
                        Intent intent = new Intent(RegistroUsuario.this, HomeActivity.class);
                        startActivity(intent);
                    }
                }else
                    Toast.makeText(context, "Contraseñas distintas", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
