package edu.niu.cs.z1759385.anilburger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private RadioGroup rbPatty,rbCheese;
    public Burger burger = new Burger();
    private CheckBox cbBacon;
    private SeekBar seek1;
    private TextView resultTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbPatty = (RadioGroup) findViewById(R.id.pattyRG);
        rbCheese = (RadioGroup) findViewById(R.id.cheeseRG);
        cbBacon = (CheckBox) findViewById(R.id.baconCB);
        seek1 = (SeekBar) findViewById(R.id.seekBar);
        resultTV = (TextView)findViewById(R.id.tbResult);
        displayCalories();
        rbPatty.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

              switch (checkedId)
              {
                  case R.id.veggieRB:
                      burger.setPatty(Burger.VEGPATTIE);
                      break;
                  case R.id.beefRB:
                      burger.setPatty(Burger.BEEFPATTIE);
                      break;

              }
                /*
                if (checkedId == R.id.veggieRB) {

                    burger.setPatty(Burger.VEGPATTIE);
                    displayCalories();
                }
                if (checkedId == R.id.beefRB) {

                    burger.setPatty(Burger.BEEFPATTIE);
                    displayCalories();
                }*/
                displayCalories();
            }
        });
        cbBacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // burger.setBacon(Burger.BACON);
                if( ((CheckBox)v).isChecked())
                {
                    burger.setBacon(Burger.BACON);

                }
                else
                {
                    burger.setBacon(0);

                }
                displayCalories();
            }
        });
        rbCheese.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbCheese)
                    burger.setCheese(Burger.CHEESE);
                if (checkedId == R.id.rbNoCheese)
                    burger.setCheese(Burger.NOCHEESE);
                displayCalories();
            }
        });
        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                burger.setSauce(seekBar.getProgress());
                displayCalories();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
        void displayCalories()
        {
        // burger.setTotalCalories(burger.getBacon() + burger.getCheese() + burger.getPatty());
            int total = burger.getTotalCalories();

            resultTV.setText("Total calories are "+total);

        }


}
