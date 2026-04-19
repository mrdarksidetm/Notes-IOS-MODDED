package a6;

import a6.n;
import hf.u;
import hf.z;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hf.j f623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Closeable f625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n.a f626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private hf.e f628g;

    public m(z zVar, hf.j jVar, String str, Closeable closeable, n.a aVar) {
        super(null);
        this.f622a = zVar;
        this.f623b = jVar;
        this.f624c = str;
        this.f625d = closeable;
        this.f626e = aVar;
    }

    private final void l() {
        if (!(!this.f627f)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // a6.n
    public n.a a() {
        return this.f626e;
    }

    @Override // a6.n
    public synchronized hf.e b() {
        l();
        hf.e eVar = this.f628g;
        if (eVar != null) {
            return eVar;
        }
        hf.e eVarD = u.d(w().q(this.f622a));
        this.f628g = eVarD;
        return eVarD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f627f = true;
        hf.e eVar = this.f628g;
        if (eVar != null) {
            o6.j.d(eVar);
        }
        Closeable closeable = this.f625d;
        if (closeable != null) {
            o6.j.d(closeable);
        }
    }

    public final String o() {
        return this.f624c;
    }

    public hf.j w() {
        return this.f623b;
    }
}
