package de.notenrechner;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;


public class MainActivity extends Activity {
	Note note;
	EditText tfDatum;
	Spinner spFach,spNote;
	Button btnErfassen, btnLoeschen, btnAnzeigen;
	OnClickListener lErfassen, lLoeschen, lAnzeigen;
	ArrayAdapter<String> adapter, listenAdapter;
	Resources res;
	ListView lvNotenliste;
	ArrayList<Note> notenListe;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		res = getResources();
		
		// Fach Liste
				spFach = (Spinner) this.findViewById(R.id.spxFach);
				String[] items = res.getStringArray(R.array.fach);
				adapter = new ArrayAdapter<String>(this,
						android.R.layout.simple_spinner_item, items);
				adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spFach.setAdapter(adapter);

				//Notenauswahlliste
				spNote = (Spinner) this.findViewById(R.id.spxNote);
				String[] notenItems = new String[] { "1", "2", "3", "4","5","6" };
				adapter = new ArrayAdapter<String>(this,
						android.R.layout.simple_spinner_item, notenItems);
				adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spNote.setAdapter(adapter);
		
		// Notenliste
		notenListe = new ArrayList<Note>();
		listenAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1);
		lvNotenliste = (ListView) this.findViewById(R.id.lvxNotenliste);
		lvNotenliste.setAdapter(listenAdapter);

		//Datum
		tfDatum = (EditText) this.findViewById(R.id.tfxDatum);
		
		//Buttons
		btnErfassen = (Button) this.findViewById(R.id.btnxErfassen);
		btnLoeschen = (Button) this.findViewById(R.id.btnxLoeschen);
		btnAnzeigen = (Button) this.findViewById(R.id.btnxAnzeigen);

		
		//Listener
		lErfassen = new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				try {
					note = new Note();
					note.setFach(spFach.getSelectedItem().toString());
					note.setDatum(tfDatum.getText().toString());
					note.setNote(Double.parseDouble(spNote.getSelectedItem().toString()));
					notenListe.add(note);
					listenAdapter.add(note.toString());

				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		lLoeschen = new OnClickListener() {

			@Override
			public void onClick(View v) {
				note = null;
				spFach.setSelection(0);
				tfDatum.setText("");
				spNote.setSelection(0);

			}
		};

		lAnzeigen = new OnClickListener() {

			@Override
			public void onClick(View v) {

				for (int i = 0; i < notenListe.size(); i++) {
					Note eineNote;
					eineNote = notenListe.get(i);
					listenAdapter.add(eineNote.toString());
				}

			}
		};

		btnAnzeigen.setOnClickListener(lAnzeigen);
		btnErfassen.setOnClickListener(lErfassen);
		btnLoeschen.setOnClickListener(lLoeschen);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
