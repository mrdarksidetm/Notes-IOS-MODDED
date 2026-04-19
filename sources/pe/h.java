package pe;

import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class h<T> extends g<T, T> {
    public h(oe.e<? extends T> eVar, qd.g gVar, int i10, ne.a aVar) {
        super(eVar, gVar, i10, aVar);
    }

    public /* synthetic */ h(oe.e eVar, qd.g gVar, int i10, ne.a aVar, int i11, ae.j jVar) {
        this(eVar, (i11 & 2) != 0 ? qd.h.f19040a : gVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? ne.a.SUSPEND : aVar);
    }

    @Override // pe.e
    protected e<T> j(qd.g gVar, int i10, ne.a aVar) {
        return new h(this.f18328d, gVar, i10, aVar);
    }

    @Override // pe.e
    public oe.e<T> l() {
        return (oe.e<T>) this.f18328d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // pe.g
    protected Object s(oe.f<? super T> fVar, qd.d<? super i0> dVar) {
        Object objA = this.f18328d.a((oe.f<? super S>) fVar, dVar);
        return objA == rd.d.e() ? objA : i0.f15558a;
    }
}
