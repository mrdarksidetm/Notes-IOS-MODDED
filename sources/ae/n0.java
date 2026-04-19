package ae;

import be.e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class n0 {
    public static Collection a(Object obj) {
        if ((obj instanceof be.a) && !(obj instanceof be.b)) {
            p(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof be.a) && !(obj instanceof be.c)) {
            p(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof be.a) && !(obj instanceof be.d)) {
            p(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof be.a) && !(obj instanceof be.e)) {
            p(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i10) {
        if (obj != null && !k(obj, i10)) {
            p(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof n) {
            return ((n) obj).getArity();
        }
        if (obj instanceof zd.a) {
            return 0;
        }
        if (obj instanceof zd.l) {
            return 1;
        }
        if (obj instanceof zd.p) {
            return 2;
        }
        if (obj instanceof zd.q) {
            return 3;
        }
        if (obj instanceof zd.r) {
            return 4;
        }
        if (obj instanceof zd.s) {
            return 5;
        }
        if (obj instanceof zd.t) {
            return 6;
        }
        if (obj instanceof zd.u) {
            return 7;
        }
        if (obj instanceof zd.v) {
            return 8;
        }
        if (obj instanceof zd.w) {
            return 9;
        }
        if (obj instanceof zd.b) {
            return 10;
        }
        if (obj instanceof zd.c) {
            return 11;
        }
        if (obj instanceof zd.d) {
            return 12;
        }
        if (obj instanceof zd.e) {
            return 13;
        }
        if (obj instanceof zd.f) {
            return 14;
        }
        if (obj instanceof zd.g) {
            return 15;
        }
        if (obj instanceof zd.h) {
            return 16;
        }
        if (obj instanceof zd.i) {
            return 17;
        }
        if (obj instanceof zd.j) {
            return 18;
        }
        if (obj instanceof zd.k) {
            return 19;
        }
        if (obj instanceof zd.m) {
            return 20;
        }
        if (obj instanceof zd.n) {
            return 21;
        }
        return obj instanceof zd.o ? 22 : -1;
    }

    public static boolean k(Object obj, int i10) {
        return (obj instanceof md.g) && j(obj) == i10;
    }

    public static boolean l(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof be.a) || (obj instanceof e.a));
    }

    public static boolean m(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof be.a) || (obj instanceof be.f));
    }

    private static <T extends Throwable> T n(T t10) {
        return (T) r.l(t10, n0.class.getName());
    }

    public static ClassCastException o(ClassCastException classCastException) {
        throw ((ClassCastException) n(classCastException));
    }

    public static void p(Object obj, String str) {
        q((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void q(String str) {
        throw o(new ClassCastException(str));
    }
}
