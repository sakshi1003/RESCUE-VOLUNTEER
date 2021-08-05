package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CycloneTip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyclone_tip);
        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);
        String some="BEFORE THE CYCLONE SEASON\n" +
                "•\tCheck with your local council or your building control authority to see if your home has been built to cyclone standards.\n" +
                "•\tCheck that the walls, roof and eaves of your home are secure.\n" +
                "•\tTrim treetops and branches well clear of your home (get council permission).\n" +
                "•\tPreferably fit shutters, or at least metal screens, to all glass areas.\n" +
                "•\tClear your property of loose material that could blow about and possibly cause injury or damage during extreme winds.\n" +
                "•\tIn case of a storm surge/tide warning, or other flooding, know your nearest safe high ground and the safest access route to it.\n" +
                "•\tPrepare an emergency kit containing:\n" +
                "o\ta portable battery radio, torch and spare batteries;\n" +
                "o\twater containers, dried or canned food and a can opener;\n" +
                "o\tmatches, fuel lamp, portable stove, cooking gear, eating utensils; and\n" +
                "o\ta first aid kit and manual, masking tape for windows and waterproof bags.\n" +
                "•\tKeep a list of emergency phone numbers on display.\n" +
                "Check neighbours, especially if recent arrivals, to make sure they are prepared.\n" +
                "\n" +
                "WHEN THE CYCLONE STRIKES\n" +
                "•\tDisconnect all electrical appliances. Listen to your battery radio for updates.\n" +
                "•\tStay inside and shelter (well clear of windows) in the strongest part of the building,\n" +
                "i.e. cellar, internal hallway or bathroom. Keep evacuation and emergency kits with you.\n" +
                "•\tIf the building starts to break up, protect yourself with mattresses, rugs or blankets under a\n" +
                "strong table or bench or hold onto a solid fixture, e.g. a water pipe.\n" +
                "•\tBeware the calm 'eye'. If the wind drops, don't assume the cyclone is over; violent winds\n" +
                "will soon resume from another direction. Wait for the official 'all clear'.\n" +
                "If driving, stop (handbrake on and in gear) — but well away from the sea and clear of trees,\n" +
                "power lines and streams. Stay in the vehicle.\n" +
                "\n" +
                "AFTER THE CYCLONE\n" +
                "•\tDon't go outside until officially advised it is safe.\n" +
                "•\tCheck for gas leaks. Don't use electric appliances if wet.\n" +
                "•\tListen to local radio for official warnings and advice.\n" +
                "•\tIf you have to evacuate, or did so earlier, don't return until advised. Use a recommended route and don't rush.\n" +
                "•\tBeware of damaged power lines, bridges, buildings, trees, and don't enter floodwaters.\n" +
                "•\tHeed all warnings and don't go sightseeing. Check/help neighbours instead.\n" +
                "Don't make unnecessary telephone calls.\n";
        messagewindow.setText (some);
    }
}