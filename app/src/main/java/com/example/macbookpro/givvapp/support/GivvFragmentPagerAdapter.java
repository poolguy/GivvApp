package com.example.macbookpro.givvapp.support;

/**
 * Created by macbookpro on 10/14/17
 */

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import android.view.ViewGroup;


public class GivvFragmentPagerAdapter extends FragmentPagerAdapter {
	private final GivvFragment[] fragments;
	private final String[] tags;
	private final FragmentMessenger[] pendingCommands;

	/**
	 * @param fragments An array of fragments to tell the viewpager how to instantiate its pages. THE FRAGMENTS ACTUALLY DISPLAYED IN THE VIEWPAGER ARE NOT GUARANTEED TO BE THE SAME AS THESE FRAGMENTS!
	 */
	public GivvFragmentPagerAdapter(FragmentManager fm, GivvFragment[] fragments) {
		super(fm);
		this.fragments = fragments;
		tags = new String[fragments.length];
		pendingCommands = new FragmentMessenger[fragments.length];
	}

	/**
	 * This is used for initial creation of the fragments. DOES NOT NECESSARILY RETURN A REFERENCE TO THE ACTUAL DISPLAYED FRAGMENT!
	 */
	@Override
	public Fragment getItem(int position) {
		return fragments[position];
	}



	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		GivvFragment fragment = (GivvFragment) super.instantiateItem(container, position);
		tags[position] = fragment.getTag();
		if (pendingCommands[position] != null) {
			pendingCommands[position].run(fragment);
			pendingCommands[position] = null;
		}
		return fragment;
	}

	/**
	 * Use this to get the fragment that is actually being displayed in a certain position, or null if the fragment has not been created yet
	 */
	public GivvFragment getFragment(FragmentManager fragmentManager, int position) {
		return (GivvFragment) fragmentManager.findFragmentByTag(tags[position]);
	}

	@Override
	public int getCount() {
		return fragments.length;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return fragments[position].getTitle();
	}

	/**
	 * Use this to safely send messages from an activity to a fragment in a view pager. Other methods, such as saving a reference to the fragment or calling getItem, are not guaranteed to work as intended.
	 * This will run messenger.run(fragment) if the fragment at the desired position is not null, or will save the messenger to run it when the fragment is instantiated if the fragment is null.
	 *
	 * @param fragmentManager The activity's fragment manager
	 * @param position        The position of the fragment to run something on
	 * @param messenger       The code to run on the fragment
	 */
	public void executeCodeOnFragment(FragmentManager fragmentManager, int position, FragmentMessenger messenger) {
		GivvFragment fragment = getFragment(fragmentManager, position);
		if (fragment != null) {
			messenger.run(fragment);
		} else {
			pendingCommands[position] = messenger;
		}
	}

	public interface FragmentMessenger<Fragment extends GivvFragment> {
		void run(Fragment fragment);
	}
}
