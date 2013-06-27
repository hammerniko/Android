package de.schule.hgs.hammer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TutorialOne extends Activity {
	
	EditText getInput;
	TextView textOut;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial1);
		
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
	

}
