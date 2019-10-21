package com.apps.ifaldyprayanda.exerciseapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMenuAdapter extends RecyclerView.Adapter<ListMenuAdapter.ListViewHolder> {
    private ArrayList<MenuDiet> listMenu;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemCallback(OnItemClickCallback onItemClickCallback)
    {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListMenuAdapter(ArrayList<MenuDiet> list)
    {
        this.listMenu = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_menu, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, int position) {
        MenuDiet menu = listMenu.get(position);

        Glide.with(listViewHolder.itemView.getContext())
                .load(menu.getMenuPhoto())
                .apply(new RequestOptions().override(70, 70))
                .into(listViewHolder.imgMenu);
        listViewHolder.txTitle.setText(menu.getMenuTitle());
        listViewHolder.txName.setText(menu.getMenuName());

        listViewHolder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onItemClickCallback.onItemClicked(listMenu.get(listViewHolder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMenu;
        TextView txTitle, txName;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMenu = itemView.findViewById(R.id.img_menu);
            txTitle = itemView.findViewById(R.id.tx_title);
            txName = itemView.findViewById(R.id.tx_name);
        }
    }

    public interface OnItemClickCallback
    {
        void onItemClicked(MenuDiet menuDiet);
    }
}
