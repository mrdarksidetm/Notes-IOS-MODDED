package a4;

import ae.r;
import java.io.File;
import java.util.List;
import le.n0;
import nd.t;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f436a = new g();

    private g() {
    }

    public final <T> f<T> a(k<T> kVar, b4.b<T> bVar, List<? extends d<T>> list, n0 n0Var, zd.a<? extends File> aVar) {
        r.f(kVar, "serializer");
        r.f(list, "migrations");
        r.f(n0Var, "scope");
        r.f(aVar, "produceFile");
        return new m(aVar, kVar, t.d(e.f418a.b(list)), new b4.a(), n0Var);
    }
}
