package com.example.mybuttonproject;

/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int numb = 0;
    public void button_pressed(View view) {
        numb +=1;
        display( numb);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView count_text_view = (TextView) findViewById(R.id.count_text_view);
        count_text_view.setText("" + number);
    }
}