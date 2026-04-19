package ye;

import ae.r;
import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f23975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final he.c<?> f23976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23977c;

    @Override // ye.f
    public String a() {
        return this.f23977c;
    }

    @Override // ye.f
    public boolean c() {
        return this.f23975a.c();
    }

    @Override // ye.f
    public int d(String str) {
        r.f(str, "name");
        return this.f23975a.d(str);
    }

    @Override // ye.f
    public j e() {
        return this.f23975a.e();
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && r.b(this.f23975a, cVar.f23975a) && r.b(cVar.f23976b, this.f23976b);
    }

    @Override // ye.f
    public int f() {
        return this.f23975a.f();
    }

    @Override // ye.f
    public String g(int i10) {
        return this.f23975a.g(i10);
    }

    @Override // ye.f
    public List<Annotation> getAnnotations() {
        return this.f23975a.getAnnotations();
    }

    @Override // ye.f
    public List<Annotation> h(int i10) {
        return this.f23975a.h(i10);
    }

    public int hashCode() {
        return (this.f23976b.hashCode() * 31) + a().hashCode();
    }

    @Override // ye.f
    public f i(int i10) {
        return this.f23975a.i(i10);
    }

    @Override // ye.f
    public boolean isInline() {
        return this.f23975a.isInline();
    }

    @Override // ye.f
    public boolean j(int i10) {
        return this.f23975a.j(i10);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f23976b + ", original: " + this.f23975a + ')';
    }
}
