package af;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 implements ye.f, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.f f770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<String> f772c;

    public i1(ye.f fVar) {
        ae.r.f(fVar, "original");
        this.f770a = fVar;
        this.f771b = fVar.a() + '?';
        this.f772c = y0.a(fVar);
    }

    @Override // ye.f
    public String a() {
        return this.f771b;
    }

    @Override // af.l
    public Set<String> b() {
        return this.f772c;
    }

    @Override // ye.f
    public boolean c() {
        return true;
    }

    @Override // ye.f
    public int d(String str) {
        ae.r.f(str, "name");
        return this.f770a.d(str);
    }

    @Override // ye.f
    public ye.j e() {
        return this.f770a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && ae.r.b(this.f770a, ((i1) obj).f770a);
    }

    @Override // ye.f
    public int f() {
        return this.f770a.f();
    }

    @Override // ye.f
    public String g(int i10) {
        return this.f770a.g(i10);
    }

    @Override // ye.f
    public List<Annotation> getAnnotations() {
        return this.f770a.getAnnotations();
    }

    @Override // ye.f
    public List<Annotation> h(int i10) {
        return this.f770a.h(i10);
    }

    public int hashCode() {
        return this.f770a.hashCode() * 31;
    }

    @Override // ye.f
    public ye.f i(int i10) {
        return this.f770a.i(i10);
    }

    @Override // ye.f
    public boolean isInline() {
        return this.f770a.isInline();
    }

    @Override // ye.f
    public boolean j(int i10) {
        return this.f770a.j(i10);
    }

    public final ye.f k() {
        return this.f770a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f770a);
        sb2.append('?');
        return sb2.toString();
    }
}
