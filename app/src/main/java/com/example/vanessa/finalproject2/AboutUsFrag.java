package com.example.vanessa.finalproject2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by f on 10/28/2015.
 */
public class AboutUsFrag extends Fragment {
    View view;
    TextView tv1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.aboutus, container, false);

        tv1 = (TextView) view.findViewById(R.id.AS);

        return view;
    }

    public void changeText(int color){
        tv1.setText(" Fahad Alqattan, Camilo Moreno, and Vanessa Plugues are the brains behind the Brain-Droid App." +
                   "\n\n All Students at Florida Atlantic University, coming together to form what many call a break through in APP Development.  " +
                   " Fahad Alqattan born and raised in Kuwait, a Senior in his double major in computer engineering/science." +
                   " To all the ladies in the class, HE IS SINGLE." +
                   "\n\n  Vanessa Plugues born and raised in Florida, a Junior is her double major in computer engineering/science." +
                   " Ms. Plugues is a mother of 1 and works as a part time tutor." +
                   "\n\n Camilo Moreno born and raised in Colombia, a Senior in his double major in computer engineer/science." +
                   " Part time drummer, part time tutor, and full time awesome."   );

        tv1.setTextColor(Color.BLUE);
    }



}
