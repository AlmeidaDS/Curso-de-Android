package com.graceland.curso.musicmix;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.IOException;

public class DetailedArtistActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer = new MediaPlayer();
    Context context =  this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_artist);
        TextView nome = (TextView) findViewById(R.id.nome);
        TextView descricao = (TextView) findViewById(R.id.descricao);
        TextView estiloMusical = (TextView) findViewById(R.id.estilomusical);
        TextView idade = (TextView) findViewById(R.id.idade);
        ImageView fotodoperfil =(ImageView) findViewById(R.id.imagem);
        final ImageButton play = (ImageButton) findViewById(R.id.imagePlay);
        play.setBackgroundResource(R.drawable.ic_play_circle_outline_black_36dp);
        
        final Bundle bundle = getIntent().getExtras();

        if(bundle.isEmpty()) {
            // DO nothing
        } else {

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                        Uri uri = Uri.parse("http://192.168.137.73/artists/songs/1.mp3");
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), bundle.getInt("SongID"));
                        mediaPlayer.isPlaying();
                        play.setBackgroundResource(R.drawable.ic_pause_black_36dp);

                    }catch (Exception e){
                        Toast.makeText(context, "Erro ao reproduzir ficheiro", Toast.LENGTH_SHORT).show();
                    }
                        
                }
            });


            Picasso.with(this).load(bundle.getString("FotodoPerfil")).into(fotodoperfil);
            nome.setText(bundle.getString("Nome"));
            descricao.setText("Descrição: " + bundle.getString("Descricao"));
            estiloMusical.setText(bundle.getStringArray("EstiloMusical")[0]);
           idade.setText("Idade : " +bundle.getString("Idade"));

        }

    }


}
