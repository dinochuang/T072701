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
    LayoutInflater inflater;
    public MyAdapter(Context c, ArrayList<Student> list)
    {
        context = c;
        inflater = LayoutInflater.from(context);
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


        ViewHolder holder;
        CheckBox chk1;
        if (convertView == null)
        {

            convertView = inflater.inflate(R.layout.listitem, null);
            holder = new ViewHolder();
            holder.img1 = (ImageView) convertView.findViewById(R.id.imageView);
            holder.tv1 = (TextView) convertView.findViewById(R.id.textView);
            holder.tv2 = (TextView) convertView.findViewById(R.id.textView2);
            holder.btn1 = (Button) convertView.findViewById(R.id.button);
            holder.chk1 = (CheckBox) convertView.findViewById(R.id.checkBox);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        chk1 = (CheckBox) convertView.findViewById(R.id.checkBox);

        holder.img1.setImageResource(data.get(position).photoid);
        holder.tv1.setText(data.get(position).name);
        holder.tv2.setText(data.get(position).phone);

        holder.btn1.setOnClickListener(new View.OnClickListener() {
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



        // chk1.setChecked(chk[p]);
        // Log.d("2701", "Get View Position:" + p + "  chk[p]:" + chk[p]);
        holder.chk1.setOnCheckedChangeListener(null);
        if(chk[p])
            holder.chk1.setChecked(true);
        else
            holder.chk1.setChecked(false);

        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                chk[p] = isChecked;
                Log.d("2701", "Check Change p:" + p + " isChecked:" + isChecked + " chk[p]:" + chk[p]);
            }
        });

        return convertView;
    }

    static class ViewHolder
    {
        ImageView img1;
        TextView tv1;
        TextView tv2;
        Button btn1;
        CheckBox chk1;
    }
}
