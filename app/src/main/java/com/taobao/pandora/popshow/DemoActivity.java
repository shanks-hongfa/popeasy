package com.taobao.pandora.popshow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DemoActivity extends AppCompatActivity {


    private ViewGroup container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        container = (ViewGroup) findViewById(R.id.container);
        add(PopWindowActivity.class);
    }


    private void add(final Class<?> clazz) {
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.item_demo, container, false);
        textView.setText(clazz.getSimpleName());
        container.addView(textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DemoActivity.this, clazz);
                startActivity(intent);
            }
        });

    }
}
