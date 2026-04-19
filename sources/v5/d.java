package v5;

import ae.r;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.Map;
import md.x;
import nd.r0;
import u5.f;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f22044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f22045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f22046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f22047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<t5.a, PointF> f22048e;

    public d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        r.f(pointF, "topLeftCorner");
        r.f(pointF2, "topRightCorner");
        r.f(pointF3, "bottomRightCorner");
        r.f(pointF4, "bottomLeftCorner");
        this.f22044a = pointF;
        this.f22045b = pointF2;
        this.f22046c = pointF3;
        this.f22047d = pointF4;
        this.f22048e = r0.j(x.a(t5.a.f21262a, pointF), x.a(t5.a.f21263b, pointF2), x.a(t5.a.f21264c, pointF3), x.a(t5.a.f21265d, pointF4));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(c cVar, c cVar2, c cVar3, c cVar4) {
        this(f.e(cVar), f.e(cVar2), f.e(cVar3), f.e(cVar4));
        r.f(cVar, "topLeftCorner");
        r.f(cVar2, "topRightCorner");
        r.f(cVar3, "bottomRightCorner");
        r.f(cVar4, "bottomLeftCorner");
    }

    public final PointF a() {
        return this.f22047d;
    }

    public final PointF b() {
        return this.f22046c;
    }

    public final t5.a c(PointF pointF) {
        Object next;
        r.f(pointF, "point");
        Iterator<T> it = this.f22048e.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fA = f.a((PointF) ((Map.Entry) next).getValue(), pointF);
                do {
                    Object next2 = it.next();
                    float fA2 = f.a((PointF) ((Map.Entry) next2).getValue(), pointF);
                    if (Float.compare(fA, fA2) > 0) {
                        next = next2;
                        fA = fA2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        t5.a aVar = entry != null ? (t5.a) entry.getKey() : null;
        r.c(aVar);
        return aVar;
    }

    public final Map<t5.a, PointF> d() {
        return this.f22048e;
    }

    public final b[] e() {
        return new b[]{new b(this.f22044a, this.f22045b), new b(this.f22045b, this.f22046c), new b(this.f22046c, this.f22047d), new b(this.f22047d, this.f22044a)};
    }

    public final PointF f() {
        return this.f22044a;
    }

    public final PointF g() {
        return this.f22045b;
    }

    public final d h(RectF rectF, float f10) {
        r.f(rectF, "imagePreviewBounds");
        return new d(f.b(f.d(this.f22044a, f10), rectF.left, rectF.top), f.b(f.d(this.f22045b, f10), rectF.left, rectF.top), f.b(f.d(this.f22046c, f10), rectF.left, rectF.top), f.b(f.d(this.f22047d, f10), rectF.left, rectF.top));
    }

    public final d i(RectF rectF, float f10) {
        r.f(rectF, "imagePreviewBounds");
        float f11 = 1 / f10;
        return new d(f.d(f.b(this.f22044a, -rectF.left, -rectF.top), f11), f.d(f.b(this.f22045b, -rectF.left, -rectF.top), f11), f.d(f.b(this.f22046c, -rectF.left, -rectF.top), f11), f.d(f.b(this.f22047d, -rectF.left, -rectF.top), f11));
    }

    public final void j(t5.a aVar, float f10, float f11) {
        r.f(aVar, "corner");
        PointF pointF = this.f22048e.get(aVar);
        if (pointF != null) {
            pointF.offset(f10, f11);
        }
    }
}
