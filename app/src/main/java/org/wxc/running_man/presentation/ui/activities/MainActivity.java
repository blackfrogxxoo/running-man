package org.wxc.running_man.presentation.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.internal.util.Predicate;

import org.wxc.running_man.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Predicate<Integer> atLeast5 = x -> x>5;
    }
}
