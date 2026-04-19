package com.google.android.gms.common.api;

import android.text.TextUtils;
import java.util.ArrayList;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public class c extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z.a f8399a;

    public c(z.a aVar) {
        this.f8399a = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (v8.b bVar : this.f8399a.keySet()) {
            t8.b bVar2 = (t8.b) m.k((t8.b) this.f8399a.get(bVar));
            z10 &= !bVar2.B();
            arrayList.add(bVar.b() + ": " + String.valueOf(bVar2));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
