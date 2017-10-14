package com.example.macbookpro.givvapp.controller.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.example.macbookpro.givvapp.R;
import com.example.macbookpro.givvapp.model.Charity;
import com.example.macbookpro.givvapp.model.Donation;
import com.example.macbookpro.givvapp.model.Employee;
import com.example.macbookpro.givvapp.model.Employer;
import com.example.macbookpro.givvapp.model.Project;
import com.example.macbookpro.givvapp.support.GivvActivity;
import com.example.macbookpro.givvapp.support.GivvFragment;
import com.example.macbookpro.givvapp.support.GivvFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.Date;

public class AdminMainActivity extends GivvActivity {

	private MenuItem addCompanyMenuItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admin_main);

		ArrayList<Charity> charities = new ArrayList<>();
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		charities.add(new Charity("Charity Name", null, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null));
		ArrayList<Employer> companies = new ArrayList<>();
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Project> currentProjects = new ArrayList<>();
		ArrayList<Donation> donations = new ArrayList();
		donations.add(new Donation(new Date(), 200));
		donations.add(new Donation(new Date(), 200));
		donations.add(new Donation(new Date(), 200));
		donations.add(new Donation(new Date(), 200));
		donations.add(new Donation(new Date(), 200));
		currentProjects.add(new Project(20000, 10000, "Project Name", "Project Description", null, null));
		currentProjects.add(new Project(20000, 10000, "Project Name", "Project Description", null, null));
		currentProjects.add(new Project(20000, 10000, "Project Name", "Project Description", null, null));
		currentProjects.add(new Project(20000, 10000, "Project Name", "Project Description", null, null));

		employees.add(new Employee("id", "Phife", "Dawg", currentProjects, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null, donations, 200));
		employees.add(new Employee("id", "Phife", "Dawg", currentProjects, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null, donations, 200));
		employees.add(new Employee("id", "Phife", "Dawg", currentProjects, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null, donations, 200));
		employees.add(new Employee("id", "Phife", "Dawg", currentProjects, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null, donations, 200));
		employees.add(new Employee("id", "Phife", "Dawg", currentProjects, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null, donations, 200));
		employees.add(new Employee("id", "Phife", "Dawg", currentProjects, new Project(20000, 10000, "Project Name", "Project Description", null, null), null, null, donations, 200));
		companies.add(new Employer(employees, currentProjects, currentProjects, "Company Name", null, null, null, null, "id"));
		companies.add(new Employer(employees, currentProjects, currentProjects, "Company Name", null, null, null, null, "id"));
		companies.add(new Employer(employees, currentProjects, currentProjects, "Company Name", null, null, null, null, "id"));
		companies.add(new Employer(employees, currentProjects, currentProjects, "Company Name", null, null, null, null, "id"));
		companies.add(new Employer(employees, currentProjects, currentProjects, "Company Name", null, null, null, null, "id"));
		companies.add(new Employer(employees, currentProjects, currentProjects, "Company Name", null, null, null, null, "id"));
		companies.add(new Employer(employees, currentProjects, currentProjects, "Company Name", null, null, null, null, "id"));



		ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
		viewPager.setAdapter(new GivvFragmentPagerAdapter(getFragmentManager(), new GivvFragment[]{CompanyFragment.newInstance(companies),
				CharitiesFragment.newInstance(charities)}));
		((TabLayout) findViewById(R.id.tabLayout)).setupWithViewPager(viewPager);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.add_company_menu, menu);
		addCompanyMenuItem = menu.findItem(R.id.add_company_menu).setEnabled(true);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent = new Intent(AdminMainActivity.this, AddCompanyActivity.class);
		startActivity(intent);
		return true;
	}


}
