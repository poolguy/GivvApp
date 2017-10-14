package com.example.macbookpro.givvapp.support;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by macbookpro on 10/14/17
 */

public abstract class GivvViewHolder<DataType> extends RecyclerView.ViewHolder {

	public GivvViewHolder(View itemView) {
		super(itemView);
	}

	public void bind(final DataType data, final GivvClickListener<DataType> listener) {
		if (listener != null) {
			itemView.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					listener.onItemClicked(data, v, getAdapterPosition());
				}
			});
		}
	}
}
