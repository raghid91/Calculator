package com.cornez.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jvybi on 2016-09-26.
 */

public class Help extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
    }

    public void goBack(View view) {
        Intent helpIntent = new Intent(Help.this, MyActivity.class);

        startActivity(helpIntent);
    }
}
