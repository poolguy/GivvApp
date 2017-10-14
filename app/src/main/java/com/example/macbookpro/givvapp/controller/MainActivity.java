package com.example.macbookpro.givvapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.macbookpro.givvapp.R;
import com.example.macbookpro.givvapp.controller.admin.AdminMainActivity;
import com.example.macbookpro.givvapp.controller.employee.EmployeeMainActivity;
import com.example.macbookpro.givvapp.controller.employer.EmployerMainActivity;
import com.example.macbookpro.givvapp.support.GivvActivity;

public class MainActivity extends GivvActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.employeeButton).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(MainActivity.this, LoginActivity.class));
			}
		});

		findViewById(R.id.employerButton).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(MainActivity.this, LoginActivity.class));
			}
		});

		findViewById(R.id.adminButton).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(MainActivity.this, AdminMainActivity.class));
			}
		});
	}
}
