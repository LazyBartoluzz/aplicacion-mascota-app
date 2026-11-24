package com.lostomates.aplicacionmascotas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/** Adapter que une el DataSet con el ViewHolder. */
public class MascotaAdapter extends RecyclerView.Adapter<MascotaViewHolder> {
    private final List<Mascota> mascotas; private final boolean permiteRating;
    public MascotaAdapter(List<Mascota> mascotas, boolean permiteRating) { this.mascotas = mascotas; this.permiteRating = permiteRating; }
    @Override public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int type) { return new MascotaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mascota, parent, false)); }
    @Override public void onBindViewHolder(final MascotaViewHolder holder, int position) {
        final Mascota mascota = mascotas.get(position); holder.foto.setImageResource(mascota.imagen); holder.nombre.setText(mascota.nombre); holder.rating.setText(String.valueOf(mascota.rating));
        holder.gustar.setVisibility(permiteRating ? View.VISIBLE : View.INVISIBLE);
        holder.gustar.setImageResource(mascota.gustada ? R.drawable.ic_bone_yellow : R.drawable.ic_bone_outline);
        holder.gustar.setOnClickListener(permiteRating ? new View.OnClickListener() { @Override public void onClick(View view) { mascota.gustada = !mascota.gustada; mascota.rating += mascota.gustada ? 1 : -1; notifyItemChanged(holder.getAdapterPosition()); } } : null);
    }
    @Override public int getItemCount() { return mascotas.size(); }
}
