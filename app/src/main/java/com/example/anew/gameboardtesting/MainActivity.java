package com.example.anew.gameboardtesting;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.Objects;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {

    private EditText Et1; private EditText Et2; private EditText Et3;  private EditText Et4;private EditText Et5;
    private EditText Et6; private EditText Et7; private EditText Et8; private EditText Et9;private EditText Et10;
    private EditText Et11; private EditText Et12; private EditText Et13;  private EditText Et14;private EditText Et15;
    private EditText Et16; private EditText Et17; private EditText Et18;  private EditText Et19;private EditText Et20;
    private EditText Et21; private EditText Et22; private EditText Et23;  private EditText Et24;private EditText Et25;
    private EditText wordLetterNumber;
    private TextView message;private TextView pandaScore;private TextView userScore;
    private Button button;
    int clickCount=0;int i;
     int robot=0,user =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Et1 = (EditText) findViewById(R.id.EtShow);
        Et2 = (EditText) findViewById(R.id.EtShow2);
        Et3 = (EditText) findViewById(R.id.EtShow3);
        Et4 = (EditText) findViewById(R.id.EtShow4);
        Et5 = (EditText) findViewById(R.id.EtShow5);
        Et6 = (EditText) findViewById(R.id.EtShow6);
        Et7 = (EditText) findViewById(R.id.EtShow7);
        Et8 = (EditText) findViewById(R.id.EtShow8);
        Et9= (EditText) findViewById(R.id.EtShow9);
        Et10= (EditText) findViewById(R.id.EtShow10); Et11= (EditText) findViewById(R.id.EtShow11); Et12= (EditText) findViewById(R.id.EtShow12);
        Et13= (EditText) findViewById(R.id.EtShow13); Et14= (EditText) findViewById(R.id.EtShow14); Et15= (EditText) findViewById(R.id.EtShow15);
        Et16= (EditText) findViewById(R.id.EtShow16); Et17= (EditText) findViewById(R.id.EtShow17); Et18= (EditText) findViewById(R.id.EtShow18);
        Et19= (EditText) findViewById(R.id.EtShow19); Et20= (EditText) findViewById(R.id.EtShow20); Et21= (EditText) findViewById(R.id.EtShow21);
        Et22= (EditText) findViewById(R.id.EtShow22); Et23= (EditText) findViewById(R.id.EtShow23); Et24= (EditText) findViewById(R.id.EtShow24);
        Et25= (EditText) findViewById(R.id.EtShow25);//wordLetterNumber= (EditText) findViewById(R.id.WordNumberEt1);
        //text view
        message = (TextView) findViewById(R.id.messageTv);
        pandaScore = (TextView) findViewById(R.id.pandaScore);
        userScore = (TextView) findViewById(R.id.userScore);
        button = (Button) findViewById(R.id.DoneBtn);

       // Et2.setText("a", TextView.BufferType.EDITABLE);


            button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount=clickCount+1;
                if(clickCount==1){
                    //module 1
                    String s=Et1.getText().toString();
                    int k=0;
                    simpleText(s);
                    pandaWord(s,k);
                    String s1=Et2.getText().toString();
                    String w=s+s1;
                    simpleText2(w)  ;
                }else if(clickCount==2){
                    //module 2
                    String s2=Et3.getText().toString();
                    String s1=Et2.getText().toString();
                    int k1=2;
                    simpleText(s1+s2);
                    pandaWord(s2,k1);

                    String s3=Et4.getText().toString();
                    simpleText2(s2+s3);
                }else if(clickCount==3){
                    //moudle 3
                    String s4=Et5.getText().toString();
                    String s3=Et4.getText().toString();
                int k2=4;
                simpleText(s3+s4);
                pandaWord(s4,k2);
                String s5=Et6.getText().toString();
                simpleText2(s4+s5);
                }else if(clickCount==4){
                    //moudel 4
                    String s6=Et7.getText().toString();
                    String s5=Et6.getText().toString();
                int k3=6;
                simpleText(s5+s6);
                pandaWord(s6,k3);
                String s7=Et8.getText().toString();
                simpleText2(s6+s7);

                }else if (clickCount==5){//model 5
                    String s8=Et9.getText().toString();
                    String s7=Et8.getText().toString();
                int k4=8;
                simpleText(s7+s8);
                pandaWord(s8,k4);
                String s9=Et10.getText().toString();
                simpleText2(s8+s9);
                }else if(clickCount==6){
                    //model 6
                    String s10=Et11.getText().toString();
                    String s9=Et10.getText().toString();
                int k5=10;
                simpleText(s9+s10);
                pandaWord(s10,k5);
                String s11=Et12.getText().toString();
                simpleText2(s10+s11);
                }else if(clickCount==7){
                    //model 7
                    String s12=Et13.getText().toString();
                    String s11=Et12.getText().toString();
                int k6=12;
                simpleText(s11+s12);
                pandaWord(s12,k6);
                String s13=Et14.getText().toString();
                simpleText2(s12+s13);
                }else if(clickCount==8){
                    //model 8
                    String s14=Et15.getText().toString();
                    String s13=Et14.getText().toString();
                int k7=14;
                    simpleText(s13+s14);
                    pandaWord(s14,k7);
                    String s15=Et16.getText().toString();
                    simpleText2(s14+s15);
                }else if(clickCount==9){
                    //model 9
                    String s16=Et17.getText().toString();
                    String s15=Et16.getText().toString();
                int k8=16;
                simpleText(s15+s16);
                pandaWord(s16,k8);
                String s17=Et18.getText().toString();
                simpleText2(s16+s17);
                }else if(clickCount==10){
                    //model 10
                    String s18=Et19.getText().toString();
                    String s17=Et18.getText().toString();
                int k9=18;
                simpleText(s17+s18);
                pandaWord(s18,k9);
                String s19=Et20.getText().toString();
                simpleText2(s18+s19);
                }else if(clickCount==11){
                    //model 11
                    String s20=Et21.getText().toString();
                    String s19=Et20.getText().toString();
                int k10=20;
                simpleText(s19+s20);
                pandaWord(s20,k10);
                String s21=Et22.getText().toString();
                simpleText2(s20+s21);
                }else if(clickCount==12){
                    //module 12
                String s22=Et23.getText().toString();
                    String s21=Et22.getText().toString();
                int k11=22 ;
                simpleText(s21+s22);
                pandaWord(s22,k11);
                String s23=Et24.getText().toString();
                simpleText2(s22+s23);
                }else if(clickCount==13){
                    //module 13
                    String s24=Et25.getText().toString();
                    String s23=Et24.getText().toString();
                simpleText(s23+s24);

if(user>=robot){
    message.setText("User won the game");
}else{
    message.setText("Panda won the game");
}

                }




            }
        });}




    //editTextTwo.setText("Google is your friend.", TextView.BufferType.EDITABLE);


