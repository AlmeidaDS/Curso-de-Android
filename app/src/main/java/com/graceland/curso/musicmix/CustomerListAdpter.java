package com.graceland.curso.musicmix;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by root on 9/14/17.
 */

public class CustomerListAdpter extends BaseAdapter {

    private Activity mContext;
    private int[] mImages;
    private String [] nomeArt;
    private String[] style;

    public CustomerListAdpter(Activity context,int[] images,String[] stilo,String[] nome){
        mContext = context;
        nomeArt = nome;
        style = stilo ;
        mImages = images;
    }

    @Override
    public int getCount() {
        return nomeArt.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(R.layout.customerartist, parent, false);
        holder.artisname = (TextView) convertView.findViewById(R.id.nomedoartista);
        holder.profilePicDoArtista = (ImageView) convertView.findViewById(R.id.fotodoartista);
        holder.estilo = (TextView) convertView.findViewById(R.id.estilodemusica);

        holder.artisname.setText(nomeArt[position]);
        holder.profilePicDoArtista.setImageResource(mImages[position]);
        holder.estilo.setText(style[position]);
        return convertView;
    }
    public class Holder{
        TextView artisname;
        ImageView profilePicDoArtista;
        TextView estilo;

    }
}

