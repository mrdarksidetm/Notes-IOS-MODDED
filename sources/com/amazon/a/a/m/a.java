package com.amazon.a.a.m;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends com.amazon.a.a.e.a<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f7269c;

    public a(Object obj, Date date) {
        this.f7268b = obj;
        this.f7269c = date;
    }

    @Override // com.amazon.a.a.e.a
    public final Date a() {
        return this.f7269c;
    }

    public final Object h() {
        return this.f7268b;
    }
}
