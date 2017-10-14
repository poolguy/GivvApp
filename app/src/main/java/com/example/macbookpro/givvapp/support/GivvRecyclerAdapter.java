package com.example.macbookpro.givvapp.support;



import android.support.v7.widget.RecyclerView;


import java.util.List;

/**
 * Created by macbookpro on 10/14/17
 */
public abstract class GivvRecyclerAdapter<DataType> extends RecyclerView.Adapter<GivvViewHolder<DataType>> {
	private List<DataType> list;
	private GivvClickListener<DataType> givvClickListener;

	public GivvRecyclerAdapter(List<DataType> list) {
		this.list = list;
	}

	public GivvRecyclerAdapter(List<DataType> list, GivvClickListener<DataType> givvClickListener) {
		this.list = list;
		this.givvClickListener = givvClickListener;
	}

	public List<DataType> getList() {
		return list;
	}

	public void setList(List<DataType> list) {
		this.list = list;
		notifyDataSetChanged();
	}

	public DataType get(int position) {
		return list.get(position);
	}

	public void setGivvClickListener(GivvClickListener<DataType> givvClickListener) {
		this.givvClickListener = givvClickListener;
	}

	@Override
	public void onBindViewHolder(GivvViewHolder<DataType> holder, int position) {
		holder.bind(list.get(position), givvClickListener);
	}

	@Override
	public int getItemCount() {
		return list == null ? 0 : list.size();
	}

	public void addAllToList(List<DataType> list) {
		int size = this.list.size();
		this.list.addAll(list);
		notifyItemRangeInserted(size, list.size());
	}

	public void addAllToList(int position, List<DataType> list) {
		this.list.addAll(position, list);
		notifyItemRangeInserted(position, list.size());
	}

	public void add(DataType data) {
		list.add(data);
		notifyItemInserted(list.size() - 1);
	}

	public void add(int index, DataType data) {
		list.add(index, data);
		notifyItemInserted(index);
	}

	public void moveItem(int fromPosition, int toPosition) {
		list.add(toPosition, list.remove(fromPosition));
		notifyItemMoved(fromPosition, toPosition);
	}

	public void remove(int position) {
		list.remove(position);
		notifyItemRemoved(position);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
}
