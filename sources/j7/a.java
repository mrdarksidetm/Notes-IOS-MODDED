package j7;

import ae.r;
import android.content.Context;
import android.os.Build;
import jc.a;
import k7.c;
import k7.e;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements jc.a, j.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0328a f14078c = new C0328a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f14079d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f14080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f14081b;

    /* JADX INFO: renamed from: j7.a$a, reason: collision with other inner class name */
    public static final class C0328a {
        private C0328a() {
        }

        public /* synthetic */ C0328a(ae.j jVar) {
            this();
        }

        public final boolean a() {
            return a.f14079d;
        }
    }

    public a() {
        n7.a aVar = n7.a.f15934a;
        aVar.b(new p7.a(0));
        aVar.b(new p7.a(1));
        aVar.b(new q7.a());
        aVar.b(new p7.a(3));
    }

    private final int b(i iVar) {
        f14079d = r.b((Boolean) iVar.b(), Boolean.TRUE);
        return 1;
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "binding");
        Context contextA = bVar.a();
        r.e(contextA, "getApplicationContext(...)");
        this.f14080a = contextA;
        j jVar = new j(bVar.b(), "flutter_image_compress");
        this.f14081b = jVar;
        jVar.e(this);
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        j jVar = this.f14081b;
        if (jVar != null) {
            jVar.e(null);
        }
        this.f14081b = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        int iB;
        r.f(iVar, "call");
        r.f(dVar, "result");
        String str = iVar.f20503a;
        if (str != null) {
            Context context = null;
            switch (str.hashCode()) {
                case -129880033:
                    if (str.equals("compressWithFileAndGetFile")) {
                        c cVar = new c(iVar, dVar);
                        Context context2 = this.f14080a;
                        if (context2 == null) {
                            r.t("context");
                        } else {
                            context = context2;
                        }
                        cVar.i(context);
                        return;
                    }
                    break;
                case 86054116:
                    if (str.equals("compressWithFile")) {
                        c cVar2 = new c(iVar, dVar);
                        Context context3 = this.f14080a;
                        if (context3 == null) {
                            r.t("context");
                        } else {
                            context = context3;
                        }
                        cVar2.g(context);
                        return;
                    }
                    break;
                case 86233094:
                    if (str.equals("compressWithList")) {
                        e eVar = new e(iVar, dVar);
                        Context context4 = this.f14080a;
                        if (context4 == null) {
                            r.t("context");
                        } else {
                            context = context4;
                        }
                        eVar.f(context);
                        return;
                    }
                    break;
                case 1262746611:
                    if (str.equals("getSystemVersion")) {
                        iB = Build.VERSION.SDK_INT;
                    }
                    break;
                case 2067272455:
                    if (str.equals("showLog")) {
                        iB = b(iVar);
                    }
                    break;
            }
            dVar.success(Integer.valueOf(iB));
            return;
        }
        dVar.notImplemented();
    }
}
