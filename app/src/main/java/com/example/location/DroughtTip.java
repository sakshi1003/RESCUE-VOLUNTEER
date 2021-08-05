package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DroughtTip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drought_tip);
        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);


        String some="A drought is generally defined as a period of below-average precipitation in a given region, resulting in prolonged shortages in water supply. A drought can last for months or years, and can have a substantial impact on the environment, ecosystem and agriculture of the affected region.\n" +
                "\n" +
                "Before a Drought-\n" +
                "\n" +
                "Make water conservation practices a part of your daily life and help preserve this essential resource.\n" +
                "\n" +
                "Indoor Water Conservation Tips Prior to a Drought\n" +
                "General\n" +
                "•\tNever pour water down the drain when there may be another use for it. For example, use it to water your indoor plants or garden.\n" +
                "•\tRepair dripping faucets by replacing washers. One drop per second wastes 2,700 gallons of water per year.\n" +
                "•\tCheck all plumbing for leaks and have any leaks repaired by a plumber.\n" +
                "•\tRetrofit all household faucets by installing aerators with flow restrictors.\n" +
                "•\tInstall an instant hot water heater on your sink.\n" +
                "•\tInsulate your water pipes to reduce heat loss and prevent them from breaking.\n" +
                "•\tInstall a water-softening system only when the minerals in the water would damage your pipes. Turn the softener off while on vacation.\n" +
                "•\tChoose appliances that are more water and energy efficient.\n" +
                "Bathroom\n" +
                "•\tInstall a low-volume toilet that uses less than half the water of older models. Note: In some areas, low-volume units are required by law.\n" +
                "•\tFor toilets with larger water tanks, install a toilet displacement device to reduce the amount of water needed to flush.\n" +
                "•\tReplace your showerhead with an ultra-low-flow version.\n" +
                "Kitchen\n" +
                "•\tReduce use of sink disposals, which require a lot of water to operate properly. Instead, start a compost pile as an alternate method of disposing of food waste or simply dispose of food in the garbage.\n" +
                "\n" +
                "Outdoor Water Conservation Tips Prior to a Drought\n" +
                "General\n" +
                "•\tCheck your well pump periodically. If the automatic pump turns on and off while water is not being used, you may have a leak.\n" +
                "•\tPlant native and/or drought-tolerant grasses, ground covers, shrubs, and trees, or small plants. Small plants require less water to become established. Group plants together based on similar water needs.\n" +
                "•\tInstall irrigation devices that are the most water efficient for each use, such as micro and drip irrigation, and soaker hoses.\n" +
                "•\tUse mulch to retain moisture in the soil. Mulch also helps control weeds that compete with landscape plants for water.\n" +
                "•\tLeave grass clippings on lawn to shade and return nutrients to soil.\n" +
                "•\tAvoid purchasing recreational water toys that require a constant stream of water.\n" +
                "•\tAvoid installing ornamental water features (such as fountains) unless they use re-circulated water.\n" +
                "•\tConsider using rainwater collection systems to water plants and gardens.\n" +
                "•\tContact your local water provider for additional guidance and information.\n" +
                "\n" +
                "During a Drought-\n" +
                "\n" +
                "Follow all state and local restrictions on water use, even if you have a private well (groundwater levels are affected by private well use). Contact your local water supplier or check MassDEP’s Municipal Water Use Restrictions page for current status.\n" +
                "Indoor Water Conservation Tips While in a Drought\n" +
                "Bathroom\n" +
                "•\tAvoid flushing the toilet unnecessarily. Dispose of tissues, insects, and other similar waste in the trash rather than the toilet.\n" +
                "•\tAvoid taking baths. Take short showers; turn on water only to get wet and lather and then again to rinse off.\n" +
                "•\tAvoid letting the water run while brushing your teeth, washing your face or shaving.\n" +
                "•\tPlace a bucket in the shower to catch excess water for watering plants.\n" +
                "Kitchen\n" +
                "•\tOperate automatic dishwashers only when they are fully loaded. Use the \"light wash\" feature, if available, to use less water.\n" +
                "•\tHand wash dishes by filling two containers—one with soapy water and the other with rinse water containing a small amount of chlorine bleach.\n" +
                "•\tClean vegetables in a pan filled with water rather than running water from the tap.\n" +
                "•\tStore drinking water in the refrigerator. Do not let the tap run while you are waiting for water to cool.\n" +
                "•\tAvoid wasting water waiting for it to get hot. Capture it for other uses such as plant watering or heat it on the stove or in a microwave.\n" +
                "•\tAvoid rinsing dishes before placing them in the dishwasher; just remove large particles of food. (Most dishwashers can clean soiled dishes very well, so dishes do not have to be rinsed before washing).\n" +
                "•\tAvoid using running water to thaw meat or other frozen foods. Defrost food overnight in the refrigerator or use the defrost setting on your microwave oven.\n" +
                "Laundry\n" +
                "•\tOperate automatic clothes washers only when they are fully loaded or set the appropriate water level for the size of your load.\n" +
                "•\tWater in several short sessions rather than one long one, in order for your lawn to better absorb moisture and avoid runoff.\n" +
                "•\tUse a broom or blower instead of a hose to clean leaves and other debris from your driveway or sidewalk.\n" +
                "•\tAvoid leaving sprinklers or hoses unattended. A garden hose can pour out 600 gallons or more in only a few hours. \n" +
                "•\tIn extreme drought, allow lawns to go unwatered in favor of preserving trees and large shrubs.\n" +
                "\n";
        messagewindow.setText (some);
    }
}