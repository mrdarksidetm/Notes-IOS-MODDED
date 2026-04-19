package p2;

import android.os.Build;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final r a(InputConnection inputConnection, zd.a<md.i0> aVar) {
        return Build.VERSION.SDK_INT >= 25 ? new v(inputConnection, aVar) : new t(inputConnection, aVar);
    }
}
