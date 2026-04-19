package c7;

import a7.d;
import ae.r;
import ae.s;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import md.l;
import md.n;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b7.b f6558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b7.a f6559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b7.d f6560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f6561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f6562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f6563f;

    static final class a extends s implements zd.a<c7.a> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c7.a invoke() {
            return new c7.a(c.this.f6559b.b());
        }
    }

    static final class b extends s implements zd.a<d> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            String strB = c.this.f6558a.b();
            if (strB == null) {
                strB = "";
            }
            return new d(strB);
        }
    }

    /* JADX INFO: renamed from: c7.c$c, reason: collision with other inner class name */
    static final class C0155c extends s implements zd.a<e> {
        C0155c() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            String strB = c.this.f6560c.b();
            if (strB == null) {
                strB = "";
            }
            return new e(strB);
        }
    }

    public c(b7.b bVar, b7.a aVar, b7.d dVar) {
        r.f(bVar, "gsfIdProvider");
        r.f(aVar, "androidIdProvider");
        r.f(dVar, "mediaDrmIdProvider");
        this.f6558a = bVar;
        this.f6559b = aVar;
        this.f6560c = dVar;
        this.f6561d = n.b(new b());
        this.f6562e = n.b(new a());
        this.f6563f = n.b(new C0155c());
    }

    public final c7.a d() {
        return (c7.a) this.f6562e.getValue();
    }

    public final d e() {
        return (d) this.f6561d.getValue();
    }

    public final e f() {
        return (e) this.f6563f.getValue();
    }

    public final c7.b<?> g(d.b bVar) {
        d dVar;
        r.f(bVar, DiagnosticsEntry.VERSION_KEY);
        if (bVar.compareTo(d.b.V_2) <= 0 && bVar.compareTo(d.b.V_1) >= 0) {
            d dVarE = e();
            dVar = dVarE.b().length() > 0 ? dVarE : null;
            if (dVar != null) {
                return dVar;
            }
        } else {
            d dVarE2 = e();
            if (!(dVarE2.b().length() > 0)) {
                dVarE2 = null;
            }
            if (dVarE2 != null) {
                return dVarE2;
            }
            e eVarF = f();
            dVar = eVarF.b().length() > 0 ? eVarF : null;
            if (dVar != null) {
                return dVar;
            }
        }
        return d();
    }
}
