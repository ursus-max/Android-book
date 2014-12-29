package kobza.ua.criminalintent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

/**
 * Created by mnes on 29.12.2014.
 */
public class CrimeListFragment extends ListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crime_title);
    }
}
