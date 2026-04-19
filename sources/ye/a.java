package ye;

import ae.r;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends Annotation> f23969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f23970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<String> f23971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<f> f23972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<List<Annotation>> f23973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<Boolean> f23974g;

    public a(String str) {
        r.f(str, "serialName");
        this.f23968a = str;
        this.f23969b = u.m();
        this.f23970c = new ArrayList();
        this.f23971d = new HashSet();
        this.f23972e = new ArrayList();
        this.f23973f = new ArrayList();
        this.f23974g = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = u.m();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, fVar, list, z10);
    }

    public final void a(String str, f fVar, List<? extends Annotation> list, boolean z10) {
        r.f(str, "elementName");
        r.f(fVar, "descriptor");
        r.f(list, "annotations");
        if (this.f23971d.add(str)) {
            this.f23970c.add(str);
            this.f23972e.add(fVar);
            this.f23973f.add(list);
            this.f23974g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f23968a).toString());
    }

    public final List<Annotation> c() {
        return this.f23969b;
    }

    public final List<List<Annotation>> d() {
        return this.f23973f;
    }

    public final List<f> e() {
        return this.f23972e;
    }

    public final List<String> f() {
        return this.f23970c;
    }

    public final List<Boolean> g() {
        return this.f23974g;
    }

    public final void h(List<? extends Annotation> list) {
        r.f(list, "<set-?>");
        this.f23969b = list;
    }
}
