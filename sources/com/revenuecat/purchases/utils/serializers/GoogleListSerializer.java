package com.revenuecat.purchases.utils.serializers;

import ae.r;
import bf.g;
import bf.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.u;
import nd.v;
import we.b;
import ye.e;
import ye.f;
import ye.i;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleListSerializer implements b<List<? extends String>> {
    public static final GoogleListSerializer INSTANCE = new GoogleListSerializer();
    private static final f descriptor = i.a("GoogleList", e.i.f23987a);

    private GoogleListSerializer() {
    }

    @Override // we.a
    public List<String> deserialize(ze.e eVar) {
        r.f(eVar, "decoder");
        g gVar = eVar instanceof g ? (g) eVar : null;
        if (gVar == null) {
            throw new IllegalStateException("This serializer can be used only with JSON format".toString());
        }
        h hVar = (h) bf.i.n(gVar.p()).get("google");
        bf.b bVarM = hVar != null ? bf.i.m(hVar) : null;
        if (bVarM == null) {
            return u.m();
        }
        ArrayList arrayList = new ArrayList(v.x(bVarM, 10));
        Iterator<h> it = bVarM.iterator();
        while (it.hasNext()) {
            arrayList.add(bf.i.o(it.next()).a());
        }
        return arrayList;
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, List<String> list) {
        r.f(fVar, "encoder");
        r.f(list, "value");
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
