package com.example.macbookpro.givvapp.support;

import android.app.Fragment;
import android.os.Bundle;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by macbookpro on 10/14/17
 */

public class GivvFragment extends Fragment{

	private static final String TITLE = "title";

	public String getTitle() {
		return getArguments().getString(TITLE);
	}

	protected static Bundle getArgsBundleWithTitle(String title) {
		Bundle bundle = new Bundle();
		if (title != null) {
			bundle.putString(TITLE, title);
		}
		return bundle;
	}
}
