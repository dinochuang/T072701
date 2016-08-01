package tw.com.pcschool.t072701;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent it = getIntent();
        Bundle b = it.getExtras();

        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);

        tv3.setText(b.getString("name"));
        tv4.setText(b.getString("phone"));

        ImageView iv = (ImageView) findViewById(R.id.imageView2);
        iv.setImageResource(b.getInt("photo"));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent it = getIntent();
        Bundle b = it.getExtras();

        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);

        tv3.setText(b.getString("name"));
        tv4.setText(b.getString("phone"));

        ImageView iv = (ImageView) findViewById(R.id.imageView2);
        iv.setImageResource(b.getInt("photo"));

    }
}