package com.revenuecat.purchases.utils.serializers;

import ae.r;
import java.util.Date;
import we.b;
import ye.e;
import ye.f;
import ye.i;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class DateSerializer implements b<Date> {
    public static final DateSerializer INSTANCE = new DateSerializer();

    private DateSerializer() {
    }

    @Override // we.a
    public Date deserialize(e eVar) {
        r.f(eVar, "decoder");
        return new Date(eVar.u());
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return i.a("Date", e.g.f23985a);
    }

    @Override // we.h
    public void serialize(ze.f fVar, Date date) {
        r.f(fVar, "encoder");
        r.f(date, "value");
        fVar.C(date.getTime());
    }
}
