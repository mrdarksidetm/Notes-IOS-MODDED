package z;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f24070a = new Object();

    public static final <E> E c(d0<E> d0Var, int i10) {
        E e10;
        ae.r.f(d0Var, "<this>");
        int iA = a0.a.a(d0Var.f24064b, d0Var.f24066d, i10);
        if (iA < 0 || (e10 = (E) d0Var.f24065c[iA]) == f24070a) {
            return null;
        }
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void d(d0<E> d0Var) {
        int i10 = d0Var.f24066d;
        int[] iArr = d0Var.f24064b;
        Object[] objArr = d0Var.f24065c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f24070a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        d0Var.f24063a = false;
        d0Var.f24066d = i11;
    }
}
