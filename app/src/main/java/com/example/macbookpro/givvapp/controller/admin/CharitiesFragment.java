package com.example.macbookpro.givvapp.controller.admin;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.macbookpro.givvapp.R;
import com.example.macbookpro.givvapp.controller.CompanyActivity;
import com.example.macbookpro.givvapp.model.Charity;
import com.example.macbookpro.givvapp.support.GivvClickListener;
import com.example.macbookpro.givvapp.support.GivvFragment;
import com.example.macbookpro.givvapp.support.GivvRecyclerAdapter;
import com.example.macbookpro.givvapp.support.GivvRecyclerView;
import com.example.macbookpro.givvapp.support.GivvViewHolder;

import java.util.ArrayList;
import java.util.List;

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
		List<Charity> charities = getArguments().getParcelableArrayList("charities");


		CharityAdapter adapter = new CharityAdapter(charities);
		GivvRecyclerView recyclerView = (GivvRecyclerView) view.findViewById(R.id.recyclerView);
		recyclerView.setAdapter(adapter);


		return view;
	}

	private class CharityAdapter extends GivvRecyclerAdapter<Charity> {
		public CharityAdapter(List<Charity> charities) {
			super(charities);
		}

		@Override
		public CharityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			return new CharityViewHolder(LayoutInflater.from(getActivity()).inflate(R.layout.default_list_item_indicator, null));
		}

		private class CharityViewHolder extends GivvViewHolder<Charity> {
			TextView textView;

			public CharityViewHolder(View view) {
				super(view);
				textView = (TextView) view.findViewById(R.id.textView);
			}

			@Override
			public void bind(final Charity data, GivvClickListener<Charity> listener) {
				super.bind(data, listener);
				textView.setText(data.getName());
				textView.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						startActivity(new Intent(getActivity(), CompanyActivity.class).putExtra("company", data));
					}
				});

			}
		}
	}
}
