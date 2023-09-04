package com.example.azkary;

import android.annotation.SuppressLint;
import android.content.Context;
//import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static androidx.fragment.app.FragmentActivity.*;

public class ZikrRecyclerAdapter extends RecyclerView.Adapter<ZikrRecyclerAdapter.ViewHolder>{

    final private Context mContext;
    final private List<Zikr> mAzkar;
    private final LayoutInflater mLayoutInflater;

    public ZikrRecyclerAdapter(Context context, List<Zikr> azkar) {
        mContext = context;
        mAzkar = azkar;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = mLayoutInflater.inflate(R.layout.list_item_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.mCurrentPos = position;

        Zikr zikr = mAzkar.get(position);

        holder.mZikrMessage.setText(zikr.getZikrText());

        String num = zikr.getAddInfo();
        holder.mNumReps.setText(num);


    }

    @Override
    public int getItemCount() {
        return mAzkar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public final TextView mZikrMessage;
        public final TextView mNumReps;

        public int mCurrentPos;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mZikrMessage = itemView.findViewById(R.id.zikr_message);
            mNumReps = itemView.findViewById(R.id.num_reps);


            mZikrMessage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String s = mNumReps.getText().toString();

                    mNumReps.setText(s);

                }
            });


        }
    }

}
