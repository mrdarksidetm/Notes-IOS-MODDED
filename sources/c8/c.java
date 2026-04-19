package c8;

import d8.x;
import f8.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import w7.o;
import w7.t;
import x7.m;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f6576f = Logger.getLogger(t.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f6577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f6578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.e f6579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e8.d f6580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f8.b f6581e;

    public c(Executor executor, x7.e eVar, x xVar, e8.d dVar, f8.b bVar) {
        this.f6578b = executor;
        this.f6579c = eVar;
        this.f6577a = xVar;
        this.f6580d = dVar;
        this.f6581e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(o oVar, w7.i iVar) {
        this.f6580d.N(oVar, iVar);
        this.f6577a.a(oVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final o oVar, u7.h hVar, w7.i iVar) {
        try {
            m mVarA = this.f6579c.a(oVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", oVar.b());
                f6576f.warning(str);
                hVar.a(new IllegalArgumentException(str));
            } else {
                final w7.i iVarB = mVarA.b(iVar);
                this.f6581e.a(new b.a() { // from class: c8.b
                    @Override // f8.b.a
                    public final Object a() {
                        return this.f6573a.d(oVar, iVarB);
                    }
                });
                hVar.a(null);
            }
        } catch (Exception e10) {
            f6576f.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    @Override // c8.e
    public void a(final o oVar, final w7.i iVar, final u7.h hVar) {
        this.f6578b.execute(new Runnable() { // from class: c8.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f6569a.e(oVar, hVar, iVar);
            }
        });
    }
}
