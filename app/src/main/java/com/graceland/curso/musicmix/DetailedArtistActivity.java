package com.graceland.curso.musicmix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailedArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_artist);
        TextView nome = (TextView) findViewById(R.id.nome);
        TextView descricao = (TextView) findViewById(R.id.descricao);
        TextView estiloMusical = (TextView) findViewById(R.id.estilomusical);
        TextView idade = (TextView) findViewById(R.id.idade);
        ImageView fotodoperfil =(ImageView) findViewById(R.id.imagem);

        Bundle bundle = getIntent().getExtras();

        if(bundle.isEmpty()) {
            // DO nothing
        } else {
            Picasso.with(this).load(bundle.getString("FotodoPerfil")).into(fotodoperfil);
            nome.setText(bundle.getString("Nome"));
            descricao.setText("Descrição: " + bundle.getString("Descricao"));
            estiloMusical.setText(bundle.getStringArray("EstiloMusical")[0]);
           idade.setText("Idade : " +bundle.getString("Idade"));

        }

    }
}
