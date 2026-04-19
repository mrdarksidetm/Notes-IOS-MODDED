package okhttp3;

import ae.j;
import ae.r;
import hf.c;
import hf.e;
import hf.f;
import hf.i0;
import hf.j0;
import hf.x;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class MultipartReader implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f16882e = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x f16883f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f16884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f16885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PartSource f16887d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public static final class Part implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f16888a;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f16888a.close();
        }
    }

    private final class PartSource implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j0 f16889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MultipartReader f16890b;

        @Override // hf.i0
        public long X(c cVar, long j10) {
            r.f(cVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(r.m("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!r.b(this.f16890b.f16887d, this)) {
                throw new IllegalStateException("closed".toString());
            }
            j0 j0VarE = this.f16890b.f16884a.e();
            j0 j0Var = this.f16889a;
            MultipartReader multipartReader = this.f16890b;
            long jH = j0VarE.h();
            long jA = j0.f11990d.a(j0Var.h(), j0VarE.h());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            j0VarE.g(jA, timeUnit);
            if (!j0VarE.e()) {
                if (j0Var.e()) {
                    j0VarE.d(j0Var.c());
                }
                try {
                    long jW = multipartReader.w(j10);
                    long jX = jW == 0 ? -1L : multipartReader.f16884a.X(cVar, jW);
                    j0VarE.g(jH, timeUnit);
                    if (j0Var.e()) {
                        j0VarE.a();
                    }
                    return jX;
                } catch (Throwable th) {
                    j0VarE.g(jH, TimeUnit.NANOSECONDS);
                    if (j0Var.e()) {
                        j0VarE.a();
                    }
                    throw th;
                }
            }
            long jC = j0VarE.c();
            if (j0Var.e()) {
                j0VarE.d(Math.min(j0VarE.c(), j0Var.c()));
            }
            try {
                long jW2 = multipartReader.w(j10);
                long jX2 = jW2 == 0 ? -1L : multipartReader.f16884a.X(cVar, jW2);
                j0VarE.g(jH, timeUnit);
                if (j0Var.e()) {
                    j0VarE.d(jC);
                }
                return jX2;
            } catch (Throwable th2) {
                j0VarE.g(jH, TimeUnit.NANOSECONDS);
                if (j0Var.e()) {
                    j0VarE.d(jC);
                }
                throw th2;
            }
        }

        @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (r.b(this.f16890b.f16887d, this)) {
                this.f16890b.f16887d = null;
            }
        }

        @Override // hf.i0
        public j0 e() {
            return this.f16889a;
        }
    }

    static {
        x.a aVar = x.f12022d;
        f.a aVar2 = f.f11960d;
        f16883f = aVar.d(aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d("\t"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long w(long j10) {
        this.f16884a.b0(this.f16885b.F());
        long jP = this.f16884a.d().P(this.f16885b);
        if (jP == -1) {
            jP = (this.f16884a.d().size() - ((long) this.f16885b.F())) + 1;
        }
        return Math.min(j10, jP);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f16886c) {
            return;
        }
        this.f16886c = true;
        this.f16887d = null;
        this.f16884a.close();
    }
}
