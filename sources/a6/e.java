package a6;

import ae.r;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f605b;

    public e(Drawable drawable, boolean z10) {
        this.f604a = drawable;
        this.f605b = z10;
    }

    public final Drawable a() {
        return this.f604a;
    }

    public final boolean b() {
        return this.f605b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (r.b(this.f604a, eVar.f604a) && this.f605b == eVar.f605b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f604a.hashCode() * 31) + Boolean.hashCode(this.f605b);
    }
}
