package com.javalera.light;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    // Fields
    private boolean isOn = true;
    private Button button;
    private View layout;

    //Methods
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setBackgroundColor(Color.TRANSPARENT);
        layout = findViewById(R.id.layout);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(isOn)
                    isOn = false;
                else
                    isOn = true;
                updateUI();
            }
        });
    }

    private void updateUI()
    {
        if (isOn)
        {
            findViewById(R.id.layout).setBackgroundColor(Color.WHITE);
        }
        else
        {
            findViewById(R.id.layout).setBackgroundColor(Color.DKGRAY);
        }
    }
}