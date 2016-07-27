package tw.com.pcschool.t072701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] str = {"AA","BB","AA2","BB3","AA4","BB6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                                MainActivity.this,
                                android.R.layout.simple_list_item_1,
                                str
                                );
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);


    }
}
