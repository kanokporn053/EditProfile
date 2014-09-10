package app.example.kanokporn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
public class MainActivity extends Activity implements OnClickListener {
private Button btn1, btn2;
private TextView txt11, txt12, txt13, txt14, txt15, txt16, txt17, txt18;
private String show1,show2,show3,show4,show5,show6,show7,show8;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
ViewMatching();
}
private void ViewMatching() {
btn1 = (Button) findViewById(R.id.btnsave);
btn2 = (Button) findViewById(R.id.btnimg);
btn1.setOnClickListener(this);
btn2.setOnClickListener(this);
txt11 = (TextView) findViewById(R.id.txt14);
txt12 = (TextView) findViewById(R.id.txt15);
txt13 = (TextView) findViewById(R.id.txt17);
txt14 = (TextView) findViewById(R.id.txt19);
txt15 = (TextView) findViewById(R.id.txt20);
txt16 = (TextView) findViewById(R.id.txt21);
txt17 = (TextView) findViewById(R.id.txt22);
txt18 = (TextView) findViewById(R.id.txt23);
txt11.setText("PON");
txt12.setText("Female");
txt13.setText("14/02/37");
txt14.setText("20");
txt15.setText("Business Computer");
txt16.setText("Kanokporn Suwan");
txt17.setText("Nooporn1402");
txt18.setText("pon-nana053@hotmail.com");;
show1 = getIntent().getStringExtra("txt11");
show2 = getIntent().getStringExtra("txt12");
show3 = getIntent().getStringExtra("txt13");
show4 = getIntent().getStringExtra("txt14");
show5 = getIntent().getStringExtra("txt15");
show6 = getIntent().getStringExtra("txt16");
show7 = getIntent().getStringExtra("txt17");
show8 = getIntent().getStringExtra("txt18");
txt11.setText(show1);
txt12.setText(show2);
txt13.setText(show3);
txt14.setText(show4);
txt15.setText(show5);
txt16.setText(show6);
txt17.setText(show7);
txt18.setText(show8);
}
@Override
public void onClick(View v) {
switch (v.getId()) {
case R.id.btnsave:
Intent i = new Intent(getApplicationContext(), edit_pon.class);
startActivity(i);
break;
case R.id.btnimg:
Intent j = new Intent(getApplicationContext(), ImageActivity.class);
startActivity(j);
break;
default:
break;
}
}
}