package tw.com.pcschool.t072701;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Student on 2016/7/27.
 */
public class MyAdapter extends BaseAdapter
{
    Context context;
    public MyAdapter(Context c)
    {
        context = c;
    }

    @Override
    public int getCount()
    {
        return 7;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv = new TextView(context);
        tv.setText("Hello:" + position);
        return tv;
    }
}
