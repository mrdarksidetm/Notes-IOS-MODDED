package b0;

import a2.g;
import androidx.compose.ui.e;
import c0.e0;
import c0.f1;
import c0.g1;
import c0.j1;
import c0.l1;
import md.i0;
import t0.e2;
import t0.p3;
import t0.q2;
import t0.u3;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    static final class a extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f5109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0<Float> f5111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f5112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.q<T, t0.l, Integer, i0> f5113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5115g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(T t10, androidx.compose.ui.e eVar, e0<Float> e0Var, String str, zd.q<? super T, ? super t0.l, ? super Integer, i0> qVar, int i10, int i11) {
            super(2);
            this.f5109a = t10;
            this.f5110b = eVar;
            this.f5111c = e0Var;
            this.f5112d = str;
            this.f5113e = qVar;
            this.f5114f = i10;
            this.f5115g = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            k.b(this.f5109a, this.f5110b, this.f5111c, this.f5112d, this.f5113e, lVar, e2.a(this.f5114f | 1), this.f5115g);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class b<T> extends ae.s implements zd.l<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5116a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        public final T invoke(T t10) {
            return t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class c<T> extends ae.s implements zd.l<T, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<T> f5117a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f1<T> f1Var) {
            super(1);
            this.f5117a = f1Var;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t10) {
            return Boolean.valueOf(!ae.r.b(t10, this.f5117a.n()));
        }
    }

    static final class d extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<T> f5118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0<Float> f5119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f5120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.q<T, t0.l, Integer, i0> f5121d;

        static final class a extends ae.s implements zd.l<androidx.compose.ui.graphics.d, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p3<Float> f5122a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p3<Float> p3Var) {
                super(1);
                this.f5122a = p3Var;
            }

            public final void a(androidx.compose.ui.graphics.d dVar) {
                dVar.b(d.b(this.f5122a));
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(androidx.compose.ui.graphics.d dVar) {
                a(dVar);
                return i0.f15558a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        static final class b<T> extends ae.s implements zd.q<f1.b<T>, t0.l, Integer, e0<Float>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e0<Float> f5123a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e0<Float> e0Var) {
                super(3);
                this.f5123a = e0Var;
            }

            public final e0<Float> a(f1.b<T> bVar, t0.l lVar, int i10) {
                lVar.e(438406499);
                if (t0.o.I()) {
                    t0.o.U(438406499, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
                }
                e0<Float> e0Var = this.f5123a;
                if (t0.o.I()) {
                    t0.o.T();
                }
                lVar.K();
                return e0Var;
            }

            @Override // zd.q
            public /* bridge */ /* synthetic */ e0<Float> invoke(Object obj, t0.l lVar, Integer num) {
                return a((f1.b) obj, lVar, num.intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(f1<T> f1Var, e0<Float> e0Var, T t10, zd.q<? super T, ? super t0.l, ? super Integer, i0> qVar) {
            super(2);
            this.f5118a = f1Var;
            this.f5119b = e0Var;
            this.f5120c = t10;
            this.f5121d = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float b(p3<Float> p3Var) {
            return p3Var.getValue().floatValue();
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

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
        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (t0.o.I()) {
                t0.o.U(-1426421288, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:128)");
            }
            f1<T> f1Var = this.f5118a;
            b bVar = new b(this.f5119b);
            T t10 = this.f5120c;
            lVar.e(-1338768149);
            j1<Float, c0.m> j1VarB = l1.b(ae.l.f718a);
            lVar.e(-142660079);
            Object objH = f1Var.h();
            lVar.e(-438678252);
            if (t0.o.I()) {
                t0.o.U(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
            }
            float f10 = ae.r.b(objH, t10) ? 1.0f : 0.0f;
            if (t0.o.I()) {
                t0.o.T();
            }
            lVar.K();
            Float fValueOf = Float.valueOf(f10);
            Object objN = f1Var.n();
            lVar.e(-438678252);
            if (t0.o.I()) {
                t0.o.U(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
            }
            float f11 = ae.r.b(objN, t10) ? 1.0f : 0.0f;
            if (t0.o.I()) {
                t0.o.T();
            }
            lVar.K();
            p3 p3VarC = g1.c(f1Var, fValueOf, Float.valueOf(f11), bVar.invoke(f1Var.l(), lVar, 0), j1VarB, "FloatAnimation", lVar, 0);
            lVar.K();
            lVar.K();
            e.a aVar = androidx.compose.ui.e.f2662a;
            lVar.e(-928915735);
            boolean zN = lVar.N(p3VarC);
            Object objF = lVar.f();
            if (zN || objF == t0.l.f20813a.a()) {
                objF = new a(p3VarC);
                lVar.E(objF);
            }
            lVar.K();
            androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.c.a(aVar, (zd.l) objF);
            zd.q<T, t0.l, Integer, i0> qVar = this.f5121d;
            T t11 = this.f5120c;
            lVar.e(733328855);
            y1.e0 e0VarG = androidx.compose.foundation.layout.d.g(f1.b.f11020a.o(), false, lVar, 0);
            lVar.e(-1323940314);
            int iA = t0.i.a(lVar, 0);
            t0.w wVarB = lVar.B();
            g.a aVar2 = a2.g.J;
            zd.a<a2.g> aVarA = aVar2.a();
            zd.q<q2<a2.g>, t0.l, Integer, i0> qVarA = y1.u.a(eVarA);
            if (!(lVar.t() instanceof t0.e)) {
                t0.i.b();
            }
            lVar.r();
            if (lVar.l()) {
                lVar.O(aVarA);
            } else {
                lVar.D();
            }
            t0.l lVarA = u3.a(lVar);
            u3.b(lVarA, e0VarG, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            zd.p<a2.g, Integer, i0> pVarB = aVar2.b();
            if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f2502a;
            qVar.invoke(t11, lVar, 0);
            lVar.K();
            lVar.L();
            lVar.K();
            lVar.K();
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    static final class e extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<T> f5124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0<Float> f5126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.l<T, Object> f5127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.q<T, t0.l, Integer, i0> f5128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5130g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(f1<T> f1Var, androidx.compose.ui.e eVar, e0<Float> e0Var, zd.l<? super T, ? extends Object> lVar, zd.q<? super T, ? super t0.l, ? super Integer, i0> qVar, int i10, int i11) {
            super(2);
            this.f5124a = f1Var;
            this.f5125b = eVar;
            this.f5126c = e0Var;
            this.f5127d = lVar;
            this.f5128e = qVar;
            this.f5129f = i10;
            this.f5130g = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            k.a(this.f5124a, this.f5125b, this.f5126c, this.f5127d, this.f5128e, lVar, e2.a(this.f5129f | 1), this.f5130g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void a(c0.f1<T> r16, androidx.compose.ui.e r17, c0.e0<java.lang.Float> r18, zd.l<? super T, ? extends java.lang.Object> r19, zd.q<? super T, ? super t0.l, ? super java.lang.Integer, md.i0> r20, t0.l r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.k.a(c0.f1, androidx.compose.ui.e, c0.e0, zd.l, zd.q, t0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void b(T r17, androidx.compose.ui.e r18, c0.e0<java.lang.Float> r19, java.lang.String r20, zd.q<? super T, ? super t0.l, ? super java.lang.Integer, md.i0> r21, t0.l r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.k.b(java.lang.Object, androidx.compose.ui.e, c0.e0, java.lang.String, zd.q, t0.l, int, int):void");
    }
}
