package r6;

import ae.j;
import ae.r;
import sc.c;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19205b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sc.c f19206a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    @Override // sc.c.d
    public void a(Object obj, c.b bVar) {
        if (bVar != null) {
            f.f19207a.c(bVar);
        }
    }

    @Override // sc.c.d
    public void b(Object obj) {
        f.f19207a.f();
    }

    public final void c(sc.b bVar) {
        r.f(bVar, "messenger");
        if (this.f19206a != null) {
            cc.b.e("StreamCallHandler", "Tried to create channel without disposing old one.");
            d();
        }
        sc.c cVar = new sc.c(bVar, "talsec.app/freerasp/events");
        cVar.d(this);
        this.f19206a = cVar;
    }

    public final void d() {
        sc.c cVar = this.f19206a;
        if (cVar != null) {
            cVar.d(null);
        }
        this.f19206a = null;
        f.f19207a.f();
    }
}
