package de.schule.hgs.hammer;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class TutorialOne extends Activity implements OnCheckedChangeListener {
	
	EditText getInput;
	TextView textOut;
	RadioGroup rgGravity, rgStyle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial1);
		
		
		rgGravity = (RadioGroup) findViewById(R.id.rgGravity);
		rgGravity.setOnCheckedChangeListener(this);
		
		rgStyle = (RadioGroup) findViewById(R.id.rgStyle);
		rgStyle.setOnCheckedChangeListener(this);
		
		
		textOut = (TextView) findViewById(R.id.tvGetInput);
		getInput = (EditText) findViewById(R.id.etInput);
		Button ok = (Button) findViewById(R.id.btOK);
		
		ok.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				textOut.setText(getInput.getText());
			}
		});
	}

	@Override
	public void onCheckedChanged(RadioGroup rg, int rbId) {
		
		switch (rbId) {
		case R.id.rbLeft:  
			textOut.setGravity(Gravity.LEFT);
			break;
			
		case R.id.rbCenter:  
			textOut.setGravity(Gravity.CENTER);
			break;
			
		case R.id.rbRight:  
			textOut.setGravity(Gravity.RIGHT);
			break;
		
		case R.id.rbBold:  
			textOut.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
			break;	
		
		case R.id.rbNormal:  
			textOut.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
			break;	
			
		case R.id.rbItalic:  
			textOut.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
			break;	
		
		}
		
	}
	

}
