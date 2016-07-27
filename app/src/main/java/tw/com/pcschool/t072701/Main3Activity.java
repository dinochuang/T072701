package tw.com.pcschool.t072701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {
    ListView lv3;
    String[] str = {"AA","BB","AA2","BB3","AA4","BB6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lv3 = (ListView) findViewById(R.id.listView3);
        MyAdapter adapter = new MyAdapter(Main3Activity.this, str);
        lv3.setAdapter(adapter);

    }
}

