package v;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
class a {
    static boolean a(int i10) {
        return (i10 & 32768) != 0;
    }

    static boolean b(int i10) {
        if (i10 == 15 || i10 == 255) {
            return true;
        }
        if (i10 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i10 != 32783) {
            return i10 == 33023 || i10 == 0;
        }
        int i11 = Build.VERSION.SDK_INT;
        return i11 < 28 || i11 > 29;
    }

    static boolean c(int i10) {
        return (i10 & 255) == 255;
    }
}
