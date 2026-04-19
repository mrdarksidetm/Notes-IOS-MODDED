package oe;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qe.h0 f16601a = new qe.h0("NO_VALUE");

    public static final <T> r<T> a(int i10, int i11, ne.a aVar) {
        boolean z10 = true;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 <= 0 && i11 <= 0 && aVar != ne.a.SUSPEND) {
            z10 = false;
        }
        if (z10) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = a.e.API_PRIORITY_OTHER;
            }
            return new w(i10, i12, aVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
    }

    public static /* synthetic */ r b(int i10, int i11, ne.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = ne.a.SUSPEND;
        }
        return a(i10, i11, aVar);
    }

    public static final <T> e<T> e(v<? extends T> vVar, qd.g gVar, int i10, ne.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == ne.a.SUSPEND) ? vVar : new pe.h(vVar, gVar, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
