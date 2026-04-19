package j6;

import android.graphics.drawable.Drawable;
import h6.c;

/* JADX INFO: loaded from: classes.dex */
public final class q extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f14054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f14055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a6.d f14056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.b f14057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f14060g;

    public q(Drawable drawable, h hVar, a6.d dVar, c.b bVar, String str, boolean z10, boolean z11) {
        super(null);
        this.f14054a = drawable;
        this.f14055b = hVar;
        this.f14056c = dVar;
        this.f14057d = bVar;
        this.f14058e = str;
        this.f14059f = z10;
        this.f14060g = z11;
    }

    @Override // j6.i
    public Drawable a() {
        return this.f14054a;
    }

    @Override // j6.i
    public h b() {
        return this.f14055b;
    }

    public final a6.d c() {
        return this.f14056c;
    }

    public final boolean d() {
        return this.f14060g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (ae.r.b(a(), qVar.a()) && ae.r.b(b(), qVar.b()) && this.f14056c == qVar.f14056c && ae.r.b(this.f14057d, qVar.f14057d) && ae.r.b(this.f14058e, qVar.f14058e) && this.f14059f == qVar.f14059f && this.f14060g == qVar.f14060g) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f14056c.hashCode()) * 31;
        c.b bVar = this.f14057d;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f14058e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f14059f)) * 31) + Boolean.hashCode(this.f14060g);
    }
}
