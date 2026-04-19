package d6;

import a6.n;
import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class m extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f9534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a6.d f9536c;

    public m(n nVar, String str, a6.d dVar) {
        super(null);
        this.f9534a = nVar;
        this.f9535b = str;
        this.f9536c = dVar;
    }

    public final a6.d a() {
        return this.f9536c;
    }

    public final n b() {
        return this.f9534a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (r.b(this.f9534a, mVar.f9534a) && r.b(this.f9535b, mVar.f9535b) && this.f9536c == mVar.f9536c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f9534a.hashCode() * 31;
        String str = this.f9535b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f9536c.hashCode();
    }
}
