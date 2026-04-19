package sd;

import ae.r;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final void a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    private static final d b(kotlin.coroutines.jvm.internal.a aVar) {
        return (d) aVar.getClass().getAnnotation(d.class);
    }

    private static final int c(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(kotlin.coroutines.jvm.internal.a aVar) {
        String strC;
        r.f(aVar, "<this>");
        d dVarB = b(aVar);
        if (dVarB == null) {
            return null;
        }
        a(1, dVarB.v());
        int iC = c(aVar);
        int i10 = iC < 0 ? -1 : dVarB.l()[iC];
        String strB = g.f20523a.b(aVar);
        if (strB == null) {
            strC = dVarB.c();
        } else {
            strC = strB + '/' + dVarB.c();
        }
        return new StackTraceElement(strC, dVarB.m(), dVarB.f(), i10);
    }
}
