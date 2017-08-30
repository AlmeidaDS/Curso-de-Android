package com.graceland.curso.musicmix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

       TextView textView;
       ListView listView;
       AppCompatActivity context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView descricao = (TextView) findViewById(R.id.descricao);
        TextView estilomusical = (TextView) findViewById(R.id.estilomusical);
        TextView idade = (TextView) findViewById(R.id.idade);
        TextView nome = (TextView) findViewById(R.id.nome);
        final ArrayList<Artista> list = FabricaDeArtistas.gerarArtistas();
        String [] nomesArtistas = new String[list.size()];

        for (int i=0; i<list.size();i++){
            nomesArtistas[i] = list.get(i).getNome();
        }

        ListView listView = (ListView) findViewById(R.id.lista);
        final ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_list_item_1,nomesArtistas);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent detailedActivity = new Intent();
                //Bundle criado para CARACTERISTICAS //
                Bundle b = new Bundle();
                b.putString("Nome", list.get(position).getNome());
                b.putString("Descricao",list.get(position).getDescriçao());
                b.putStringArray("EstiloMusical",list.get(position).getEstiloMusical());
                b.putString("Idade",list.get(position).getIdade());
                b.putString("FotodoPerfil",list.get(position).getFotoPerfil());
                b.putStringArray("Musicas", list.get(position).getListadeMusicas());
                b.putInt("SongID", list.get(position).getSongId());
                detailedActivity.putExtras(b);




                detailedActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                detailedActivity.setClass(context, DetailedArtistActivity.class);
                startActivity(detailedActivity);
            }
        });


    }
}
