package af;

import java.lang.annotation.Annotation;
import java.util.List;
import ye.f;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 implements ye.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f828a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.j f829b = k.d.f24014a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f830c = "kotlin.Nothing";

    private u0() {
    }

    private final Void b() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // ye.f
    public String a() {
        return f830c;
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

    @Override // ye.f
    public ye.j e() {
        return f829b;
    }

    public boolean equals(Object obj) {
        return this == obj;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
