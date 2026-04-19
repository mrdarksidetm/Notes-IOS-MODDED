package c0;

import c0.f1;
import c0.f1.a;
import c0.f1.d;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.l;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    static final class a extends ae.s implements zd.l<t0.j0, t0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<S> f6045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1<T> f6046b;

        /* JADX INFO: renamed from: c0.g1$a$a, reason: collision with other inner class name */
        public static final class C0146a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1 f6047a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f1 f6048b;

            public C0146a(f1 f1Var, f1 f1Var2) {
                this.f6047a = f1Var;
                this.f6048b = f1Var2;
            }

            @Override // t0.i0
            public void dispose() {
                this.f6047a.y(this.f6048b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f1<S> f1Var, f1<T> f1Var2) {
            super(1);
            this.f6045a = f1Var;
            this.f6046b = f1Var2;
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
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0.i0 invoke(t0.j0 j0Var) {
            this.f6045a.e(this.f6046b);
            return new C0146a(this.f6045a, this.f6046b);
        }
    }

    static final class b extends ae.s implements zd.l<t0.j0, t0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<S> f6049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1<S>.a<T, V> f6050b;

        public static final class a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1 f6051a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f1.a f6052b;

            public a(f1 f1Var, f1.a aVar) {
                this.f6051a = f1Var;
                this.f6052b = aVar;
            }

            @Override // t0.i0
            public void dispose() {
                this.f6051a.w(this.f6052b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f1<S> f1Var, f1<S>.a<T, V> aVar) {
            super(1);
            this.f6049a = f1Var;
            this.f6050b = aVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0.i0 invoke(t0.j0 j0Var) {
            return new a(this.f6049a, this.f6050b);
        }
    }

    static final class c extends ae.s implements zd.l<t0.j0, t0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<S> f6053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1<S>.d<T, V> f6054b;

        public static final class a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1 f6055a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f1.d f6056b;

            public a(f1 f1Var, f1.d dVar) {
                this.f6055a = f1Var;
                this.f6056b = dVar;
            }

            @Override // t0.i0
            public void dispose() {
                this.f6055a.x(this.f6056b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f1<S> f1Var, f1<S>.d<T, V> dVar) {
            super(1);
            this.f6053a = f1Var;
            this.f6054b = dVar;
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
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0.i0 invoke(t0.j0 j0Var) {
            this.f6053a.d(this.f6054b);
            return new a(this.f6053a, this.f6054b);
        }
    }

    static final class d extends ae.s implements zd.l<t0.j0, t0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<T> f6057a;

        public static final class a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1 f6058a;

            public a(f1 f1Var) {
                this.f6058a = f1Var;
            }

            @Override // t0.i0
            public void dispose() {
                this.f6058a.u();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f1<T> f1Var) {
            super(1);
            this.f6057a = f1Var;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0.i0 invoke(t0.j0 j0Var) {
            return new a(this.f6057a);
        }
    }

    static final class e extends ae.s implements zd.l<t0.j0, t0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1<T> f6059a;

        public static final class a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1 f6060a;

            public a(f1 f1Var) {
                this.f6060a = f1Var;
            }

            @Override // t0.i0
            public void dispose() {
                this.f6060a.u();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f1<T> f1Var) {
            super(1);
            this.f6059a = f1Var;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0.i0 invoke(t0.j0 j0Var) {
            return new a(this.f6059a);
        }
    }

    public static final <S, T> f1<T> a(f1<S> f1Var, T t10, T t11, String str, t0.l lVar, int i10) {
        lVar.e(-198307638);
        if (t0.o.I()) {
            t0.o.U(-198307638, i10, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1022)");
        }
        lVar.e(1157296644);
        boolean zN = lVar.N(f1Var);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = new f1(new r0(t10), f1Var.i() + " > " + str);
            lVar.E(objF);
        }
        lVar.K();
        f1<T> f1Var2 = (f1) objF;
        lVar.e(1951131101);
        boolean zN2 = lVar.N(f1Var) | lVar.N(f1Var2);
        Object objF2 = lVar.f();
        if (zN2 || objF2 == t0.l.f20813a.a()) {
            objF2 = new a(f1Var, f1Var2);
            lVar.E(objF2);
        }
        lVar.K();
        t0.l0.b(f1Var2, (zd.l) objF2, lVar, 0);
        if (f1Var.r()) {
            f1Var2.z(t10, t11, f1Var.j());
        } else {
            f1Var2.G(t11, lVar, ((i10 >> 3) & 8) | ((i10 >> 6) & 14));
            f1Var2.B(false);
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return f1Var2;
    }

    public static final <S, T, V extends q> f1<S>.a<T, V> b(f1<S> f1Var, j1<T, V> j1Var, String str, t0.l lVar, int i10, int i11) {
        lVar.e(-1714122528);
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (t0.o.I()) {
            t0.o.U(-1714122528, i10, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:976)");
        }
        lVar.e(1157296644);
        boolean zN = lVar.N(f1Var);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = f1Var.new a(j1Var, str);
            lVar.E(objF);
        }
        lVar.K();
        f1<S>.a<T, V> aVar = (f1.a) objF;
        t0.l0.b(aVar, new b(f1Var, aVar), lVar, 0);
        if (f1Var.r()) {
            aVar.d();
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return aVar;
    }

    public static final <S, T, V extends q> p3<T> c(f1<S> f1Var, T t10, T t11, e0<T> e0Var, j1<T, V> j1Var, String str, t0.l lVar, int i10) {
        lVar.e(-304821198);
        if (t0.o.I()) {
            t0.o.U(-304821198, i10, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1097)");
        }
        lVar.e(1157296644);
        boolean zN = lVar.N(f1Var);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = f1Var.new d(t10, l.e(j1Var, t11), j1Var, str);
            lVar.E(objF);
        }
        lVar.K();
        f1.d dVar = (f1.d) objF;
        if (f1Var.r()) {
            dVar.F(t10, t11, e0Var);
        } else {
            dVar.G(t11, e0Var);
        }
        lVar.e(1951134899);
        boolean zN2 = lVar.N(f1Var) | lVar.N(dVar);
        Object objF2 = lVar.f();
        if (zN2 || objF2 == t0.l.f20813a.a()) {
            objF2 = new c(f1Var, dVar);
            lVar.E(objF2);
        }
        lVar.K();
        t0.l0.b(dVar, (zd.l) objF2, lVar, 0);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return dVar;
    }

    public static final <T> f1<T> d(h1<T> h1Var, String str, t0.l lVar, int i10, int i11) {
        lVar.e(1643203617);
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (t0.o.I()) {
            t0.o.U(1643203617, i10, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:316)");
        }
        lVar.e(1157296644);
        boolean zN = lVar.N(h1Var);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = new f1((h1) h1Var, str);
            lVar.E(objF);
        }
        lVar.K();
        f1<T> f1Var = (f1) objF;
        f1Var.f(h1Var.b(), lVar, 0);
        lVar.e(1951103416);
        boolean zN2 = lVar.N(f1Var);
        Object objF2 = lVar.f();
        if (zN2 || objF2 == t0.l.f20813a.a()) {
            objF2 = new d(f1Var);
            lVar.E(objF2);
        }
        lVar.K();
        t0.l0.b(f1Var, (zd.l) objF2, lVar, 0);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return f1Var;
    }

    public static final <T> f1<T> e(r0<T> r0Var, String str, t0.l lVar, int i10, int i11) {
        lVar.e(882913843);
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (t0.o.I()) {
            t0.o.U(882913843, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:355)");
        }
        f1<T> f1VarD = d(r0Var, str, lVar, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i10 & 14), 0);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return f1VarD;
    }

    public static final <T> f1<T> f(T t10, String str, t0.l lVar, int i10, int i11) {
        lVar.e(2029166765);
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (t0.o.I()) {
            t0.o.U(2029166765, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:73)");
        }
        lVar.e(-492369756);
        Object objF = lVar.f();
        l.a aVar = t0.l.f20813a;
        if (objF == aVar.a()) {
            objF = new f1(t10, str);
            lVar.E(objF);
        }
        lVar.K();
        f1<T> f1Var = (f1) objF;
        f1Var.f(t10, lVar, (i10 & 8) | 48 | (i10 & 14));
        lVar.e(1951093734);
        boolean zN = lVar.N(f1Var);
        Object objF2 = lVar.f();
        if (zN || objF2 == aVar.a()) {
            objF2 = new e(f1Var);
            lVar.E(objF2);
        }
        lVar.K();
        t0.l0.b(f1Var, (zd.l) objF2, lVar, 6);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return f1Var;
    }
}
