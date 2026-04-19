package p0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import d0.y;
import d0.z;
import l1.j0;
import le.n0;
import md.i0;
import md.u;
import t0.f3;
import t0.l0;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f17784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p3<j0> f17785c;

    @sd.d(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {136}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0.k f17788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f17789d;

        /* JADX INFO: renamed from: p0.e$a$a, reason: collision with other inner class name */
        static final class C0378a<T> implements oe.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f17790a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n0 f17791b;

            C0378a(m mVar, n0 n0Var) {
                this.f17790a = mVar;
                this.f17791b = n0Var;
            }

            @Override // oe.f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(g0.j jVar, qd.d<? super i0> dVar) {
                m mVar;
                g0.p pVarA;
                if (jVar instanceof g0.p) {
                    this.f17790a.e((g0.p) jVar, this.f17791b);
                } else {
                    if (jVar instanceof g0.q) {
                        mVar = this.f17790a;
                        pVarA = ((g0.q) jVar).a();
                    } else if (jVar instanceof g0.o) {
                        mVar = this.f17790a;
                        pVarA = ((g0.o) jVar).a();
                    } else {
                        this.f17790a.h(jVar, this.f17791b);
                    }
                    mVar.g(pVarA);
                }
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g0.k kVar, m mVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f17788c = kVar;
            this.f17789d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f17788c, this.f17789d, dVar);
            aVar.f17787b = obj;
            return aVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f17786a;
            if (i10 == 0) {
                u.b(obj);
                n0 n0Var = (n0) this.f17787b;
                oe.e<g0.j> eVarB = this.f17788c.b();
                C0378a c0378a = new C0378a(this.f17789d, n0Var);
                this.f17786a = 1;
                if (eVarB.a(c0378a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    private e(boolean z10, float f10, p3<j0> p3Var) {
        this.f17783a = z10;
        this.f17784b = f10;
        this.f17785c = p3Var;
    }

    public /* synthetic */ e(boolean z10, float f10, p3 p3Var, ae.j jVar) {
        this(z10, f10, p3Var);
    }

    @Override // d0.y
    public final z a(g0.k kVar, t0.l lVar, int i10) {
        lVar.e(988743187);
        if (t0.o.I()) {
            t0.o.U(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:115)");
        }
        o oVar = (o) lVar.P(p.d());
        lVar.e(-1524341038);
        long jE = (this.f17785c.getValue().E() > j0.f14524b.j() ? 1 : (this.f17785c.getValue().E() == j0.f14524b.j() ? 0 : -1)) != 0 ? this.f17785c.getValue().E() : oVar.b(lVar, 0);
        lVar.K();
        m mVarB = b(kVar, this.f17783a, this.f17784b, f3.o(j0.m(jE), lVar, 0), f3.o(oVar.a(lVar, 0), lVar, 0), lVar, (i10 & 14) | (458752 & (i10 << 12)));
        l0.c(mVarB, kVar, new a(kVar, mVarB, null), lVar, ((i10 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 520);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return mVarB;
    }

    public abstract m b(g0.k kVar, boolean z10, float f10, p3<j0> p3Var, p3<f> p3Var2, t0.l lVar, int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f17783a == eVar.f17783a && w2.h.o(this.f17784b, eVar.f17784b) && ae.r.b(this.f17785c, eVar.f17785c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f17783a) * 31) + w2.h.p(this.f17784b)) * 31) + this.f17785c.hashCode();
    }
}
