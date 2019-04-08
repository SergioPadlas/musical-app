package android.example.musicalapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView favoritas = findViewById(R.id.favoritas);
        favoritas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoritasIntent = new Intent(MainActivity.this, FavoritasActivity.class);
                startActivity(favoritasIntent);
            }
        });

        TextView dowloads = findViewById(R.id.dowloads);
        dowloads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dowloadsIntent = new Intent(MainActivity.this, DowloadsActivity.class);
                startActivity(dowloadsIntent);
            }
        });

        TextView albuns = findViewById(R.id.albuns);
        albuns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albunsIntent = new Intent(MainActivity.this, AlbunsActivity.class);
                startActivity(albunsIntent);
            }
        });

        TextView artista = findViewById(R.id.artistas);
        artista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistaIntent = new Intent(MainActivity.this, ArtistasActivity.class);
                startActivity(artistaIntent);
            }
        });


    }

}
