package pl.sincos.calculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener
{
    // zmienne:

    private EditText pierwsza, druga;

    private Button dodawanie, odejmowanie, mnozenie, dzielenie, mod;

    private TextView wynik, informacja, first, second;

    public Button push;

    public void lalala()
    {
        push = (Button) findViewById(R.id.push);
        push.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent sth = new Intent(Calculator.this,second.class);
                startActivity(sth); //zeby dzialalo po kliknieciu
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);
        lalala();
        init();
    }
        private void init()
        {
            // okreslenie elementow

            pierwsza = (EditText) findViewById(R.id.pierwsza);
            druga = (EditText) findViewById(R.id.druga);

            dodawanie = (Button) findViewById(R.id.dodawanie);
            odejmowanie = (Button) findViewById(R.id.odejmowanie);
            dzielenie = (Button) findViewById(R.id.dzielenie);
            mnozenie = (Button) findViewById(R.id.mnozenie);
            mod = (Button) findViewById(R.id.mod);

            wynik = (TextView) findViewById(R.id.wynik);
            informacja = (TextView) findViewById(R.id.informacja);
            first = (TextView) findViewById(R.id.first);
            second = (TextView) findViewById(R.id.second);

            //wykonanie po nacisnieciu

            dodawanie.setOnClickListener(this);
            odejmowanie.setOnClickListener(this);
            mnozenie.setOnClickListener(this);
            dzielenie.setOnClickListener(this);
            mod.setOnClickListener(this);

        }

    // zaimplementowana metoda
    @Override
    public void onClick(View view)
    {
        String num1 = pierwsza.getText().toString();
        String num2 = druga.getText().toString();
        switch(view.getId())
        {
            case R.id.dodawanie:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                wynik.setText(String.valueOf(addition));
                break;
            case R.id.odejmowanie:
                int substraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                wynik.setText(String.valueOf(substraction));
                break;
            case R.id.mnozenie:
                    int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                    wynik.setText(String.valueOf(multiply));
                    break;
            case R.id.mod:
                int modulo = Integer.parseInt(num1) % Integer.parseInt(num2);
                wynik.setText(String.valueOf(modulo));
                break;
            case R.id.dzielenie:
                try
                {
                    double division = Double.parseDouble(num1) / Double.parseDouble(num2);
                    wynik.setText(String.valueOf(division));
                    break;
                }
                catch(Exception e)
                {
                    wynik.setText("Cannot DIVINE!");
                }
        }

    }
}
