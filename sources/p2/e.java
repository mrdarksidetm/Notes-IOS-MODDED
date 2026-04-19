package p2;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import l1.z0;
import v1.n0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f18093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f18094b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e0 f18102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i2.d0 f18103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private x f18104l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k1.h f18106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private k1.h f18107o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f18095c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private zd.l<? super z0, md.i0> f18105m = a.f18111a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final CursorAnchorInfo.Builder f18108p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float[] f18109q = z0.c(null, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Matrix f18110r = new Matrix();

    static final class a extends ae.s implements zd.l<z0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18111a = new a();

        a() {
            super(1);
        }

        public final void a(float[] fArr) {
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(z0 z0Var) {
            a(z0Var.o());
            return md.i0.f15558a;
        }
    }

    public e(n0 n0Var, m mVar) {
        this.f18093a = n0Var;
        this.f18094b = mVar;
    }

    private final void b() {
        if (this.f18094b.isActive()) {
            this.f18105m.invoke(z0.a(this.f18109q));
            this.f18093a.k(this.f18109q);
            l1.h.a(this.f18110r, this.f18109q);
            m mVar = this.f18094b;
            CursorAnchorInfo.Builder builder = this.f18108p;
            e0 e0Var = this.f18102j;
            ae.r.c(e0Var);
            x xVar = this.f18104l;
            ae.r.c(xVar);
            i2.d0 d0Var = this.f18103k;
            ae.r.c(d0Var);
            Matrix matrix = this.f18110r;
            k1.h hVar = this.f18106n;
            ae.r.c(hVar);
            k1.h hVar2 = this.f18107o;
            ae.r.c(hVar2);
            mVar.updateCursorAnchorInfo(d.b(builder, e0Var, xVar, d0Var, matrix, hVar, hVar2, this.f18098f, this.f18099g, this.f18100h, this.f18101i));
            this.f18097e = false;
        }
    }

    public final void a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f18095c) {
            this.f18098f = z12;
            this.f18099g = z13;
            this.f18100h = z14;
            this.f18101i = z15;
            if (z10) {
                this.f18097e = true;
                if (this.f18102j != null) {
                    b();
                }
            }
            this.f18096d = z11;
            md.i0 i0Var = md.i0.f15558a;
        }
    }
}
