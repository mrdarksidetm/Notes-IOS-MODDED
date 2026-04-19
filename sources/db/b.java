package db;

import ae.r;
import android.content.Context;
import db.a;
import java.io.IOException;
import jc.a;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements jc.a, j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f9933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9934b;

    public static final class a implements a.InterfaceC0229a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j.d f9935a;

        a(j.d dVar) {
            this.f9935a = dVar;
        }

        @Override // db.a.InterfaceC0229a
        public void a() {
            this.f9935a.error("ERROR", "Unable to convert html to pdf document!", "");
        }

        @Override // db.a.InterfaceC0229a
        public void b(String str) {
            r.f(str, "filePath");
            this.f9935a.success(str);
        }
    }

    private final void a(i iVar, j.d dVar) throws IOException {
        String str = (String) iVar.a("htmlFilePath");
        String str2 = (String) iVar.a("printSize");
        String str3 = (String) iVar.a("orientation");
        db.a aVar = new db.a();
        r.c(str);
        Context context = this.f9934b;
        if (context == null) {
            r.t("applicationContext");
            context = null;
        }
        r.c(str2);
        r.c(str3);
        aVar.a(str, context, str2, str3, new a(dVar));
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "flutterPluginBinding");
        j jVar = new j(bVar.b(), "html_to_pdf");
        this.f9933a = jVar;
        jVar.e(this);
        Context contextA = bVar.a();
        r.e(contextA, "getApplicationContext(...)");
        this.f9934b = contextA;
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        j jVar = this.f9933a;
        if (jVar == null) {
            r.t("channel");
            jVar = null;
        }
        jVar.e(null);
    }

    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) throws IOException {
        r.f(iVar, "call");
        r.f(dVar, "result");
        if (r.b(iVar.f20503a, "convertHtmlToPdf")) {
            a(iVar, dVar);
        } else {
            dVar.notImplemented();
        }
    }
}
