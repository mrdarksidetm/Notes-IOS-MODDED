package hf;

import hf.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f11997i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    private static final z f11998j = z.a.e(z.f12027b, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f11999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f12000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<z, p003if.d> f12001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f12002h;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public l0(z zVar, j jVar, Map<z, p003if.d> map, String str) {
        ae.r.f(zVar, "zipPath");
        ae.r.f(jVar, "fileSystem");
        ae.r.f(map, "entries");
        this.f11999e = zVar;
        this.f12000f = jVar;
        this.f12001g = map;
        this.f12002h = str;
    }

    private final z r(z zVar) {
        return f11998j.o(zVar, true);
    }

    private final List<z> s(z zVar, boolean z10) throws IOException {
        p003if.d dVar = this.f12001g.get(r(zVar));
        if (dVar != null) {
            return nd.c0.C0(dVar.b());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + zVar);
    }

    @Override // hf.j
    public g0 b(z zVar, boolean z10) throws IOException {
        ae.r.f(zVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // hf.j
    public void c(z zVar, z zVar2) throws IOException {
        ae.r.f(zVar, "source");
        ae.r.f(zVar2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // hf.j
    public void g(z zVar, boolean z10) throws IOException {
        ae.r.f(zVar, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // hf.j
    public void i(z zVar, boolean z10) throws IOException {
        ae.r.f(zVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // hf.j
    public List<z> k(z zVar) throws IOException {
        ae.r.f(zVar, "dir");
        List<z> listS = s(zVar, true);
        ae.r.c(listS);
        return listS;
    }

    @Override // hf.j
    public i m(z zVar) throws Throwable {
        e eVarD;
        ae.r.f(zVar, "path");
        p003if.d dVar = this.f12001g.get(r(zVar));
        Throwable th = null;
        if (dVar == null) {
            return null;
        }
        i iVar = new i(!dVar.h(), dVar.h(), null, dVar.h() ? null : Long.valueOf(dVar.g()), null, dVar.e(), null, null, 128, null);
        if (dVar.f() == -1) {
            return iVar;
        }
        h hVarN = this.f12000f.n(this.f11999e);
        try {
            eVarD = u.d(hVarN.G(dVar.f()));
            if (hVarN != null) {
                try {
                    hVarN.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (hVarN != null) {
                try {
                    hVarN.close();
                } catch (Throwable th4) {
                    md.f.a(th3, th4);
                }
            }
            th = th3;
            eVarD = null;
        }
        if (th != null) {
            throw th;
        }
        ae.r.c(eVarD);
        return p003if.e.h(eVarD, iVar);
    }

    @Override // hf.j
    public h n(z zVar) {
        ae.r.f(zVar, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // hf.j
    public g0 p(z zVar, boolean z10) throws IOException {
        ae.r.f(zVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // hf.j
    public i0 q(z zVar) throws Throwable {
        e eVarD;
        ae.r.f(zVar, "file");
        p003if.d dVar = this.f12001g.get(r(zVar));
        if (dVar == null) {
            throw new FileNotFoundException("no such file: " + zVar);
        }
        h hVarN = this.f12000f.n(this.f11999e);
        Throwable th = null;
        try {
            eVarD = u.d(hVarN.G(dVar.f()));
            if (hVarN != null) {
                try {
                    hVarN.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (hVarN != null) {
                try {
                    hVarN.close();
                } catch (Throwable th4) {
                    md.f.a(th3, th4);
                }
            }
            eVarD = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        ae.r.c(eVarD);
        p003if.e.k(eVarD);
        return dVar.d() == 0 ? new p003if.b(eVarD, dVar.g(), true) : new p003if.b(new p(new p003if.b(eVarD, dVar.c(), true), new Inflater(true)), dVar.g(), false);
    }
}
