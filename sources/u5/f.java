package u5;

import ae.r;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final float a(PointF pointF, PointF pointF2) {
        r.f(pointF, "<this>");
        r.f(pointF2, "point");
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF2.x - pointF.x, d10)) + ((float) Math.pow(pointF2.y - pointF.y, d10)));
    }

    public static final PointF b(PointF pointF, float f10, float f11) {
        r.f(pointF, "<this>");
        return new PointF(pointF.x + f10, pointF.y + f11);
    }

    public static final v5.c c(v5.c cVar, double d10, double d11) {
        r.f(cVar, "<this>");
        return new v5.c(cVar.a() + d10, cVar.b() + d11);
    }

    public static final PointF d(PointF pointF, float f10) {
        r.f(pointF, "<this>");
        return new PointF(pointF.x * f10, f10 * pointF.y);
    }

    public static final PointF e(v5.c cVar) {
        r.f(cVar, "<this>");
        return new PointF((float) cVar.a(), (float) cVar.b());
    }
}
