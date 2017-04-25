package com.example.gaurav.assignment3.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gaurav.assignment3.Model.ListItem;
import com.example.gaurav.assignment3.R;
import com.example.gaurav.assignment3.UI.ListDetail;

import java.util.List;

/**
 * Created by gaurav on 21/4/17.
 */

public class DerpAdapter extends  RecyclerView.Adapter<DerpAdapter.DerpHolder>{


    private List<ListItem> listData;
    private LayoutInflater inflater;

Context context;
     public DerpAdapter(List<ListItem> listData, Context C){
         this.inflater=LayoutInflater.from(C);
         this.listData=listData;
         this.context=C;

     }
    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {

        ListItem item=listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getImageResid());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, ListDetail.class);
                context.startActivity(intent);
            }

        });

    }


    @Override
    public int getItemCount()
    {

        return listData.size();
    }




    class DerpHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView icon;
        private View container;

        public DerpHolder(View itemView) {
            super(itemView);

            title=(TextView) itemView.findViewById(R.id.tv_list1);
            icon=(ImageView) itemView.findViewById(R.id.im_item_icon);
            container=(View) itemView.findViewById(R.id.cont_item_root);


        }
    }


}
