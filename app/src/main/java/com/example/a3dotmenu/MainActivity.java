package com.example.a3dotmenu;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchView searchView = findViewById(R.id.search_view1);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_setting:

                return true;
            case R.id.menu_contact:

                return true;
            case R.id.menu_profile:

                return true;
            case R.id.menu_exit:

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openSetting(MenuItem item) {
    }

    public void openProfile(MenuItem item) {
        Intent intent = new Intent(MainActivity.this,Profile.class);
        startActivity(intent);

    }

    public void openContactus(MenuItem item) {
    }

    public void openExit(MenuItem item) {
    }

    public void mobilephone(View view) {
        Intent i = new Intent(MainActivity.this,mobile.class);
        startActivity(i);
        Toast.makeText(this, "Cliked on MObile", Toast.LENGTH_SHORT).show();

    }

    public void Watch(View view) {
        Intent intent = new Intent(MainActivity.this,watch.class);
        startActivity(intent);
        Toast.makeText(this, "clicked on Watch", Toast.LENGTH_SHORT).show();
    }

    public void TvStore(View view) {
        Intent i = new Intent(MainActivity.this,Tv.class);
        startActivity(i);
        Toast.makeText(this, "clicked on Tvstore", Toast.LENGTH_SHORT).show();

    }

    public void joota(View view) {
        Intent i = new Intent(MainActivity.this,Joota.class);
        startActivity(i);
        Toast.makeText(this, "clicked on Shoes", Toast.LENGTH_SHORT).show();

    }

    public void Earphone(View view) {
        Toast.makeText(this, "clicked on Earphone", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,Earphone.class);
        startActivity(intent);
    }

    public void buds(View view) {
        Intent i = new Intent(MainActivity.this,Buds.class);
        startActivity(i);
        Toast.makeText(this, "clicked on Buds", Toast.LENGTH_SHORT).show();
    }

    public void Lehnga(View view) {
        Intent intent = new Intent(MainActivity.this,Lehnga.class);
        startActivity(intent);
        Toast.makeText(this, "clicked on Lehnga", Toast.LENGTH_SHORT).show();
    }

    public void Kurtapjama(View view) {
        Intent intent=new Intent(MainActivity.this,Kurtapjama.class);
        startActivity(intent);
        Toast.makeText(this, "clicked on Kuerta Pjama", Toast.LENGTH_SHORT).show();
    }

    public void Cycle(View view) {
        Intent intent = new Intent(MainActivity.this,Cycle.class);
        startActivity(intent);
        Toast.makeText(this, "clicked on Cycle", Toast.LENGTH_SHORT).show();

    }

    public void BikeBullet(View view) {
        Intent intent = new Intent(MainActivity.this,Bike.class);
        startActivity(intent);
        Toast.makeText(this, "clicked on bullet", Toast.LENGTH_SHORT).show();

    }

    public void GroceryFood(View view) {
        Intent intent = new Intent(MainActivity.this,GroceryFood.class);
        startActivity(intent);
        Toast.makeText(this, "clicked on Grocery Food", Toast.LENGTH_SHORT).show();
    }

    public void Bartan(View view) {
        Intent i = new Intent(MainActivity.this,BartanKitchen.class);
        startActivity(i);
        Toast.makeText(this, "clicked on Bartan ", Toast.LENGTH_SHORT).show();

    }
}