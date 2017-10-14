package com.example.macbookpro.givvapp.controller.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.macbookpro.givvapp.R;
import com.example.macbookpro.givvapp.controller.CompanyActivity;
import com.example.macbookpro.givvapp.model.Employer;
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

public class CompanyFragment extends GivvFragment {
	public static CompanyFragment newInstance(ArrayList<Employer> employers) {
		CompanyFragment fragment = new CompanyFragment();
		Bundle args = new Bundle();
		args.putParcelableArrayList("employers", employers);
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public String getTitle() {
		return "Companies";
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_recycler_view, null);
		List<Employer> employers = getArguments().getParcelableArrayList("employers");


		EmployerAdapter adapter = new EmployerAdapter(employers);
		((GivvRecyclerView) view.findViewById(R.id.recyclerView)).setAdapter(adapter);

		return view;
	}

	private class EmployerAdapter extends GivvRecyclerAdapter<Employer>{
		public EmployerAdapter(List<Employer> employers) {
			super(employers);
		}

		@Override
		public EmployerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			return new EmployerViewHolder(LayoutInflater.from(getActivity()).inflate(R.layout.default_list_item_indicator, null));
		}

		private class EmployerViewHolder extends GivvViewHolder<Employer> {
			TextView textView;

			public EmployerViewHolder(View view) {
				super(view);
				textView = (TextView) view.findViewById(R.id.textView);
			}

			@Override
			public void bind(final Employer data, GivvClickListener<Employer> listener) {
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
