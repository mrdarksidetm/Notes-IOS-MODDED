package af;

import java.lang.annotation.Annotation;
import java.util.List;
import ye.f;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l0 implements ye.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.f f779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f780b;

    private l0(ye.f fVar) {
        this.f779a = fVar;
        this.f780b = 1;
    }

    public /* synthetic */ l0(ye.f fVar, ae.j jVar) {
        this(fVar);
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
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    @Override // ye.f
    public ye.j e() {
        return k.b.f24012a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return ae.r.b(this.f779a, l0Var.f779a) && ae.r.b(a(), l0Var.a());
    }

    @Override // ye.f
    public int f() {
        return this.f780b;
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
        return (this.f779a.hashCode() * 31) + a().hashCode();
    }

    @Override // ye.f
    public ye.f i(int i10) {
        if (i10 >= 0) {
            return this.f779a;
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
        return a() + '(' + this.f779a + ')';
    }
}
