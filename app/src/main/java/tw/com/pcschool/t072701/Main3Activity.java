package tw.com.pcschool.t072701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    ListView lv3;
    ArrayList<Student> mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mylist = new ArrayList<>();
        mylist.add(new Student(R.drawable.f1, "AA", "11111"));
        mylist.add(new Student(R.drawable.f2, "BB", "22222"));
        mylist.add(new Student(R.drawable.f3, "CC", "33333"));

        lv3 = (ListView) findViewById(R.id.listView3);
        MyAdapter adapter = new MyAdapter(Main3Activity.this, mylist);
        lv3.setAdapter(adapter);

    }
}

