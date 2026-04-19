package cf;

import df.e;
import java.util.List;
import ye.j;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 implements df.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6995b;

    public u0(boolean z10, String str) {
        ae.r.f(str, "discriminator");
        this.f6994a = z10;
        this.f6995b = str;
    }

    private final void f(ye.f fVar, he.c<?> cVar) {
        int iF = fVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            String strG = fVar.g(i10);
            if (ae.r.b(strG, this.f6995b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + cVar + " has property '" + strG + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void g(ye.f fVar, he.c<?> cVar) {
        ye.j jVarE = fVar.e();
        if ((jVarE instanceof ye.d) || ae.r.b(jVarE, j.a.f24009a)) {
            throw new IllegalArgumentException("Serializer for " + cVar.b() + " can't be registered as a subclass for polymorphic serialization because its kind " + jVarE + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f6994a) {
            return;
        }
        if (ae.r.b(jVarE, k.b.f24012a) || ae.r.b(jVarE, k.c.f24013a) || (jVarE instanceof ye.e) || (jVarE instanceof j.b)) {
            throw new IllegalArgumentException("Serializer for " + cVar.b() + " of kind " + jVarE + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // df.e
    public <Base, Sub extends Base> void a(he.c<Base> cVar, he.c<Sub> cVar2, we.b<Sub> bVar) {
        ae.r.f(cVar, "baseClass");
        ae.r.f(cVar2, "actualClass");
        ae.r.f(bVar, "actualSerializer");
        ye.f descriptor = bVar.getDescriptor();
        g(descriptor, cVar2);
        if (this.f6994a) {
            return;
        }
        f(descriptor, cVar2);
    }

    @Override // df.e
    public <T> void b(he.c<T> cVar, zd.l<? super List<? extends we.b<?>>, ? extends we.b<?>> lVar) {
        ae.r.f(cVar, "kClass");
        ae.r.f(lVar, "provider");
    }

    @Override // df.e
    public <Base> void c(he.c<Base> cVar, zd.l<? super Base, ? extends we.h<? super Base>> lVar) {
        ae.r.f(cVar, "baseClass");
        ae.r.f(lVar, "defaultSerializerProvider");
    }

    @Override // df.e
    public <T> void d(he.c<T> cVar, we.b<T> bVar) {
        e.a.a(this, cVar, bVar);
    }

    @Override // df.e
    public <Base> void e(he.c<Base> cVar, zd.l<? super String, ? extends we.a<? extends Base>> lVar) {
        ae.r.f(cVar, "baseClass");
        ae.r.f(lVar, "defaultDeserializerProvider");
    }
}
