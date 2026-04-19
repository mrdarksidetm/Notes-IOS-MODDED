package f;

import ae.s;
import e.q;
import e.r;
import e.u;
import md.i0;
import o4.e;
import t0.f3;
import t0.j0;
import t0.l;
import t0.l0;
import t0.o2;
import t0.p3;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f.a$a, reason: collision with other inner class name */
    static final class C0264a extends s implements zd.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f11005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11006b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0264a(d dVar, boolean z10) {
            super(0);
            this.f11005a = dVar;
            this.f11006b = z10;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f11005a.j(this.f11006b);
        }
    }

    static final class b extends s implements l<j0, t0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f11007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f11008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f11009c;

        /* JADX INFO: renamed from: f.a$b$a, reason: collision with other inner class name */
        public static final class C0265a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f11010a;

            public C0265a(d dVar) {
                this.f11010a = dVar;
            }

            @Override // t0.i0
            public void dispose() {
                this.f11010a.h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar, e eVar, d dVar) {
            super(1);
            this.f11007a = rVar;
            this.f11008b = eVar;
            this.f11009c = dVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0.i0 invoke(j0 j0Var) {
            this.f11007a.i(this.f11008b, this.f11009c);
            return new C0265a(this.f11009c);
        }
    }

    static final class c extends s implements p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.a<i0> f11012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11014d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, zd.a<i0> aVar, int i10, int i11) {
            super(2);
            this.f11011a = z10;
            this.f11012b = aVar;
            this.f11013c = i10;
            this.f11014d = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            a.a(this.f11011a, this.f11012b, lVar, this.f11013c | 1, this.f11014d);
        }
    }

    public static final class d extends q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p3<zd.a<i0>> f11015d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, p3<? extends zd.a<i0>> p3Var) {
            super(z10);
            this.f11015d = p3Var;
        }

        @Override // e.q
        public void d() {
            a.b(this.f11015d).invoke();
        }
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
    public static final void a(boolean z10, zd.a<i0> aVar, t0.l lVar, int i10, int i11) {
        int i12;
        t0.l lVarP = lVar.p(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (lVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= lVarP.N(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            p3 p3VarO = f3.o(aVar, lVarP, (i12 >> 3) & 14);
            lVarP.e(-971159753);
            Object objF = lVarP.f();
            l.a aVar2 = t0.l.f20813a;
            if (objF == aVar2.a()) {
                objF = new d(z10, p3VarO);
                lVarP.E(objF);
            }
            d dVar = (d) objF;
            lVarP.K();
            lVarP.e(-971159481);
            boolean zN = lVarP.N(dVar) | lVarP.c(z10);
            Object objF2 = lVarP.f();
            if (zN || objF2 == aVar2.a()) {
                objF2 = new C0264a(dVar, z10);
                lVarP.E(objF2);
            }
            lVarP.K();
            l0.e((zd.a) objF2, lVarP, 0);
            u uVarA = f.c.f11017a.a(lVarP, 6);
            if (uVarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            r onBackPressedDispatcher = uVarA.getOnBackPressedDispatcher();
            e eVar = (e) lVarP.P(androidx.compose.ui.platform.r.i());
            lVarP.e(-971159120);
            boolean zN2 = lVarP.N(onBackPressedDispatcher) | lVarP.N(eVar) | lVarP.N(dVar);
            Object objF3 = lVarP.f();
            if (zN2 || objF3 == aVar2.a()) {
                objF3 = new b(onBackPressedDispatcher, eVar, dVar);
                lVarP.E(objF3);
            }
            lVarP.K();
            l0.a(eVar, onBackPressedDispatcher, (zd.l) objF3, lVarP, 0);
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new c(z10, aVar, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zd.a<i0> b(p3<? extends zd.a<i0>> p3Var) {
        return p3Var.getValue();
    }
}
