package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FloodTip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood_tip);

        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);
        String some="Flooding is an overflow of water that can range from a few inches deep to fully submerging entire buildings. Flooding can occur when rivers and lakes cannot contain excessive rain or snow melt, or when rain cannot be absorbed fully into the ground. \n" +
                "\n" +
                "What to do Before a Flood-\n" +
                "•\tBe informed by receiving alerts, warnings, and public safety information before, during, and after emergencies.\n" +
                "•\tFind out whether your property is in a flood-prone or high-risk area. Explore the Federal Emergency Management Agency’s (FEMA) flood maps.\n" +
                "•\tContact your local Emergency Management Director to find out if your home or workplace is downstream from a dam and learn more about your community’s risk of flooding.\n" +
                "•\tCreate and review your family emergency plan.\n" +
                "o\tHave a plan to go to higher ground quickly if necessary.\n" +
                "o\tIf you live or work in a flood zone, hurricane evacuation zone, or an area that is prone to flooding, you should be prepared to evacuate.\n" +
                "•\tAssemble an emergency kit.\n" +
                "•\tMake a record of your personal property by taking photos or videos of your belongings. Store these records in a safe place.\n" +
                "•\tPrepare your home for flooding.\n" +
                "•\tFlood losses are not typically covered under renter and homeowner’s insurance policies. Consider purchasing flood insurance through the National Flood Insurance Plan (NFIP). Flood insurance is available in most communities whether or not your building is in a flood-prone area, but there is a 30-day waiting period before it goes into effect.\n" +
                "\n" +
                "What to do During a Flood Watch or Flash Flood Watch-\n" +
                "•\tMove immediately to higher ground or stay on high ground.\n" +
                "•\tContinue to check the media for emergency information.\n" +
                "•\tFollow instructions from public safety officials. If advised to evacuate, do so immediately.\n" +
                "•\tIf you must evacuate your home, take only essential items and bring your pets if safe to do so.\n" +
                "•\tIf you must evacuate or are traveling during flooding, remember:\n" +
                "\n" +
                "o\tDo not walk through flowing water. Most drownings occur during flash floods. Six inches of swiftly moving water can knock you off of your feet.\n" +
                "o\tRemember the phrase “Turn Around, Don’t Drown!” Don’t drive through flooded roads. Cars can be swept away in only two feet of moving water. If your vehicle is trapped in rapidly moving water, stay in the vehicle. If the water is rising inside the vehicle, seek refuge on the roof.\n" +
                "o\tDo not drive around road barriers. Roads and bridges may be washed out or structurally unsound.\n" +
                "•\tIf told to shelter in place, listen to local television or radio for updates. Conditions may change quickly, so be prepared to evacuate to a shelter or a neighbor’s home if necessary.\n" +
                "\n" +
                "What to do After a Flood-\n" +
                "•\tContinue to monitor the media for emergency information.\n" +
                "•\tFollow instructions from public safety officials.\n" +
                "•\tIf you have evacuated, return home only when authorities say it is safe to do so.\n" +
                "•\tCall 9-1-1 to report emergencies including downed power lines and gas leaks.\n" +
                "•\tCall 2-1-1 to obtain shelter locations and other disaster information.\n" +
                "•\tBe a good neighbor. Check on family, friends, and neighbors, especially the elderly, those who live alone, those with medical conditions, and those who may need extra help.\n" +
                "\n" +
                "Safety\n" +
                "•\tStay away from downed utility wires. Always assume a downed power line is live. Electrocution is also a serious danger in floods as electrical currents can travel through water.\n" +
                "•\t“Turn Around, Don’t Drown!” - Don’t drive through flooded roads.\n" +
                "•\tStay out of damaged buildings and away from affected areas or roads until authorities deem them safe.\n" +
                "•\tIf your power is out, report outages to your utility company and follow our power outage safety tips.\n" +
                "•\tLook before you step. Debris, including broken bottles and nails can cover the ground and floors after a flood. Mud covered floors and stairs can be slippery.\n" +
                "•\tListen to news reports to learn if your water supply is safe to drink. Until local authorities say your water supply is safe, boil water for at least one minute before drinking or using it for cooking.\n" +
                "•\tThrow away food (including canned items) that has come in contact with floodwaters. Don’t eat food from flooded gardens. Throw away any refrigerated food that was not kept at temperatures above 40 °F for more than two hours or that has an unusual odor, color, or texture.\n";
        messagewindow.setText (some);

    }
}