package com.revenuecat.purchases.paywalls;

import ae.m0;
import ae.r;
import je.v;
import we.b;
import xe.a;
import ye.e;
import ye.f;
import ye.i;

/* JADX INFO: loaded from: classes2.dex */
public final class EmptyStringToNullSerializer implements b<String> {
    public static final EmptyStringToNullSerializer INSTANCE = new EmptyStringToNullSerializer();
    private static final b<String> delegate = a.p(a.y(m0.f720a));
    private static final f descriptor = i.a("EmptyStringToNullSerializer", e.i.f23987a);

    private EmptyStringToNullSerializer() {
    }

    @Override // we.a
    public String deserialize(ze.e eVar) {
        r.f(eVar, "decoder");
        String strDeserialize = delegate.deserialize(eVar);
        if (strDeserialize == null || !(!v.v(strDeserialize))) {
            return null;
        }
        return strDeserialize;
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, String str) {
        r.f(fVar, "encoder");
        if (str == null) {
            str = "";
        }
        fVar.F(str);
    }
}
