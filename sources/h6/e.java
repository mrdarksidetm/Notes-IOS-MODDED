package h6;

import h6.c;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f11847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f11848b;

    public e(h hVar, i iVar) {
        this.f11847a = hVar;
        this.f11848b = iVar;
    }

    @Override // h6.c
    public c.C0289c a(c.b bVar) {
        c.C0289c c0289cA = this.f11847a.a(bVar);
        return c0289cA == null ? this.f11848b.a(bVar) : c0289cA;
    }

    @Override // h6.c
    public void b(int i10) {
        this.f11847a.b(i10);
        this.f11848b.b(i10);
    }

    @Override // h6.c
    public void c(c.b bVar, c.C0289c c0289c) {
        this.f11847a.c(c.b.b(bVar, null, o6.c.b(bVar.d()), 1, null), c0289c.a(), o6.c.b(c0289c.b()));
    }
}
