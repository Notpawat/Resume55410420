package lab.example.prpfile;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {
	private Button btone;
	private Button bttwo; 
	private TextView txtname,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	private string p1,p2,p3,p4,p5,p6,p7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewMathching();
    }
    private void ViewMathching() {
		// TODO Auto-generated method stub
		btone =(Button)findViewById(R.id.Edit);
		bttwo =(Button)findViewById(R.id.Image);
		
		txtname = (TextView)findViewById(R.id.tv1);
		t1 = (TextView)findViewById(R.id.tv2);
		t2 = (TextView)findViewById(R.id.tv3);
		t3 = (TextView)findViewById(R.id.tv4);
		t4 = (TextView)findViewById(R.id.tv5);
		t5 = (TextView)findViewById(R.id.tv6);
		t6 = (TextView)findViewById(R.id.tv7);
		t13 = (TextView)findViewById(R.id.textView14);
		
		t7 = (TextView)findViewById(R.id.textView8);
		t8 = (TextView)findViewById(R.id.textView9);
		t9 = (TextView)findViewById(R.id.textView10);
		t10 = (TextView)findViewById(R.id.textView11);
		t11 = (TextView)findViewById(R.id.textView12);
		t12 = (TextView)findViewById(R.id.textView13);
		t14 = (TextView)findViewById(R.id.textView15);
	//startsettext	
		t1.setText("Nickname");
		t2.setText("Age");
		t3.setText("Weidth");
		t4.setText("Height");
		t5.setText("Sex");
		t6.setText("Major");
		t13.setText("Email");
		
		String p1 = getIntent().getStringExtra("dd1");
		String p2 = getIntent().getStringExtra("dd2");
		String p3 = getIntent().getStringExtra("dd3");
		String p4 = getIntent().getStringExtra("dd4");
		String p5 = getIntent().getStringExtra("dd5");
		String p6 = getIntent().getStringExtra("dd6");
		String p7 = getIntent().getStringExtra("dd7");
		
		if(txtname!=null){
		txtname.setText("Notpawat  Sornvieng");
		t7.setText("Pang");
		t8.setText("20");
		t9.setText("40");
		t10.setText("173");
		t11.setText("Male");
		t12.setText("Inormation Technology");
		t14.setText("Notpawat96@gmail.com");
		}
		
		if(p1!=null){
			t7.setText(p1);
			t8.setText(p2);
			t9.setText(p3);
			t10.setText(p4);
			t11.setText(p5);
			t12.setText(p6);
			t14.setText(p7);

		}
	
		btone.setOnClickListener(this);
		bttwo.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.Edit:
		Intent edit = new Intent (MainActivity.this, Edit.class);
		startActivity(edit);
			
			break;
		case R.id.Image:
		Intent sresume = new Intent (MainActivity.this, Resume.class);
		startActivity(sresume);
		
			break;
			
		default:
			break;
		}
	}


}
