package q0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;
import t0.a2;
import t0.b2;
import t0.e2;
import t0.k1;
import t0.k3;
import t0.o2;
import y1.b1;
import y1.d1;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k1 f18644a = k3.e(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a2<q> f18645b = t0.v.e(c.f18682a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f18646c = w2.h.m(16);

    static final class a extends ae.s implements zd.p<d1, w2.b, y1.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0.o0 f18651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ zd.q<h0.y, t0.l, Integer, md.i0> f18653g;

        /* JADX INFO: renamed from: q0.h0$a$a, reason: collision with other inner class name */
        static final class C0395a extends ae.s implements zd.l<t0.a, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d1 f18654a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18655b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18656c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18657d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f18658e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f18659f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ h0.o0 f18660g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ long f18661h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18662i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ zd.q<h0.y, t0.l, Integer, md.i0> f18663j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f18664k;

            /* JADX INFO: renamed from: q0.h0$a$a$a, reason: collision with other inner class name */
            static final class C0396a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ h0.o0 f18665a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d1 f18666b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ List<t0> f18667c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f18668d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ List<t0> f18669e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ Integer f18670f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ zd.q<h0.y, t0.l, Integer, md.i0> f18671g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0396a(h0.o0 o0Var, d1 d1Var, List<? extends t0> list, int i10, List<? extends t0> list2, Integer num, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar) {
                    super(2);
                    this.f18665a = o0Var;
                    this.f18666b = d1Var;
                    this.f18667c = list;
                    this.f18668d = i10;
                    this.f18669e = list2;
                    this.f18670f = num;
                    this.f18671g = qVar;
                }

                @Override // zd.p
                public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
                    invoke(lVar, num.intValue());
                    return md.i0.f15558a;
                }

                public final void invoke(t0.l lVar, int i10) {
                    Integer num;
                    if ((i10 & 3) == 2 && lVar.s()) {
                        lVar.x();
                        return;
                    }
                    if (t0.o.I()) {
                        t0.o.U(495329982, i10, -1, "androidx.compose.material3.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:456)");
                    }
                    h0.y yVarB = h0.q0.b(this.f18665a, this.f18666b);
                    this.f18671g.invoke(androidx.compose.foundation.layout.m.d(androidx.compose.foundation.layout.m.g(yVarB, this.f18666b.getLayoutDirection()), this.f18667c.isEmpty() ? yVarB.c() : this.f18666b.l0(this.f18668d), androidx.compose.foundation.layout.m.f(yVarB, this.f18666b.getLayoutDirection()), (this.f18669e.isEmpty() || (num = this.f18670f) == null) ? yVarB.a() : this.f18666b.l0(num.intValue())), lVar, 0);
                    if (t0.o.I()) {
                        t0.o.T();
                    }
                }
            }

            /* JADX INFO: renamed from: q0.h0$a$a$b */
            static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ q f18672a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18673b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(q qVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
                    super(2);
                    this.f18672a = qVar;
                    this.f18673b = pVar;
                }

                @Override // zd.p
                public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
                    invoke(lVar, num.intValue());
                    return md.i0.f15558a;
                }

                public final void invoke(t0.l lVar, int i10) {
                    if ((i10 & 3) == 2 && lVar.s()) {
                        lVar.x();
                        return;
                    }
                    if (t0.o.I()) {
                        t0.o.U(-791102355, i10, -1, "androidx.compose.material3.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:429)");
                    }
                    t0.v.a(h0.i().c(this.f18672a), this.f18673b, lVar, b2.f20629d | 0);
                    if (t0.o.I()) {
                        t0.o.T();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0395a(d1 d1Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, int i10, int i11, h0.o0 o0Var, long j10, zd.p<? super t0.l, ? super Integer, md.i0> pVar4, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar, int i12) {
                super(1);
                this.f18654a = d1Var;
                this.f18655b = pVar;
                this.f18656c = pVar2;
                this.f18657d = pVar3;
                this.f18658e = i10;
                this.f18659f = i11;
                this.f18660g = o0Var;
                this.f18661h = j10;
                this.f18662i = pVar4;
                this.f18663j = qVar;
                this.f18664k = i12;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return md.i0.f15558a;
            }

            /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x022e  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(y1.t0.a r32) {
                /*
                    Method dump skipped, instruction units count: 1111
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: q0.h0.a.C0395a.invoke2(y1.t0$a):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, int i10, h0.o0 o0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar4, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar) {
            super(2);
            this.f18647a = pVar;
            this.f18648b = pVar2;
            this.f18649c = pVar3;
            this.f18650d = i10;
            this.f18651e = o0Var;
            this.f18652f = pVar4;
            this.f18653g = qVar;
        }

        public final y1.f0 a(d1 d1Var, long j10) {
            int iN = w2.b.n(j10);
            int iM = w2.b.m(j10);
            return y1.g0.z0(d1Var, iN, iM, null, new C0395a(d1Var, this.f18647a, this.f18648b, this.f18649c, this.f18650d, iN, this.f18651e, w2.b.e(j10, 0, 0, 0, 0, 10, null), this.f18652f, this.f18653g, iM), 4, null);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ y1.f0 invoke(d1 d1Var, w2.b bVar) {
            return a(d1Var, bVar.t());
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.q<h0.y, t0.l, Integer, md.i0> f18676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0.o0 f18679f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18680g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f18681h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i10, zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, h0.o0 o0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar4, int i11) {
            super(2);
            this.f18674a = i10;
            this.f18675b = pVar;
            this.f18676c = qVar;
            this.f18677d = pVar2;
            this.f18678e = pVar3;
            this.f18679f = o0Var;
            this.f18680g = pVar4;
            this.f18681h = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            h0.a(this.f18674a, this.f18675b, this.f18676c, this.f18677d, this.f18678e, this.f18679f, this.f18680g, lVar, e2.a(this.f18681h | 1));
        }
    }

    static final class c extends ae.s implements zd.a<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f18682a = new c();

        c() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return null;
        }
    }

    static final class d extends ae.s implements zd.l<h0.o0, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f18683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.o0 f18684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b0 b0Var, h0.o0 o0Var) {
            super(1);
            this.f18683a = b0Var;
            this.f18684b = o0Var;
        }

        public final void a(h0.o0 o0Var) {
            this.f18683a.f(h0.q0.c(this.f18684b, o0Var));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(h0.o0 o0Var) {
            a(o0Var);
            return md.i0.f15558a;
        }
    }

    static final class e extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.q<h0.y, t0.l, Integer, md.i0> f18687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b0 f18690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18691g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(int i10, zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, b0 b0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar4) {
            super(2);
            this.f18685a = i10;
            this.f18686b = pVar;
            this.f18687c = qVar;
            this.f18688d = pVar2;
            this.f18689e = pVar3;
            this.f18690f = b0Var;
            this.f18691g = pVar4;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 3) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (t0.o.I()) {
                t0.o.U(-1979205334, i10, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:107)");
            }
            h0.c(this.f18685a, this.f18686b, this.f18687c, this.f18688d, this.f18689e, this.f18690f, this.f18691g, lVar, 0);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    static final class f extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f18692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f18697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f18698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f18699h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ h0.o0 f18700i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ zd.q<h0.y, t0.l, Integer, md.i0> f18701j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f18702k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f18703l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.e eVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, zd.p<? super t0.l, ? super Integer, md.i0> pVar4, int i10, long j10, long j11, h0.o0 o0Var, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar, int i11, int i12) {
            super(2);
            this.f18692a = eVar;
            this.f18693b = pVar;
            this.f18694c = pVar2;
            this.f18695d = pVar3;
            this.f18696e = pVar4;
            this.f18697f = i10;
            this.f18698g = j10;
            this.f18699h = j11;
            this.f18700i = o0Var;
            this.f18701j = qVar;
            this.f18702k = i11;
            this.f18703l = i12;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            h0.b(this.f18692a, this.f18693b, this.f18694c, this.f18695d, this.f18696e, this.f18697f, this.f18698g, this.f18699h, this.f18700i, this.f18701j, lVar, e2.a(this.f18702k | 1), this.f18703l);
        }
    }

    static final class g extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.q<h0.y, t0.l, Integer, md.i0> f18706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0.o0 f18709f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18710g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f18711h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(int i10, zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, h0.o0 o0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar4, int i11) {
            super(2);
            this.f18704a = i10;
            this.f18705b = pVar;
            this.f18706c = qVar;
            this.f18707d = pVar2;
            this.f18708e = pVar3;
            this.f18709f = o0Var;
            this.f18710g = pVar4;
            this.f18711h = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            h0.c(this.f18704a, this.f18705b, this.f18706c, this.f18707d, this.f18708e, this.f18709f, this.f18710g, lVar, e2.a(this.f18711h | 1));
        }
    }

    static final class h extends ae.s implements zd.p<d1, w2.b, y1.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0.o0 f18716e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18717f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ zd.q<h0.y, t0.l, Integer, md.i0> f18718g;

        static final class a extends ae.s implements zd.l<t0.a, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<t0> f18719a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<t0> f18720b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<t0> f18721c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<t0> f18722d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ q f18723e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f18724f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f18725g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ h0.o0 f18726h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ d1 f18727i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f18728j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f18729k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Integer f18730l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ List<t0> f18731m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Integer f18732n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends t0> list, List<? extends t0> list2, List<? extends t0> list3, List<? extends t0> list4, q qVar, int i10, int i11, h0.o0 o0Var, d1 d1Var, int i12, int i13, Integer num, List<? extends t0> list5, Integer num2) {
                super(1);
                this.f18719a = list;
                this.f18720b = list2;
                this.f18721c = list3;
                this.f18722d = list4;
                this.f18723e = qVar;
                this.f18724f = i10;
                this.f18725g = i11;
                this.f18726h = o0Var;
                this.f18727i = d1Var;
                this.f18728j = i12;
                this.f18729k = i13;
                this.f18730l = num;
                this.f18731m = list5;
                this.f18732n = num2;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
                List<t0> list = this.f18719a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t0.a.f(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
                List<t0> list2 = this.f18720b;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    t0.a.f(aVar, list2.get(i11), 0, 0, 0.0f, 4, null);
                }
                List<t0> list3 = this.f18721c;
                int i12 = this.f18724f;
                int i13 = this.f18725g;
                h0.o0 o0Var = this.f18726h;
                d1 d1Var = this.f18727i;
                int i14 = this.f18728j;
                int i15 = this.f18729k;
                int size3 = list3.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    t0.a.f(aVar, list3.get(i16), ((i12 - i13) / 2) + o0Var.a(d1Var, d1Var.getLayoutDirection()), i14 - i15, 0.0f, 4, null);
                }
                List<t0> list4 = this.f18722d;
                int i17 = this.f18728j;
                Integer num = this.f18730l;
                int size4 = list4.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    t0.a.f(aVar, list4.get(i18), 0, i17 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                q qVar = this.f18723e;
                if (qVar != null) {
                    List<t0> list5 = this.f18731m;
                    int i19 = this.f18728j;
                    Integer num2 = this.f18732n;
                    int size5 = list5.size();
                    for (int i20 = 0; i20 < size5; i20++) {
                        t0 t0Var = list5.get(i20);
                        int iB = qVar.b();
                        ae.r.c(num2);
                        t0.a.f(aVar, t0Var, iB, i19 - num2.intValue(), 0.0f, 4, null);
                    }
                }
            }
        }

        static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0.o0 f18733a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d1 f18734b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<t0> f18735c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f18736d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<t0> f18737e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Integer f18738f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ zd.q<h0.y, t0.l, Integer, md.i0> f18739g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(h0.o0 o0Var, d1 d1Var, List<? extends t0> list, int i10, List<? extends t0> list2, Integer num, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar) {
                super(2);
                this.f18733a = o0Var;
                this.f18734b = d1Var;
                this.f18735c = list;
                this.f18736d = i10;
                this.f18737e = list2;
                this.f18738f = num;
                this.f18739g = qVar;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return md.i0.f15558a;
            }

            public final void invoke(t0.l lVar, int i10) {
                Integer num;
                if ((i10 & 3) == 2 && lVar.s()) {
                    lVar.x();
                    return;
                }
                if (t0.o.I()) {
                    t0.o.U(1655277373, i10, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:285)");
                }
                h0.y yVarB = h0.q0.b(this.f18733a, this.f18734b);
                this.f18739g.invoke(androidx.compose.foundation.layout.m.d(androidx.compose.foundation.layout.m.g(yVarB, this.f18734b.getLayoutDirection()), this.f18735c.isEmpty() ? yVarB.c() : this.f18734b.l0(this.f18736d), androidx.compose.foundation.layout.m.f(yVarB, this.f18734b.getLayoutDirection()), (this.f18737e.isEmpty() || (num = this.f18738f) == null) ? yVarB.a() : this.f18734b.l0(num.intValue())), lVar, 0);
                if (t0.o.I()) {
                    t0.o.T();
                }
            }
        }

        static final class c extends ae.s implements zd.p<t0.l, Integer, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f18740a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18741b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(q qVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar) {
                super(2);
                this.f18740a = qVar;
                this.f18741b = pVar;
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return md.i0.f15558a;
            }

            public final void invoke(t0.l lVar, int i10) {
                if ((i10 & 3) == 2 && lVar.s()) {
                    lVar.x();
                    return;
                }
                if (t0.o.I()) {
                    t0.o.U(1843374446, i10, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:258)");
                }
                t0.v.a(h0.i().c(this.f18740a), this.f18741b, lVar, b2.f20629d | 0);
                if (t0.o.I()) {
                    t0.o.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, int i10, h0.o0 o0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar4, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar) {
            super(2);
            this.f18712a = pVar;
            this.f18713b = pVar2;
            this.f18714c = pVar3;
            this.f18715d = i10;
            this.f18716e = o0Var;
            this.f18717f = pVar4;
            this.f18718g = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x023b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final y1.f0 a(y1.d1 r28, long r29) {
            /*
                Method dump skipped, instruction units count: 987
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.h0.h.a(y1.d1, long):y1.f0");
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ y1.f0 invoke(d1 d1Var, w2.b bVar) {
            return a(d1Var, bVar.t());
        }
    }

    static final class i extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.q<h0.y, t0.l, Integer, md.i0> f18744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0.o0 f18747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f18748g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f18749h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(int i10, zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, h0.o0 o0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar4, int i11) {
            super(2);
            this.f18742a = i10;
            this.f18743b = pVar;
            this.f18744c = qVar;
            this.f18745d = pVar2;
            this.f18746e = pVar3;
            this.f18747f = o0Var;
            this.f18748g = pVar4;
            this.f18749h = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            h0.d(this.f18742a, this.f18743b, this.f18744c, this.f18745d, this.f18746e, this.f18747f, this.f18748g, lVar, e2.a(this.f18749h | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(int i10, zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, h0.o0 o0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar4, t0.l lVar, int i11) {
        int i12;
        int i13;
        t0.l lVarP = lVar.p(1307205667);
        if ((i11 & 6) == 0) {
            i12 = (lVarP.h(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarP.k(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= lVarP.k(qVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarP.k(pVar2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= lVarP.k(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= lVarP.N(o0Var) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= lVarP.k(pVar4) ? 1048576 : 524288;
        }
        if ((i12 & 599187) == 599186 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(1307205667, i12, -1, "androidx.compose.material3.LegacyScaffoldLayout (Scaffold.kt:347)");
            }
            lVarP.e(1646578117);
            boolean z10 = ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | ((i12 & 7168) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384) | ((i12 & 14) == 4) | ((3670016 & i12) == 1048576) | ((i12 & 896) == 256);
            Object objF = lVarP.f();
            if (z10 || objF == t0.l.f20813a.a()) {
                i13 = 1;
                objF = new a(pVar, pVar2, pVar3, i10, o0Var, pVar4, qVar);
                lVarP.E(objF);
            } else {
                i13 = 1;
            }
            lVarP.K();
            b1.a(null, (zd.p) objF, lVarP, 0, i13);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new b(i10, pVar, qVar, pVar2, pVar3, o0Var, pVar4, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.e r29, zd.p<? super t0.l, ? super java.lang.Integer, md.i0> r30, zd.p<? super t0.l, ? super java.lang.Integer, md.i0> r31, zd.p<? super t0.l, ? super java.lang.Integer, md.i0> r32, zd.p<? super t0.l, ? super java.lang.Integer, md.i0> r33, int r34, long r35, long r37, h0.o0 r39, zd.q<? super h0.y, ? super t0.l, ? super java.lang.Integer, md.i0> r40, t0.l r41, int r42, int r43) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.b(androidx.compose.ui.e, zd.p, zd.p, zd.p, zd.p, int, long, long, h0.o0, zd.q, t0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(int i10, zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, h0.o0 o0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar4, t0.l lVar, int i11) {
        int i12;
        t0.l lVarP = lVar.p(-975511942);
        if ((i11 & 6) == 0) {
            i12 = (lVarP.h(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarP.k(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= lVarP.k(qVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarP.k(pVar2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= lVarP.k(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= lVarP.N(o0Var) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= lVarP.k(pVar4) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(-975511942, i12, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:141)");
            }
            if (j()) {
                lVarP.e(-915303637);
                d(i10, pVar, qVar, pVar2, pVar3, o0Var, pVar4, lVarP, (i12 & 14) | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016));
            } else {
                lVarP.e(-915303332);
                a(i10, pVar, qVar, pVar2, pVar3, o0Var, pVar4, lVarP, (i12 & 14) | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016));
            }
            lVarP.K();
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new g(i10, pVar, qVar, pVar2, pVar3, o0Var, pVar4, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(int i10, zd.p<? super t0.l, ? super Integer, md.i0> pVar, zd.q<? super h0.y, ? super t0.l, ? super Integer, md.i0> qVar, zd.p<? super t0.l, ? super Integer, md.i0> pVar2, zd.p<? super t0.l, ? super Integer, md.i0> pVar3, h0.o0 o0Var, zd.p<? super t0.l, ? super Integer, md.i0> pVar4, t0.l lVar, int i11) {
        int i12;
        int i13;
        t0.l lVarP = lVar.p(-2037614249);
        if ((i11 & 6) == 0) {
            i12 = (lVarP.h(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarP.k(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= lVarP.k(qVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarP.k(pVar2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= lVarP.k(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= lVarP.N(o0Var) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= lVarP.k(pVar4) ? 1048576 : 524288;
        }
        if ((i12 & 599187) == 599186 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(-2037614249, i12, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix (Scaffold.kt:177)");
            }
            lVarP.e(-273325894);
            boolean z10 = ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | ((i12 & 7168) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384) | ((i12 & 14) == 4) | ((3670016 & i12) == 1048576) | ((i12 & 896) == 256);
            Object objF = lVarP.f();
            if (z10 || objF == t0.l.f20813a.a()) {
                i13 = 1;
                objF = new h(pVar, pVar2, pVar3, i10, o0Var, pVar4, qVar);
                lVarP.E(objF);
            } else {
                i13 = 1;
            }
            lVarP.K();
            b1.a(null, (zd.p) objF, lVarP, 0, i13);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new i(i10, pVar, qVar, pVar2, pVar3, o0Var, pVar4, i11));
        }
    }

    public static final a2<q> i() {
        return f18645b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean j() {
        return ((Boolean) f18644a.getValue()).booleanValue();
    }
}
