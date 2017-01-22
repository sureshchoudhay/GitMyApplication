package com.example.kalmadi.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by KALMADI on 12/8/2016.
 */

public class Fragment2 extends Fragment {
    private Button gotIt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View myFragmentView = inflater.inflate(R.layout.layout_fragment2, container, false);
        gotIt = (Button) myFragmentView.findViewById(R.id.socl_btn_lyt);

        gotIt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(getActivity(), SplashScreen.class);
                startActivity(i);
            }

        });


        return myFragmentView;
    }


}
