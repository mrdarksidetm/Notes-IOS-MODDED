package e0;

import ae.e0;
import c0.d1;
import java.util.concurrent.CancellationException;
import le.n0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c0.x<Float> f10347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f1.d f10348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10349c;

    @sd.d(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {965}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super Float>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f10353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f10354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ x f10355f;

        /* JADX INFO: renamed from: e0.h$a$a, reason: collision with other inner class name */
        static final class C0244a extends ae.s implements zd.l<c0.h<Float, c0.m>, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e0 f10356a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f10357b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e0 f10358c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ h f10359d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0244a(e0 e0Var, x xVar, e0 e0Var2, h hVar) {
                super(1);
                this.f10356a = e0Var;
                this.f10357b = xVar;
                this.f10358c = e0Var2;
                this.f10359d = hVar;
            }

            public final void a(c0.h<Float, c0.m> hVar) {
                float fFloatValue = hVar.e().floatValue() - this.f10356a.f701a;
                float fA = this.f10357b.a(fFloatValue);
                this.f10356a.f701a = hVar.e().floatValue();
                this.f10358c.f701a = hVar.f().floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    hVar.a();
                }
                h hVar2 = this.f10359d;
                hVar2.e(hVar2.c() + 1);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(c0.h<Float, c0.m> hVar) {
                a(hVar);
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, h hVar, x xVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f10353d = f10;
            this.f10354e = hVar;
            this.f10355f = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f10353d, this.f10354e, this.f10355f, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super Float> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            float f10;
            e0 e0Var;
            c0.k kVar;
            c0.x<Float> xVarB;
            C0244a c0244a;
            Object objE = rd.d.e();
            int i10 = this.f10352c;
            if (i10 == 0) {
                md.u.b(obj);
                if (Math.abs(this.f10353d) > 1.0f) {
                    e0 e0Var2 = new e0();
                    e0Var2.f701a = this.f10353d;
                    e0 e0Var3 = new e0();
                    c0.k kVarB = c0.l.b(0.0f, this.f10353d, 0L, 0L, false, 28, null);
                    try {
                        xVarB = this.f10354e.b();
                        c0244a = new C0244a(e0Var3, this.f10355f, e0Var2, this.f10354e);
                        this.f10350a = e0Var2;
                        this.f10351b = kVarB;
                        this.f10352c = 1;
                    } catch (CancellationException unused) {
                        e0Var = e0Var2;
                        kVar = kVarB;
                        e0Var.f701a = ((Number) kVar.j()).floatValue();
                    }
                    if (d1.h(kVarB, xVarB, false, c0244a, this, 2, null) == objE) {
                        return objE;
                    }
                    e0Var = e0Var2;
                    f10 = e0Var.f701a;
                } else {
                    f10 = this.f10353d;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = (c0.k) this.f10351b;
                e0Var = (e0) this.f10350a;
                try {
                    md.u.b(obj);
                } catch (CancellationException unused2) {
                    e0Var.f701a = ((Number) kVar.j()).floatValue();
                }
                f10 = e0Var.f701a;
            }
            return sd.a.c(f10);
        }
    }

    public h(c0.x<Float> xVar, f1.d dVar) {
        this.f10347a = xVar;
        this.f10348b = dVar;
    }

    public /* synthetic */ h(c0.x xVar, f1.d dVar, int i10, ae.j jVar) {
        this(xVar, (i10 & 2) != 0 ? androidx.compose.foundation.gestures.e.g() : dVar);
    }

    @Override // e0.p
    public Object a(x xVar, float f10, qd.d<? super Float> dVar) {
        this.f10349c = 0;
        return le.i.g(this.f10348b, new a(f10, this, xVar, null), dVar);
    }

    public final c0.x<Float> b() {
        return this.f10347a;
    }

    public final int c() {
        return this.f10349c;
    }

    public final void d(c0.x<Float> xVar) {
        this.f10347a = xVar;
    }

    public final void e(int i10) {
        this.f10349c = i10;
    }
}
