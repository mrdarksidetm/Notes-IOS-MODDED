package c0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<h0> f6168a;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        a(q qVar, float f10, float f11) {
            ge.i iVarT = ge.o.t(0, qVar.b());
            ArrayList arrayList = new ArrayList(nd.v.x(iVarT, 10));
            Iterator<Integer> it = iVarT.iterator();
            while (it.hasNext()) {
                arrayList.add(new h0(f10, f11, qVar.a(((nd.l0) it).nextInt())));
            }
            this.f6168a = arrayList;
        }

        @Override // c0.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 get(int i10) {
            return this.f6168a.get(i10);
        }
    }

    public static final class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h0 f6169a;

        b(float f10, float f11) {
            this.f6169a = new h0(f10, f11, 0.0f, 4, null);
        }

        @Override // c0.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 get(int i10) {
            return this.f6169a;
        }
    }

    public static final long b(p1<?> p1Var, long j10) {
        return ge.o.m(j10 - ((long) p1Var.e()), 0L, p1Var.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends q> s c(V v10, float f10, float f11) {
        return v10 != null ? new a(v10, f10, f11) : new b(f10, f11);
    }

    public static final <V extends q> V d(m1<V> m1Var, long j10, V v10, V v11, V v12) {
        return (V) m1Var.d(j10 * 1000000, v10, v11, v12);
    }
}
