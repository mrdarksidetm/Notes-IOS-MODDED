package androidx.webkit.internal;

import android.webkit.TracingController;
import androidx.webkit.internal.a;
import g5.l0;
import g5.q;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class i extends f5.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TracingController f4953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TracingControllerBoundaryInterface f4954b;

    public i() {
        a.g gVar = m.L;
        if (gVar.c()) {
            this.f4953a = q.a();
            this.f4954b = null;
        } else {
            if (!gVar.d()) {
                throw m.a();
            }
            this.f4953a = null;
            this.f4954b = l0.d().getTracingController();
        }
    }

    private TracingControllerBoundaryInterface e() {
        if (this.f4954b == null) {
            this.f4954b = l0.d().getTracingController();
        }
        return this.f4954b;
    }

    private TracingController f() {
        if (this.f4953a == null) {
            this.f4953a = q.a();
        }
        return this.f4953a;
    }

    @Override // f5.k
    public boolean b() {
        a.g gVar = m.L;
        if (gVar.c()) {
            return q.d(f());
        }
        if (gVar.d()) {
            return e().isTracing();
        }
        throw m.a();
    }

    @Override // f5.k
    public void c(f5.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
        a.g gVar = m.L;
        if (gVar.c()) {
            q.f(f(), jVar);
        } else {
            if (!gVar.d()) {
                throw m.a();
            }
            e().start(jVar.b(), jVar.a(), jVar.c());
        }
    }

    @Override // f5.k
    public boolean d(OutputStream outputStream, Executor executor) {
        a.g gVar = m.L;
        if (gVar.c()) {
            return q.g(f(), outputStream, executor);
        }
        if (gVar.d()) {
            return e().stop(outputStream, executor);
        }
        throw m.a();
    }
}
