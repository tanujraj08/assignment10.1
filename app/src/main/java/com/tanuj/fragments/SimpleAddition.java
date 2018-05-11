package com.tanuj.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import android.support.v4.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleAddition extends Fragment {



    View view;
    TextView enteredValueTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate View Bu Updating the Layout.
        view =  inflater.inflate(R.layout.fragment_simple_addition, container, false);

        // Type Cast TextView and Change Text.
        enteredValueTextView = (TextView) view.findViewById(R.id.enteredValueTextView);
        enteredValueTextView.setText(""); // Change Text To Empty on View Create.

        // Return Inflated View.
        return  view;
    }

    // This method shall be accessible from MainActivity. With the Help of FragmentManager.
    // This Method will change Text of TextView and Updates UI
    public void ChangeText(String textViewText){
        // Update TextView Text.
        enteredValueTextView.setText(textViewText);

    }
}
