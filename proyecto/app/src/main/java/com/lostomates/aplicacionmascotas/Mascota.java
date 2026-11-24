package com.lostomates.aplicacionmascotas;

/** Entidad que da forma a cada ítem del RecyclerView. */
public class Mascota {
    public final String nombre;
    public final int imagen;
    public int rating;
    public boolean gustada;
    public Mascota(String nombre, int imagen, int rating) { this.nombre = nombre; this.imagen = imagen; this.rating = rating; }
}
