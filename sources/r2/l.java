package r2;

import androidx.emoji2.text.e;
import t0.k1;
import t0.k3;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p3<Boolean> f19167a;

    public static final class a extends e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1<Boolean> f19168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f19169b;

        a(k1<Boolean> k1Var, l lVar) {
            this.f19168a = k1Var;
            this.f19169b = lVar;
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable th) {
            this.f19169b.f19167a = p.f19174a;
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            this.f19168a.setValue(Boolean.TRUE);
            this.f19169b.f19167a = new q(true);
        }
    }

    public l() {
        this.f19167a = androidx.emoji2.text.e.i() ? c() : null;
    }

    private final p3<Boolean> c() {
        androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
        if (eVarC.e() == 1) {
            return new q(true);
        }
        k1 k1VarE = k3.e(Boolean.FALSE, null, 2, null);
        eVarC.t(new a(k1VarE, this));
        return k1VarE;
    }

    @Override // r2.o
    public p3<Boolean> a() {
        p3<Boolean> p3VarC = this.f19167a;
        if (p3VarC == null) {
            if (!androidx.emoji2.text.e.i()) {
                return p.f19174a;
            }
            p3VarC = c();
            this.f19167a = p3VarC;
        }
        ae.r.c(p3VarC);
        return p3VarC;
    }
}
