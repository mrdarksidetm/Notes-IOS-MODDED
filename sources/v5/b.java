package v5;

import ae.r;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f22040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f22041b;

    public b(PointF pointF, PointF pointF2) {
        r.f(pointF, "fromPoint");
        r.f(pointF2, "toPoint");
        this.f22040a = pointF;
        this.f22041b = pointF2;
    }

    public final PointF a() {
        return this.f22040a;
    }

    public final PointF b() {
        return this.f22041b;
    }
}
