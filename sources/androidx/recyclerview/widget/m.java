package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final z.a<RecyclerView.b0, a> f4891a = new z.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final z.m<RecyclerView.b0> f4892b = new z.m<>();

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static n3.e<a> f4893d = new n3.f(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.k.c f4895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.k.c f4896c;

        private a() {
        }

        static void a() {
            while (f4893d.b() != null) {
            }
        }

        static a b() {
            a aVarB = f4893d.b();
            return aVarB == null ? new a() : aVarB;
        }

        static void c(a aVar) {
            aVar.f4894a = 0;
            aVar.f4895b = null;
            aVar.f4896c = null;
            f4893d.a(aVar);
        }
    }

    interface b {
    }

    m() {
    }

    void a(long j10, RecyclerView.b0 b0Var) {
        this.f4892b.i(j10, b0Var);
    }

    void b(RecyclerView.b0 b0Var, RecyclerView.k.c cVar) {
        a aVarB = this.f4891a.get(b0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f4891a.put(b0Var, aVarB);
        }
        aVarB.f4895b = cVar;
        aVarB.f4894a |= 4;
    }

    void c() {
        a.a();
    }

    void d(RecyclerView.b0 b0Var) {
        int iM = this.f4892b.m() - 1;
        while (true) {
            if (iM < 0) {
                break;
            }
            if (b0Var == this.f4892b.n(iM)) {
                this.f4892b.k(iM);
                break;
            }
            iM--;
        }
        a aVarRemove = this.f4891a.remove(b0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
