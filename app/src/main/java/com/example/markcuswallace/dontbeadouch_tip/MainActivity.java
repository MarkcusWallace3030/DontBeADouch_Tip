package com.example.markcuswallace.dontbeadouch_tip;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup.*;
import java.text.DecimalFormat;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
/** These are generated once the application loads. */
EditText ba = null;
TextView ta = null;
RadioButton t10 = null;
RadioButton t15 = null;
RadioButton t20 = null;
RadioGroup rg = null;
DecimalFormat df = new DecimalFormat("$####.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ba=(EditText)findViewById(R.id.bill_amount);
        ta=(TextView) findViewById(R.id.tip_amount);
        t10=(RadioButton)findViewById(R.id.ten);
        t20=(RadioButton)findViewById(R.id.twenty);
        t15=(RadioButton)findViewById(R.id.fifteen);
        rg=(RadioGroup)findViewById(R.id.tip_choices);
        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        //Logic for onChecked Radiobuttons in the radiogroup
        if(i==t10.getId())
            ta.setText(df.format(Double.parseDouble(ba.getText().toString())*.10));
        if(i==t15.getId())
            ta.setText(df.format(Double.parseDouble(ba.getText().toString())*.15));
        if(i==t20.getId())
            ta.setText(df.format(Double.parseDouble(ba.getText().toString())*.20));
    }
}
