package c0;

import c0.l0;
import c0.l0.a;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    static final class a extends ae.s implements zd.a<md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f6155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.a<T, V> f6156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f6157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0<T> f6158d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t10, l0.a<T, V> aVar, T t11, k0<T> k0Var) {
            super(0);
            this.f6155a = t10;
            this.f6156b = aVar;
            this.f6157c = t11;
            this.f6158d = k0Var;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (ae.r.b(this.f6155a, this.f6156b.c()) && ae.r.b(this.f6157c, this.f6156b.f())) {
                return;
            }
            this.f6156b.p(this.f6155a, this.f6157c, this.f6158d);
        }
    }

    static final class b extends ae.s implements zd.l<t0.j0, t0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f6159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.a<T, V> f6160b;

        public static final class a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0 f6161a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0.a f6162b;

            public a(l0 l0Var, l0.a aVar) {
                this.f6161a = l0Var;
                this.f6162b = aVar;
            }

            @Override // t0.i0
            public void dispose() {
                this.f6161a.j(this.f6162b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l0 l0Var, l0.a<T, V> aVar) {
            super(1);
            this.f6159a = l0Var;
            this.f6160b = aVar;
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
            this.f6159a.f(this.f6160b);
            return new a(this.f6159a, this.f6160b);
        }
    }

    public static final p3<Float> a(l0 l0Var, float f10, float f11, k0<Float> k0Var, String str, t0.l lVar, int i10, int i11) {
        lVar.e(-644770905);
        String str2 = (i11 & 8) != 0 ? "FloatAnimation" : str;
        if (t0.o.I()) {
            t0.o.U(-644770905, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i12 = i10 << 3;
        p3<Float> p3VarB = b(l0Var, Float.valueOf(f10), Float.valueOf(f11), l1.b(ae.l.f718a), k0Var, str2, lVar, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896) | (57344 & i12) | (i12 & 458752), 0);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return p3VarB;
    }

    public static final <T, V extends q> p3<T> b(l0 l0Var, T t10, T t11, j1<T, V> j1Var, k0<T> k0Var, String str, t0.l lVar, int i10, int i11) {
        lVar.e(-1062847727);
        String str2 = (i11 & 16) != 0 ? "ValueAnimation" : str;
        if (t0.o.I()) {
            t0.o.U(-1062847727, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        lVar.e(-492369756);
        Object objF = lVar.f();
        if (objF == t0.l.f20813a.a()) {
            objF = l0Var.new a(t10, t11, j1Var, k0Var, str2);
            lVar.E(objF);
        }
        lVar.K();
        l0.a aVar = (l0.a) objF;
        t0.l0.e(new a(t10, aVar, t11, k0Var), lVar, 0);
        t0.l0.b(aVar, new b(l0Var, aVar), lVar, 6);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return aVar;
    }

    public static final l0 c(String str, t0.l lVar, int i10, int i11) {
        lVar.e(1013651573);
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (t0.o.I()) {
            t0.o.U(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        lVar.e(-492369756);
        Object objF = lVar.f();
        if (objF == t0.l.f20813a.a()) {
            objF = new l0(str);
            lVar.E(objF);
        }
        lVar.K();
        l0 l0Var = (l0) objF;
        l0Var.k(lVar, 8);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return l0Var;
    }
}
