package com.example.macbookpro.givvapp.support;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by macbookpro on 10/14/17
 */

public class GivvRecyclerView extends RecyclerView {
	public DividerItemDecoration decor;

	// The first and third constructors aren't used (by us), but they're required when creating a custom view.
	public GivvRecyclerView(Context context) {
		this(context, null);
	}

	public GivvRecyclerView(Context context, @Nullable AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public GivvRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setHasFixedSize(true);
		setLayoutManager(new LinearLayoutManager(context));
		decor = new DividerItemDecoration(context, DividerItemDecoration.VERTICAL);
		addItemDecoration(decor);
	}

	public void removeHorizontalLineDivider() {
		removeItemDecoration(decor);
	}

	@Override
	public GivvRecyclerAdapter getAdapter() {
		return (GivvRecyclerAdapter) super.getAdapter();
	}
}
