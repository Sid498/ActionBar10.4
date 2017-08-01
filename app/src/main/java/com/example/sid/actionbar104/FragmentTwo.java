package com.example.sid.actionbar104;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by SID on 7/23/2017.
 */

public class FragmentTwo extends Fragment {

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //inflating layout fragment_two
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        TextView videoText = (TextView) view.findViewById(R.id.tvVideoFragment);
        Toast.makeText(getContext()," YOU CLICKED VIDEO ",Toast.LENGTH_SHORT).show();
        return view;
    }
}