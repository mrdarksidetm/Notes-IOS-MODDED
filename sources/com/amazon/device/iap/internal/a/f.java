package com.amazon.device.iap.internal.a;

/* JADX INFO: loaded from: classes.dex */
public class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f7812a = 3715222306172636179L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7815d;

    public f(String str, String str2, String str3) {
        this.f7813b = str;
        this.f7814c = str2;
        this.f7815d = str3;
    }

    public f(String str, String str2, String str3, Throwable th) {
        super(th);
        this.f7813b = str;
        this.f7814c = str2;
        this.f7815d = str3;
    }

    public String a() {
        return this.f7813b;
    }

    public String b() {
        return this.f7814c;
    }

    public String c() {
        return this.f7815d;
    }
}
