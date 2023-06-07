package sg.edu.rp.c346.id22036196.demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etElement;
    EditText etIndexElement;
    Button btnAdd;
    ListView lvColour;

    ArrayList<String>alColours;
    ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etElement=findViewById(R.id.editTextColour);
        etIndexElement=findViewById(R.id.editTextIndex);
        btnAdd=findViewById(R.id.buttonAddItem);
        lvColour=findViewById(R.id.listViewColour);

        alColours=new ArrayList<>();
        alColours.add("Red");
        alColours.add("Orange");
        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alColours);

        lvColour.setAdapter(adapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colourName=etElement.getText().toString();
                int pos=Integer.parseInt(etIndexElement.getText().toString());
                alColours.add(pos,colourName);
                adapter.notifyDataSetChanged();
            }
        });
        lvColour.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String color=alColours.get(position);qdbdedsa   XAS
                Toast.makeText(MainActivity.this, color, Toast.LENGTH_LONG).show();
            }
        });
    }
}