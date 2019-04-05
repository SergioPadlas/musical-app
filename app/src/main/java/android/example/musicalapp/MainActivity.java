package android.example.musicalapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void abrirFavoritas (View view){
        Intent favoritas = new Intent(this, FavoritasActivity.class);
        startActivity(favoritas);
    }

    public void abrirDowloads (View view){
        Intent dowloads = new Intent(this, DowloadsActivity.class);
        startActivity(dowloads);
    }

    public void abrirAlbuns (View view){
        Intent albuns = new Intent(this, AlbunsActivity.class);
        startActivity(albuns);
    }

    public void abrirArtistas (View view){
        Intent artistas = new Intent(this, ArtistasActivity.class);
        startActivity(artistas);
    }
}
