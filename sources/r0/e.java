package r0;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j5.b f19144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f19145b;

    public e(j5.b bVar, d dVar) {
        this.f19144a = bVar;
        this.f19145b = dVar;
    }

    public final j5.b a() {
        return this.f19144a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return r.b(this.f19144a, eVar.f19144a) && r.b(this.f19145b, eVar.f19145b);
    }

    public int hashCode() {
        return (this.f19144a.hashCode() * 31) + this.f19145b.hashCode();
    }

    public String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.f19144a + ", windowPosture=" + this.f19145b + ')';
    }
}
