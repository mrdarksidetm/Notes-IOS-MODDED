package b2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public static final String a(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        ae.m0 m0Var = ae.m0.f720a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        ae.r.e(str2, "format(format, *args)");
        sb2.append(str2);
        return sb2.toString();
    }
}
