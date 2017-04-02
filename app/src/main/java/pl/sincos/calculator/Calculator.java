package pl.sincos.calculator;

import android.content.DialogInterface;
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

    private Button dodawanie, odejmowanie, mnozenie, dzielenie, push;

    private TextView wynik, informacja, first, second;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);
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
            push = (Button) findViewById(R.id.push);

            wynik = (TextView) findViewById(R.id.wynik);
            informacja = (TextView) findViewById(R.id.informacja);
            first = (TextView) findViewById(R.id.first);
            second = (TextView) findViewById(R.id.second);

            //wykonanie po nacisnieciu

            dodawanie.setOnClickListener(this);
            odejmowanie.setOnClickListener(this);
            mnozenie.setOnClickListener(this);
            dzielenie.setOnClickListener(this);
            push.setOnClickListener(this);

        }




    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

    }
}
