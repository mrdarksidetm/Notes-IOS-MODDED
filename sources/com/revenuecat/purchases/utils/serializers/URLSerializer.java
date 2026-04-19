package com.revenuecat.purchases.utils.serializers;

import ae.r;
import java.net.URL;
import we.b;
import ye.e;
import ye.f;
import ye.i;

/* JADX INFO: loaded from: classes2.dex */
public final class URLSerializer implements b<URL> {
    public static final URLSerializer INSTANCE = new URLSerializer();
    private static final f descriptor = i.a("URL", e.i.f23987a);

    private URLSerializer() {
    }

    @Override // we.a
    public URL deserialize(ze.e eVar) {
        r.f(eVar, "decoder");
        return new URL(eVar.s());
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, URL url) {
        r.f(fVar, "encoder");
        r.f(url, "value");
        String string = url.toString();
        r.e(string, "value.toString()");
        fVar.F(string);
    }
}
