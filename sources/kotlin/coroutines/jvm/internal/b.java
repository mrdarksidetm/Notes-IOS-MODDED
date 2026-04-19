package kotlin.coroutines.jvm.internal;

import ae.r;
import qd.d;
import qd.e;
import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends a {
    private final g _context;
    private transient d<Object> intercepted;

    public b(d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public b(d<Object> dVar, g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // qd.d
    public g getContext() {
        g gVar = this._context;
        r.c(gVar);
        return gVar;
    }

    public final d<Object> intercepted() {
        d<Object> dVarY = this.intercepted;
        if (dVarY == null) {
            e eVar = (e) getContext().get(e.U);
            if (eVar == null || (dVarY = eVar.y(this)) == null) {
                dVarY = this;
            }
            this.intercepted = dVarY;
        }
        return dVarY;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(e.U);
            r.c(bVar);
            ((e) bVar).E(dVar);
        }
        this.intercepted = sd.b.f20522a;
    }
}
