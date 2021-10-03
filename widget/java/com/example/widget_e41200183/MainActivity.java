package com.example.widget_e41200183;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //create cities array for autocomplete with string data type
    private static final String[] CITIES = new String[]{
            "Jakarta", "Surabaya", "Jogjakarta", "Bandung", "Bogor", "Malang",
            "Palangkaraya", "Sidoarjo", "Bekasi", "Tangerang", "Medan", "Jember",
            "Semarang"
    };

    //initiate spinner
    Spinner spinner;

    //initiate listview education
    ListView listViewService;
//    String[] educations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //autocomplete settings
        AutoCompleteTextView editText = findViewById(R.id.actv); //id actv diberi behaviour AutoCompleteViewTextView
        ArrayAdapter<String> adapterAutoComplete = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, CITIES);
        editText.setAdapter(adapterAutoComplete); //adapter diberi nilai yang ada pada variabel adapterAutoComplete

        //spinner settings
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this, R.array.menu, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterSpinner); //adapter diberi nilai yang ada pada variabel adapterSpinner
        //give action when choose one of spinner items
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String menu = parent.getItemAtPosition(i).toString(); //initiate menu variable
                Toast.makeText(parent.getContext(), "Your gender's " + menu, Toast.LENGTH_SHORT).show(); //show the pop up
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //listView settings
        listViewService = findViewById(R.id.lv);
        String[] services = {"Delivery", "Drive Thru", "Dine In"};
        ArrayAdapter<String> serviceAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, services);
        listViewService.setAdapter(serviceAdapter); //adapter diberi nilai yang ada pada variabel serviceAdapter
        //give action when choose one of listView items
        listViewService.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String service = ((TextView) view).getText().toString(); //initiate service variable with string data type
                Toast.makeText(getApplicationContext(), "Choose " + service, Toast.LENGTH_SHORT).show(); //show the pop up
            }
        });
    }
}