package a6;

import a6.n;
import ae.r;
import hf.u;
import hf.z;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class q extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.a f634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hf.e f636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zd.a<? extends File> f637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z f638e;

    public q(hf.e eVar, zd.a<? extends File> aVar, n.a aVar2) {
        super(null);
        this.f634a = aVar2;
        this.f636c = eVar;
        this.f637d = aVar;
    }

    private final void l() {
        if (!(!this.f635b)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // a6.n
    public n.a a() {
        return this.f634a;
    }

    @Override // a6.n
    public synchronized hf.e b() {
        l();
        hf.e eVar = this.f636c;
        if (eVar != null) {
            return eVar;
        }
        hf.j jVarO = o();
        z zVar = this.f638e;
        r.c(zVar);
        hf.e eVarD = u.d(jVarO.q(zVar));
        this.f636c = eVarD;
        return eVarD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f635b = true;
        hf.e eVar = this.f636c;
        if (eVar != null) {
            o6.j.d(eVar);
        }
        z zVar = this.f638e;
        if (zVar != null) {
            o().h(zVar);
        }
    }

    public hf.j o() {
        return hf.j.f11987b;
    }
}
