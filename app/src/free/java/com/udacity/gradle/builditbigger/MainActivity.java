package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.udacity.gradle.builditbigger.R;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button tellJoke=findViewById(R.id.telljokebutton);
        tellJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Joke joke = new Joke();
//                String ajoke=joke.getJoke();
//                Intent intent =new Intent(com.udacity.gradle.builditbigger.com.udacity.gradle.builditbigger.MainActivity.this, myAndroidLibraryActivity.class);
//                intent.putExtra("joke",ajoke);
//                startActivity(intent);
                tellJoke();
            }
        });
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

    public void tellJoke() {

//        Joke joke = new Joke();
//        String ajoke=joke.getJoke();
//        Toast.makeText(this, ajoke, Toast.LENGTH_SHORT).show();
//
//        Intent intent=new Intent(this, myAndroidLibraryActivity.class );

        new com.udacity.gradle.builditbigger.EndpointsAsyncTask().execute(this);

    }





}
