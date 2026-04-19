package v;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
class f {
    static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return b(context, str, i.f21841a);
    }

    private static boolean b(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
