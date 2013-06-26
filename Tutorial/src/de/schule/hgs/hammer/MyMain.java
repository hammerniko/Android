package de.schule.hgs.hammer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

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

				startActivity(new Intent("de.schule.hgs.hammer.TUTORIALTWO"));
				mpButtonClick.start();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_main, menu);
		return true;
	}

}
