package lab.example.prpfile;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Profile;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Edit extends Activity implements OnClickListener{
	 TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7;
	 Button bbt;
	 EditText e1,e2,e3,e4,e5,e6,e7;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit);
		d();
	}

	private void d() {
		// TODO Auto-generated method stub
		txt1 = (TextView) findViewById(R.id.tv1);
		txt2 = (TextView) findViewById(R.id.tv2);
		txt3 = (TextView) findViewById(R.id.tv3);
		txt4 = (TextView) findViewById(R.id.tv4);
		txt5 = (TextView) findViewById(R.id.tv4);
		txt6 = (TextView) findViewById(R.id.tv6);
		txt7 = (TextView) findViewById(R.id.tv7);
		
		bbt = (Button) findViewById(R.id.btt);
		
		
		e1 = (EditText) findViewById(R.id.et1);
		e2 = (EditText) findViewById(R.id.et2);
		e3 = (EditText) findViewById(R.id.et3);
		e4 = (EditText) findViewById(R.id.et4);
		e5 = (EditText) findViewById(R.id.et5);
		e6 = (EditText) findViewById(R.id.et6);
		e7 = (EditText) findViewById(R.id.et7);
		
		bbt.setOnClickListener(this);
		
		
		
		txt1.setText("Nickname");
		txt2.setText("Age");
		txt3.setText("Weidth");
		txt4.setText("Height");
		txt5.setText("Sex");
		txt6.setText("Major");
		txt7.setText("Email");
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
	case R.id.btt:
		
		Intent a = new Intent(Edit.this,MainActivity.class);
		
		
		String name1 = e1.getText().toString();
		String name2 = e2.getText().toString();
		String name3 = e3.getText().toString();
		String name4 = e4.getText().toString();
		String name5 = e5.getText().toString();
		String name6 = e6.getText().toString();
		String name7 = e7.getText().toString();
	
		
		a.putExtra("dd1", name1);
		a.putExtra("dd2", name2);
		a.putExtra("dd3", name3);
		a.putExtra("dd4", name4);
		a.putExtra("dd5", name5);
		a.putExtra("dd6", name6);
		a.putExtra("dd7", name7);
		
		startActivity(a);
		
		
		break;

	default:
		break;
	}
	}
}



