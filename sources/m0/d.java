package m0;

import ae.s;
import java.util.List;
import md.i0;
import y1.d0;
import y1.e0;
import y1.f0;
import y1.g0;
import y1.t0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class d implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f15176a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l<t0.a, i0> f15177b = a.f15178a;

    static final class a extends s implements l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15178a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
        }
    }

    private d() {
    }

    @Override // y1.e0
    public f0 a(g0 g0Var, List<? extends d0> list, long j10) {
        return g0.z0(g0Var, w2.b.n(j10), w2.b.m(j10), null, f15177b, 4, null);
    }
}
