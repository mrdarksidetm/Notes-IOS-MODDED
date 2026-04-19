package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f3702b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile o f3704d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, w.e<?, ?>> f3706a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<?> f3703c = c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final o f3705e = new o(true);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f3707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3708b;

        a(Object obj, int i10) {
            this.f3707a = obj;
            this.f3708b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3707a == aVar.f3707a && this.f3708b == aVar.f3708b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f3707a) * 65535) + this.f3708b;
        }
    }

    o() {
        this.f3706a = new HashMap();
    }

    o(boolean z10) {
        this.f3706a = Collections.emptyMap();
    }

    public static o b() {
        o oVarA = f3704d;
        if (oVarA == null) {
            synchronized (o.class) {
                oVarA = f3704d;
                if (oVarA == null) {
                    oVarA = f3702b ? n.a() : f3705e;
                    f3704d = oVarA;
                }
            }
        }
        return oVarA;
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public <ContainingType extends n0> w.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (w.e) this.f3706a.get(new a(containingtype, i10));
    }
}
