package com.diegolozano.walletapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {


    private ArrayList<Account> dataset;

    public AccountAdapter(ArrayList<Account> dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_accounts_list,parent,false);
        return new ViewHolder(myView);


    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account myaccount =dataset.get(position);
        holder.loadInfo(myaccount);

    }

    @Override
    public int getItemCount() {

        return dataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNameAccount,tvTypeAccount,tvCurrentvalue;
    private ImageView ivPrincipal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameAccount = itemView.findViewById(R.id.tv_item_name_account);
            tvTypeAccount= itemView.findViewById(R.id.tv_item_type_account);
            tvCurrentvalue=itemView.findViewById(R.id.tv_item_balance_account);
            ivPrincipal= itemView.findViewById(R.id.iv_item_account);
        }

        public void loadInfo(Account myaccount){

            tvNameAccount.setText(myaccount.getName());
            tvTypeAccount.setText(myaccount.getType());
            tvCurrentvalue.setText(String.valueOf(myaccount.getCurrentValue()));
            Picasso.get().load(myaccount
                            .getImagenUrl())
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)
                            .into(ivPrincipal);
        }
    }
}
