package com.example.android.tabbedfrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Android on 3/6/2018.
 */

public class Tab4Fragment extends Fragment {
    private Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab4_fragment,container,false);
        btn=view.findViewById(R.id.buttonTab1);
        return view;
    }
}
