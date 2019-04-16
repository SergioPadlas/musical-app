package android.example.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbunsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albuns);

        ArrayList<Albun> albuns = new ArrayList<Albun>();

        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));
        albuns.add(new Albun("VERIFICA", "Não Sei o NOME "));

        AlbunAdapter adapter = new AlbunAdapter(this, albuns);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
