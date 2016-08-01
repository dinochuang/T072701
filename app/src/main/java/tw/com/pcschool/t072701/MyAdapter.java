package tw.com.pcschool.t072701;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Student on 2016/7/27.
 */
public class MyAdapter extends BaseAdapter
{
    Context context;
    ArrayList<Student> data;
    boolean chk[];
    public MyAdapter(Context c, ArrayList<Student> list)
    {
        context = c;
        data = list;
        chk = new boolean[data.size()];
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int p = position;

        Log.d("2701", "Get View Position:" + p);

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.listitem, null);
        ImageView img = (ImageView) v.findViewById(R.id.imageView);
        img.setImageResource(data.get(position).photoid);
        final TextView tv1 = (TextView) v.findViewById(R.id.textView);
        tv1.setText(data.get(position).name);
        TextView tv2 = (TextView) v.findViewById(R.id.textView2);
        tv2.setText(data.get(position).phone);

        Button btn = (Button) v.findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(context, tv1.getText(),Toast.LENGTH_SHORT).show();
                Intent it = new Intent(context, DetailActivity.class);
                Bundle b = new Bundle();
                b.putString("name", data.get(p).name);
                b.putString("phone", data.get(p).phone);
                b.putInt("photo", data.get(p).photoid);

                it.putExtras(b);
                context.startActivity(it);
            }
        });


        CheckBox chk1 = (CheckBox) v.findViewById(R.id.checkBox);
        chk1.setChecked(chk[p]);
        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                chk[p] = isChecked;
            }
        });

        return v;
    }
}
