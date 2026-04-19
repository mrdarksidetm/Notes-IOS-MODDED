package com.amazon.a.b;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f7534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7535e;

    public b(com.amazon.a.a.o.b.f fVar) {
        this.f7531a = a("checksum", fVar);
        this.f7532b = a("customerId", fVar);
        this.f7533c = a("deviceId", fVar);
        this.f7535e = a("packageName", fVar);
        this.f7534d = b("expiration", fVar);
    }

    private String a(String str, com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        String strA = fVar.a(str);
        if (com.amazon.a.a.o.e.a(strA)) {
            throw com.amazon.a.a.o.b.a.b.a(str);
        }
        return strA;
    }

    private Date b(String str, com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        String strA = a(str, fVar);
        try {
            return new Date(Long.parseLong(strA));
        } catch (NumberFormatException unused) {
            throw com.amazon.a.a.o.b.a.b.a(str, strA);
        }
    }

    public String a() {
        return this.f7531a;
    }

    public String b() {
        return this.f7532b;
    }

    public String c() {
        return this.f7533c;
    }

    public Date d() {
        return this.f7534d;
    }

    public String e() {
        return this.f7535e;
    }
}
