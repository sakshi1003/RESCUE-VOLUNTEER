package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Volcano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volcano);
        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);
        String some="A volcano is an opening in the Earth’s crust that allows molten rock, gases, and debris to escape to the surface. Alaska, Hawaii, California, and Oregon have the most active volcanoes, but other states and territories have active volcanoes, too. A volcanic eruption may involve lava and other debris that can flow up to 100 mph, destroying everything in their path.\n" +
                "\n" +
                "IF YOU ARE UNDER A VOLCANO WARNING:\n" +
                "•\tListen for emergency information and alerts.\n" +
                "•\tFollow evacuation or shelter orders. If advised to evacuate, then do so early.\n" +
                "•\tAvoid areas downstream of the eruption.\n" +
                "•\tProtect yourself from falling ash.\n" +
                "•\tDo not drive in heavy ash fall.\n" +
                "•\tCloth masks help prevent the spread of COVID-19, but they will not adequately protect you from inhaling ash for longer periods of time like a respirator will. Respirators, like an N-95, are not meant to fit children. Due to COVID-19, it may be difficult to find respirators, such as N-95s.\n" +
                "•\tReduce your ash exposure by doing the following:\n" +
                "o\tLimit your time outdoors and use a dust mask or cloth mask as a last resort.\n" +
                "o\tAvoid areas downwind and river valleys downstream of the volcano.\n" +
                "o\tTake temporary shelter from volcanic ash where you are.\n" +
                "o\tCover ventilation openings and seal doors and windows.\n" +
                "o\tAvoid driving in heavy ash. If you must drive, keep the windows up and do not use the air conditioning system.\n" +
                "o\tDo not get on your roof to remove ash.\n" +
                "o\tIf you have any breathing problems, avoid contact with ash and stay indoors until authorities say it is safe to go outside.\n" +
                "o\t\n" +
                "HOW TO STAY SAFE WHEN A VOLCANO THREATENS:\n" +
                "Prepare NOW\n" +
                "•\tKnow your area’s risk from volcanic eruption.\n" +
                "•\tAsk local emergency management for evacuation and shelter plans, and for potential means of protection from ash.\n" +
                "•\tLearn about community warning systems by signing up for a free service called the Volcano Notification Service (VNS) that sends notifications about volcanic activity. Sign up for email updates about coronavirus from the Centers for Disease Control and Prevention (CDC).\n" +
                "•\tGet necessary supplies in advance, including non-perishable foods, cleaning supplies, and water for several days, in case you have to evacuate immediately, or if services are cut off. Keep in mind each person’s specific needs, including medication. Do not forget the needs of pets.\n" +
                "o\tIf you are able to, set aside items like soap, hand sanitizer that contains at least 60 percent alcohol, disinfecting wipes, and general household cleaning supplies that you can use to disinfect surfaces you touch regularly. After an explosive eruption, you may not have access to these supplies for days or even weeks.\n" +
                "o\tBeing prepared allows you to avoid unnecessary excursions and to address minor medical issues at home, alleviating the burden on urgent care centers and hospitals.\n" +
                "o\tRemember that not everyone can afford to respond by stocking up on necessities. For those who can afford it, making essential purchases and slowly building up supplies in advance will allow for longer time periods between shopping trips. This helps to protect those who are unable to procure essentials in advance of the pandemic and must shop more frequently. In addition, consider avoiding WIC-labeled products so that those who rely on these products can access them.\n" +
                "•\tConsult your doctor if you have existing respiratory difficulties.\n" +
                "•\tPractice a communication and evacuation plan with everyone in your family.\n" +
                "o\tIf you are advised to evacuate, find several ways to leave the area. Drive the evacuation routes and find shelter locations while following the latest guidelines from the CDC and your state and local authorities to prevent the spread of COVID-19. Have a plan for pets and livestock.\n" +
                "•\tHave a shelter-in-place plan if your biggest risk is from ash.\n" +
                "•\tKeep important documents in a safe place. Create password-protected digital copies.\n" +
                "•\tFind out what your homeowner’s insurance policy will cover when a volcano erupts.\n" +
                "Survive DURING\n" +
                "•\tListen to alerts. The Volcano Notification Service provides up-to-date information about eruptions.\n" +
                "•\tFollow evacuation orders from local authorities. Evacuate early.\n" +
                "o\tMake plans to shelter with friends or family, if that is a feasible and safe option, or to a public shelter. Check with local authorities to determine which public shelters are open.\n" +
                "o\tIf you must stay at a public shelter or other public facility, take steps to keep yourself and others safe from COVID-19. Wash your hands often, maintain a physical distance of at least six feet between you and people who are not part of your household, and avoid crowds and gathering in groups. When possible, wear a mask. Masks should not be worn by children under two, those who have trouble breathing, and those who are unable to remove them on their own. Avoid touching surfaces and your eyes, nose, and mouth.\n" +
                "o\tReview the CDC’s guidelines for “Going to a Public Disaster Shelter During the COVID-19 Pandemic.”\n" +
                "•\tAvoid areas downwind, and river valleys downstream, of the volcano. Rubble and ash will be carried by wind and gravity.\n" +
                "•\tTake temporary shelter from volcanic ash where you are if you have enough supplies. Cover ventilation openings and seal doors and windows. Wear a mask and maintain a distance of at least six feet between yourself and those who are not a part of your household to slow the spread of COVID-19.\n" +
                "•\tIf outside, protect yourself from falling ash that can irritate skin and injure breathing passages, eyes, and open wounds. Use a well-fitting, certified face mask such as an N95. The Centers for Disease Control and Prevention (CDC) has a list of certified masks and the maker’s instructions on how to use the masks. Use a cloth mask to protect yourself for shorter periods of time.\n" +
                "•\tAvoid driving in heavy ash fall.\n" +
                "Be Safe AFTER\n" +
                "Listen to authorities to find out when it is safe to return after an eruption.\n" +
                "•\tSend text messages or use social media to reach out to family and friends. Phone systems are often busy after a disaster. Only make emergency calls.\n" +
                "•\tAvoid driving in heavy ash. Driving will stir up volcanic ash that can clog engines and stall vehicles.\n" +
                "•\tIf you have any breathing problems, avoid contact with ash. Stay indoors until authorities say it is safe to go outside.\n" +
                "•\tDo not get on your roof to remove ash unless you have guidance or training. If you have to remove ash, then be very careful as ash makes surfaces slippery. Be careful not to contribute additional weight to an overloaded roof.\n" +
                "o\tWhen cleaning, wear protective clothing, use appropriate face coverings or masks, and maintain a physical distance of at least six feet while working with someone else. Poor air quality can worsen asthma symptoms. People with asthma and/or other lung conditions should take precaution in areas with poor air quality. Children should not help with cleanup efforts.\n" +
                "o\tContinue taking steps to protect yourself from COVID-19 and other infectious diseases, by washing your hands often and cleaning commonly touched surfaces.\n" +
                "o\tEngage virtually with your community through video and phone calls. Know that it’s normal to feel anxious or stressed. Take care of your body and talk to someone if you are feeling upset. Many people may already feel fear and anxiety about the coronavirus 2019 (COVID-19). Follow CDC guidance for managing stress during a traumatic event and managing stress during COVID-19\n";
        messagewindow.setText (some);
    }
}