package com.aheaditec.talsec_security.security.api;

import ae.r;
import android.content.Context;
import s6.f1;

/* JADX INFO: loaded from: classes.dex */
public final class Natives {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Natives f7025a = new Natives();

    static {
        System.loadLibrary(f1.a("43290361AB"));
    }

    public final void a(Context context) {
        r.f(context, f1.a("542B017CAC3B5B"));
        start(context, true);
    }

    public final native void start(Context context, boolean z10);
}
