package w5;

import ae.r;
import android.content.Intent;
import android.net.Uri;
import i.f;
import java.io.File;
import java.io.IOException;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.activity.a f22477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<String, i0> f22478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.a<i0> f22479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f22480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h.d<Intent> f22481e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(androidx.activity.a aVar, l<? super String, i0> lVar, zd.a<i0> aVar2) {
        r.f(aVar, "activity");
        r.f(lVar, "onPhotoCaptureSuccess");
        r.f(aVar2, "onCancelPhoto");
        this.f22477a = aVar;
        this.f22478b = lVar;
        this.f22479c = aVar2;
        h.d<Intent> dVarRegisterForActivityResult = aVar.registerForActivityResult(new f(), new h.b() { // from class: w5.a
            @Override // h.b
            public final void onActivityResult(Object obj) {
                b.c(this.f22476a, (h.a) obj);
            }
        });
        r.e(dVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f22481e = dVarRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b bVar, h.a aVar) {
        r.f(bVar, "this$0");
        r.f(aVar, "result");
        int iB = aVar.b();
        String str = null;
        if (iB == -1) {
            l<String, i0> lVar = bVar.f22478b;
            String str2 = bVar.f22480d;
            if (str2 == null) {
                r.t("photoFilePath");
            } else {
                str = str2;
            }
            lVar.invoke(str);
            return;
        }
        if (iB != 0) {
            return;
        }
        String str3 = bVar.f22480d;
        if (str3 == null) {
            r.t("photoFilePath");
        } else {
            str = str3;
        }
        new File(str).delete();
        bVar.f22479c.invoke();
    }

    public final void b(int i10) throws IOException {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File fileA = new c().a(this.f22477a, i10);
        String absolutePath = fileA.getAbsolutePath();
        r.e(absolutePath, "getAbsolutePath(...)");
        this.f22480d = absolutePath;
        Uri uriForFile = androidx.core.content.b.getUriForFile(this.f22477a, this.f22477a.getPackageName() + ".DocumentScannerFileProvider", fileA);
        r.e(uriForFile, "getUriForFile(...)");
        intent.putExtra("output", uriForFile);
        this.f22481e.a(intent);
    }
}
