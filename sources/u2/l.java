package u2;

import l1.j0;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final long b(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : j0.u(j10, j0.x(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(float f10, zd.a<Float> aVar) {
        return Float.isNaN(f10) ? aVar.invoke().floatValue() : f10;
    }
}
