package com.example.databindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView not necessary while initialize binding object*/
        //setContentView(R.layout.activity_main);
        //initialize
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        /*we are avoiding the findviewByID() method calls.
        Direct accessing of view on the xml file is now enabled */
        binding.textView.setText(String.valueOf(count));
      /*  binding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                //displaying data
                binding.textView.setText(String.valueOf(count));
            }
        });
        binding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                binding.textView.setText(String.valueOf(count));
            }
        });*/
        /*Here we are implemented onclick listner two times one for plus and second for minus
        that is not recommended */
        binding.plus.setOnClickListener(this);
        binding.minus.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==binding.plus.getId()){
            count++;
        }
        if(v.getId()==binding.minus.getId()){
            count--;
        }
        binding.textView.setText(String.valueOf(count));

    }
}