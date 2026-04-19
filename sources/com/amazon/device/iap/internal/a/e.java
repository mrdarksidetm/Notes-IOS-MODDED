package com.amazon.device.iap.internal.a;

/* JADX INFO: loaded from: classes.dex */
public class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f7802a = 7955687159702952249L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7804c;

    public e(String str, String str2) {
        this.f7803b = str;
        this.f7804c = str2;
    }

    public e(String str, String str2, Throwable th) {
        super(th);
        this.f7803b = str;
        this.f7804c = str2;
    }

    public String a() {
        return this.f7803b;
    }

    public String b() {
        return this.f7804c;
    }
}
