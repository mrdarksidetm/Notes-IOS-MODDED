package md;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15576b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15577a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f15578a;

        public b(Throwable th) {
            ae.r.f(th, "exception");
            this.f15578a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && ae.r.b(this.f15578a, ((b) obj).f15578a);
        }

        public int hashCode() {
            return this.f15578a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f15578a + ')';
        }
    }

    private /* synthetic */ t(Object obj) {
        this.f15577a = obj;
    }

    public static final /* synthetic */ t a(Object obj) {
        return new t(obj);
    }

    public static <T> Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof t) && ae.r.b(obj, ((t) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return ae.r.b(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f15578a;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f15577a, obj);
    }

    public int hashCode() {
        return f(this.f15577a);
    }

    public final /* synthetic */ Object j() {
        return this.f15577a;
    }

    public String toString() {
        return i(this.f15577a);
    }
}
