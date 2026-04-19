package p0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;
import java.util.List;
import l1.j0;
import le.n0;
import le.p0;
import md.i0;
import md.u;
import nd.c0;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p3<f> f17854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0.a<Float, c0.m> f17855c = c0.b.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<g0.j> f17856d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g0.j f17857e;

    @sd.d(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {299}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17858a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f17860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0.i<Float> f17861d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, c0.i<Float> iVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f17860c = f10;
            this.f17861d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return q.this.new a(this.f17860c, this.f17861d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f17858a;
            if (i10 == 0) {
                u.b(obj);
                c0.a aVar = q.this.f17855c;
                Float fC = sd.a.c(this.f17860c);
                c0.i<Float> iVar = this.f17861d;
                this.f17858a = 1;
                if (c0.a.f(aVar, fC, iVar, null, null, this, 12, null) == objE) {
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

    @sd.d(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {305}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17862a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0.i<Float> f17864c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c0.i<Float> iVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f17864c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return q.this.new b(this.f17864c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f17862a;
            if (i10 == 0) {
                u.b(obj);
                c0.a aVar = q.this.f17855c;
                Float fC = sd.a.c(0.0f);
                c0.i<Float> iVar = this.f17864c;
                this.f17862a = 1;
                if (c0.a.f(aVar, fC, iVar, null, null, this, 12, null) == objE) {
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

    public q(boolean z10, p3<f> p3Var) {
        this.f17853a = z10;
        this.f17854b = p3Var;
    }

    public final void b(n1.f fVar, float f10, long j10) {
        float fA = Float.isNaN(f10) ? h.a(fVar, this.f17853a, fVar.c()) : fVar.G0(f10);
        float fFloatValue = this.f17855c.m().floatValue();
        if (fFloatValue > 0.0f) {
            long jU = j0.u(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.f17853a) {
                n1.f.s1(fVar, jU, fA, 0L, 0.0f, null, null, 0, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
                return;
            }
            float fI = k1.l.i(fVar.c());
            float fG = k1.l.g(fVar.c());
            int iB = l1.i0.f14518a.b();
            n1.d dVarM0 = fVar.M0();
            long jC = dVarM0.c();
            dVarM0.d().h();
            dVarM0.a().b(0.0f, 0.0f, fI, fG, iB);
            n1.f.s1(fVar, jU, fA, 0L, 0.0f, null, null, 0, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
            dVarM0.d().p();
            dVarM0.b(jC);
        }
    }

    public final void c(g0.j jVar, n0 n0Var) {
        List<g0.j> list;
        Object objA;
        qd.g gVar;
        p0 p0Var;
        zd.p bVar;
        boolean z10 = jVar instanceof g0.g;
        if (z10) {
            this.f17856d.add(jVar);
        } else {
            if (jVar instanceof g0.h) {
                list = this.f17856d;
                objA = ((g0.h) jVar).a();
            } else {
                if (!(jVar instanceof g0.d)) {
                    if (jVar instanceof g0.e) {
                        list = this.f17856d;
                        objA = ((g0.e) jVar).a();
                    } else if (!(jVar instanceof g0.b)) {
                        if (jVar instanceof g0.c) {
                            list = this.f17856d;
                            objA = ((g0.c) jVar).a();
                        } else {
                            if (!(jVar instanceof g0.a)) {
                                return;
                            }
                            list = this.f17856d;
                            objA = ((g0.a) jVar).a();
                        }
                    }
                }
                this.f17856d.add(jVar);
            }
            list.remove(objA);
        }
        g0.j jVar2 = (g0.j) c0.k0(this.f17856d);
        if (ae.r.b(this.f17857e, jVar2)) {
            return;
        }
        if (jVar2 != null) {
            gVar = null;
            p0Var = null;
            bVar = new a(z10 ? this.f17854b.getValue().c() : jVar instanceof g0.d ? this.f17854b.getValue().b() : jVar instanceof g0.b ? this.f17854b.getValue().a() : 0.0f, n.c(jVar2), null);
        } else {
            gVar = null;
            p0Var = null;
            bVar = new b(n.d(this.f17857e), null);
        }
        le.k.d(n0Var, gVar, p0Var, bVar, 3, null);
        this.f17857e = jVar2;
    }
}
