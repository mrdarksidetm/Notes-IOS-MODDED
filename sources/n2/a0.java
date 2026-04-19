package n2;

import java.util.List;
import le.a2;
import le.k0;
import le.w2;
import n2.c1;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15748c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15749d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d0 f15750e = new d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final le.k0 f15751f = new c(le.k0.Q);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f15752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private le.n0 f15753b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    @sd.d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {153}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f15755b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l lVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f15755b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return new b(this.f15755b, dVar);
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f15754a;
            if (i10 == 0) {
                md.u.b(obj);
                l lVar = this.f15755b;
                this.f15754a = 1;
                if (lVar.i(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return md.i0.f15558a;
        }
    }

    public static final class c extends qd.a implements le.k0 {
        public c(k0.a aVar) {
            super(aVar);
        }

        @Override // le.k0
        public void o(qd.g gVar, Throwable th) {
        }
    }

    public a0(m mVar, qd.g gVar) {
        this.f15752a = mVar;
        this.f15753b = le.o0.a(f15751f.plus(r2.m.a()).plus(gVar).plus(w2.a((a2) gVar.get(a2.R))));
    }

    public /* synthetic */ a0(m mVar, qd.g gVar, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? new m() : mVar, (i10 & 2) != 0 ? qd.h.f19040a : gVar);
    }

    public c1 a(a1 a1Var, n0 n0Var, zd.l<? super c1.b, md.i0> lVar, zd.l<? super a1, ? extends Object> lVar2) {
        if (!(a1Var.c() instanceof z)) {
            return null;
        }
        md.s sVarB = b0.b(f15750e.a(((z) a1Var.c()).s(), a1Var.f(), a1Var.d()), a1Var, this.f15752a, n0Var, lVar2);
        List list = (List) sVarB.a();
        Object objB = sVarB.b();
        if (list == null) {
            return new c1.b(objB, false, 2, null);
        }
        l lVar3 = new l(list, objB, a1Var, this.f15752a, lVar, n0Var);
        le.k.d(this.f15753b, null, le.p0.UNDISPATCHED, new b(lVar3, null), 1, null);
        return new c1.a(lVar3);
    }
}
