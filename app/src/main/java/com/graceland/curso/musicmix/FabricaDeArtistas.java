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
            chrisBrown.setListadeMusicas(new String[] {"Loyal"});
            chrisBrown.setEstiloMusical(new String[]{"Rap/R&b"});
            chrisBrown.setIdade(" 27 anos");
            chrisBrown.setAltura("1,84m");
            chrisBrown.setSongId(R.raw.song);
            chrisBrown.setFotoPerfil("http://ima.ulximg.com/image/405x405/artist/1392667111_de9e68d2eaa029b400b942e2824f1b24.jpg/fa5bba411435bb15128bd0e1a1a0437c/1392667111_chris_brown_billboard_music_awards_2013_red_carpet_01_48.jpg");
            chrisBrown.setDescriçao("Brown aprendeu sozinho a cantar e dançar em uma idade jovem, muitas vezes citando Michael Jackson como inspiração");
            chrisBrown.setListadeMusicas(new String[]{"http://yt-dm-c.howwe.biz/h/373"});

            Artista drake = new Artista();
            drake.setNome("Drake");
            drake.setEstiloMusical(new String[]{"Hip Hop","R&B"});
            drake.setIdade("31 anos");
            drake.setAltura("1,82m");
            drake.setListadeMusicas(new String[] {"Shut it down ft The Dream"});
            drake.setSongId(R.raw.drake);
            drake.setFotoPerfil("http://thefader-res.cloudinary.com/images/w_1440,c_limit,f_auto,q_auto:best/Fader_Drake_Peckmezian_high_res_v3-2015-08-31_010_auffnh/drake-views-from-the-6-cover-story-interview.jpg");
            drake.setDescriçao("Drake afirmou que Kanye West, Jay-Z, Aaliyah e seu mentor Lil Wayne são suas maiores influências.");
            artistas.add(chrisBrown);
            artistas.add(drake);

            Artista blackcoffee = new Artista();
            blackcoffee.setNome("Black Coffee");
            blackcoffee.setEstiloMusical( new String[]{"Rap/Hip Hop"});
            blackcoffee.setIdade("35 anos");
            blackcoffee.setSongId(R.raw.blackcoffee);
            blackcoffee.setAltura("1.72");
            blackcoffee.setFotoPerfil("http://www.edmtunes.com/wp-content/uploads/2017/03/Black-Coffee.jpg");
            blackcoffee.setListadeMusicas(new String[]{"In common ft Alicia Keys"});
            blackcoffee.setDescriçao("Black Coffee (born Nkosinathi Maphumulo on 11 March 1976) is a South African record producer and DJ. He began his career around 1995");
            artistas.add(blackcoffee);

            Artista hillsong = new Artista();
            hillsong.setNome("Hillsong");
            hillsong.setDescriçao("Hillsong United é conhecido como um grupo musical gospel formado por jovens da Hillsong Church, na Austrália. Sua música é de louvor e adoração a Deus, com um estilo pop-rock contemporâneo e algumas influências de rock. O grupo já se apresentou em vários países do mundo e atualmente possui como líder Joel Houston (filho dos Pastores Sênior da Hillsong Church em Sydney, Brian Houston e Bobbie Houston e irmão de Benjamin Houston e Laura Houston-Toggs).");
            hillsong.setEstiloMusical(new String []{"Religiosa"});
            hillsong.setIdade("31 Anos");
            hillsong.setAltura("1,77");
            hillsong.setSongId(R.raw.strength);
            hillsong.setFotoPerfil("https://boldlions.files.wordpress.com/2014/02/hillsonglogo-photobucket.jpg");
            artistas.add(hillsong);

            return artistas;
    }
}
