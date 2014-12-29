package kobza.ua.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by mnes on 29.12.2014.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
