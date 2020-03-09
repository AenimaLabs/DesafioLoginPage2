package cl.aenimalabs.desafiologinpage2;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class HomeActivity extends AppCompatActivity {

    //relacionar la clase HhomeActivity con el layout activity_home
    @Override
    public void onCreate (@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String url= getString(R.string.url);
        ImageView imagen = findViewById(R.id.imagen_home);
        Picasso.get().load(url).into(imagen);
    }
}
