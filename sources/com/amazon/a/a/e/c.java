package com.amazon.a.a.e;

import com.amazon.a.a.e.a;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T extends a<T>> extends a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7142b = new com.amazon.a.a.o.c("RelativeExpirable");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f7143c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f7144d = new Date();

    @Override // com.amazon.a.a.e.a
    public final Date a() {
        com.amazon.a.a.o.c cVar = f7142b;
        cVar.a("RelativeExpiration duration: " + h() + ", expirable: " + this);
        Date date = new Date(this.f7144d.getTime() + (h() * f7143c));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expiration should occur at time: ");
        sb2.append(date);
        cVar.a(sb2.toString());
        return date;
    }

    protected abstract long h();
}
