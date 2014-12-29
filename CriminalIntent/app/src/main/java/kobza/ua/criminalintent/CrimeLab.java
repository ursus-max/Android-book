package kobza.ua.criminalintent;

import android.content.Context;

/**
 * Created by mnes on 26.12.2014.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    public CrimeLab(Context appContext) {
        mAppContext = appContext;
    }

    public static CrimeLab get (Context c){
        if (sCrimeLab==null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }
}
