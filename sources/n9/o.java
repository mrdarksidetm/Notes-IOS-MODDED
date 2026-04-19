package n9;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class o {
    public static int a(int i10) {
        if ((i10 < 0 || i10 > 1) && (i10 < 1000 || i10 >= 1006)) {
            return 1;
        }
        return i10;
    }

    public static Status b(int i10) {
        if (i10 == 1) {
            i10 = 13;
        }
        return new Status(i10);
    }
}
