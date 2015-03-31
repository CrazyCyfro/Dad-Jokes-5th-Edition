package com.doritos.mtndew.dadjokes5thedition;

import android.app.ListActivity;
import android.content.Context;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class JokeActivity extends ListActivity {
    private ListView mJokeView = (ListView)this.findViewById(R.id.jokeView);
    private Joke[] mJokes = {
        new Joke("Grape","What did the grape do when he got stepped on?","He let out a little wine.",false),
        new Joke("Paper","Want to hear a joke about paper?","Never mind, it's tearable.",false),
        new Joke("Apples","How many apples grow on a tree?","All of them.",false)

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JokeAdapter jokeAdapter = new JokeAdapter(JokeActivity.this, R.layout.list_item_joke, mJokes);
        mJokeView.setAdapter(jokeAdapter);

    }

    @Override
    protected void OnListItemClick(ListView l, View v, int position, long id) {
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

    private class JokeAdapter extends ArrayAdapter<Joke> {
        private int mResource;
        private Joke[] mJokes;

        public JokeAdapter(Context context, int resource, Joke[] jokes) {
            super(context, resource, jokes);
            mResource = resource;
            mJokes = jokes;
        }

        @Override
        public View getView(int position, View row, ViewGroup parent) {
            if (row==null) {
                row = getLayoutInflater().inflate(mResource, parent, false);
            }

            Joke currentJoke = mJokes[position];

            TextView textView = (TextView)row.findViewById(R.id.list_text);
            textView.setText(currentJoke.getTitle());

            ImageView imageView = (ImageView)row.findViewById(R.id.list_graphic);
            if (currentJoke.getmSeen() == false) {
                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.INVISIBLE);
            }

            return row;
        }


    }
}
