package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.e;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static <L> e<L> a(L l10, Looper looper, String str) {
        w8.m.l(l10, "Listener must not be null");
        w8.m.l(looper, "Looper must not be null");
        w8.m.l(str, "Listener type must not be null");
        return new e<>(looper, l10, str);
    }

    public static <L> e<L> b(L l10, Executor executor, String str) {
        w8.m.l(l10, "Listener must not be null");
        w8.m.l(executor, "Executor must not be null");
        w8.m.l(str, "Listener type must not be null");
        return new e<>(executor, l10, str);
    }

    public static <L> e.a<L> c(L l10, String str) {
        w8.m.l(l10, "Listener must not be null");
        w8.m.l(str, "Listener type must not be null");
        w8.m.f(str, "Listener type must not be empty");
        return new e.a<>(l10, str);
    }
}
