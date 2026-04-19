package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.C0100a f4371b;

    o(Object obj) {
        this.f4370a = obj;
        this.f4371b = a.f4299c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        this.f4371b.a(eVar, aVar, this.f4370a);
    }
}
