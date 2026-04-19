package j6;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f13971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f13972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f13973c;

    public f(Drawable drawable, h hVar, Throwable th) {
        super(null);
        this.f13971a = drawable;
        this.f13972b = hVar;
        this.f13973c = th;
    }

    @Override // j6.i
    public Drawable a() {
        return this.f13971a;
    }

    @Override // j6.i
    public h b() {
        return this.f13972b;
    }

    public final Throwable c() {
        return this.f13973c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (ae.r.b(a(), fVar.a()) && ae.r.b(b(), fVar.b()) && ae.r.b(this.f13973c, fVar.f13973c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Drawable drawableA = a();
        return ((((drawableA != null ? drawableA.hashCode() : 0) * 31) + b().hashCode()) * 31) + this.f13973c.hashCode();
    }
}
