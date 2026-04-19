package o0;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16217a;

    public static final class a {
    }

    public final a a() {
        return null;
    }

    public final boolean b() {
        return this.f16217a;
    }

    public final a c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.getClass();
        return r.b(null, null) && r.b(null, null) && this.f16217a == eVar.f16217a;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "Selection(start=" + ((Object) null) + ", end=" + ((Object) null) + ", handlesCrossed=" + this.f16217a + ')';
    }
}
