package com.aheaditec.talsec_security.security;

import ae.r;
import android.content.Context;
import android.util.Pair;
import java.security.cert.X509Certificate;
import s6.f1;

/* JADX INFO: loaded from: classes.dex */
public final class Natives {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Natives f7024a = new Natives();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final native boolean j();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final native String[] g();

    private final native boolean c(String[] strArr);

    private final native byte[] d(String str, String str2, String str3, String str4, String str5);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final native boolean k();

    private final native String h(Context context, String[] strArr);

    private final native String i(Context context, String[] strArr);

    private final native Pair<String, X509Certificate> j(Context context, String[] strArr);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final native int[] i();

    public final Pair a(Context context, String[] strArr) {
        r.f(context, f1.a("542B017CAC3B5B"));
        r.f(strArr, f1.b(f1.c("56341F40A830474497")));
        return j(context, strArr);
    }

    public final /* synthetic */ boolean b(String[] strArr) {
        r.f(strArr, f1.a("5634047B"));
        return c(strArr);
    }

    public final /* synthetic */ byte[] c(String str, String str2, String str3, String str4, String str5) {
        r.f(str, f1.a("53251B69"));
        return d(str2, str3, str4, str, str5);
    }

    public final String d(Context context, String[] strArr) {
        r.f(context, f1.a("542B017CAC3B5B"));
        r.f(strArr, f1.b(f1.c("56280367BE264B718F1373553C680F")));
        return h(context, strArr);
    }

    public final String e(Context context, String[] strArr) {
        r.f(context, f1.a("542B017CAC3B5B"));
        r.f(strArr, f1.b(f1.c("56280367BE264B72901B4F5122")));
        return i(context, strArr);
    }
}
