package com.example.macbookpro.givvapp.controller.admin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.macbookpro.givvapp.R;
import com.example.macbookpro.givvapp.model.Charity;
import com.example.macbookpro.givvapp.support.GivvFragment;

import java.util.ArrayList;

/**
 * Created by macbookpro on 10/14/17
 */

public class CharitiesFragment extends GivvFragment {

	public static CharitiesFragment newInstance(ArrayList<Charity> charities) {
		CharitiesFragment fragment = new CharitiesFragment();
		Bundle args = new Bundle();
		args.putParcelableArrayList("charities", charities);
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public String getTitle() {
		return "Charities";
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_recycler_view, null);



		return view;
	}
}
