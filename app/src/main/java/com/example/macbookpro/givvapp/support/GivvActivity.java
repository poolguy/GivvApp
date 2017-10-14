package com.example.macbookpro.givvapp.support;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.macbookpro.givvapp.R;

/**
 * Created by macbookpro on 10/14/17
 */

public class GivvActivity extends AppCompatActivity {
	private static final String LOADING = "Loading...";
	private AlertDialog errorDialog;
	protected ProgressDialog progressDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}

	protected boolean displayUp() {
		return true;
	}

	@Override
	public void setContentView(@LayoutRes int layoutResID) {
		View view = getLayoutInflater().inflate(layoutResID, null);
		configureToolbar(view);
		super.setContentView(view);
	}

	private void configureToolbar(View view) {
		Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
		if (toolbar != null) {
			setSupportActionBar(toolbar);
			getSupportActionBar().setDisplayHomeAsUpEnabled(displayUp());
		}
	}

	@NonNull
	@Override
	public ActionBar getSupportActionBar() {
		ActionBar actionBar = super.getSupportActionBar();
		if (actionBar != null) {
			return actionBar;
		}
		throw new NullPointerException("Toolbar must be included in the Activity layout file");
	}
}
