package com.graceland.curso.musicmix;

import android.widget.ListView;

import com.graceland.curso.musicmix.API.API;

import java.util.ArrayList;

/**
 * Created by alexandre on 8/18/17.
 */

public class FabricaDeArtistas {

    public static ArrayList<Artista> gerarArtistas (){

            ArrayList<Artista> artistas = new ArrayList<>();
            Artista chrisBrown = new Artista();
            chrisBrown.setNome("Chris Brown");
            chrisBrown.setEstiloMusical(new String[]{"Rap/R&b"});
            chrisBrown.setIdade(" 27");
            chrisBrown.setAltura("1,84m");
            chrisBrown.setFotoPerfil("http://ima.ulximg.com/image/405x405/artist/1392667111_de9e68d2eaa029b400b942e2824f1b24.jpg/fa5bba411435bb15128bd0e1a1a0437c/1392667111_chris_brown_billboard_music_awards_2013_red_carpet_01_48.jpg");
            chrisBrown.setDescriçao("Brown aprendeu sozinho a cantar e dançar em uma idade jovem, muitas vezes citando Michael Jackson como inspiração");

            Artista drake = new Artista();
            drake.setNome("Drake");
            drake.setEstiloMusical(new String[]{"Hip Hop","R&B"});
            drake.setIdade("31");
            drake.setAltura("1,82m");
            drake.setFotoPerfil("http://thefader-res.cloudinary.com/images/w_1440,c_limit,f_auto,q_auto:best/Fader_Drake_Peckmezian_high_res_v3-2015-08-31_010_auffnh/drake-views-from-the-6-cover-story-interview.jpg");
            drake.setDescriçao("Drake afirmou que Kanye West, Jay-Z, Aaliyah e seu mentor Lil Wayne são suas maiores influências.");

            artistas.add(chrisBrown);
            artistas.add(drake);

            return artistas;
    }
}
