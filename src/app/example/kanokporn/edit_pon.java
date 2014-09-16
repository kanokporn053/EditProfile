package app.example.kanokporn;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class edit_pon extends Activity implements OnClickListener {
private Button btnsubmit;
private EditText etxt1, etxt2, etxt3, etxt4, etxt5, etxt6, etxt7, etxt8;
private String txt11, txt12, txt13, txt14, txt15, txt16 , txt17, txt18;
@Override
protected void onCreate(Bundle savedInstanceState) {
setContentView(R.layout.edit_109);
super.onCreate(savedInstanceState);
ViewMatching();
}
private void ViewMatching() {
btnsubmit = (Button) findViewById(R.id.btnsave);
btnsubmit.setOnClickListener(this); 
etxt1 = (EditText) findViewById(R.id.etxt1);
etxt2 = (EditText) findViewById(R.id.etxt2);
etxt3 = (EditText) findViewById(R.id.etxt3);
etxt4 = (EditText) findViewById(R.id.etxt4);
etxt5 = (EditText) findViewById(R.id.etxt5);
etxt6 = (EditText) findViewById(R.id.etxt6);
etxt7 = (EditText) findViewById(R.id.etxt7);
etxt8 = (EditText) findViewById(R.id.etxt8);
}
@Override
public void onClick(View v) {
	
	
	save();
		
switch (v.getId()) {
case R.id.btnsave:
txt11 = (etxt1.getText().toString());
txt12 = (etxt2.getText().toString());
txt13 = (etxt3.getText().toString());
txt14 = (etxt4.getText().toString());
txt15 = (etxt5.getText().toString());
txt16 = (etxt6.getText().toString());
txt17 = (etxt7.getText().toString());
txt18 = (etxt8.getText().toString());
Intent R = new Intent(getApplicationContext(), MainActivity.class);
R.putExtra("txt11", txt11);
R.putExtra("txt12", txt12);
R.putExtra("txt13", txt13);
R.putExtra("txt14", txt14);
R.putExtra("txt15", txt15);
R.putExtra("txt16", txt16);
R.putExtra("txt17", txt17);
R.putExtra("txt18", txt18);
startActivity(R);
break;
default:
break;
}
}


public boolean save(){
	final AlertDialog.Builder ab = new AlertDialog.Builder(this);
	AlertDialog vv = ab.create();
	dbcontroler_109 dbclass = new dbcontroler_109(this);
	long savedata = dbclass.insertData(etxt1.getText().toString(),etxt2.getText().toString()
			,etxt3.getText().toString(),etxt4.getText().toString(),etxt5.getText().toString()
			,etxt6.getText().toString(),etxt7.getText().toString(),etxt8.getText().toString());
			
	if (savedata <= 0) {
		vv.setMessage("Error !!!!");
		vv.show();
		return false;
	}		
			
	Toast.makeText(getApplicationContext(), "Add Data Successfully",Toast.LENGTH_SHORT).show();
	return true;

	
}





}