package edu.temple.colorpalettemultipleactivites;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        LinearLayout ll = (LinearLayout)findViewById(R.id.activity_canvas);

        Intent i = getIntent();

        ll.setBackgroundColor(Color.parseColor(i.getStringExtra("color_key")));
    }
}
