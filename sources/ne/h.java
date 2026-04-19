package ne;

/* JADX INFO: loaded from: classes2.dex */
public final class h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f16193b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f16194c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16195a;

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f16196a;

        public a(Throwable th) {
            this.f16196a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ae.r.b(this.f16196a, ((a) obj).f16196a);
        }

        public int hashCode() {
            Throwable th = this.f16196a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // ne.h.c
        public String toString() {
            return "Closed(" + this.f16196a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return h.c(new a(th));
        }

        public final <E> Object b() {
            return h.c(h.f16194c);
        }

        public final <E> Object c(E e10) {
            return h.c(e10);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ h(Object obj) {
        this.f16195a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof h) && ae.r.b(obj, ((h) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f16196a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f16195a, obj);
    }

    public int hashCode() {
        return g(this.f16195a);
    }

    public final /* synthetic */ Object k() {
        return this.f16195a;
    }

    public String toString() {
        return j(this.f16195a);
    }
}
