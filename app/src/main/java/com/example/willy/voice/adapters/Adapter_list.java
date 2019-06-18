package com.example.willy.voice.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.willy.voice.R;

import java.util.List;


public  class Adapter_list extends BaseAdapter {

        private Context context;
        private int layout;
        private List<String> nombres;

        public Adapter_list(Context context, int layout, List<String> nombres){
            this.context=context;
            this.layout=layout;
            this.nombres=nombres;
        }

        @Override
        public int getCount() {
            return this.nombres.size();
        }

        @Override
        public Object getItem(int position) {
             return this.nombres.get(position);
        }

        @Override
        public long getItemId(int id) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if(convertView==null){
                LayoutInflater layoutInflater = LayoutInflater.from(this.context);

                convertView= layoutInflater.inflate(R.layout.list_view_new,null);
                holder = new ViewHolder();
                holder.nameText   = (TextView) convertView.findViewById(R.id.text);
                convertView.setTag(holder);

            }else{
                holder=(ViewHolder) convertView.getTag();
            }

            String current =nombres.get(position);
            holder.nameText.setText(current);
            return convertView;
        }
        static  class ViewHolder{
             private TextView nameText;
        }

}
