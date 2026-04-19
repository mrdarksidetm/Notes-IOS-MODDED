package b6;

import b6.a;
import b6.b;
import hf.f;
import hf.j;
import hf.z;
import le.j0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f5510e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f5511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f5512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f5513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b6.b f5514d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private static final class b implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.C0130b f5515a;

        public b(b.C0130b c0130b) {
            this.f5515a = c0130b;
        }

        @Override // b6.a.b
        public void a() {
            this.f5515a.a();
        }

        @Override // b6.a.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c g() {
            b.d dVarC = this.f5515a.c();
            if (dVarC != null) {
                return new c(dVarC);
            }
            return null;
        }

        @Override // b6.a.b
        public z f() {
            return this.f5515a.f(0);
        }

        @Override // b6.a.b
        public z getData() {
            return this.f5515a.f(1);
        }
    }

    private static final class c implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.d f5516a;

        public c(b.d dVar) {
            this.f5516a = dVar;
        }

        @Override // b6.a.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b x() {
            b.C0130b c0130bA = this.f5516a.a();
            if (c0130bA != null) {
                return new b(c0130bA);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5516a.close();
        }

        @Override // b6.a.c
        public z f() {
            return this.f5516a.b(0);
        }

        @Override // b6.a.c
        public z getData() {
            return this.f5516a.b(1);
        }
    }

    public d(long j10, z zVar, j jVar, j0 j0Var) {
        this.f5511a = j10;
        this.f5512b = zVar;
        this.f5513c = jVar;
        this.f5514d = new b6.b(getFileSystem(), c(), j0Var, d(), 1, 2);
    }

    private final String e(String str) {
        return f.f11960d.d(str).E().p();
    }

    @Override // b6.a
    public a.b a(String str) {
        b.C0130b c0130bY = this.f5514d.Y(e(str));
        if (c0130bY != null) {
            return new b(c0130bY);
        }
        return null;
    }

    @Override // b6.a
    public a.c b(String str) {
        b.d dVarZ = this.f5514d.Z(e(str));
        if (dVarZ != null) {
            return new c(dVarZ);
        }
        return null;
    }

    public z c() {
        return this.f5512b;
    }

    public long d() {
        return this.f5511a;
    }

    @Override // b6.a
    public j getFileSystem() {
        return this.f5513c;
    }
}
