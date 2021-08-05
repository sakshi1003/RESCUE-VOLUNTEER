package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TurnadoTip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turnado_tip);
        TextView titlewindow=(TextView) findViewById (R.id.titlewindow);

        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);;
        // StringBuilder stringBuilder=new StringBuilder (  );
        String some="Spawned from powerful thunderstorms, winds can reach 300 mph and damage paths can be in excess of one mile wide and 50 miles long. The intensity of a tornado is measured by the Enhanced Fujita Scale (EF Scale).\n\n" +
                "STEP 1. What to do before a Tornado strikes-\n\n" +
                "•\tBe informed by receiving alerts, warnings, and public safety information before, during, and after emergencies.\n" +
                "•\tCreate and review your family emergency plan.\n" +
                "o\tIdentify safe locations to take shelter where your family spends time, such as your home, your workplace, public buildings, nursing homes, shopping centers, and schools.\n" +
                "o\tDetermine safe locations to seek shelter, such as basements or storm cellars. If an underground location is not available, choose an interior room or hallway on the lowest floor. Put as many walls between you and the outside as possible.\n" +
                "o\tBe sure everyone in your household knows these shelter locations.\n" +
                "•\tAssemble an emergency kit.\n" +
                "•\tMake a record of your personal property by taking photos/videos of your belongings. Store these records in a safe place.\n\n" +
                "STEP 2. During a Tornado Warning-\n\n" +
                "•\tListen to NOAA Weather Radio or to a local news station for the latest information. Follow instructions given by public safety officials.\n\n" +
                "A- If You Are Inside\n" +
                "•\tIn a residence or small building, go to a pre-designated area such as a basement, storm cellar, or the lowest building level. If there is no basement, go to the center of a small interior room on the lowest level (closet, interior hallway) away from corners, windows, doors, and outside walls.\n" +
                "o\tPut as many walls as possible between you and the outside.\n" +
                "•\tIf you are in a school, hospital, high-rise building or other public place, move to a small interior room or hallway on the lowest possible floor.\n" +
                "•\tIf you are in a mobile home, get out immediately and go to a pre-identified location like the lowest floor of a sturdy, nearby building. Mobile homes offer little protection from tornadoes.\n" +
                "•\tDo not open windows.\n\n" +
                "B- If You Are Outside or In a Vehicle\n" +
                "•\tIf possible, go to a nearby sturdy building.\n" +
                "•\tConsider taking cover in a stationary vehicle. Put your seat belt on and cover your head with your arms and a blanket, coat, or other cushion if possible.\n" +
                "•\tConsider lying flat in a nearby ditch or low-lying area and cover your head with your arms and a blanket, coat, or other cushion if possible.\n" +
                "•\tIf you are boating or swimming, get to land and seek shelter immediately.\n" +
                "•\tDo not go under an overpass or bridge. You are safer in a low, flat location.\n" +
                "•\tWatch for flying debris, which can cause injuries or fatalities.\n\n" +
                "STEP 3. What to do After a Tornado-\n\n" +
                "•\tContinue to monitor media for emergency information.\n" +
                "•\tFollow instructions from public safety officials.\n" +
                "•\tIf you are trapped, try calling or texting for help. Try tapping on a pipe or wall or using a whistle to help rescuers locate you.\n" +
                "•\tCall 9-1-1 to report emergencies, including downed power lines and gas leaks.\n" +
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
                "•\tBe a good neighbor. Check on family, friends, and neighbors, especially the elderly, those who live alone, those with medical conditions and those who may need additional assistance.\n" +
                "\t\n";
        messagewindow.setText (some);
    }
}