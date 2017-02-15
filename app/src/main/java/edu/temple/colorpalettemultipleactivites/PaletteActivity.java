package edu.temple.colorpalettemultipleactivites;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;

public class PaletteActivity extends AppCompatActivity {

    String[] myColors = {"No selection", "Red", "Blue", "Grey", "Yellow", "Cyan", "Black", "LightGray", "Green", "Magenta", "DarkGray"};
    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        GridView gv = (GridView) findViewById(R.id.gridview);
        rl = (RelativeLayout) findViewById(R.id.activity_palette);


        final ColorAdapter colorAdapter = new ColorAdapter(this, myColors);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent newIntent = new Intent(PaletteActivity.this, CanvasActivity.class);

                newIntent.putExtra("color_key", colorAdapter.getItem(i).toString());

                startActivity(newIntent);

            }
        });

        gv.setAdapter(colorAdapter);


    }
}
