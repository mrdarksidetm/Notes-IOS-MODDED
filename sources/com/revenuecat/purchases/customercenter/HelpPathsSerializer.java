package com.revenuecat.purchases.customercenter;

import ae.r;
import bf.g;
import bf.h;
import bf.i;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import we.b;
import xe.a;
import ye.f;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class HelpPathsSerializer implements b<List<? extends CustomerCenterConfigData.HelpPath>> {
    public static final HelpPathsSerializer INSTANCE = new HelpPathsSerializer();
    private static final f descriptor = a.g(CustomerCenterConfigData.HelpPath.Companion.serializer()).getDescriptor();

    private HelpPathsSerializer() {
    }

    @Override // we.a
    public List<CustomerCenterConfigData.HelpPath> deserialize(e eVar) {
        r.f(eVar, "decoder");
        ArrayList arrayList = new ArrayList();
        g gVar = eVar instanceof g ? (g) eVar : null;
        if (gVar == null) {
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }
        Iterator<h> it = i.m(gVar.p()).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(gVar.b().c(CustomerCenterConfigData.HelpPath.Companion.serializer(), it.next()));
            } catch (IllegalArgumentException e10) {
                LogUtilsKt.debugLog("Issue deserializing CustomerCenter HelpPath. Ignoring. Error: " + e10);
            }
        }
        return arrayList;
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, List<CustomerCenterConfigData.HelpPath> list) {
        r.f(fVar, "encoder");
        r.f(list, "value");
        a.g(CustomerCenterConfigData.HelpPath.Companion.serializer()).serialize(fVar, list);
    }
}
