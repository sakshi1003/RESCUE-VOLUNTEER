package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HurricaneTip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hurricane_tip);
        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);
        String some="Hurricanes are a rotating low-pressure tropical weather system.  Systems with maximum sustained surface winds of less than 39 miles per hour (mph) are called tropical depressions. Those with maximum sustained winds of 39 mph or higher are called tropical storms. When a storm's maximum sustained winds reach 74 mph, it is called a hurricane.\n" +
                "\n" +
                "What to do before a Hurricane Strikes-\n" +
                "\n" +
                "•\tBe informed by receiving alerts, warnings, and public safety information before, during, and after emergencies.\n" +
                "•\tKnow Your Zone. Learn if you live in a hurricane evacuation zone.\n" +
                "•\tFind out whether your property is in a flood-prone or high-risk area. Explore the Federal Emergency Management Agency’s (FEMA) flood maps.\n" +
                "•\tCreate and review your family emergency plan.\n" +
                "o\tIf you live or work in a flood zone, hurricane evacuation zone, or an area that is prone to flooding, you should be prepared to evacuate.\n" +
                "o\tIf you receive medical treatment or home health care services, work with your medical provider to determine how to maintain care and service if you are unable to leave your home or have to evacuate during.\n" +
                "•\tAssemble an emergency kit.\n" +
                "•\tFollow instructions from public safety officials.\n" +
                "•\tPrepare for possible power outages.\n" +
                "o\tEnsure your smoke and carbon monoxide detectors are working and have fresh batteries.\n" +
                "o\tConsider purchasing a generator to provide power during an outage. Follow the manufacturer’s instructions and learn how to use it safely before an outage.\n" +
                "o\tIf you have life-support devices or other medical equipment or supplies which depend on electricity, notify your utility and work with your medical provider to prepare for power outages.\n" +
                "•\tMake a record of your personal property by taking photos or videos of your belongings. Store these records in a safe place.\n" +
                "•\tPrepare your home.\n" +
                "o\tConsider attaching temporary plywood covers to protect windows and sliding doors.\n" +
                "o\tIf you live in a coastal community, review the Homeowner's Handbook to Prepare for Coastal Hazards.\n" +
                "•\tFlood losses are not typically covered under renter and homeowner’s insurance policies. Consider purchasing flood insurance through the National Flood Insurance Program (NFIP).\n" +
                "What to do during a Hurricane-\n" +
                "\n" +
                "•\tAvoid driving or going outdoors during a storm. Flooding and damaging winds can make traveling dangerous. \n" +
                "•\tIf you must be out in the storm:\n" +
                "o\tDo not walk through flowing water. Six inches of swiftly moving water can knock you off of your feet.\n" +
                "o\tRemember the phrase “Turn Around, Don’t Drown!” Don’t drive through flooded roads. Cars can be swept away in just two feet of moving water. If your vehicle is trapped in rapidly moving water, stay in the vehicle. If the water is rising inside the vehicle, seek refuge on the roof.\n" +
                "o\tDo not drive around road barriers.\n" +
                "•\tContinue to monitor media for emergency information.\n" +
                "•\tFollow instructions from public safety officials.\n" +
                "•\tIf advised to evacuate, do so immediately. Take only essential items, and bring your pets if possible.\n" +
                "•\tIf told to shelter in place:\n" +
                "o\tStay indoors and away from windows.\n" +
                "o\tListen to local television or radio for updates.\n" +
                "o\tConditions may change quickly; be prepared to evacuate to a shelter or neighbor’s home if necessary.\n" +
                "\n" +
                "What to do after a Hurricane has passed-\n" +
                "\n" +
                "•\tContinue to monitor the media for emergency information.\n" +
                "•\tFollow instructions from public safety officials.\n" +
                "•\tCall 9-1-1 to report emergencies, including downed power lines and gas leaks.\n" +
                "•\tCall 2-1-1 to obtain shelter locations and other disaster information.\n" +
                "•\tStay away from downed utility wires.  Always assume a downed power line is live.\n" +
                "•\tRemember the phrase “Turn Around, Don’t Drown!” Don’t drive through flooded roads. Cars can be swept away in just two feet of moving water.\n" +
                "•\tStay out of damaged buildings and away from affected areas and or roads until authorities deem them safe.\n" +
                "•\tIf you have evacuated, return home only when authorities say it is safe to do so.\n" +
                "•\tListen to news reports to learn if your water supply is safe to drink. Until local authorities proclaim your water supply safe, boil water for at least one minute before drinking or using it for food preparation.\n" +
                "•\tCheck your home for damage:\n" +
                "o\tNever touch electrical equipment while you are wet or standing in water. Consider hiring a qualified electrician to assess damage to electrical systems.\n" +
                "o\tHave wells checked for contamination from bacteria and chemicals before using.\n" +
                "o\tHave damaged septic tanks or leaching systems repaired as soon as possible to reduce potential health hazards.\n" +
                "o\tIf you believe there is a gas leak, go outdoors immediately, and do not turn electrical switches or appliances on or off. If you turned off your gas, a licensed professional is required to turn it back on.\n" +
                "o\tIf your home or property is damaged, take photos or videos to document damage, and contact your insurance company.\n" +
                "•\tIf your power is out, follow our power outage safety tips.\n" +
                "o\tReport power outages to your utility company.\n" +
                "o\tUse generators and grills outside because their fumes contain carbon monoxide. Make sure your carbon monoxide detectors are working as it is a silent, odorless, killer. See more Generator Safety Tips.\n" +
                "o\tIf a traffic light is out, treat the intersection as a four-way stop.\n" +
                "•\tIf phone lines are down, use social media or texting to let others know you are OK.\n" +
                "•\tLook before you step. After a hurricane or flood, the ground and floors can be covered with debris, including broken bottles and nails.\n" +
                "•\tAvoid entering moving or standing floodwaters. Floodwater and mud may be contaminated by oil, gasoline, or raw sewage.\n" +
                "•\tClean and disinfect anything that got wet, and take steps to prevent and detect mold. Consider using professional cleaning and repair services. See more tips to recover from flooding.\n" +
                "•\tThrow away food (including canned items), that has come into contact with floodwaters, was exposed to temperatures above 40 °F for more than two hours, or has an unusual odor, color, or texture.  When in doubt, throw it out!\n" +
                "•\tBe a good neighbor. Check on family, friends, and neighbors, especially the elderly, those who live alone, those with medical conditions and those who may need additional assistance.\n" +
                "\n" +
                "\n";
        messagewindow.setText (some);

    }
}