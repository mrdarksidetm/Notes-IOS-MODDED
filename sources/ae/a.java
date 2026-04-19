package ae;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class a implements n, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f694g;

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f688a = obj;
        this.f689b = cls;
        this.f690c = str;
        this.f691d = str2;
        this.f692e = (i11 & 1) == 1;
        this.f693f = i10;
        this.f694g = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f692e == aVar.f692e && this.f693f == aVar.f693f && this.f694g == aVar.f694g && r.b(this.f688a, aVar.f688a) && r.b(this.f689b, aVar.f689b) && this.f690c.equals(aVar.f690c) && this.f691d.equals(aVar.f691d);
    }

    @Override // ae.n
    public int getArity() {
        return this.f693f;
    }

    public int hashCode() {
        Object obj = this.f688a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f689b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f690c.hashCode()) * 31) + this.f691d.hashCode()) * 31) + (this.f692e ? 1231 : 1237)) * 31) + this.f693f) * 31) + this.f694g;
    }

    public String toString() {
        return i0.g(this);
    }
}
