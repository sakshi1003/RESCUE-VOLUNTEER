package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PrivacyPolicy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
        TextView messagewindow=(TextView) findViewById (R.id.messagewindow);
        String some="This privacy policy has been compiled to better serve those who are concerned with how ‘Personally Identifiable Information’ (PPI) is being used online. PII, as described in U.S. privacy law and information security, is information that can be used on its own or with other information to identify, contact, or locate a single person, or to identify an individual in context. Please read our privacy policy carefully to get a clear understanding of how we collect, use, protect or otherwise handle Personally Identifiable Information in accordance with our software solutions and websites.\n" +
                "\n" +
                "What personal information do we collect from the people that use our website or apps-\n" +
                "\n" +
                "When registering an account to use an app and/or website, as appropriate, you may be asked to enter your name, email address, phone number, or other details. Other information collected when using the apps and/or websites could include:\n" +
                "\n" +
                "Unique device identifier, device model, device operating system;\n" +
                "\n" +
                "Geo-location (GPS, WiFi, user-entered);\n" +
                "\n" +
                "Photos, videos, or voice recordings.\n" +
                "\n" +
                "When do we collect information?\n" +
                "\n" +
                "We collect information when you register on our websites, log into an app, receive notifications, use messaging functionality, fill out a form, submit a tech support ticket, or enter information on our systems.\n" +
                "\n" +
                "How do we use your information?\n" +
                "\n" +
                "We may use the information collected from you when the apps are being used for their specific purposes and certain features are activated, such as:\n" +
                "\n" +
                "To construct after-action reports\n" +
                "\n" +
                "To share information with emergency responders or other authorized people\n" +
                "\n" +
                "To follow up after a tech support ticket has been issued\n" +
                "\n" +
                "To perform technical monitoring of the apps and websites\n" +
                "\n" +
                "How do we protect your information?\n" +
                "\n" +
                "Your personal information is contained behind secure networks and is only accessible by a limited number of persons, including your organizational administrators (manager users) who have special access rights to such systems. All persons that are granted special access are required to keep the information strictly confidential, in compliance with state, federal, and education law. In addition, all sensitive information is encrypted via Secure Socket Layer (SSL) technology.\n" +
                "\n" +
                "We implement strict security measures when a user enters, submits, or accesses their information to maintain the security of personal information.\n" +
                "\n" +
                "Where do we store your information?\n" +
                "\n" +
                "Our databases containing PII are located on secure Amazon servers in the United States.\n" +
                "\n" +
                "How can users correct their information?\n" +
                "\n" +
                "Users can correct their name and phone numbers directly from inside the apps. All other information may be corrected by contacting our tech support for assistance.\n" +
                "\n" +
                "How do we dispose of the user PII after user account termination?\n" +
                "\n" +
                "Individual user accounts may be deleted by authorized organizational administrators. The user’s PII data, such as name with corresponding email and phone number are immediately deleted from the user table and will no longer be available once deleted.\n" +
                "\n" +
                "COPPA (Children Online Privacy Protection Act)\n" +
                "\n" +
                "When it comes to the collection of personal information from children under the age of 13 years old, the Children’s Online Privacy Protection Act (COPPA) puts parents in control. The Federal Trade Commission, United States’ consumer protection agency, enforces the COPPA Rule, which spells out what operators of websites and online services must do to protect children’s privacy and safety online.\n" +
                "\n" +
                "We do not specifically market to children under the age of 13 years old. All information pertaining to children is kept strictly confidential.\n" +
                "\n" +
                "Third party-disclosure\n" +
                "\n" +
                "We do not sell, trade, or otherwise transfer to outside parties, your personal identifiable information. PII contained on the reports may be turned in to authorities by a subpoena.\n" +
                "\n" +
                "Third party links\n" +
                "\n" +
                "We do not include or offer third-party products or services on our websites.\n" +
                "\n" +
                "CAN SPAM ACT\n" +
                "\n" +
                "The CAN-SPAM ACT is a law that sets the rules for commercial email, establishes requirements for commercial messages, gives recipients the right to have emails stopped from being sent to them, and spells out tough penalties for violations.\n" +
                "\n" +
                "We collect your email address in order to send emergency communications and notifications required to use the apps. We do not send out commercial messages.\n" +
                "\n" +
                "This policy is effective as of march 17, 2021 \n" +
                "\n" +
                "Contacting Us\n" +
                "\n" +
                "If there are any questions regarding this privacy policy, you can contact us at:\n" +
                "\n" +
                "unknown.alert@gmail.com";
        messagewindow.setText (some);

    }
}