package com.example.guia8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;

public class MainActivity extends AppCompatActivity {

    private Button n0;
    private Button n1;
    private Button n2;
    private Button n3;
    private Button n4;
    private Button n5;
    private Button n6;
    private Button n7;
    private Button n8;
    private Button n9;
    private Button bmas;
    private Button bmenos;
    private Button bmulti;
    private Button bdivicion;
    private Button bpunto;
    private Button bigual;
    private Button c;
    private Button del;
    private Button bp;
    private Button bp2;
    private Button paren;
    private TextView calc;
    int v = 0, x = 0;
    float a,b;
    boolean s=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n0 = (Button)findViewById(R.id.n0);
        n1 = (Button)findViewById(R.id.n1);
        n2 = (Button)findViewById(R.id.n2);
        n3 = (Button)findViewById(R.id.n3);
        n4 = (Button)findViewById(R.id.n4);
        n5 = (Button)findViewById(R.id.n5);
        n6 = (Button)findViewById(R.id.n6);
        n7 = (Button)findViewById(R.id.n7);
        n8 = (Button)findViewById(R.id.n8);
        n9 = (Button)findViewById(R.id.n9);
        bmas = (Button)findViewById(R.id.om);
        bmenos = (Button)findViewById(R.id.oms);
        bmulti = (Button)findViewById(R.id.omt);
        bdivicion = (Button)findViewById(R.id.odv);
        bpunto = (Button)findViewById(R.id.bp);
        c = (Button)findViewById(R.id.C);
        del = (Button)findViewById(R.id.DEL);

        paren = (Button)findViewById(R.id.paren);
        bigual = (Button)findViewById(R.id.bi);
        calc = (TextView)findViewById(R.id.calc);

    /*    if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
        //    bp = (Button)findViewById(R.id.pp);
 //           bp2 = (Button)findViewById(R.id.pp2);
           // calc = (TextView)findViewById(R.id.calc2);

            bp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String operacion = calc.getText().toString();
                    calc.setText("("+operacion);
                }
            });

            bp2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String operacion = calc.getText().toString();
                    calc.setText(operacion+")");
                }
            });
        }*/



        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                calc.setText(operacion+"0");
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                calc.setText(operacion+"1");
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                calc.setText(operacion+"2");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                calc.setText(operacion+"3");
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                calc.setText(operacion+"4");
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                calc.setText(operacion+"5");
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                calc.setText(operacion+"6");
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                calc.setText(operacion+"7");
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                calc.setText(operacion+"8");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                calc.setText(operacion+"9");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText("");
            }
        });

        paren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(v == 0){
                    String operacion = calc.getText().toString();
                    calc.setText(operacion+"(");
                    v=1;
                }else if(v == 1){
                    String operacion = calc.getText().toString();
                    calc.setText(operacion+")");
                    v=0;
                }

            }
        });
        ////////////////////////
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  cadena= calc.getText().toString();
                cadena = cadena.substring(0, cadena.length() - 1);
                calc.setText(cadena);
            }
        });
        bpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String operacion = calc.getText().toString();
                calc.setText(operacion+".");

            }
        });
        ///////////////////////
        bigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float R;
                switch (x){
                    case 1:
                        String str = calc.getText().toString();
                        String answer = str.substring(str.indexOf("+")+1);
                        b=Integer.parseInt(answer);
                        R = a+b;
                        calc.setText(""+R);
                        a=0;
                        b=0;
                        break;
                    case 2:
                        String str2 = calc.getText().toString();
                        String answer2 = str2.substring(str2.indexOf("-")+1);
                        b=Integer.parseInt(answer2);
                        R = a-b;
                        calc.setText(""+R);
                        a=0;
                        b=0;
                        break;
                    case 3:
                        String str3 = calc.getText().toString();
                        String answer3 = str3.substring(str3.indexOf("*")+1);
                        b=Integer.parseInt(answer3);
                        R = a*b;
                        calc.setText(""+R);
                        a=0;
                        b=0;
                        break;
                    case 4:
                        String str4 = calc.getText().toString();
                        String answer4 = str4.substring(str4.indexOf("/")+1);
                        b=Integer.parseInt(answer4);
                        R = a/b;
                        calc.setText(""+R);
                        a=0;
                        b=0;
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Operacion invalida", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
        ///////////////////////
        bmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                a = Float.parseFloat(operacion);
                x=1;
                calc.setText(operacion+"+");
            }
        });
        bmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                a = Float.parseFloat(operacion);
                x=2;
                calc.setText(operacion+"-");
            }
        });
        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                a = Float.parseFloat(operacion);
                x=3;
                calc.setText(operacion+"x");
            }
        });
        bdivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacion = calc.getText().toString();
                a = Float.parseFloat(operacion);
                x=4;
                calc.setText(operacion+"÷");
            }
        });
        ////////////////////////////
    }
}