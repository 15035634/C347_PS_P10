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
public class Frag2 extends Fragment {


    public Frag2() {
        // Required empty public constructor
    }


    TextView tvFrag2;
    Button change;
    LinearLayout back;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag2, container, false);

        tvFrag2 = (TextView) view.findViewById(R.id.tvFrag2);
        change = (Button)view.findViewById(R.id.buttonChange);
        back = (LinearLayout)view.findViewById(R.id.backGrnd);


        tvFrag2.setText("You can't kill yourself by holding your breath \n \n" +
                "Human thigh bones are stronger than concrete");




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
