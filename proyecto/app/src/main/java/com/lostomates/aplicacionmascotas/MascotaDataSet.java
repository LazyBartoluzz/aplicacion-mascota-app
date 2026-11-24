package com.lostomates.aplicacionmascotas;

import java.util.ArrayList;
import java.util.List;

/** DataSet hardcodeado para las partes 1 y 2 del ejercicio. */
public final class MascotaDataSet {
    private MascotaDataSet() { }
    public static List<Mascota> listaPrincipal() {
        List<Mascota> lista = new ArrayList<Mascota>();
        lista.add(new Mascota("Max", R.drawable.pet_max, 13));
        lista.add(new Mascota("Luna", R.drawable.pet_luna, 9));
        lista.add(new Mascota("Rocky", R.drawable.pet_rocky, 16));
        lista.add(new Mascota("Nala", R.drawable.pet_nala, 7));
        lista.add(new Mascota("Toby", R.drawable.pet_toby, 10));
        lista.add(new Mascota("Misha", R.drawable.pet_misha, 5));
        lista.add(new Mascota("Bella", R.drawable.pet_bella, 7));
        return lista;
    }
    public static List<Mascota> cincoDummy() {
        List<Mascota> lista = listaPrincipal();
        return new ArrayList<Mascota>(lista.subList(0, 5));
    }
}
