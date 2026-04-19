package p6;

import ae.r;
import android.content.Context;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import jc.a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements jc.a, kc.a, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r6.e f18236a = new r6.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r6.c f18237b = new r6.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f18239d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18240a;

        static {
            int[] iArr = new int[g.a.values().length];
            try {
                iArr[g.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18240a = iArr;
        }
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        r.f(cVar, "binding");
        g gVarA = nc.a.a(cVar);
        gVarA.a(this);
        this.f18239d = gVarA;
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "flutterPluginBinding");
        sc.b bVarB = bVar.b();
        r.e(bVarB, "getBinaryMessenger(...)");
        this.f18238c = bVar.a();
        r6.c cVar = this.f18237b;
        Context contextA = bVar.a();
        r.e(contextA, "getApplicationContext(...)");
        cVar.g(bVarB, contextA);
        this.f18236a.c(bVarB);
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        g gVar = this.f18239d;
        if (gVar != null) {
            gVar.c(this);
        }
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        g gVar = this.f18239d;
        if (gVar != null) {
            gVar.c(this);
        }
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        this.f18237b.h();
        this.f18236a.d();
        r6.f fVar = r6.f.f19207a;
        Context contextA = bVar.a();
        r.e(contextA, "getApplicationContext(...)");
        fVar.g(contextA);
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        r.f(cVar, "binding");
        g gVarA = nc.a.a(cVar);
        this.f18239d = gVarA;
        if (gVarA != null) {
            gVarA.a(this);
        }
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        r.f(eVar, "source");
        r.f(aVar, "event");
        int i10 = a.f18240a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.f18238c != null) {
                r6.f.f19207a.j();
            }
        } else if (i10 == 2 && this.f18238c != null) {
            r6.f.f19207a.l();
        }
    }
}
