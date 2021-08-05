package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EarthQuakeTip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_quake_tip);
        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);

        String some="An earthquake is the sudden, rapid shaking of the earth, caused by the breaking and shifting of subterranean rock. Initial mild shaking may strengthen and become extremely strong within seconds.\n" +
                "\n" +
                "What to do before an earthquake strikes-\n" +
                "\n" +
                "•\tBe informed by receiving alerts, warnings, and public safety information before, during, and after emergencies.\n" +
                "•\tCreate and review your family emergency plan.\n" +
                "o\tIdentify safe places to take cover (such as under a sturdy piece of furniture) in your home, office, or school.\n" +
                "•\tPractice how to “Drop, Cover, and Hold On;” and participate in the Great Northeast Shakeout each October.\n" +
                "•\tAssemble an emergency kit.\n" +
                "•\tPrepare your home for possible emergencies.\n" +
                "o\tFasten bookcases, hutches, and freestanding shelving to walls. Place large, heavy objects, as well as fragile objects, on lower shelves.\n" +
                "o\tKnow where your electricity, gas, and water switches and valves are located and how to shut them off.\n" +
                "•\tMake a record of your personal property by taking photos/videos of your belongings. Store these records in a safe place.\n" +
                "•\t\n" +
                "What to do during an earthquake-\n" +
                "\n" +
                "If You Are Inside\n" +
                "•\tStay inside. Do not get in a doorway — this does not provide protection from falling or flying objects, and you might not be able to remain standing.\n" +
                "•\tDrop, Cover, and Hold On\n" +
                "o\tDrop down to the ground so the earthquake doesn’t knock you down.\n" +
                "o\tCover your head and neck with your arms to protect you from falling debris. If possible, crawl under a sturdy desk, table or other piece of furniture for additional protection. Stay away from glass, windows, outside doors and walls, and other items that could fall.\n" +
                "o\tHold on to any sturdy item you can until the shaking stops.\n" +
                "o\t\n" +
                "If You Are Outside\n" +
                "•\tMove away from buildings, streetlights, and utility wires.\n" +
                "If You Are in a Vehicle\n" +
                "•\tPull to the side of the road and stay inside until the earthquake is over. Do not stop under overpasses or power lines.\n" +
                "•\t\n" +
                "What to do after an earthquake strikes-\n" +
                "\n" +
                "•\tContinue to monitor media for emergency information.\n" +
                "•\tFollow instructions from public safety officials.\n" +
                "•\tIf you are trapped, try calling or texting for help. Try tapping on a pipe or wall or using a whistle to help rescuers locate you.\n" +
                "•\tCall 9-1-1 to report emergencies including downed power lines and gas leaks.\n" +
                "•\tCall 2-1-1 to obtain shelter locations and other disaster information.\n" +
                "•\tStay away from downed utility wires. Always assume a downed power line is live.\n" +
                "•\tStay out of damaged buildings and areas until authorities deem them safe.\n" +
                "•\tCheck your home for damage:\n" +
                "o\tIf you believe there is a gas leak, go outdoors immediately, and do not turn electrical switches or appliances on or off.\n" +
                "o\tCheck chimneys for visual damage and have a professional inspect the chimney for internal damage before lighting a fire.\n" +
                "o\tIf your home or property is damaged, take photos or videos to document your damage, and contact your insurance company.\n" +
                "•\tIf your power is out, follow our power outage safety tips.\n" +
                "o\tReport power outages to your utility company.\n" +
                "o\tUse generators and grills outside because their fumes contain carbon monoxide. Make sure your carbon monoxide detectors are working as it is a silent, odorless, killer.\n" +
                "•\tIf phone lines are down, use social media or texting to let others know you are OK.\n" +
                "•\tBe a good neighbor. Check on family, friends, and neighbors, especially the elderly, those who live alone, those with medical conditions, and those who may need additional assistance.\n";
        messagewindow.setText (some);
    }
}