package com.example.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Counter counter = new Counter();

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonPlus:
                Counter.getRaise();
                break;
            case R.id.buttonMinus:
                Counter.getLower();
                break;
            case R.id.imageButtonReset:
                Counter.getReset();
                break;
        }
        TextView tv = findViewById(R.id.textViewCounter);
        RadioGroup rg = findViewById(R.id.radioGroup);
        int chosen = rg.getCheckedRadioButtonId();
        if (chosen == R.id.radioButtonBinary)
            tv.setText(Integer.toBinaryString(Counter.Value()));
        else if (chosen == R.id.radioButtonDecimal)
            tv.setText(Integer.toString(Counter.Value()));
        else if (chosen == R.id.radioButtonHexadecimal)
            tv.setText(Integer.toHexString(Counter.Value()));
        Log.i("DGB", "Radionappia painettiin ");
    }
}