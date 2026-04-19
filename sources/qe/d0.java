package qe;

/* JADX INFO: loaded from: classes2.dex */
public class d0<T> extends le.a<T> implements sd.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qd.d<T> f19049d;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(qd.g gVar, qd.d<? super T> dVar) {
        super(gVar, true, true);
        this.f19049d = dVar;
    }

    @Override // le.a
    protected void O0(Object obj) {
        qd.d<T> dVar = this.f19049d;
        dVar.resumeWith(le.g0.a(obj, dVar));
    }

    @Override // sd.c
    public final sd.c getCallerFrame() {
        qd.d<T> dVar = this.f19049d;
        if (dVar instanceof sd.c) {
            return (sd.c) dVar;
        }
        return null;
    }

    @Override // le.i2
    protected final boolean j0() {
        return true;
    }

    @Override // le.i2
    protected void x(Object obj) {
        k.c(rd.c.c(this.f19049d), le.g0.a(obj, this.f19049d), null, 2, null);
    }
}
