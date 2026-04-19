package n2;

import android.content.Context;
import android.graphics.Typeface;
import n2.h0;

/* JADX INFO: loaded from: classes.dex */
final class p extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i0 f15877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f15878g;

    private p(String str, i0 i0Var, int i10, h0.d dVar) {
        super(c0.f15768a.c(), l0.f15858a, dVar, null);
        this.f15876e = str;
        this.f15877f = i0Var;
        this.f15878g = i10;
    }

    public /* synthetic */ p(String str, i0 i0Var, int i10, h0.d dVar, ae.j jVar) {
        this(str, i0Var, i10, dVar);
    }

    @Override // n2.s
    public i0 b() {
        return this.f15877f;
    }

    @Override // n2.s
    public int c() {
        return this.f15878g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return o.b(this.f15876e, pVar.f15876e) && ae.r.b(b(), pVar.b()) && e0.f(c(), pVar.c()) && ae.r.b(e(), pVar.e());
    }

    public final Typeface f(Context context) {
        return s0.a().c(this.f15876e, b(), c(), e(), context);
    }

    public int hashCode() {
        return (((((o.c(this.f15876e) * 31) + b().hashCode()) * 31) + e0.g(c())) * 31) + e().hashCode();
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) o.d(this.f15876e)) + "\", weight=" + b() + ", style=" + ((Object) e0.h(c())) + ')';
    }
}
