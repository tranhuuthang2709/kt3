package com.example.kt3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

    public class Adapter extends BaseAdapter {

        private Context context;
        private int layout;
        private List<Ngonngu> ngonnguList;

        public Adapter(Context context, int layout, List<Ngonngu> ngonnguList) {
            this.context = context;
            this.layout = layout;
            this.ngonnguList = ngonnguList;
        }

        @Override
        public int getCount() {
            return ngonnguList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        private class ViewHolder{
            ImageView imgHinh;
            TextView txtTen;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            ViewHolder holder;

            if (view == null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                view = inflater.inflate(layout, null);
                holder = new ViewHolder();

                //anh xa view
                holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
                holder.imgHinh= (ImageView) view.findViewById(R.id.imageviewHinh);
                view.setTag(holder);
            }else {
                holder = (ViewHolder) view.getTag();
            }

            // gan gia tri
            Ngonngu ngonngu = ngonnguList.get(i);

            holder.txtTen.setText(ngonngu.getNgonngu());
            holder.imgHinh.setImageResource(ngonngu.getHinh());

            return view;
        }

    }
