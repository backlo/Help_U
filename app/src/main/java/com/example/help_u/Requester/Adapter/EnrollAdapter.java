package com.example.help_u.Requester.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.help_u.R;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EnrollAdapter extends BaseAdapter {

    private HashMap<String, String> itemList = new HashMap<>();

    @BindView(R.id.enroll_listview_name)
    TextView enrollName;
    @BindView(R.id.enroll_listiview_number)
    TextView enrollNumber;
    @BindView(R.id.enroll_check)
    CheckBox enrollCheck;

    private static String key;

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.enroll_custom_listview, parent, false);
            ButterKnife.bind(this, convertView);
        }

        enrollName.setText(key);
        enrollNumber.setText(itemList.get(key));

        enrollCheck.setOnClickListener(new CheckBox.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked()){
                    Log.e("Enroll >> ", key+" 삭제해버리자");
                }
            }
        });

        return convertView;
    }

    public void addItem(String name, String number) {
        itemList.put(name, number);
        key = name;
    }

    public void deleteItem(){
        Log.e("Enroll >> ", "삭제");

    }
}