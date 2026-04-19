package b0;

import c0.f1;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import md.i0;
import t0.e2;
import t0.f3;
import t0.o2;
import t0.p3;
import t0.y1;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    static final class a extends ae.s implements zd.q<g0, d0, w2.b, f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f5044a;

        /* JADX INFO: renamed from: b0.d$a$a, reason: collision with other inner class name */
        static final class C0120a extends ae.s implements zd.l<t0.a, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t0 f5045a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0120a(t0 t0Var) {
                super(1);
                this.f5045a = t0Var;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
                t0.a.f(aVar, this.f5045a, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t tVar) {
            super(3);
            this.f5044a = tVar;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ f0 invoke(g0 g0Var, d0 d0Var, w2.b bVar) {
            return m2invoke3p2s80s(g0Var, d0Var, bVar.t());
        }

        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
        public final f0 m2invoke3p2s80s(g0 g0Var, d0 d0Var, long j10) {
            t0 t0VarI = d0Var.I(j10);
            t tVar = this.f5044a;
            if (g0Var.C0()) {
                tVar.a(w2.q.a(t0VarI.q0(), t0VarI.d0()));
            }
            return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new C0120a(t0VarI), 4, null);
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<T> f5046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<T, Boolean> f5047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f5049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f5050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zd.p<l, l, Boolean> f5051f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ t f5052g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ zd.q<b0.e, t0.l, Integer, i0> f5053h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f5054i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f5055j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(f1<T> f1Var, zd.l<? super T, Boolean> lVar, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, zd.p<? super l, ? super l, Boolean> pVar, t tVar, zd.q<? super b0.e, ? super t0.l, ? super Integer, i0> qVar, int i10, int i11) {
            super(2);
            this.f5046a = f1Var;
            this.f5047b = lVar;
            this.f5048c = eVar;
            this.f5049d = hVar;
            this.f5050e = jVar;
            this.f5051f = pVar;
            this.f5052g = tVar;
            this.f5053h = qVar;
            this.f5054i = i10;
            this.f5055j = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            d.a(this.f5046a, this.f5047b, this.f5048c, this.f5049d, this.f5050e, this.f5051f, this.f5052g, this.f5053h, lVar, e2.a(this.f5054i | 1), this.f5055j);
        }
    }

    @sd.d(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {803}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.p<y1<Boolean>, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f5056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f5057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f1<l> f5058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p3<zd.p<l, l, Boolean>> f5059d;

        static final class a extends ae.s implements zd.a<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1<l> f5060a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f1<l> f1Var) {
                super(0);
                this.f5060a = f1Var;
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(d.i(this.f5060a));
            }
        }

        static final class b<T> implements oe.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1<Boolean> f5061a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f1<l> f5062b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p3<zd.p<l, l, Boolean>> f5063c;

            /* JADX WARN: Multi-variable type inference failed */
            b(y1<Boolean> y1Var, f1<l> f1Var, p3<? extends zd.p<? super l, ? super l, Boolean>> p3Var) {
                this.f5061a = y1Var;
                this.f5062b = f1Var;
                this.f5063c = p3Var;
            }

            public final Object a(boolean z10, qd.d<? super i0> dVar) {
                this.f5061a.setValue(sd.a.a(z10 ? ((Boolean) d.b(this.f5063c).invoke(this.f5062b.h(), this.f5062b.n())).booleanValue() : false));
                return i0.f15558a;
            }

            @Override // oe.f
            public /* bridge */ /* synthetic */ Object b(Object obj, qd.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(f1<l> f1Var, p3<? extends zd.p<? super l, ? super l, Boolean>> p3Var, qd.d<? super c> dVar) {
            super(2, dVar);
            this.f5058c = f1Var;
            this.f5059d = p3Var;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y1<Boolean> y1Var, qd.d<? super i0> dVar) {
            return ((c) create(y1Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            c cVar = new c(this.f5058c, this.f5059d, dVar);
            cVar.f5057b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f5056a;
            if (i10 == 0) {
                md.u.b(obj);
                y1 y1Var = (y1) this.f5057b;
                oe.e eVarP = f3.p(new a(this.f5058c));
                b bVar = new b(y1Var, this.f5058c, this.f5059d);
                this.f5056a = 1;
                if (eVarP.a(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return i0.f15558a;
        }
    }

    /* JADX INFO: renamed from: b0.d$d, reason: collision with other inner class name */
    static final class C0121d extends ae.s implements zd.l<Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0121d f5064a = new C0121d();

        C0121d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    static final class e extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f5067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f5068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f5069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zd.q<b0.e, t0.l, Integer, i0> f5070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f5072h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(boolean z10, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, String str, zd.q<? super b0.e, ? super t0.l, ? super Integer, i0> qVar, int i10, int i11) {
            super(2);
            this.f5065a = z10;
            this.f5066b = eVar;
            this.f5067c = hVar;
            this.f5068d = jVar;
            this.f5069e = str;
            this.f5070f = qVar;
            this.f5071g = i10;
            this.f5072h = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            d.e(this.f5065a, this.f5066b, this.f5067c, this.f5068d, this.f5069e, this.f5070f, lVar, e2.a(this.f5071g | 1), this.f5072h);
        }
    }

    static final class f extends ae.s implements zd.l<Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f5073a = new f();

        f() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    static final class g extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0.h f5074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f5077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f5078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f5079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ zd.q<b0.e, t0.l, Integer, i0> f5080g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f5081h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f5082i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(h0.h hVar, boolean z10, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar2, androidx.compose.animation.j jVar, String str, zd.q<? super b0.e, ? super t0.l, ? super Integer, i0> qVar, int i10, int i11) {
            super(2);
            this.f5074a = hVar;
            this.f5075b = z10;
            this.f5076c = eVar;
            this.f5077d = hVar2;
            this.f5078e = jVar;
            this.f5079f = str;
            this.f5080g = qVar;
            this.f5081h = i10;
            this.f5082i = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            d.d(this.f5074a, this.f5075b, this.f5076c, this.f5077d, this.f5078e, this.f5079f, this.f5080g, lVar, e2.a(this.f5081h | 1), this.f5082i);
        }
    }

    static final class h extends ae.s implements zd.q<g0, d0, w2.b, f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<T, Boolean> f5083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1<T> f5084b;

        static final class a extends ae.s implements zd.l<t0.a, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t0 f5085a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t0 t0Var) {
                super(1);
                this.f5085a = t0Var;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
                t0.a.f(aVar, this.f5085a, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(zd.l<? super T, Boolean> lVar, f1<T> f1Var) {
            super(3);
            this.f5083a = lVar;
            this.f5084b = f1Var;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ f0 invoke(g0 g0Var, d0 d0Var, w2.b bVar) {
            return m3invoke3p2s80s(g0Var, d0Var, bVar.t());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
        public final f0 m3invoke3p2s80s(g0 g0Var, d0 d0Var, long j10) {
            t0 t0VarI = d0Var.I(j10);
            long jA = (!g0Var.C0() || this.f5083a.invoke((T) this.f5084b.n()).booleanValue()) ? w2.q.a(t0VarI.q0(), t0VarI.d0()) : w2.p.f22421b.a();
            return g0.z0(g0Var, w2.p.g(jA), w2.p.f(jA), null, new a(t0VarI), 4, null);
        }
    }

    static final class i extends ae.s implements zd.p<l, l, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f5086a = new i();

        i() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(l lVar, l lVar2) {
            return Boolean.valueOf(lVar == lVar2 && lVar2 == l.PostExit);
        }
    }

    static final class j extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<T> f5087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<T, Boolean> f5088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f5090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f5091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zd.q<b0.e, t0.l, Integer, i0> f5092f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5093g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(f1<T> f1Var, zd.l<? super T, Boolean> lVar, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, zd.q<? super b0.e, ? super t0.l, ? super Integer, i0> qVar, int i10) {
            super(2);
            this.f5087a = f1Var;
            this.f5088b = lVar;
            this.f5089c = eVar;
            this.f5090d = hVar;
            this.f5091e = jVar;
            this.f5092f = qVar;
            this.f5093g = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            d.f(this.f5087a, this.f5088b, this.f5089c, this.f5090d, this.f5091e, this.f5092f, lVar, e2.a(this.f5093g | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void a(c0.f1<T> r20, zd.l<? super T, java.lang.Boolean> r21, androidx.compose.ui.e r22, androidx.compose.animation.h r23, androidx.compose.animation.j r24, zd.p<? super b0.l, ? super b0.l, java.lang.Boolean> r25, b0.t r26, zd.q<? super b0.e, ? super t0.l, ? super java.lang.Integer, md.i0> r27, t0.l r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d.a(c0.f1, zd.l, androidx.compose.ui.e, androidx.compose.animation.h, androidx.compose.animation.j, zd.p, b0.t, zd.q, t0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zd.p<l, l, Boolean> b(p3<? extends zd.p<? super l, ? super l, Boolean>> p3Var) {
        return (zd.p) p3Var.getValue();
    }

    private static final boolean c(p3<Boolean> p3Var) {
        return p3Var.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(h0.h r23, boolean r24, androidx.compose.ui.e r25, androidx.compose.animation.h r26, androidx.compose.animation.j r27, java.lang.String r28, zd.q<? super b0.e, ? super t0.l, ? super java.lang.Integer, md.i0> r29, t0.l r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d.d(h0.h, boolean, androidx.compose.ui.e, androidx.compose.animation.h, androidx.compose.animation.j, java.lang.String, zd.q, t0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(boolean r23, androidx.compose.ui.e r24, androidx.compose.animation.h r25, androidx.compose.animation.j r26, java.lang.String r27, zd.q<? super b0.e, ? super t0.l, ? super java.lang.Integer, md.i0> r28, t0.l r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d.e(boolean, androidx.compose.ui.e, androidx.compose.animation.h, androidx.compose.animation.j, java.lang.String, zd.q, t0.l, int, int):void");
    }

    public static final <T> void f(f1<T> f1Var, zd.l<? super T, Boolean> lVar, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, zd.q<? super b0.e, ? super t0.l, ? super Integer, i0> qVar, t0.l lVar2, int i10) {
        int i11;
        t0.l lVarP = lVar2.p(429978603);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(f1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.k(lVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= lVarP.N(eVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= lVarP.N(hVar) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= lVarP.N(jVar) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= lVarP.k(qVar) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(429978603, i11, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:739)");
            }
            lVarP.e(-311853878);
            boolean zK = lVarP.k(lVar) | lVarP.N(f1Var);
            Object objF = lVarP.f();
            if (zK || objF == t0.l.f20813a.a()) {
                objF = new h(lVar, f1Var);
                lVarP.E(objF);
            }
            lVarP.K();
            a(f1Var, lVar, androidx.compose.ui.layout.a.a(eVar, (zd.q) objF), hVar, jVar, i.f5086a, null, qVar, lVarP, 196608 | (i11 & 14) | (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128), 64);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new j(f1Var, lVar, eVar, hVar, jVar, qVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(f1<l> f1Var) {
        l lVarH = f1Var.h();
        l lVar = l.PostExit;
        return lVarH == lVar && f1Var.n() == lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> b0.l j(c0.f1<T> r3, zd.l<? super T, java.lang.Boolean> r4, T r5, t0.l r6, int r7) {
        /*
            r0 = 361571134(0x158d233e, float:5.700505E-26)
            r6.e(r0)
            boolean r1 = t0.o.I()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:889)"
            t0.o.U(r0, r7, r1, r2)
        L12:
            r7 = -721835388(0xffffffffd4f9aa84, float:-8.578461E12)
            r6.q(r7, r3)
            boolean r7 = r3.r()
            if (r7 == 0) goto L43
            java.lang.Object r5 = r4.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L2d
        L2a:
            b0.l r3 = b0.l.Visible
            goto L94
        L2d:
            java.lang.Object r3 = r3.h()
            java.lang.Object r3 = r4.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L40
        L3d:
            b0.l r3 = b0.l.PostExit
            goto L94
        L40:
            b0.l r3 = b0.l.PreEnter
            goto L94
        L43:
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.e(r7)
            java.lang.Object r7 = r6.f()
            t0.l$a r0 = t0.l.f20813a
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L60
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r0 = 2
            r1 = 0
            t0.k1 r7 = t0.f3.j(r7, r1, r0, r1)
            r6.E(r7)
        L60:
            r6.K()
            t0.k1 r7 = (t0.k1) r7
            java.lang.Object r3 = r3.h()
            java.lang.Object r3 = r4.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L7a
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r7.setValue(r3)
        L7a:
            java.lang.Object r3 = r4.invoke(r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L87
            goto L2a
        L87:
            java.lang.Object r3 = r7.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L40
            goto L3d
        L94:
            r6.I()
            boolean r4 = t0.o.I()
            if (r4 == 0) goto La0
            t0.o.T()
        La0:
            r6.K()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d.j(c0.f1, zd.l, java.lang.Object, t0.l, int):b0.l");
    }
}
