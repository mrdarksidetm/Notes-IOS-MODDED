package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3307e = new a(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3311d;

    /* JADX INFO: renamed from: androidx.core.graphics.a$a, reason: collision with other inner class name */
    static class C0076a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private a(int i10, int i11, int i12, int i13) {
        this.f3308a = i10;
        this.f3309b = i11;
        this.f3310c = i12;
        this.f3311d = i13;
    }

    public static a a(a aVar, a aVar2) {
        return b(Math.max(aVar.f3308a, aVar2.f3308a), Math.max(aVar.f3309b, aVar2.f3309b), Math.max(aVar.f3310c, aVar2.f3310c), Math.max(aVar.f3311d, aVar2.f3311d));
    }

    public static a b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f3307e : new a(i10, i11, i12, i13);
    }

    public static a c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static a d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return C0076a.a(this.f3308a, this.f3309b, this.f3310c, this.f3311d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3311d == aVar.f3311d && this.f3308a == aVar.f3308a && this.f3310c == aVar.f3310c && this.f3309b == aVar.f3309b;
    }

    public int hashCode() {
        return (((((this.f3308a * 31) + this.f3309b) * 31) + this.f3310c) * 31) + this.f3311d;
    }

    public String toString() {
        return "Insets{left=" + this.f3308a + ", top=" + this.f3309b + ", right=" + this.f3310c + ", bottom=" + this.f3311d + '}';
    }
}
