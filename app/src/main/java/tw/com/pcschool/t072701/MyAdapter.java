package tw.com.pcschool.t072701;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Student on 2016/7/27.
 */
public class MyAdapter extends BaseAdapter
{
    Context context;
    ArrayList<Student> data;
    public MyAdapter(Context c, ArrayList<Student> list)
    {
        context = c;
        data = list;
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
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.listitem, null);
        ImageView img = (ImageView) v.findViewById(R.id.imageView);
        img.setImageResource(data.get(position).photoid);
        TextView tv1 = (TextView) v.findViewById(R.id.textView);
        tv1.setText(data.get(position).name);
        TextView tv2 = (TextView) v.findViewById(R.id.textView2);
        tv2.setText(data.get(position).phone);
        return v;
    }
}