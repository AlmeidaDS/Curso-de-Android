package com.graceland.curso.musicmix;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Activity activity = this;
    private String stilo[] = new String[]{"RnB","RnB","Hevy Metal"};
    private String [] nameAtista = new String[]{"Chris Brown","Drake","Black Coffee"};
    private int [] images = new int[]{R.drawable.c,R.drawable.d,R.drawable.b,R.drawable.a};
    AppCompatActivity context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.lista);

        final ArrayList<Artista> list = FabricaDeArtistas.gerarArtistas();
        String [] nomesArtistas = new String[list.size()];

        for (int i=0; i<list.size();i++){
            nomesArtistas[i] = list.get(i).getNome();
        }

        CustomerListAdpter customerListAdpter = new CustomerListAdpter(this,images,stilo,nameAtista);
        listView.setAdapter(customerListAdpter);

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
