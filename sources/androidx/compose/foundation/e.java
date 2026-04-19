package androidx.compose.foundation;

import ae.s;
import androidx.compose.foundation.a;
import androidx.compose.ui.e;
import b2.u0;
import b2.w0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import d0.a0;
import d0.y;
import e0.t;
import le.n0;
import le.o0;
import le.x0;
import md.i0;
import md.u;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    static final class a extends s implements q<androidx.compose.ui.e, t0.l, Integer, androidx.compose.ui.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f2246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g2.i f2247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.a<i0> f2248d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, String str, g2.i iVar, zd.a<i0> aVar) {
            super(3);
            this.f2245a = z10;
            this.f2246b = str;
            this.f2247c = iVar;
            this.f2248d = aVar;
        }

        public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, t0.l lVar, int i10) {
            lVar.e(-756081143);
            if (t0.o.I()) {
                t0.o.U(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:98)");
            }
            e.a aVar = androidx.compose.ui.e.f2662a;
            y yVar = (y) lVar.P(a0.a());
            lVar.e(-492369756);
            Object objF = lVar.f();
            if (objF == t0.l.f20813a.a()) {
                objF = g0.l.a();
                lVar.E(objF);
            }
            lVar.K();
            androidx.compose.ui.e eVarB = e.b(aVar, (g0.m) objF, yVar, this.f2245a, this.f2246b, this.f2247c, this.f2248d);
            if (t0.o.I()) {
                t0.o.T();
            }
            lVar.K();
            return eVarB;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, t0.l lVar, Integer num) {
            return invoke(eVar, lVar, num.intValue());
        }
    }

    public static final class b extends s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0.m f2249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f2250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f2252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g2.i f2253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zd.a f2254f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g0.m mVar, y yVar, boolean z10, String str, g2.i iVar, zd.a aVar) {
            super(1);
            this.f2249a = mVar;
            this.f2250b = yVar;
            this.f2251c = z10;
            this.f2252d = str;
            this.f2253e = iVar;
            this.f2254f = aVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("clickable");
            w0Var.a().c("interactionSource", this.f2249a);
            w0Var.a().c("indication", this.f2250b);
            w0Var.a().c("enabled", Boolean.valueOf(this.f2251c));
            w0Var.a().c("onClickLabel", this.f2252d);
            w0Var.a().c("role", this.f2253e);
            w0Var.a().c("onClick", this.f2254f);
        }
    }

    public static final class c extends s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f2256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g2.i f2257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.a f2258d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String str, g2.i iVar, zd.a aVar) {
            super(1);
            this.f2255a = z10;
            this.f2256b = str;
            this.f2257c = iVar;
            this.f2258d = aVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("clickable");
            w0Var.a().c("enabled", Boolean.valueOf(this.f2255a));
            w0Var.a().c("onClickLabel", this.f2256b);
            w0Var.a().c("role", this.f2257c);
            w0Var.a().c("onClick", this.f2258d);
        }
    }

    @sd.d(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {307, 309, 316, 317, 326}, m = "invokeSuspend")
    static final class d extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f2259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f2261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t f2262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f2263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0.m f2264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a.C0044a f2265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ zd.a<Boolean> f2266h;

        @sd.d(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {301, RCHTTPStatusCodes.NOT_MODIFIED}, m = "invokeSuspend")
        static final class a extends sd.j implements p<n0, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f2267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f2268b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ zd.a<Boolean> f2269c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f2270d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ g0.m f2271e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a.C0044a f2272f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(zd.a<Boolean> aVar, long j10, g0.m mVar, a.C0044a c0044a, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f2269c = aVar;
                this.f2270d = j10;
                this.f2271e = mVar;
                this.f2272f = c0044a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f2269c, this.f2270d, this.f2271e, this.f2272f, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                g0.p pVar;
                Object objE = rd.d.e();
                int i10 = this.f2268b;
                if (i10 == 0) {
                    u.b(obj);
                    if (this.f2269c.invoke().booleanValue()) {
                        long jA = d0.m.a();
                        this.f2268b = 1;
                        if (x0.a(jA, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pVar = (g0.p) this.f2267a;
                        u.b(obj);
                        this.f2272f.e(pVar);
                        return i0.f15558a;
                    }
                    u.b(obj);
                }
                g0.p pVar2 = new g0.p(this.f2270d, null);
                g0.m mVar = this.f2271e;
                this.f2267a = pVar2;
                this.f2268b = 2;
                if (mVar.c(pVar2, this) == objE) {
                    return objE;
                }
                pVar = pVar2;
                this.f2272f.e(pVar);
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t tVar, long j10, g0.m mVar, a.C0044a c0044a, zd.a<Boolean> aVar, qd.d<? super d> dVar) {
            super(2, dVar);
            this.f2262d = tVar;
            this.f2263e = j10;
            this.f2264f = mVar;
            this.f2265g = c0044a;
            this.f2266h = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            d dVar2 = new d(this.f2262d, this.f2263e, this.f2264f, this.f2265g, this.f2266h, dVar);
            dVar2.f2261c = obj;
            return dVar2;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((d) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, g0.m mVar, y yVar, boolean z10, String str, g2.i iVar, zd.a<i0> aVar) {
        return u0.b(eVar, u0.c() ? new b(mVar, yVar, z10, str, iVar, aVar) : u0.a(), FocusableKt.b(n.a(a0.b(androidx.compose.ui.e.f2662a, mVar, yVar), mVar, z10), z10, mVar).h(new ClickableElement(mVar, z10, str, iVar, aVar, null)));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, g0.m mVar, y yVar, boolean z10, String str, g2.i iVar, zd.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return b(eVar, mVar, yVar, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : iVar, aVar);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, boolean z10, String str, g2.i iVar, zd.a<i0> aVar) {
        return androidx.compose.ui.c.a(eVar, u0.c() ? new c(z10, str, iVar, aVar) : u0.a(), new a(z10, str, iVar, aVar));
    }

    public static /* synthetic */ androidx.compose.ui.e e(androidx.compose.ui.e eVar, boolean z10, String str, g2.i iVar, zd.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            iVar = null;
        }
        return d(eVar, z10, str, iVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(t tVar, long j10, g0.m mVar, a.C0044a c0044a, zd.a<Boolean> aVar, qd.d<? super i0> dVar) {
        Object objE = o0.e(new d(tVar, j10, mVar, c0044a, aVar, null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }
}
