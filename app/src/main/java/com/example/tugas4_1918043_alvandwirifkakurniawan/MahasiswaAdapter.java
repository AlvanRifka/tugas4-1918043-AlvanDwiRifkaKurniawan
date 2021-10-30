package com.example.tugas4_1918043_alvandwirifkakurniawan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends
        RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>{
    private ArrayList<Mahasiswa> dataList;
    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }
    public void onBindViewHolder(MahasiswaViewHolder holder, int
            position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtChat.setText(dataList.get(position).getChat());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class MahasiswaViewHolder extends
            RecyclerView.ViewHolder{
        private TextView txtNama, txtChat;
        private ImageView Logo;
        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);
            txtChat = (TextView)
                    itemView.findViewById(R.id.txt_chat);
        }
    }
}
