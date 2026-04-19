package m5;

import ae.r;
import android.graphics.Rect;
import androidx.core.view.o;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i5.b f15466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f15467b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, o oVar) {
        this(new i5.b(rect), oVar);
        r.f(rect, "bounds");
        r.f(oVar, "insets");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(Rect rect, o oVar, int i10, ae.j jVar) {
        if ((i10 & 2) != 0) {
            oVar = new o.b().a();
            r.e(oVar, "Builder().build()");
        }
        this(rect, oVar);
    }

    public l(i5.b bVar, o oVar) {
        r.f(bVar, "_bounds");
        r.f(oVar, "_windowInsetsCompat");
        this.f15466a = bVar;
        this.f15467b = oVar;
    }

    public final Rect a() {
        return this.f15466a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return r.b(this.f15466a, lVar.f15466a) && r.b(this.f15467b, lVar.f15467b);
    }

    public int hashCode() {
        return (this.f15466a.hashCode() * 31) + this.f15467b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.f15466a + ", windowInsetsCompat=" + this.f15467b + ')';
    }
}
