package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThunderStorm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thunder_storm);
        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);

        String some="A thunderstorm is classified as a severe thunderstorm when it contains large (at least one inch) hail and/or winds of 58 MPH or greater. If you can hear thunder, you are close enough to be affected by lightning. Lightning can strike up to 10 miles ahead of or trailing a storm. Thunderstorms can occur by themselves, in clusters, or in lines. \n" +
                "\n" +
                "Before a Thunderstorm\n" +
                "\n" +
                "•\tBe informed by receiving alerts, warnings, and public safety information before, during, and after emergencies.\n" +
                "•\tCreate and review your family emergency plan.\n" +
                "•\tAssemble an emergency kit.\n" +
                "•\tMake a record of your personal property by taking photos or videos of your belongings. Store these records in a safe place.\n" +
                "•\tPrepare your home.\n" +
                "o\tRemove dead or rotting trees and branches around your home that could fall and cause injury or damage.\n" +
                "o\tClear clogged rain gutters to allow water to flow away from your home.\n" +
                "\n" +
                "During a Thunderstorm Watch\n" +
                "\n" +
                "•\tListen to the National Oceanic and Atmospheric Administration (NOAA) Weather Radio or to a local news station for the latest information.\n" +
                "•\tFollow instructions given by public safety officials.\n" +
                "•\tBe alert to changing weather conditions and be prepared to take shelter immediately.\n" +
                "•\tConsider postponing outdoor activities.\n" +
                "•\tSecure or bring in outdoor objects (patio furniture, children's toys, trash cans, etc.) that could be blown away or cause damage during strong winds.\n" +
                "•\tConsider unplugging sensitive electronic equipment before the storm.\n" +
                "\n" +
                "During a Thunderstorm\n" +
                "\n" +
                "When you first hear thunder, see dark threatening clouds developing, see lightning, or after a severe thunderstorm warning is issued, take actions to stay safe. Remember “When Thunder Roars, Go Indoors!” If possible, monitor local media for the latest information and follow the instructions given by public safety officials.\n" +
                "If You Are Outside\n" +
                "•\tGo indoors immediately. If you cannot get inside, take shelter in a vehicle.\n" +
                "•\tIf you are in an open area, go to a low place such as a ravine or valley and watch out for flash flooding.\n" +
                "•\tIf you are in a forest, seek shelter in a low area under a growth of small trees.\n" +
                "•\tIf you are boating or swimming, get to land and seek shelter immediately.\n" +
                "\n" +
                "If You Are in a Car\n" +
                "•\tStay in your car if you are on the road. If driving conditions worsen, find a safe place to pull over and park.\n" +
                "•\tAvoid touching metal or other surfaces in and on your vehicle.\n" +
                "\n" +
                "If You Are Inside a Building\n" +
                "•\tStay away from windows and doors. Strong thunderstorms can cause flying debris that could do significant damage.\n" +
                "•\tAvoid using a corded telephone, except for emergencies. Cordless or cellular telephones are safe to use. Unplug appliances, air conditioners, and other electrical items like computers to avoid damage from a power surge.\n" +
                "•\tAvoid showering, bathing, washing dishes, or doing laundry. Plumbing and bathroom fixtures can conduct electricity.\n" +
                "•\tAvoid contact with metal objects (yard equipment, motorcycles, bicycles, etc.).\n" +
                "•\tStay inside until at least 30 minutes after you last hear thunder or see lightning.\n" +
                "\n" +
                "After a Thunderstorm\n" +
                "•\tContinue to monitor media for emergency information.\n" +
                "•\tFollow instructions from public safety officials.\n" +
                "•\tCall 9-1-1 to report emergencies including downed power lines and gas leaks.\n" +
                "•\tCall 2-1-1 to obtain shelter locations and other disaster information.\n" +
                "•\tStay away from downed utility wires. Always assume a downed power line is live.\n" +
                "•\tStay out of damaged buildings and areas until authorities deem them safe.\n" +
                "•\tCheck your home for damage:\n" +
                "o\tIf you believe there is a gas leak, go outdoors immediately, and do not turn electrical switches or appliances on or off.\n" +
                "o\tIf your home or property is damaged, take photos or videos to document your damage, and contact your insurance company.\n" +
                "•\tIf your power is out, follow our power outage safety tips.\n" +
                "o\tReport power outages to your utility company.\n" +
                "o\tUse generators and grills outside because their fumes contain carbon monoxide. Make sure your carbon monoxide detectors are working as it is a silent, odorless, killer.\n" +
                "•\tIf phone lines are down, use social media or texting to let others know you are OK.\n" +
                "•\tRemember “Turn Around, Don’t Drown!” Don’t drive through flooded roads. Cars can be swept away in just two feet of moving water.\n" +
                "\n";
        messagewindow.setText (some);
    }
}