// for panda word check
    private void simpleText2(String word) {
        try {




            Toast.makeText(MainActivity.this, ""+word, Toast.LENGTH_SHORT).show();
            InputStream is = this.getResources().openRawResource(R.raw.word);
            byte[] buffer = new byte[is.available()];
            String jsontext=null;
            while (is.read(buffer) != -1) {
                jsontext = new String(buffer);
            }
            String arrr[]=jsontext.split(",");
            //code to linear search for element
            int l=arrr.length;
            for(  i=0;i<arrr.length;i++){
                if(arrr[i].equals(word)){
                    message.setText("yes");
                    ++robot;
                    pandaScore.setText(""+robot );


                    break;
                }
            }
            if(i==l){
                message.setText("no");

            }




            //textView.setText(jsontext);

        } catch (Exception e) {

            throw new RuntimeException("Error" + e);
        }


    }


//for user word check & score
    private void simpleText(String word) {
        try {




            Toast.makeText(MainActivity.this, ""+word, Toast.LENGTH_SHORT).show();
            InputStream is = this.getResources().openRawResource(R.raw.word);
            byte[] buffer = new byte[is.available()];
            String jsontext=null;
            while (is.read(buffer) != -1) {
                jsontext = new String(buffer);
            }
            String arrr[]=jsontext.split(",");
 //code to linear search for element
            int l=arrr.length;
for(  i=0;i<arrr.length;i++){
    if(arrr[i].equals(word)){
        message.setText("yes");
//user=user+1;
       ++user;
       userScore.setText(" "+user );

        break;
    }
}
            if(i==l){
                message.setText("no");

            }




        //textView.setText(jsontext);

        } catch (Exception e) {

            throw new RuntimeException("Error" + e);
        }


    }

    //logic implementation to get proper output
    private void pandaWord(String s,int k){
        EditText []array={Et1,Et2,Et3,Et4,Et5,Et6,Et7,Et8,Et9, Et10,Et11,Et12,Et13,Et14,Et15,Et16,Et17,Et18,Et19,Et20,Et21,Et22,Et23,Et24};

        if(Objects.equals(s, "a"))
            array[k+1].setText("n", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "b"))
            array[k+1].setText("e", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "c"))
            array[k+1].setText("o", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "d"))
            array[k+1].setText("o", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "e"))
            array[k+1].setText("x", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "f"))
            array[k+1].setText("b", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "g"))
            array[k+1].setText("o", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "h"))
            array[k+1].setText("i", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "i"))
            array[k+1].setText("t", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "j"))
            array[k+1].setText("p", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "k"))
            array[k+1].setText("b", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "l"))
            array[k+1].setText("w", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "m"))
            array[k+1].setText("e", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "n"))
            array[k+1].setText("o", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "o"))
            array[k+1].setText("n", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "p"))
            array[k+1].setText("a", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "q"))
            array[k+1].setText("e", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "r"))
            array[k+1].setText("e", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "s"))
            array[k+1].setText("o", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "t"))
            array[k+1].setText("o", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "u"))
            array[k+1].setText("v", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "v"))
            array[k+1].setText("p", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "w"))
            array[k+1].setText("e", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "x"))
            array[k+1].setText("p", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "y"))
            array[k+1].setText("n", TextView.BufferType.EDITABLE);
        else if(Objects.equals(s, "z"))
            array[k+1].setText("r", TextView.BufferType.EDITABLE);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.about:
                Intent intent1 = new Intent(this, AboutActivity.class);
                startActivity(intent1);
                return true;

            case R.id.play:
                Intent mIntent = getIntent();
                finish();
                startActivity(mIntent);
            case R.id.exit:
               finish();
return true;

        }

        return super.onOptionsItemSelected(item);
    }

}
