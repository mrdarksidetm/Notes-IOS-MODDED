package com.revenuecat.purchases.paywalls.components;

import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
final class UrlSurrogate {
    private final ButtonComponent.UrlMethod method;
    private final String url_lid;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {null, ButtonComponent.UrlMethod.Companion.serializer()};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<UrlSurrogate> serializer() {
            return UrlSurrogate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UrlSurrogate(int i10, String str, ButtonComponent.UrlMethod urlMethod, j1 j1Var) {
        if (3 != (i10 & 3)) {
            z0.a(i10, 3, UrlSurrogate$$serializer.INSTANCE.getDescriptor());
        }
        this.url_lid = str;
        this.method = urlMethod;
    }

    public UrlSurrogate(String str, ButtonComponent.UrlMethod urlMethod) {
        r.f(str, "url_lid");
        r.f(urlMethod, "method");
        this.url_lid = str;
        this.method = urlMethod;
    }

    public static final /* synthetic */ void write$Self(UrlSurrogate urlSurrogate, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.w(fVar, 0, urlSurrogate.url_lid);
        dVar.E(fVar, 1, bVarArr[1], urlSurrogate.method);
    }

    public final ButtonComponent.UrlMethod getMethod() {
        return this.method;
    }

    public final String getUrl_lid() {
        return this.url_lid;
    }
}
