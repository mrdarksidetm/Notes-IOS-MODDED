package af;

import java.util.Iterator;
import ze.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final we.b<Element> f804a;

    private p(we.b<Element> bVar) {
        super(null);
        this.f804a = bVar;
    }

    public /* synthetic */ p(we.b bVar, ae.j jVar) {
        this(bVar);
    }

    @Override // af.a
    protected final void g(ze.c cVar, Builder builder, int i10, int i11) {
        ae.r.f(cVar, "decoder");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            h(cVar, i10 + i12, builder, false);
        }
    }

    @Override // we.b, we.h, we.a
    public abstract ye.f getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // af.a
    protected void h(ze.c cVar, int i10, Builder builder, boolean z10) {
        ae.r.f(cVar, "decoder");
        n(builder, i10, c.a.c(cVar, getDescriptor(), i10, this.f804a, null, 8, null));
    }

    protected abstract void n(Builder builder, int i10, Element element);

    @Override // we.h
    public void serialize(ze.f fVar, Collection collection) {
        ae.r.f(fVar, "encoder");
        int iE = e(collection);
        ye.f descriptor = getDescriptor();
        ze.d dVarP = fVar.p(descriptor, iE);
        Iterator<Element> itD = d(collection);
        for (int i10 = 0; i10 < iE; i10++) {
            dVarP.E(getDescriptor(), i10, this.f804a, itD.next());
        }
        dVarP.d(descriptor);
    }
}
