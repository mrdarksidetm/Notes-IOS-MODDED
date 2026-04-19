package af;

import java.lang.annotation.Annotation;
import java.util.List;
import ye.f;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 implements ye.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye.e f762b;

    public g1(String str, ye.e eVar) {
        ae.r.f(str, "serialName");
        ae.r.f(eVar, "kind");
        this.f761a = str;
        this.f762b = eVar;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // ye.f
    public String a() {
        return this.f761a;
    }

    @Override // ye.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // ye.f
    public int d(String str) {
        ae.r.f(str, "name");
        b();
        throw new md.i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return ae.r.b(a(), g1Var.a()) && ae.r.b(e(), g1Var.e());
    }

    @Override // ye.f
    public int f() {
        return 0;
    }

    @Override // ye.f
    public String g(int i10) {
        b();
        throw new md.i();
    }

    @Override // ye.f
    public List<Annotation> getAnnotations() {
        return f.a.a(this);
    }

    @Override // ye.f
    public List<Annotation> h(int i10) {
        b();
        throw new md.i();
    }

    public int hashCode() {
        return a().hashCode() + (e().hashCode() * 31);
    }

    @Override // ye.f
    public ye.f i(int i10) {
        b();
        throw new md.i();
    }

    @Override // ye.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // ye.f
    public boolean j(int i10) {
        b();
        throw new md.i();
    }

    @Override // ye.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ye.e e() {
        return this.f762b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
