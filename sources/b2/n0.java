package b2;

import c1.g;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements c1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.a<md.i0> f5378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ c1.g f5379b;

    public n0(c1.g gVar, zd.a<md.i0> aVar) {
        this.f5378a = aVar;
        this.f5379b = gVar;
    }

    @Override // c1.g
    public boolean a(Object obj) {
        return this.f5379b.a(obj);
    }

    @Override // c1.g
    public Map<String, List<Object>> b() {
        return this.f5379b.b();
    }

    @Override // c1.g
    public Object c(String str) {
        return this.f5379b.c(str);
    }

    @Override // c1.g
    public g.a d(String str, zd.a<? extends Object> aVar) {
        return this.f5379b.d(str, aVar);
    }

    public final void e() {
        this.f5378a.invoke();
    }
}
