package com.example.hwhong.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                //toast.setGravity(Gravity.BOTTOM, 0, 0);

                inflater = getLayoutInflater();
                //the second parameter takes in the root of the custom toast layout
                //which is the relative layout in this case
                View appearance = inflater.inflate(R.layout.customtoast,
                        (ViewGroup) findViewById(R.id.relativeLayout));
                //returns a view object

                toast.setView(appearance);
                toast.show();
            }
        });
    }
}
