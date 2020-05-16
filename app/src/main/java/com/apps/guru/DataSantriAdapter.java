package com.apps.guru;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataSantriAdapter extends RecyclerView.Adapter<DataSantriAdapter.UserViewHolder> {

    private ArrayList<DataSantri> dataList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public DataSantriAdapter(ArrayList<DataSantri> dataList) {
        this.dataList = dataList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.data_santri_layout, parent, false);
        return new UserViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.tv_nama.setText(dataList.get(position).getNamaSantri());
        holder.tv_kelompokBelajar.setText(dataList.get(position).getKelompokBelajar());
        holder.tv_tanggal.setText(dataList.get(position).getTanggalJurnal());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_nama, tv_kelompokBelajar,tv_tanggal;

        public UserViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            tv_nama = (TextView) itemView.findViewById(R.id.tv_listNamaSantri);
            tv_kelompokBelajar = (TextView) itemView.findViewById(R.id.tv_listKelompokBelajar);
            tv_tanggal = (TextView) itemView.findViewById(R.id.tv_listTanggalJurnal);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
