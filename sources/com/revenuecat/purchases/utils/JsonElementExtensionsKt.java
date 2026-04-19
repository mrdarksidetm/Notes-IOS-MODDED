package com.revenuecat.purchases.utils;

import ae.r;
import bf.b;
import bf.h;
import bf.i;
import bf.u;
import bf.w;
import ge.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import md.s;
import md.x;
import nd.q0;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonElementExtensionsKt {
    public static final Map<String, Object> asMap(h hVar) {
        r.f(hVar, "<this>");
        if (!(hVar instanceof u)) {
            return null;
        }
        Set<Map.Entry<String, h>> setEntrySet = i.n(hVar).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(o.d(q0.b(v.x(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            s sVarA = x.a(entry.getKey(), getExtractedContent((h) entry.getValue()));
            linkedHashMap.put(sVarA.c(), sVarA.d());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    private static final Object getExtractedContent(h hVar) {
        ?? arrayList;
        if (hVar instanceof w) {
            w wVarO = i.o(hVar);
            if (wVarO.d()) {
                return wVarO.a();
            }
            arrayList = i.e(wVarO);
            if (arrayList == 0 && (arrayList = i.l(wVarO)) == 0 && (arrayList = i.r(wVarO)) == 0 && (arrayList = i.j(wVarO)) == 0 && (arrayList = i.h(wVarO)) == 0) {
                return i.f(wVarO);
            }
        } else {
            if (!(hVar instanceof b)) {
                if (!(hVar instanceof u)) {
                    return null;
                }
                Set<Map.Entry<String, h>> setEntrySet = i.n(hVar).entrySet();
                LinkedHashMap linkedHashMap = new LinkedHashMap(o.d(q0.b(v.x(setEntrySet, 10)), 16));
                Iterator it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    s sVarA = x.a(entry.getKey(), getExtractedContent((h) entry.getValue()));
                    linkedHashMap.put(sVarA.c(), sVarA.d());
                }
                return linkedHashMap;
            }
            b bVarM = i.m(hVar);
            arrayList = new ArrayList(v.x(bVarM, 10));
            Iterator<h> it2 = bVarM.iterator();
            while (it2.hasNext()) {
                arrayList.add(getExtractedContent(it2.next()));
            }
        }
        return arrayList;
    }
}
