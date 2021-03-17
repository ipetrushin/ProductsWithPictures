package com.example.productswithpictures;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductsAdapter extends CursorAdapter {
    public ProductsAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ImageView picture = view.findViewById(R.id.picture);
        TextView tvName = view.findViewById(R.id.name);
        TextView tvPrice = view.findViewById(R.id.price);

        String name = cursor.getString(cursor.getColumnIndex("name"));
        int price = cursor.getInt(cursor.getColumnIndex("price"));
        String url = cursor.getString(cursor.getColumnIndex("picture"));

        tvName.setText(name);
        tvPrice.setText(Integer.toString(price));
        // image view set picture
        picture.setImageResource(R.drawable.user_unknown);
    }
}
