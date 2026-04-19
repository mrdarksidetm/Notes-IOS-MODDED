package oe;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f16506a;

        public a(Object obj) {
            this.f16506a = obj;
        }

        @Override // oe.e
        public Object a(f<? super T> fVar, qd.d<? super md.i0> dVar) {
            Object objB = fVar.b((Object) this.f16506a, dVar);
            return objB == rd.d.e() ? objB : md.i0.f15558a;
        }
    }

    public static final <T> e<T> a(zd.p<? super ne.r<? super T>, ? super qd.d<? super md.i0>, ? extends Object> pVar) {
        return new b(pVar, null, 0, null, 14, null);
    }

    public static final <T> e<T> b(zd.p<? super f<? super T>, ? super qd.d<? super md.i0>, ? extends Object> pVar) {
        return new u(pVar);
    }

    public static final <T> e<T> c(T t10) {
        return new a(t10);
    }
}
