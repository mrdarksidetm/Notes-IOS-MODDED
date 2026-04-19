package i5;

import ae.r;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12523d;

    public b(int i10, int i11, int i12, int i13) {
        this.f12520a = i10;
        this.f12521b = i11;
        this.f12522c = i12;
        this.f12523d = i13;
        if (!(i10 <= i12)) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i10 + ", right: " + i12).toString());
        }
        if (i11 <= i13) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i11 + ", bottom: " + i13).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        r.f(rect, "rect");
    }

    public final int a() {
        return this.f12523d - this.f12521b;
    }

    public final int b() {
        return this.f12520a;
    }

    public final int c() {
        return this.f12521b;
    }

    public final int d() {
        return this.f12522c - this.f12520a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f12520a == bVar.f12520a && this.f12521b == bVar.f12521b && this.f12522c == bVar.f12522c && this.f12523d == bVar.f12523d;
    }

    public final Rect f() {
        return new Rect(this.f12520a, this.f12521b, this.f12522c, this.f12523d);
    }

    public int hashCode() {
        return (((((this.f12520a * 31) + this.f12521b) * 31) + this.f12522c) * 31) + this.f12523d;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.f12520a + ',' + this.f12521b + ',' + this.f12522c + ',' + this.f12523d + "] }";
    }
}
