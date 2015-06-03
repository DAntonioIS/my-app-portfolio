package bz.dantonio.dantonioportfolioapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PortfolioActivity extends AppCompatActivity implements View.OnClickListener
{

    // Buttons used in the UI to represent various
    //apps
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        //get reference to views
        findViews();
    }

    private void findViews() {
        button = (Button)findViewById( R.id.button );
        button2 = (Button)findViewById( R.id.button2 );
        button3 = (Button)findViewById( R.id.button3 );
        button4 = (Button)findViewById( R.id.button4 );
        button5 = (Button)findViewById( R.id.button5 );
        button6 = (Button)findViewById( R.id.button6 );

        button.setOnClickListener( this );
        button2.setOnClickListener( this );
        button3.setOnClickListener( this );
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        if ( v == button ) {
            // Handle clicks for button
            sendToast(button.getText().toString());
        } else if ( v == button2 ) {
            // Handle clicks for button2
            sendToast(button2.getText().toString());
        } else if ( v == button3 ) {
            // Handle clicks for button3
            sendToast(button3.getText().toString());
        } else if ( v == button4 ) {
            // Handle clicks for button4
            sendToast(button4.getText().toString());
        } else if ( v == button5 ) {
            // Handle clicks for button5
            sendToast(button5.getText().toString());
        } else if ( v == button6 ) {
            // Handle clicks for button6
            sendToast(button6.getText().toString());
        }
    }

    private void sendToast(final String msg)
    {
        Toast.makeText(this,"This button will launch "+msg,Toast.LENGTH_SHORT).show();
    }


}//end class
