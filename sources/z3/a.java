package z3;

import ae.r;
import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final File a(Context context, String str) {
        r.f(context, "<this>");
        r.f(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), r.m("datastore/", str));
    }
}
