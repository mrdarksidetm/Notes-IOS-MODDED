package d6;

import ae.r;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f9507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f9508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a6.d f9509c;

    public g(Drawable drawable, boolean z10, a6.d dVar) {
        super(null);
        this.f9507a = drawable;
        this.f9508b = z10;
        this.f9509c = dVar;
    }

    public final a6.d a() {
        return this.f9509c;
    }

    public final Drawable b() {
        return this.f9507a;
    }

    public final boolean c() {
        return this.f9508b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (r.b(this.f9507a, gVar.f9507a) && this.f9508b == gVar.f9508b && this.f9509c == gVar.f9509c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f9507a.hashCode() * 31) + Boolean.hashCode(this.f9508b)) * 31) + this.f9509c.hashCode();
    }
}
