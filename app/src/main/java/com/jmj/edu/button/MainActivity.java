package com.jmj.edu.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickwidget(View view) {
        int id = view.getId();
        String text ="null";
        switch (id) {
            case R.id.button1:
                text = ((Button)view).getText().toString();
                break;
            case R.id.button2:
                text="This is Button2";
                break;
            case R.id.toggleButton:
                text = ((ToggleButton)view).getText().toString();
                 break;
            case R.id.imageButton:
                text="this is an Image Button";
                break;
            default:
                text="Nothing";
                break;
        }
        Toast.makeText(view.getContext(), text , Toast.LENGTH_SHORT).show();
    }
}
