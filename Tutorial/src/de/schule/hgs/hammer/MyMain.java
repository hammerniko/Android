package de.schule.hgs.hammer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_main);

		// Sound for ButtonClick
		final MediaPlayer mpButtonClick = MediaPlayer
				.create(this, R.raw.button);

		// Button1
		Button btTutorialOne = (Button) findViewById(R.id.btTutorial1);
		btTutorialOne.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				startActivity(new Intent("de.schule.hgs.hammer.TUTORIALONE"));
				mpButtonClick.start();
			}
		});

		// Button2
		Button btTutorialTwo = (Button) findViewById(R.id.btTutorial2);
		btTutorialTwo.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				startActivity(new Intent("de.schule.hgs.hammer.LISTVIEW"));
				mpButtonClick.start();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		// Inflate the menu; this adds items to t;he action bar if it is present.
		MenuInflater awesome = getMenuInflater();
		awesome.inflate(R.menu.my_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menuSweet:
			startActivity(new Intent("de.schule.hgs.hammer.SWEET"));
			return true;
			
		case R.id.menuToast:
			//...
			Toast toast = Toast.makeText(this, "Der erste Toast",Toast.LENGTH_SHORT);
			toast.show();
			return true;

		}
		
		return false;
	}
	
	

}
