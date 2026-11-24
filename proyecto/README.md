# Mascotas App

Proyecto Android independiente, hecho en Java/XML, para las partes 1 y 2 del ejercicio RecyclerView.

## Estructura

- `Mascota`: entidad de cada fila.
- `MascotaDataSet`: lista principal y cinco mascotas Dummy.
- `MascotaAdapter` y `MascotaViewHolder`: implementación del RecyclerView.
- `MascotasActivity`: lista principal y Action View de estrella.
- `FavoritasActivity`: muestra cinco ítems Dummy y permite volver a la Activity padre.

El hueso contorneado permite dar o retirar rating. Al marcarlo, se vuelve amarillo y el contador cambia en una unidad.

Compatibilidad: `minSdk 15` Android 4.0.3 y `targetSdk 23` Android 6.0.
