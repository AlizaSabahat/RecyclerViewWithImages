package com.example.recyclerveiwtwoq.RecyclerView;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerveiwtwoq.ModelClass.Modelclass;
import com.example.recyclerveiwtwoq.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;

    ArrayList<Modelclass> modelclassArrayList ;

    public RecyclerAdapter(ArrayList<Modelclass> modelclassArrayList,Context context) {
        this.modelclassArrayList = modelclassArrayList;
        this.context = context;
    }



    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( RecyclerAdapter.ViewHolder holder, int position) {
        holder.txtfooditem.setText(modelclassArrayList.get(position).getTxtfooditem());
        holder.txtweight.setText(modelclassArrayList.get(position).getTxtweight());
        holder.txtrupees.setText(modelclassArrayList.get(position).getTxtrupees());
        holder.txtnumbercount.setText(modelclassArrayList.get(position).getTxtnumbercount());


        holder.txtplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = holder.txtnumbercount.getText().toString();
                int x = Integer.parseInt(a);
                x = x + 1;

                String b = String.valueOf(x);
                holder.txtnumbercount.setText(b);
            }
        });
        holder.txtminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String k = holder.txtnumbercount.getText().toString();

                int y = Integer.parseInt(k);
                if (y == 0)
                    Toast.makeText(context, "Add Something First", Toast.LENGTH_LONG).show();
                 else {
                    y = y - 1;
                    String l = String.valueOf(y);
                    holder.txtnumbercount.setText(l);
                }


            }
        });

                String s;
                s= holder.txtfooditem.getText().toString();
                if (s=="Noodles")
                holder.imgfood.setImageResource(R.drawable.noodles);
                else if (s=="Nimko")
                    holder.imgfood.setImageResource(R.drawable.nimko);
                else if(s=="Lays")
                    holder.imgfood.setImageResource(R.drawable.lays);
                else if (s=="Biscuit")
                    holder.imgfood.setImageResource(R.drawable.biscuit);





    }

    @Override
    public int getItemCount() {

        return modelclassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgfood;
        TextView txtfooditem,txtweight,txtrupees,txtminus,txtplus,txtnumbercount;
        public ViewHolder( View itemView) {
            super(itemView);
            imgfood=itemView.findViewById(R.id.imgfood);
            txtfooditem=itemView.findViewById(R.id.txtfooditem);
            txtweight=itemView.findViewById(R.id.txtweight);
            txtrupees=itemView.findViewById(R.id.txtrupees);
            txtminus=itemView.findViewById(R.id.txtminus);
            txtplus=itemView.findViewById(R.id.txtplus);
            txtnumbercount=itemView.findViewById(R.id.txtnumbercount);



        }
    }
}
