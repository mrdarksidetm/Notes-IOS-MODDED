package com.amazon.a.a.m;

import com.amazon.a.a.k.d;

/* JADX INFO: loaded from: classes.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7274a = "DATA_AUTHENTICATION_KEY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7275b = "APPLICATION_LICENSE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f7276c = "LICENSE_FAILURE_CONTENT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f7277d = "LICENSE_FAILURE_RAW_EXCEPTION";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f7278e = "TEST_MODE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f7279f = "PACKAGE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f7280g = "COMMAND";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f7281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f7282i = new b();

    public <T> T a(String str) {
        return (T) this.f7282i.b(str);
    }

    public <T> void a(String str, a aVar) {
        this.f7282i.a(str, aVar);
    }

    public <T> void a(String str, T t10) {
        this.f7282i.a(str, t10);
    }

    public boolean b(String str) {
        return this.f7282i.a(str);
    }

    public void c(String str) {
        this.f7282i.c(str);
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f7281h.b(this.f7282i);
    }

    public String toString() {
        return this.f7282i.toString();
    }
}
