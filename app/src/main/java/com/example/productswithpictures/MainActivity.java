package com.example.productswithpictures;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.products_list);

        Cursor c = null; // TODO: загрузить БД, сделать выборку из таблицы
        ProductsAdapter adapter = new ProductsAdapter(this, c, 0);
        lv.setAdapter(adapter);
    }
}
