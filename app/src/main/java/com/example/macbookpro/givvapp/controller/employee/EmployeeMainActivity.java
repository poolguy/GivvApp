package com.example.macbookpro.givvapp.controller.employee;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.macbookpro.givvapp.R;
import com.example.macbookpro.givvapp.model.Project;
import com.example.macbookpro.givvapp.support.GivvActivity;
import com.example.macbookpro.givvapp.support.GivvClickListener;
import com.example.macbookpro.givvapp.support.GivvRecyclerAdapter;
import com.example.macbookpro.givvapp.support.GivvRecyclerView;
import com.example.macbookpro.givvapp.support.GivvViewHolder;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMainActivity extends GivvActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_employee_main);

		List<Project> projects = new ArrayList<>();
		projects.add(new Project(20000, 10000, "Project 1 Name", "Lorem ipsum", "Short description", R.drawable.peru_nutrition, null, null, false));
		projects.add(new Project(20000, 10000, "Project 2 Name", "Lorem ipsum", "Short description", R.drawable.india_water_security, null, null, false));
		projects.add(new Project(20000, 10000, "Project 3 Name", "Lorem ipsum", "Short description", R.drawable.atcq, null, null, false));
//		projects.add(new Project(20000, 10000, "Project 3 Name", "Lorem ipsum", "Short description", null, null, null, false));


		ProjectAdapter adapter = new ProjectAdapter(projects);
		((GivvRecyclerView) findViewById(R.id.recyclerView)).setAdapter(adapter);
	}


	private class ProjectAdapter extends GivvRecyclerAdapter<Project> {
		public ProjectAdapter(List<Project> projects) {
			super(projects);
		}

		@Override
		public ProjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			return new ProjectViewHolder(LayoutInflater.from(EmployeeMainActivity.this).inflate(R.layout.project_view, null));
		}

		private class ProjectViewHolder extends GivvViewHolder<Project> {
			TextView textView;
			TextView subtextView;
			ImageView imageView;

			public ProjectViewHolder(View view) {
				super(view);
				textView = (TextView) view.findViewById(R.id.textView);
				subtextView = (TextView) view.findViewById(R.id.subtextView);
				imageView = (ImageView) view.findViewById(R.id.imageView);
			}

			@Override
			public void bind(final Project data, GivvClickListener<Project> listener) {
				super.bind(data, listener);
				textView.setText(data.getName());
				subtextView.setText(data.getShortDescription());
				imageView.setImageResource(data.getHeaderResource());
				textView.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						startActivity(new Intent(EmployeeMainActivity.this, ProjectActivity.class).putExtra("project", data));
					}
				});

			}
		}
	}
	
}
