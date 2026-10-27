package com.rocket.maxkiller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(50, 50, 50, 50);

        TextView tv = new TextView(this);
        tv.setText("Нажми кнопку, найди 'Max Killer' в списке и включи.");
        tv.setTextSize(18f);

        Button btn = new Button(this);
        btn.setText("Включить службу");
        btn.setOnClickListener(v -> startActivity(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)));

        layout.addView(tv);
        layout.addView(btn);
        setContentView(layout);
    }
}