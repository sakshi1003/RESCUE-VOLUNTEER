package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TsunamiTip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsunami_tip);
        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);
        String some="A tsunami can kill or injure people and damage or destroy buildings and infrastructure as waves come in and go out. A tsunami is a series of enormous ocean waves caused by earthquakes, underwater landslides, volcanic eruptions, or asteroids.\n" +
                "IF YOU ARE UNDER A TSUNAMI WARNING:\n" +
                "\n" +
                "•\tFirst, protect yourself from an Earthquake. Drop, Cover, then Hold On.\n" +
                "•\tGet to high ground as far inland as possible. You can protect yourself from a tsunami while also protecting yourself and your family from COVID-19. Protect yourself from the effects of a tsunami by moving from the shore to safe, high grounds outside tsunami hazard areas.\n" +
                "•\tBe alert to signs of a tsunami, such as a sudden rise or draining of ocean waters.\n" +
                "•\tListen to emergency information and alerts.\n" +
                "•\tEvacuate: DO NOT wait! Leave as soon as you see any natural signs of a tsunami or receive an official tsunami warning.\n" +
                "o\tUnderstand that your regular public shelter may not be open this year as shelter locations may have changed due to the COVID-19 pandemic. CDC, FEMA, and the American Red Cross are advising shelter operators on safety procedures to make sure that shelters can protect people from natural disasters while taking COVID-19 precautions. Check with local authorities for the latest information about public shelters or download the free Red Cross Emergency app for a list of open Red Cross shelters in your area. In addition:\n" +
                "\uF0A7\tAlways follow the instructions from local emergency managers. They provide the latest recommendations based on the threat in your community.\n" +
                "\uF0A7\tMake plans to shelter with friends and family, if possible.\n" +
                "\uF0A7\tIf you must evacuate to a public shelter, try to bring items that can help protect yourself and your family from COVID-19, such as hand sanitizer that contains at least 60 percent alcohol, cleaning materials, and two masks per person. Children under 2 years old, people who have trouble breathing, and people who cannot remove masks on their own should not wear them. Review the CDC’s guidelines for “Going to a Public Disaster Shelter During the COVID-19 Pandemic.”\n" +
                "\uF0A7\tMaintain a distance of at least six feet between yourself and those who are not part of your household.\n" +
                "•\tIf you are in a boat, go out to sea.\n" +
                "\n" +
                "HOW TO STAY SAFE WHEN A TSUNAMI THREATENS\n" +
                "Prepare NOW\n" +
                "•\tIf you live near, or regularly visit a coastal area, learn about the risk of tsunami in the area. Some at-risk communities have maps with evacuation zones and routes. If you are a visitor, ask about community plans.\n" +
                "•\tLearn the signs of a potential tsunami, such as an earthquake, a loud roar from the ocean, or unusual ocean behavior, such as a sudden rise or wall of water or sudden draining of water showing the ocean floor.\n" +
                "•\tKnow and practice community evacuation plans and map out your routes from home, work, and play. Pick shelters 100 feet or more above sea level, or at least one mile inland.\n" +
                "•\tCreate a family emergency communication plan that has an out-of-state contact. Plan where to meet if you get separated.\n" +
                "•\tSign up for your community’s warning system. The Emergency Alert System (EAS) and National Oceanic and Atmospheric Administration (NOAA) Weather Radio also provide emergency alerts. Sign up for email updates about COVID-19 from the Centers for Disease Control and Prevention (CDC).\n" +
                "•\tConsider earthquake insurance and a flood insurance policy through the National Flood Insurance Program (NFIP). Standard homeowner’s insurance does not cover flood or earthquake damage.\n" +
                "Survive DURING\n" +
                "•\tIf you are in a tsunami area and there is an earthquake, then first protect yourself from the earthquake. Drop, Cover, and Hold On. Drop to your hands and knees. Cover your head and neck with your arms. Hold on to any sturdy furniture until the shaking stops. Crawl only if you can reach better cover, but do not go through an area with more debris. If possible, avoid touching your eyes, mouth, and nose, especially after touching high-touch surfaces, to slow the spread of COVID-19.\n" +
                "•\tWhen the shaking stops, if there are natural signs or official warnings of a tsunami, then move immediately to a safe place as high and as far inland as possible. Listen to the authorities, but do not wait for tsunami warnings and evacuation orders.\n" +
                "•\tIf you are outside of the tsunami hazard zone and receive a warning, then stay where you are unless officials tell you otherwise.\n" +
                "•\tLeave immediately if you are told to do so. Evacuation routes are often marked by a wave with an arrow in the direction of higher ground.\n" +
                "•\tIf you are in the water, then grab onto something that floats, such as a raft, tree trunk, or door. There is no evidence that COVID-19 can be spread through water, however floodwaters may contain debris, chemicals, or waste that are harmful to your health.  \n" +
                "•\tIf you are in a boat, then face the direction of the waves and head out to sea. If you are in a harbor, then go inland.\n" +
                "Be Safe AFTER\n" +
                "•\tListen to local alerts and authorities for information on areas to avoid and shelter locations.\n" +
                "•\tAvoid wading in floodwater, which can contain dangerous debris. Water may be deeper than it appears.\n" +
                "•\tBe aware of the risk of electrocution. Underground or downed power lines can electrically charge water. Do not touch electrical equipment if it is wet or if you are standing in water.\n" +
                "•\tIf you become injured or sick and need medical attention, contact your healthcare provider for further care instructions and shelter in place, if possible. If you are experiencing a medical emergency, call 9-1-1 and let the operator know if you have, or think you might have, COVID-19. If possible, put on a mask before help arrives. If staying at a shelter or public facility, alert shelter staff immediately so they can call a local hospital or clinic.\n" +
                "•\tStay away from damaged buildings, roads, and bridges.\n" +
                "•\tDocument property damage with photographs. Conduct an inventory and contact your insurance company for assistance.\n" +
                "•\tSave phone calls for emergencies. Phone systems are often down or busy after a disaster. Use text messages or social media to communicate with family and friends.\n" +
                "•\tEngage virtually with your community through video and phone calls. Know that it’s normal to feel anxious or stressed. Take care of your body and talk to someone if you are feeling upset. Many people may already feel fear and anxiety about the coronavirus 2019 (COVID-19). The threat of a tsunami can add additional stress. Follow CDC guidance for managing stress during a traumatic event and managing stress during COVID-19.\n" +
                "\n";
        messagewindow.setText (some);
    }
}