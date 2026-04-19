package w8;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f22644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f22645b;

        /* synthetic */ a(Object obj, o0 o0Var) {
            m.k(obj);
            this.f22645b = obj;
            this.f22644a = new ArrayList();
        }

        public a a(String str, Object obj) {
            m.k(str);
            this.f22644a.add(str + com.amazon.a.a.o.b.f.f7479b + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f22645b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f22644a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f22644a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a d(Object obj) {
        return new a(obj, null);
    }
}
