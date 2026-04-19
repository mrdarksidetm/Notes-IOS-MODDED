package w7;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class t implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile u f22582e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g8.a f22583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g8.a f22584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c8.e f22585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d8.r f22586d;

    t(g8.a aVar, g8.a aVar2, c8.e eVar, d8.r rVar, d8.v vVar) {
        this.f22583a = aVar;
        this.f22584b = aVar2;
        this.f22585c = eVar;
        this.f22586d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f22583a.a()).k(this.f22584b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f22582e;
        if (uVar != null) {
            return uVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<u7.b> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(u7.b.b("proto"));
    }

    public static void f(Context context) {
        if (f22582e == null) {
            synchronized (t.class) {
                if (f22582e == null) {
                    f22582e = e.l().a(context).build();
                }
            }
        }
    }

    @Override // w7.s
    public void a(n nVar, u7.h hVar) {
        this.f22585c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public d8.r e() {
        return this.f22586d;
    }

    public u7.g g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
