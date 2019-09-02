package com.example.android.paddydtblive;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;


public class MoreDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);
        TextView textView = (TextView) findViewById(R.id.txt_more_details);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml("<p><b><u>Goda wella</u></p><p>How to manage</p></b></strong><ol><li><p>Remove weeds from fields and surrounding areas to prevent the multiplication of rice bugs during fallow periods.</p> </li> <li> <p>Level fields with even applications of fertilizer and water encourage rice to grow and develop is at the same rate. Planting fields, within a village, at the same time (synchronous planting) also helps reduce rice bug problems.</p>  </li>  <li>  <p>Capturing rice bugs, in the early morning or late afternoon, by net can be effective at low rice bug densities, though labor-intensive.</p></li> <li><p>Encourage biological control agents: Some wasps, grasshoppers and spiders attack rice bugs or rice bug eggs. Indiscriminate insecticide use disrupts biological control, resulting in pest resurgence.</p> </li></ol><strong><p>For chemical control</p></strong><p>Before using a pesticide contact a crop protection specialist for suggestions, guidance, and warnings specific to your situation.</p><ol> <li> <p>Begin scouting the field at pre-flowering and continue daily until the hard dough stage. Count rice bugs in the early morning or late afternoon from 20 hills while walking diagonally across a transplanted field. Adults often fly out of the way before you reach the rice plant, so counts may only reveal immature forms. Direct control may be required if there are more than 10 rice bugs/20 hills.</p> </li>  <li> <p>The choice of insecticide depends on many factors such as the application equipment available, the cost of the insecticide, experience of the applicator, or presence of fish. The benefits of using an insecticide must be weighed against the risks to health and the environment.</p></li></ol>", Html.FROM_HTML_MODE_COMPACT));
        } else {
            textView.setText(Html.fromHtml("<p><b><u>Goda wella</u></p><p>How to manage</p></b></strong><ol><li><p>Remove weeds from fields and surrounding areas to prevent the multiplication of rice bugs during fallow periods.</p> </li> <li> <p>Level fields with even applications of fertilizer and water encourage rice to grow and develop is at the same rate. Planting fields, within a village, at the same time (synchronous planting) also helps reduce rice bug problems.</p>  </li>  <li>  <p>Capturing rice bugs, in the early morning or late afternoon, by net can be effective at low rice bug densities, though labor-intensive.</p></li> <li><p>Encourage biological control agents: Some wasps, grasshoppers and spiders attack rice bugs or rice bug eggs. Indiscriminate insecticide use disrupts biological control, resulting in pest resurgence.</p> </li></ol><strong><p>For chemical control</p></strong><p>Before using a pesticide contact a crop protection specialist for suggestions, guidance, and warnings specific to your situation.</p><ol> <li> <p>Begin scouting the field at pre-flowering and continue daily until the hard dough stage. Count rice bugs in the early morning or late afternoon from 20 hills while walking diagonally across a transplanted field. Adults often fly out of the way before you reach the rice plant, so counts may only reveal immature forms. Direct control may be required if there are more than 10 rice bugs/20 hills.</p> </li>  <li> <p>The choice of insecticide depends on many factors such as the application equipment available, the cost of the insecticide, experience of the applicator, or presence of fish. The benefits of using an insecticide must be weighed against the risks to health and the environment.</p></li></ol>"));
        }

    }

}
