package af;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<Element, Collection, Builder> implements we.b<Collection> {
    private a() {
    }

    public /* synthetic */ a(ae.j jVar) {
        this();
    }

    public static /* synthetic */ void i(a aVar, ze.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        aVar.h(cVar, i10, obj, z10);
    }

    private final int j(ze.c cVar, Builder builder) {
        int iN = cVar.n(getDescriptor());
        c(builder, iN);
        return iN;
    }

    protected abstract Builder a();

    protected abstract int b(Builder builder);

    protected abstract void c(Builder builder, int i10);

    protected abstract Iterator<Element> d(Collection collection);

    @Override // we.a
    public Collection deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return f(eVar, null);
    }

    protected abstract int e(Collection collection);

    public final Collection f(ze.e eVar, Collection collection) {
        Builder builderA;
        ae.r.f(eVar, "decoder");
        if (collection == null || (builderA = k(collection)) == null) {
            builderA = a();
        }
        int iB = b(builderA);
        ze.c cVarC = eVar.c(getDescriptor());
        if (!cVarC.x()) {
            while (true) {
                int iZ = cVarC.z(getDescriptor());
                if (iZ == -1) {
                    break;
                }
                i(this, cVarC, iB + iZ, builderA, false, 8, null);
            }
        } else {
            g(cVarC, builderA, iB, j(cVarC, builderA));
        }
        cVarC.d(getDescriptor());
        return l(builderA);
    }

    protected abstract void g(ze.c cVar, Builder builder, int i10, int i11);

    protected abstract void h(ze.c cVar, int i10, Builder builder, boolean z10);

    protected abstract Builder k(Collection collection);

    protected abstract Collection l(Builder builder);
}
