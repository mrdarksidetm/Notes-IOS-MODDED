package af;

import java.lang.annotation.Annotation;
import java.util.List;
import ye.f;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p0 implements ye.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye.f f806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ye.f f807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f808d;

    private p0(String str, ye.f fVar, ye.f fVar2) {
        this.f805a = str;
        this.f806b = fVar;
        this.f807c = fVar2;
        this.f808d = 2;
    }

    public /* synthetic */ p0(String str, ye.f fVar, ye.f fVar2, ae.j jVar) {
        this(str, fVar, fVar2);
    }

    @Override // ye.f
    public String a() {
        return this.f805a;
    }

    @Override // ye.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // ye.f
    public int d(String str) {
        ae.r.f(str, "name");
        Integer numL = je.u.l(str);
        if (numL != null) {
            return numL.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // ye.f
    public ye.j e() {
        return k.c.f24013a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return ae.r.b(a(), p0Var.a()) && ae.r.b(this.f806b, p0Var.f806b) && ae.r.b(this.f807c, p0Var.f807c);
    }

    @Override // ye.f
    public int f() {
        return this.f808d;
    }

    @Override // ye.f
    public String g(int i10) {
        return String.valueOf(i10);
    }

    @Override // ye.f
    public List<Annotation> getAnnotations() {
        return f.a.a(this);
    }

    @Override // ye.f
    public List<Annotation> h(int i10) {
        if (i10 >= 0) {
            return nd.u.m();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + this.f806b.hashCode()) * 31) + this.f807c.hashCode();
    }

    @Override // ye.f
    public ye.f i(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f806b;
            }
            if (i11 == 1) {
                return this.f807c;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // ye.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // ye.f
    public boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + a() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return a() + '(' + this.f806b + ", " + this.f807c + ')';
    }
}
