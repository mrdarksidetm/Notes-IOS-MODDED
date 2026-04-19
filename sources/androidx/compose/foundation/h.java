package androidx.compose.foundation;

import a2.n1;
import ae.r;
import ae.s;
import androidx.compose.ui.e;
import g2.v;
import g2.x;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class h extends e.c implements n1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f2402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private g2.i f2403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private zd.a<i0> f2404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f2405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private zd.a<i0> f2406s;

    static final class a extends s implements zd.a<Boolean> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            h.this.f2404q.invoke();
            return Boolean.TRUE;
        }
    }

    static final class b extends s implements zd.a<Boolean> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            zd.a aVar = h.this.f2406s;
            if (aVar != null) {
                aVar.invoke();
            }
            return Boolean.TRUE;
        }
    }

    private h(boolean z10, String str, g2.i iVar, zd.a<i0> aVar, String str2, zd.a<i0> aVar2) {
        this.f2401n = z10;
        this.f2402o = str;
        this.f2403p = iVar;
        this.f2404q = aVar;
        this.f2405r = str2;
        this.f2406s = aVar2;
    }

    public /* synthetic */ h(boolean z10, String str, g2.i iVar, zd.a aVar, String str2, zd.a aVar2, ae.j jVar) {
        this(z10, str, iVar, aVar, str2, aVar2);
    }

    @Override // a2.n1
    public void U(x xVar) {
        g2.i iVar = this.f2403p;
        if (iVar != null) {
            r.c(iVar);
            v.y(xVar, iVar.n());
        }
        v.j(xVar, this.f2402o, new a());
        if (this.f2406s != null) {
            v.k(xVar, this.f2405r, new b());
        }
        if (this.f2401n) {
            return;
        }
        v.f(xVar);
    }

    public final void c2(boolean z10, String str, g2.i iVar, zd.a<i0> aVar, String str2, zd.a<i0> aVar2) {
        this.f2401n = z10;
        this.f2402o = str;
        this.f2403p = iVar;
        this.f2404q = aVar;
        this.f2405r = str2;
        this.f2406s = aVar2;
    }

    @Override // a2.n1
    public boolean q1() {
        return true;
    }
}
