package com.amazon.a.a.o;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f7483a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f7484b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7485c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7486d = "Kiwi";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7487e;

    public c(String str) {
        this.f7487e = str;
    }

    public static void a() {
        f7485c = true;
    }

    public static boolean b() {
        return f7485c;
    }

    private String d(String str) {
        return this.f7487e + ": " + str;
    }

    public void a(String str) {
        if (f7483a) {
            Log.d(f7486d, d(str));
        }
    }

    public void a(String str, Throwable th) {
        if (f7483a) {
            Log.d(f7486d, d(str), th);
        }
    }

    public void b(String str) {
        if (f7484b) {
            Log.e(f7486d, d(str));
        }
    }

    public void b(String str, Throwable th) {
        if (f7484b) {
            Log.e(f7486d, d(str), th);
        }
    }

    public void c(String str) {
        if (f7485c) {
            Log.e(f7486d, "TEST-" + d(str));
        }
    }
}
