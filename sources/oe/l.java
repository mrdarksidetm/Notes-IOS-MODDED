package oe;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zd.l<Object, Object> f16524a = b.f16527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zd.p<Object, Object, Boolean> f16525b = a.f16526a;

    static final class a extends ae.s implements zd.p<Object, Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16526a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(ae.r.b(obj, obj2));
        }
    }

    static final class b extends ae.s implements zd.l<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16527a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> e<T> a(e<? extends T> eVar) {
        return eVar instanceof f0 ? eVar : b(eVar, f16524a, f16525b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> e<T> b(e<? extends T> eVar, zd.l<? super T, ? extends Object> lVar, zd.p<Object, Object, Boolean> pVar) {
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            if (dVar.f16472b == lVar && dVar.f16473c == pVar) {
                return eVar;
            }
        }
        return new d(eVar, lVar, pVar);
    }
}
