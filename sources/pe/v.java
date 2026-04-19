package pe;

import com.google.android.gms.common.api.a;
import oe.f0;

/* JADX INFO: loaded from: classes2.dex */
final class v extends oe.w<Integer> implements f0<Integer> {
    public v(int i10) {
        super(1, a.e.API_PRIORITY_OTHER, ne.a.DROP_OLDEST);
        i(Integer.valueOf(i10));
    }

    @Override // oe.f0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(N().intValue());
        }
        return numValueOf;
    }

    public final boolean b0(int i10) {
        boolean zI;
        synchronized (this) {
            zI = i(Integer.valueOf(N().intValue() + i10));
        }
        return zI;
    }
}
