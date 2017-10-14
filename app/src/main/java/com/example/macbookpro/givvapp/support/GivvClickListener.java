package com.example.macbookpro.givvapp.support;

import android.view.View;

/**
 * Created by macbookpro on 10/14/17
 */

public interface GivvClickListener<DataType> {
	void onItemClicked(DataType data, View view, int position);
}
