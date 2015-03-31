package com.doritos.mtndew.dadjokes5thedition;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class JokeActivity extends ActionBarActivity {
    private ListView mJokeView = (ListView)findViewById()
    private Joke[] mJokes = {
        new Joke("Grape","What did the grape do when he got stepped on?","He let out a little wine.",false),
        new Joke("Paper","Want to hear a joke about paper?","Never mind, it's tearable.",false),
        new Joke("Apples","How many apples grow on a tree?","All of them.",false)

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<Joke> jokeAdapter;

        jokeAdapter = new ArrayAdapter<Joke>(this, android.R.layout.simple_list_item_1, mJokes);





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
