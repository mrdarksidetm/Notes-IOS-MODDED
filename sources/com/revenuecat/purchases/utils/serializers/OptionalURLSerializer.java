package com.revenuecat.purchases.utils.serializers;

import ae.r;
import java.net.MalformedURLException;
import java.net.URL;
import we.b;
import xe.a;
import ye.e;
import ye.f;
import ye.i;

/* JADX INFO: loaded from: classes2.dex */
public final class OptionalURLSerializer implements b<URL> {
    public static final OptionalURLSerializer INSTANCE = new OptionalURLSerializer();
    private static final b<URL> delegate = a.p(URLSerializer.INSTANCE);
    private static final f descriptor = i.a("URL?", e.i.f23987a);

    private OptionalURLSerializer() {
    }

    @Override // we.a
    public URL deserialize(ze.e eVar) {
        r.f(eVar, "decoder");
        try {
            return delegate.deserialize(eVar);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, URL url) {
        r.f(fVar, "encoder");
        if (url == null) {
            fVar.F("");
        } else {
            delegate.serialize(fVar, url);
        }
    }
}
