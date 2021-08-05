package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WinterStormTip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winter_storm_tip);
        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);


        String some="Winter storms can include large snow accumulation, extremely cold temperatures, coastal flooding, beach erosion and heavy, wet snow or ice.\n" +
                "\n" +
                "Before a Winter Storm-\n" +
                "\n" +
                "•\tBe informed by receiving alerts, warnings, and public safety information before, during, and after emergencies.\n" +
                "•\tCreate and review your family emergency plan.\n" +
                "o\tIf you receive medical treatments or home health care services, work with your medical provider to determine how to maintain care and service if you are unable to leave your home for a period of time.\n" +
                "•\tAssemble an emergency kit. Add seasonal supplies to your emergency kit, such as extra winter clothing and blankets.\n" +
                "•\tFollow instructions from public safety officials.\n" +
                "•\tPrepare for possible power outages.\n" +
                "o\tFully charge your cellphone, laptop, and other electronic devices before a storm if power outages are expected.\n" +
                "o\tConsider purchasing a generator to provide power during an outage. Follow the manufacturer’s instructions and learn how to use it safely before an outage.\n" +
                "•\tPrepare your home for possible emergencies.\n" +
                "o\tRemove dead or rotting trees and branches around your home that could fall and cause injury or damage.\n" +
                "o\tClear clogged rain gutters to allow water to flow away from your home. Melting snow and ice can build up if gutters are clogged with debris.\n" +
                "o\tEnsure your smoke and carbon monoxide alarms are working and have fresh batteries.\n" +
                "o\tMaintain heating equipment and chimneys by having them cleaned and inspected every year.\n" +
                "o\tMake sure your home is properly insulated. Caulk and weather-strip doors and windows to keep cold air out. Install storm windows or cover windows with plastic from the inside to provide insulation.\n" +
                "o\tEnsure you have sufficient heating fuel and consider safe backup heating options such as fireplaces or woodstoves.\n" +
                "•\tEnsure your vehicle is ready for safe winter driving. Keep the gas tank at least half-full and have a Winter Emergency Car Kit in the trunk.\n" +
                "\n" +
                "During a Winter Storm-\n" +
                "\n" +
                "•\tMinimize outdoor activities. Drive only if it is absolutely necessary. If you must drive, utilize MEMA’s winter driving safety tips.\n" +
                "•\tKeep your pets safe with Winter Pet Safety Tips.\n" +
                "•\tDress for the season to protect against the elements. Dress in several layers of loose-fitting, lightweight clothing instead of a single heavy layer. Outer garments should be tightly woven and water repellent. Wear a hat, mittens (not gloves) and sturdy waterproof boots to protect your extremities. Cover your mouth with a scarf to protect your lungs.\n" +
                "•\tDuring extreme cold weather, follow our extreme cold safety tips.\n" +
                "•\tWatch for signs of frostbite and hypothermia.\n" +
                "\n" +
                "After a Winter Storm-\n" +
                "•\tContinue to monitor media for emergency information.\n" +
                "•\tFollow instructions from public safety officials.\n" +
                "•\tCall 9-1-1 to report emergencies, including downed power lines and gas leaks.\n" +
                "•\tCheck with your local authorities or call 2-1-1 to find locations of warming centers or shelters near you or for other storm-related questions.\n" +
                "•\tIn the event of power outages during cold weather, you may need to go to a warming center or emergency shelter to stay warm. Report power outages to your utility company.\n" +
                "•\tStay away from downed utility wires. Always assume a downed power line is live.\n" +
                "•\tStay off streets and roads until they are clear of snow.\n" +
                "•\tUse caution and take frequent breaks when shoveling snow to prevent overexertion. Overexertion can bring on a heart attack—a major cause of death in the winter.\n" +
                "•\tClear exhaust vents from direct vent gas furnace systems to avoid carbon monoxide poisoning. Make sure your carbon monoxide detectors are working as it is a silent, odorless, killer.\n" +
                "•\tClear snow from around vehicle exhaust pipes before starting the vehicle to avoid carbon monoxide poisoning.\n" +
                "•\tMake sure emergency generators or secondary heating systems are well ventilated because their fumes contain carbon monoxide. See more Generator Safety Tips.\n" +
                "•\tDig out fire hydrants and storm drains in your neighborhood.\n" +
                "•\tClear snow from the sidewalk on your property including nearby curb cuts to allow access for wheelchair users. Regulations and requirements for homeowners and business to clear sidewalks vary by community, but even if not required, please clear sidewalks to make safe travel for all.\n" +
                "•\tProperty owners and businesses should clear snow from walkways, entrances and access ramps, and handicapped parking spots and may be required to do so.\n" +
                "•\tCheck your roof and clear accumulated snow to avoid roof collapses.\n" +
                "•\tDon’t park too close to corners so public safety vehicles and plows can maneuver safely.\n" +
                "•\tBe aware of children playing in the streets, particularly climbing on or running out from behind large snowdrifts. Parents should remind their children to be aware of plowing operations and traffic.\n" +
                "•\tBe a good neighbor. Check on family, friends, and neighbors, especially the elderly, those who live alone, those with medical conditions and those who may need additional assistance.\n";
        messagewindow.setText (some);

    }
}