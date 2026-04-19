package t0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    static final class a extends ae.s implements zd.p<l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b2<?>[] f20992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<l, Integer, md.i0> f20993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20994c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b2<?>[] b2VarArr, zd.p<? super l, ? super Integer, md.i0> pVar, int i10) {
            super(2);
            this.f20992a = b2VarArr;
            this.f20993b = pVar;
            this.f20994c = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            b2<?>[] b2VarArr = this.f20992a;
            v.b((b2[]) Arrays.copyOf(b2VarArr, b2VarArr.length), this.f20993b, lVar, e2.a(this.f20994c | 1));
        }
    }

    static final class b extends ae.s implements zd.p<l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b2<?> f20995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<l, Integer, md.i0> f20996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b2<?> b2Var, zd.p<? super l, ? super Integer, md.i0> pVar, int i10) {
            super(2);
            this.f20995a = b2Var;
            this.f20996b = pVar;
            this.f20997c = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            v.a(this.f20995a, this.f20996b, lVar, e2.a(this.f20997c | 1));
        }
    }

    public static final void a(b2<?> b2Var, zd.p<? super l, ? super Integer, md.i0> pVar, l lVar, int i10) {
        l lVarP = lVar.p(-1350970552);
        if (o.I()) {
            o.U(-1350970552, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:245)");
        }
        lVarP.y(b2Var);
        pVar.invoke(lVarP, Integer.valueOf((i10 >> 3) & 14));
        lVarP.J();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new b(b2Var, pVar, i10));
        }
    }

    public static final void b(b2<?>[] b2VarArr, zd.p<? super l, ? super Integer, md.i0> pVar, l lVar, int i10) {
        l lVarP = lVar.p(-1390796515);
        if (o.I()) {
            o.U(-1390796515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        lVarP.F(b2VarArr);
        pVar.invoke(lVarP, Integer.valueOf((i10 >> 3) & 14));
        lVarP.A();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new a(b2VarArr, pVar, i10));
        }
    }

    public static final <T> a2<T> c(e3<T> e3Var, zd.a<? extends T> aVar) {
        return new k0(e3Var, aVar);
    }

    public static /* synthetic */ a2 d(e3 e3Var, zd.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e3Var = f3.q();
        }
        return c(e3Var, aVar);
    }

    public static final <T> a2<T> e(zd.a<? extends T> aVar) {
        return new q3(aVar);
    }
}
