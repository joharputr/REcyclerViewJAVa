package com.example.recyclerviewjava;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.RecyclerView.ViewHolder;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.TestHolder> {
    ArrayList<Model> arrayList = new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<Model> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Model> getArrayList() {
        return arrayList;
    }

    @NonNull
    @Override
    public TestHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view, viewGroup, false);
        TestHolder holder = new TestHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestHolder testHolder, int i) {
        Model model = arrayList.get(i);
      testHolder.nama.setText(model.getNama());
      testHolder.umur.setText(model.getUmur());
    }

    @Override
    public int getItemCount() {
        return getArrayList().size();
    }

    public class TestHolder extends ViewHolder {
        private TextView nama;
        private TextView umur;
        private ConstraintLayout constraintLayout;

        public TestHolder(@NonNull View itemView) {
            super(itemView);
            this.nama = itemView.findViewById(R.id.namaku);
            this.umur = itemView.findViewById(R.id.umur);
            this.constraintLayout = itemView.findViewById(R.id.cons);

        }
    }
}
