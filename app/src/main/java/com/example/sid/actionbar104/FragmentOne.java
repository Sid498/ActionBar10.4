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

public class FragmentOne extends Fragment {

    public FragmentOne(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //inflating layout fragment_one
        View view = inflater.inflate(R.layout.fragment_one,container,false);
        Toast.makeText(getContext()," YOU CLICKED AUDIO ",Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) view.findViewById(R.id.tvAudioFragment);
        return  view;
    }
}
