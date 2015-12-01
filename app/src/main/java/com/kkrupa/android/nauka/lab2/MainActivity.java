package com.kkrupa.android.nauka.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Moja aktywność";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText wpisanyTekst = (EditText) findViewById(R.id.idText);
        wpisanyTekst.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(event.getAction() == KeyEvent.ACTION_DOWN) {
                    Log.i(TAG, "Naciśnieto klawisz "+KeyEvent.keyCodeToString(keyCode));
                }
                if (keyCode == KeyEvent.KEYCODE_DPAD_CENTER) {
                    return true;
                }
                return false;
            }
        });
    }

    public void printText(View view) {
        EditText wpisanyTekst = (EditText) findViewById(R.id.idText);
        String tekst = wpisanyTekst.getText().toString();
        TextView wyswietlanyTekst = (TextView) findViewById(R.id.idWynik);

        if(tekst.length() >= 1) {
            wyswietlanyTekst.setText(tekst);
        }

        Log.i(TAG, "Naciśnięto przycisk OK");

    }
}
