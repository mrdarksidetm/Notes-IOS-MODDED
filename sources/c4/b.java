package c4;

import ae.r;
import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final File a(Context context, String str) {
        r.f(context, "<this>");
        r.f(str, "name");
        return z3.a.a(context, r.m(str, ".preferences_pb"));
    }
}
