package c1;

import ae.r;
import ae.s;
import d1.u;
import md.i0;
import t0.f3;
import t0.l0;
import t0.o;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f6258a = 36;

    static final class a extends s implements zd.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c<T> f6259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j<T, ? extends Object> f6260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f6261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f6263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object[] f6264f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar, j<T, ? extends Object> jVar, g gVar, String str, T t10, Object[] objArr) {
            super(0);
            this.f6259a = cVar;
            this.f6260b = jVar;
            this.f6261c = gVar;
            this.f6262d = str;
            this.f6263e = t10;
            this.f6264f = objArr;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f6259a.i(this.f6260b, this.f6261c, this.f6262d, this.f6263e, this.f6264f);
        }
    }

    public static final <T> T b(Object[] objArr, j<T, ? extends Object> jVar, String str, zd.a<? extends T> aVar, t0.l lVar, int i10, int i11) {
        Object objC;
        lVar.e(441892779);
        if ((i11 & 2) != 0) {
            jVar = k.b();
        }
        T tB = null;
        if ((i11 & 4) != 0) {
            str = null;
        }
        if (o.I()) {
            o.U(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int iA = t0.i.a(lVar, 0);
        if (str == null || str.length() == 0) {
            str = Integer.toString(iA, je.b.a(f6258a));
            r.e(str, "toString(this, checkRadix(radix))");
        }
        r.d(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        g gVar = (g) lVar.P(i.b());
        lVar.e(-492369756);
        Object objF = lVar.f();
        if (objF == t0.l.f20813a.a()) {
            if (gVar != null && (objC = gVar.c(str)) != null) {
                tB = jVar.b(objC);
            }
            objF = new c(jVar, gVar, str, tB == null ? aVar.invoke() : tB, objArr);
            lVar.E(objF);
        }
        lVar.K();
        c cVar = (c) objF;
        T tInvoke = (T) cVar.g(objArr);
        if (tInvoke == null) {
            tInvoke = aVar.invoke();
        }
        l0.e(new a(cVar, jVar, gVar, str, tInvoke, objArr), lVar, 0);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(g gVar, Object obj) {
        StringBuilder sb2;
        String str;
        String string;
        if (obj == null || gVar.a(obj)) {
            return;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (uVar.d() != f3.k() && uVar.d() != f3.q() && uVar.d() != f3.n()) {
                string = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                throw new IllegalArgumentException(string);
            }
            sb2 = new StringBuilder();
            sb2.append("MutableState containing ");
            sb2.append(uVar.getValue());
            str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
        } else {
            sb2 = new StringBuilder();
            sb2.append(obj);
            str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        sb2.append(str);
        string = sb2.toString();
        throw new IllegalArgumentException(string);
    }
}
