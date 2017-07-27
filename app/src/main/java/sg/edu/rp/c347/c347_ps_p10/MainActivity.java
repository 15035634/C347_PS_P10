package sg.edu.rp.c347.c347_ps_p10;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    ArrayList<Fragment> al;
    MyFragPageAdapter adapter;
    ViewPager vPager;
    Button btnRead;
    AlarmManager am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vPager = (ViewPager) findViewById(R.id.viewpager1);
        btnRead = (Button) findViewById(R.id.buttonRead);

        FragmentManager fm = getSupportFragmentManager();

        al = new ArrayList<Fragment>();
        al.add(new Frag1());
        al.add(new Frag2());
        al.add(new Frag3());

        adapter = new MyFragPageAdapter(fm, al);

        vPager.setAdapter(adapter);

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("wake_up");
                intent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
              //  PendingIntent pending = PendingIntent.getBroadcast(this, 0, intent, 0);

                AlarmManager alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
              //  alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, 5000, pendingIntent);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.next) {
            int max = vPager.getChildCount();
            if (vPager.getCurrentItem() < max-1){
                int nextPage = vPager.getCurrentItem() + 1;
                vPager.setCurrentItem(nextPage, true);
            }
        }

        if(id == R.id.prev) {
            int max = vPager.getChildCount();
            if (vPager.getCurrentItem() > 0){
                int previousPage = vPager.getCurrentItem() - 1;
                vPager.setCurrentItem(previousPage, true);
            }
        }

        if(id == R.id.random) {
            int max = vPager.getChildCount();
            Random r = new Random();
            int i = r.nextInt(80 - 65) + 65;
                vPager.setCurrentItem(i, true);

        }


        return super.onOptionsItemSelected(item);
    }
}
