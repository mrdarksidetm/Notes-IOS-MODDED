package l1;

import android.graphics.ColorFilter;

/* JADX INFO: loaded from: classes.dex */
public final class w extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f14624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14625d;

    private w(long j10, int i10) {
        this(j10, i10, d.a(j10, i10), null);
    }

    public /* synthetic */ w(long j10, int i10, ae.j jVar) {
        this(j10, i10);
    }

    private w(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.f14624c = j10;
        this.f14625d = i10;
    }

    public /* synthetic */ w(long j10, int i10, ColorFilter colorFilter, ae.j jVar) {
        this(j10, i10, colorFilter);
    }

    public final int b() {
        return this.f14625d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return j0.w(this.f14624c, wVar.f14624c) && v.E(this.f14625d, wVar.f14625d);
    }

    public int hashCode() {
        return (j0.C(this.f14624c) * 31) + v.F(this.f14625d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) j0.D(this.f14624c)) + ", blendMode=" + ((Object) v.G(this.f14625d)) + ')';
    }
}
