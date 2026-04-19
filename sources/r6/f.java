package r6;

import ae.r;
import android.content.Context;
import java.util.List;
import r6.c;
import r6.d;
import sc.c;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f19207a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c.b f19208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c.b f19209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f19210d;

    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19211a = new a();

        private a() {
        }

        @Override // r6.d.a
        public void a(List<t6.b> list) {
            r.f(list, "suspiciousApps");
            c.b bVar = f.f19209c;
            if (bVar != null) {
                bVar.a(list);
            }
        }

        @Override // r6.d.a
        public void b(p6.d dVar) {
            r.f(dVar, "threatType");
            c.b bVar = f.f19208b;
            if (bVar != null) {
                bVar.success(Integer.valueOf(dVar.a()));
            }
        }
    }

    private f() {
    }

    private final void i(c.b bVar) {
        c.b bVar2;
        for (p6.d dVar : d.f19200a.p()) {
            if (bVar != null) {
                bVar.success(Integer.valueOf(dVar.a()));
            }
        }
        d dVar2 = d.f19200a;
        List<t6.b> listO = dVar2.o();
        if ((!listO.isEmpty()) && (bVar2 = f19209c) != null) {
            bVar2.a(listO);
        }
        dVar2.p().clear();
        dVar2.o().clear();
    }

    public final void c(c.b bVar) {
        r.f(bVar, "eventSink");
        f19208b = bVar;
        d.f19200a.t(a.f19211a);
        i(bVar);
    }

    public final void d(Context context) {
        r.f(context, "context");
        if (f19210d) {
            return;
        }
        d.f19200a.s(context);
        f19210d = true;
    }

    public final void e(c.b bVar) {
        r.f(bVar, "sink");
        f19209c = bVar;
    }

    public final void f() {
        f19208b = null;
        d.f19200a.t(null);
    }

    public final void g(Context context) {
        r.f(context, "context");
        if (f19210d) {
            f19210d = false;
            d.f19200a.u(context);
        }
    }

    public final void h() {
        f19209c = null;
    }

    public final void j() {
        c.b bVar = f19208b;
        if (bVar != null) {
            d.f19200a.t(a.f19211a);
            f19207a.i(bVar);
        }
    }

    public final void k(Context context, t6.e eVar) {
        r.f(context, "context");
        r.f(eVar, "config");
        d(context);
        t6.c.b(context, eVar);
    }

    public final void l() {
        d.f19200a.t(null);
    }
}
