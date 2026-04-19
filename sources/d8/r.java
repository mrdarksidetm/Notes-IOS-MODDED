package d8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import f8.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import x7.g;
import z7.c;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.e f9820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e8.d f9821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f9822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f9823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f8.b f9824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g8.a f9825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g8.a f9826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e8.c f9827i;

    public r(Context context, x7.e eVar, e8.d dVar, x xVar, Executor executor, f8.b bVar, g8.a aVar, g8.a aVar2, e8.c cVar) {
        this.f9819a = context;
        this.f9820b = eVar;
        this.f9821c = dVar;
        this.f9822d = xVar;
        this.f9823e = executor;
        this.f9824f = bVar;
        this.f9825g = aVar;
        this.f9826h = aVar2;
        this.f9827i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(w7.o oVar) {
        return Boolean.valueOf(this.f9821c.e0(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(w7.o oVar) {
        return this.f9821c.p(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, w7.o oVar, long j10) {
        this.f9821c.a0(iterable);
        this.f9821c.k(oVar, this.f9825g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f9821c.i(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f9827i.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f9827i.l(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(w7.o oVar, long j10) {
        this.f9821c.k(oVar, this.f9825g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(w7.o oVar, int i10) {
        this.f9822d.a(oVar, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final w7.o oVar, final int i10, Runnable runnable) {
        try {
            try {
                f8.b bVar = this.f9824f;
                final e8.d dVar = this.f9821c;
                Objects.requireNonNull(dVar);
                bVar.a(new b.a() { // from class: d8.i
                    @Override // f8.b.a
                    public final Object a() {
                        return Integer.valueOf(dVar.h());
                    }
                });
                if (k()) {
                    u(oVar, i10);
                } else {
                    this.f9824f.a(new b.a() { // from class: d8.j
                        @Override // f8.b.a
                        public final Object a() {
                            return this.f9800a.s(oVar, i10);
                        }
                    });
                }
            } catch (f8.a unused) {
                this.f9822d.a(oVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public w7.i j(x7.m mVar) {
        f8.b bVar = this.f9824f;
        final e8.c cVar = this.f9827i;
        Objects.requireNonNull(cVar);
        return mVar.b(w7.i.a().i(this.f9825g.a()).k(this.f9826h.a()).j("GDT_CLIENT_METRICS").h(new w7.h(u7.b.b("proto"), ((z7.a) bVar.a(new b.a() { // from class: d8.h
            @Override // f8.b.a
            public final Object a() {
                return cVar.o();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f9819a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public x7.g u(final w7.o oVar, int i10) {
        x7.g gVarA;
        x7.m mVarA = this.f9820b.a(oVar.b());
        long jMax = 0;
        x7.g gVarE = x7.g.e(0L);
        while (true) {
            final long j10 = jMax;
            while (((Boolean) this.f9824f.a(new b.a() { // from class: d8.k
                @Override // f8.b.a
                public final Object a() {
                    return this.f9803a.l(oVar);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f9824f.a(new b.a() { // from class: d8.l
                    @Override // f8.b.a
                    public final Object a() {
                        return this.f9805a.m(oVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return gVarE;
                }
                if (mVarA == null) {
                    a8.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    gVarA = x7.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((e8.k) it.next()).b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(mVarA));
                    }
                    gVarA = mVarA.a(x7.f.a().b(arrayList).c(oVar.c()).a());
                }
                gVarE = gVarA;
                if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                    this.f9824f.a(new b.a() { // from class: d8.m
                        @Override // f8.b.a
                        public final Object a() {
                            return this.f9807a.n(iterable, oVar, j10);
                        }
                    });
                    this.f9822d.b(oVar, i10 + 1, true);
                    return gVarE;
                }
                this.f9824f.a(new b.a() { // from class: d8.n
                    @Override // f8.b.a
                    public final Object a() {
                        return this.f9811a.o(iterable);
                    }
                });
                if (gVarE.c() == g.a.OK) {
                    jMax = Math.max(j10, gVarE.b());
                    if (oVar.e()) {
                        this.f9824f.a(new b.a() { // from class: d8.o
                            @Override // f8.b.a
                            public final Object a() {
                                return this.f9813a.p();
                            }
                        });
                    }
                } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strJ = ((e8.k) it2.next()).b().j();
                        map.put(strJ, !map.containsKey(strJ) ? 1 : Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    }
                    this.f9824f.a(new b.a() { // from class: d8.p
                        @Override // f8.b.a
                        public final Object a() {
                            return this.f9814a.q(map);
                        }
                    });
                }
            }
            this.f9824f.a(new b.a() { // from class: d8.q
                @Override // f8.b.a
                public final Object a() {
                    return this.f9816a.r(oVar, j10);
                }
            });
            return gVarE;
        }
    }

    public void v(final w7.o oVar, final int i10, final Runnable runnable) {
        this.f9823e.execute(new Runnable() { // from class: d8.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f9794a.t(oVar, i10, runnable);
            }
        });
    }
}
