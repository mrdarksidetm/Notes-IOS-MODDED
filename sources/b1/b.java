package b1;

import ae.n0;
import ae.r;
import ae.s;
import java.util.ArrayList;
import java.util.List;
import md.i0;
import t0.c2;
import t0.e2;
import t0.l;
import t0.o2;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes.dex */
public final class b implements b1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f5157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c2 f5158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<c2> f5159e;

    static final class a extends s implements p<l, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f5161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5162c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, int i10) {
            super(2);
            this.f5161b = obj;
            this.f5162c = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            b.this.b(this.f5161b, lVar, e2.a(this.f5162c) | 1);
        }
    }

    /* JADX INFO: renamed from: b1.b$b, reason: collision with other inner class name */
    static final class C0123b extends s implements p<l, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f5164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f5165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5166d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0123b(Object obj, Object obj2, int i10) {
            super(2);
            this.f5164b = obj;
            this.f5165c = obj2;
            this.f5166d = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            b.this.a(this.f5164b, this.f5165c, lVar, e2.a(this.f5166d) | 1);
        }
    }

    public b(int i10, boolean z10, Object obj) {
        this.f5155a = i10;
        this.f5156b = z10;
        this.f5157c = obj;
    }

    private final void d(l lVar) {
        c2 c2VarB;
        if (!this.f5156b || (c2VarB = lVar.b()) == null) {
            return;
        }
        lVar.m(c2VarB);
        if (c.e(this.f5158d, c2VarB)) {
            this.f5158d = c2VarB;
            return;
        }
        List arrayList = this.f5159e;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f5159e = arrayList;
        } else {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (c.e((c2) arrayList.get(i10), c2VarB)) {
                    arrayList.set(i10, c2VarB);
                    return;
                }
            }
        }
        arrayList.add(c2VarB);
    }

    private final void e() {
        if (this.f5156b) {
            c2 c2Var = this.f5158d;
            if (c2Var != null) {
                c2Var.invalidate();
                this.f5158d = null;
            }
            List<c2> list = this.f5159e;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    public Object a(Object obj, Object obj2, l lVar, int i10) {
        l lVarP = lVar.p(this.f5155a);
        d(lVarP);
        int iD = lVarP.N(this) ? c.d(2) : c.f(2);
        Object obj3 = this.f5157c;
        r.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((zd.r) n0.e(obj3, 4)).invoke(obj, obj2, lVarP, Integer.valueOf(iD | i10));
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new C0123b(obj, obj2, i10));
        }
        return objInvoke;
    }

    public Object b(Object obj, l lVar, int i10) {
        l lVarP = lVar.p(this.f5155a);
        d(lVarP);
        int iD = lVarP.N(this) ? c.d(1) : c.f(1);
        Object obj2 = this.f5157c;
        r.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((q) n0.e(obj2, 3)).invoke(obj, lVarP, Integer.valueOf(iD | i10));
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new a(obj, i10));
        }
        return objInvoke;
    }

    public Object c(l lVar, int i10) {
        l lVarP = lVar.p(this.f5155a);
        d(lVarP);
        int iD = i10 | (lVarP.N(this) ? c.d(0) : c.f(0));
        Object obj = this.f5157c;
        r.d(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((p) n0.e(obj, 2)).invoke(lVarP, Integer.valueOf(iD));
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            r.d(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            o2VarV.a((p) n0.e(this, 2));
        }
        return objInvoke;
    }

    public final void f(Object obj) {
        if (r.b(this.f5157c, obj)) {
            return;
        }
        boolean z10 = this.f5157c == null;
        this.f5157c = obj;
        if (z10) {
            return;
        }
        e();
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ Object invoke(l lVar, Integer num) {
        return c(lVar, num.intValue());
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, l lVar, Integer num) {
        return b(obj, lVar, num.intValue());
    }

    @Override // zd.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, l lVar, Integer num) {
        return a(obj, obj2, lVar, num.intValue());
    }
}
