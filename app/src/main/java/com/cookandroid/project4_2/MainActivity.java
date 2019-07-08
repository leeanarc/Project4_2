package com.cookandroid.project4_2;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoGo;
    /*Button btnOK;*/
    ImageView imgPet;
    Switch switch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        /*text1= (TextView) findViewById(R.id.Text1);*/
        final Switch sw = (Switch)findViewById(R.id.Switch1);
        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);

        text2= (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);

        rdoDog = (RadioButton) findViewById(R.id.RdoDog);
        rdoCat = (RadioButton) findViewById(R.id.RdoCat);
        rdoGo = (RadioButton) findViewById(R.id.RdoGo);


        /*btnOK = (Button) findViewById(R.id.BtnOK);*/
        imgPet = (ImageView) findViewById(R.id.ImgPet);
        Button exitButton = (Button) findViewById(R.id.exitButton);


        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(sw.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    /*btnOK.setVisibility(View.VISIBLE);*/
                    imgPet.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    /*btnOK.setVisibility(View.INVISIBLE);*/
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });



        /*chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                if(chkAgree.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });*/


        rGroup1.setOnCheckedChangeListener ( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rGroup1, @IdRes int i) {
                if(R.id.RdoDog ==i) {
                    imgPet.setImageResource(R.drawable.dog1);
                }else if (R.id.RdoCat ==i) {
                    imgPet.setImageResource(R.drawable.cat1);
                }else if (R.id.RdoGo == i) {
                    imgPet.setImageResource(R.drawable.go1);
                }
            }
        });


       /* rGroup1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                switch (rGroup1.getCheckedRadioButtonId()) {
                    case R.id.RdoDog :
                        imgPet.setImageResource(R.drawable.dog1);
                        break;
                    case R.id.RdoCat :
                        imgPet.setImageResource(R.drawable.cat1);
                        break;
                    case R.id.RdoGo :
                        imgPet.setImageResource(R.drawable.go1);
                        break;
                        default:
                            Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
       

    }



}
