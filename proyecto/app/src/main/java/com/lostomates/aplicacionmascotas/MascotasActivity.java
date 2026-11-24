package com.lostomates.aplicacionmascotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/** Activity padre con RecyclerView y Action View de estrella. */
public class MascotasActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle state) {
        super.onCreate(state); setContentView(R.layout.activity_lista);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); toolbar.setTitle(R.string.mascotas); setSupportActionBar(toolbar);
        RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler); recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new MascotaAdapter(MascotaDataSet.listaPrincipal(), true));
    }
    @Override public boolean onCreateOptionsMenu(Menu menu) { getMenuInflater().inflate(R.menu.menu_mascotas, menu); return true; }
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_favoritas) { startActivity(new Intent(this, FavoritasActivity.class)); return true; }
        return super.onOptionsItemSelected(item);
    }
}
