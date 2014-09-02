package lab.example.prpfile;

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
		txtname = (TextView)findViewById(R.id.textView1);
		txtname.setText("Notpawat  Sornvieng");
		t1 = (TextView)findViewById(R.id.textView2);
		t2 = (TextView)findViewById(R.id.textView3);
		t3 = (TextView)findViewById(R.id.textView4);
		t4 = (TextView)findViewById(R.id.textView5);
		t5 = (TextView)findViewById(R.id.textView6);
		t6 = (TextView)findViewById(R.id.textView7);
		t7 = (TextView)findViewById(R.id.textView8);
		t8 = (TextView)findViewById(R.id.textView9);
		t9 = (TextView)findViewById(R.id.textView10);
		t10 = (TextView)findViewById(R.id.textView11);
		t11 = (TextView)findViewById(R.id.textView12);
		t12 = (TextView)findViewById(R.id.textView13);
		t13 = (TextView)findViewById(R.id.textView14);
		t14 = (TextView)findViewById(R.id.textView15);
		
		
		t1.setText("Nickname");
		t2.setText("Age");
		t3.setText("Weidth");
		t4.setText("Height");
		t5.setText("Sex");
		t6.setText("Major");
		t7.setText("Pang");
		t8.setText("20");
		t9.setText("40");
		t10.setText("173");
		t11.setText("Male");
		t12.setText("Inormation Technology");
		t13.setText("Email");
		t14.setText("Notpawat96@gmail.com");
		
		
	
		btone.setOnClickListener(this);
		bttwo.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.Edit:
			
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
