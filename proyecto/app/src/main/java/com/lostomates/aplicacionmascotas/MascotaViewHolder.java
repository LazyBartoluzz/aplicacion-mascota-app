package com.lostomates.aplicacionmascotas;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/** ViewHolder de la fila mascota. */
public class MascotaViewHolder extends RecyclerView.ViewHolder {
    final ImageView foto; final TextView nombre; final TextView rating; final ImageButton gustar;
    public MascotaViewHolder(View itemView) {
        super(itemView); foto = (ImageView) itemView.findViewById(R.id.foto); nombre = (TextView) itemView.findViewById(R.id.nombre);
        rating = (TextView) itemView.findViewById(R.id.rating); gustar = (ImageButton) itemView.findViewById(R.id.gustar);
    }
}
