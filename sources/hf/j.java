package hf;

import hf.z;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11986a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f11987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f11988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f11989d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    static {
        j sVar;
        try {
            Class.forName("java.nio.file.Files");
            sVar = new t();
        } catch (ClassNotFoundException unused) {
            sVar = new s();
        }
        f11987b = sVar;
        z.a aVar = z.f12027b;
        String property = System.getProperty("java.io.tmpdir");
        ae.r.e(property, "getProperty(\"java.io.tmpdir\")");
        f11988c = z.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = p003if.c.class.getClassLoader();
        ae.r.e(classLoader, "ResourceFileSystem::class.java.classLoader");
        f11989d = new p003if.c(classLoader, false);
    }

    public final g0 a(z zVar) {
        ae.r.f(zVar, "file");
        return b(zVar, false);
    }

    public abstract g0 b(z zVar, boolean z10);

    public abstract void c(z zVar, z zVar2);

    public final void d(z zVar) {
        ae.r.f(zVar, "dir");
        e(zVar, false);
    }

    public final void e(z zVar, boolean z10) {
        ae.r.f(zVar, "dir");
        p003if.h.a(this, zVar, z10);
    }

    public final void f(z zVar) {
        ae.r.f(zVar, "dir");
        g(zVar, false);
    }

    public abstract void g(z zVar, boolean z10);

    public final void h(z zVar) {
        ae.r.f(zVar, "path");
        i(zVar, false);
    }

    public abstract void i(z zVar, boolean z10);

    public final boolean j(z zVar) {
        ae.r.f(zVar, "path");
        return p003if.h.b(this, zVar);
    }

    public abstract List<z> k(z zVar);

    public final i l(z zVar) {
        ae.r.f(zVar, "path");
        return p003if.h.c(this, zVar);
    }

    public abstract i m(z zVar);

    public abstract h n(z zVar);

    public final g0 o(z zVar) {
        ae.r.f(zVar, "file");
        return p(zVar, false);
    }

    public abstract g0 p(z zVar, boolean z10);

    public abstract i0 q(z zVar);
}
