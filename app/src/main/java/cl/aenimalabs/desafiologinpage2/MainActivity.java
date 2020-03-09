package cl.aenimalabs.desafiologinpage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    private String url;
    private ImageView imagen;
    private EditText txt_usuario, txt2_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url= getString(R.string.url);
        imagen = findViewById(R.id.imagenlatam);
        Picasso.get().load(url).into(imagen);

        txt_usuario= findViewById(R.id.editText2);
        txt2_pass= findViewById(R.id.editText3);

        final Button bt_ingreso = findViewById(R.id.button);
        final Button bt_registro= findViewById(R.id.button2);
        final Context context = getApplicationContext(); // se usa para darle contexto

           bt_ingreso.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       String usuariotexto = txt_usuario.getText().toString();
                       String passtexto = txt2_pass.getText().toString();

                       if (!passtexto.isEmpty() && !usuariotexto.isEmpty()){
                           Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                           startActivity(intent);

                       }else
                           Toast.makeText(context, "Llena los datos", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        bt_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistroUsuario.class);
                startActivity(intent);
            }
        });

    }





}
