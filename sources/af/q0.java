package af;

import java.util.Iterator;
import java.util.Map;
import ze.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q0<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final we.b<Key> f810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final we.b<Value> f811b;

    private q0(we.b<Key> bVar, we.b<Value> bVar2) {
        super(null);
        this.f810a = bVar;
        this.f811b = bVar2;
    }

    public /* synthetic */ q0(we.b bVar, we.b bVar2, ae.j jVar) {
        this(bVar, bVar2);
    }

    @Override // we.b, we.h, we.a
    public abstract ye.f getDescriptor();

    public final we.b<Key> m() {
        return this.f810a;
    }

    public final we.b<Value> n() {
        return this.f811b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(ze.c cVar, Builder builder, int i10, int i11) {
        ae.r.f(cVar, "decoder");
        ae.r.f(builder, "builder");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        ge.g gVarS = ge.o.s(ge.o.t(0, i11 * 2), 2);
        int iL = gVarS.l();
        int iN = gVarS.n();
        int iO = gVarS.o();
        if ((iO <= 0 || iL > iN) && (iO >= 0 || iN > iL)) {
            return;
        }
        while (true) {
            h(cVar, i10 + iL, builder, false);
            if (iL == iN) {
                return;
            } else {
                iL += iO;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(ze.c cVar, int i10, Builder builder, boolean z10) {
        int iZ;
        ae.r.f(cVar, "decoder");
        ae.r.f(builder, "builder");
        Object objC = c.a.c(cVar, getDescriptor(), i10, this.f810a, null, 8, null);
        if (z10) {
            iZ = cVar.z(getDescriptor());
            if (!(iZ == i10 + 1)) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iZ).toString());
            }
        } else {
            iZ = i10 + 1;
        }
        int i11 = iZ;
        builder.put(objC, (!builder.containsKey(objC) || (this.f811b.getDescriptor().e() instanceof ye.e)) ? c.a.c(cVar, getDescriptor(), i11, this.f811b, null, 8, null) : cVar.k(getDescriptor(), i11, this.f811b, nd.r0.f(builder, objC)));
    }

    @Override // we.h
    public void serialize(ze.f fVar, Collection collection) {
        ae.r.f(fVar, "encoder");
        int iE = e(collection);
        ye.f descriptor = getDescriptor();
        ze.d dVarP = fVar.p(descriptor, iE);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itD = d(collection);
        int i10 = 0;
        while (itD.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itD.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i11 = i10 + 1;
            dVarP.E(getDescriptor(), i10, m(), key);
            dVarP.E(getDescriptor(), i11, n(), value);
            i10 = i11 + 1;
        }
        dVarP.d(descriptor);
    }
}
