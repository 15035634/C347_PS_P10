package sg.edu.rp.c347.c347_ps_p10;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {


    public Frag3() {
        // Required empty public constructor
    }


    TextView tvFrag3;
    Button change;
    LinearLayout back;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag3, container, false);

        tvFrag3 = (TextView) view.findViewById(R.id.tvFrag3);
        change = (Button)view.findViewById(R.id.buttonChange);
        back = (LinearLayout)view.findViewById(R.id.backGrnd);


        tvFrag3.setText("You can't kill yourself by holding your breath \n \n" +
                "Owls are the only birds who can see the colour blue");




        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                back.setBackgroundColor(color);

            }
        });

        return view;
    }
}
