package ef;

import android.content.Context;
import android.print.PrintAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class a implements j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sc.j f10968b;

    /* JADX INFO: renamed from: ef.a$a, reason: collision with other inner class name */
    class C0262a implements j.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f10969a;

        C0262a(j jVar) {
            this.f10969a = jVar;
        }

        @Override // sc.j.d
        public void error(String str, String str2, Object obj) {
            this.f10969a.k(str2);
        }

        @Override // sc.j.d
        public void notImplemented() {
            this.f10969a.k("notImplemented");
        }

        @Override // sc.j.d
        public void success(Object obj) {
            if (obj instanceof byte[]) {
                this.f10969a.y((byte[]) obj);
            } else {
                this.f10969a.k("Unknown data received");
            }
        }
    }

    a(Context context, sc.j jVar) {
        this.f10967a = context;
        this.f10968b = jVar;
    }

    void a(j jVar, boolean z10, String str) {
        HashMap map = new HashMap();
        map.put("completed", Boolean.valueOf(z10));
        map.put("error", str);
        map.put("job", Integer.valueOf(jVar.f10996g));
        this.f10968b.c("onCompleted", map);
    }

    void b(j jVar, String str) {
        HashMap map = new HashMap();
        map.put("error", str);
        map.put("job", Integer.valueOf(jVar.f10996g));
        this.f10968b.c("onHtmlError", map);
    }

    void c(j jVar, byte[] bArr) {
        HashMap map = new HashMap();
        map.put("doc", bArr);
        map.put("job", Integer.valueOf(jVar.f10996g));
        this.f10968b.c("onHtmlRendered", map);
    }

    void d(j jVar, Double d10, double d11, double d12, double d13, double d14, double d15) {
        HashMap map = new HashMap();
        map.put("width", d10);
        map.put("height", Double.valueOf(d11));
        map.put("marginLeft", Double.valueOf(d12));
        map.put("marginTop", Double.valueOf(d13));
        map.put("marginRight", Double.valueOf(d14));
        map.put("marginBottom", Double.valueOf(d15));
        map.put("job", Integer.valueOf(jVar.f10996g));
        this.f10968b.d("onLayout", map, new C0262a(jVar));
    }

    void e(j jVar, String str) {
        HashMap map = new HashMap();
        map.put("job", Integer.valueOf(jVar.f10996g));
        if (str != null) {
            map.put("error", str);
        }
        this.f10968b.c("onPageRasterEnd", map);
    }

    void f(j jVar, byte[] bArr, int i10, int i11) {
        HashMap map = new HashMap();
        map.put("image", bArr);
        map.put("width", Integer.valueOf(i10));
        map.put("height", Integer.valueOf(i11));
        map.put("job", Integer.valueOf(jVar.f10996g));
        this.f10968b.c("onPageRasterized", map);
    }

    @Override // sc.j.c
    public void onMethodCall(sc.i iVar, j.d dVar) {
        Object objW;
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "printPdf":
                new j(this.f10967a, this, ((Integer) iVar.a("job")).intValue()).v((String) iVar.a("name"), (Double) iVar.a("width"), (Double) iVar.a("height"));
                objW = 1;
                dVar.success(objW);
                break;
            case "convertHtml":
                Double d10 = (Double) iVar.a("width");
                Double d11 = (Double) iVar.a("height");
                Double d12 = (Double) iVar.a("marginLeft");
                Double d13 = (Double) iVar.a("marginTop");
                Double d14 = (Double) iVar.a("marginRight");
                Double d15 = (Double) iVar.a("marginBottom");
                j jVar = new j(this.f10967a, this, ((Integer) iVar.a("job")).intValue());
                PrintAttributes.Margins margins = new PrintAttributes.Margins(Double.valueOf(d12.doubleValue() * 1000.0d).intValue(), Double.valueOf((d13.doubleValue() * 1000.0d) / 72.0d).intValue(), Double.valueOf((d14.doubleValue() * 1000.0d) / 72.0d).intValue(), Double.valueOf((d15.doubleValue() * 1000.0d) / 72.0d).intValue());
                jVar.l((String) iVar.a("html"), new PrintAttributes.MediaSize("flutter_printing", "Provided size", Double.valueOf((d10.doubleValue() * 1000.0d) / 72.0d).intValue(), Double.valueOf((d11.doubleValue() * 1000.0d) / 72.0d).intValue()), margins, (String) iVar.a("baseUrl"));
                objW = 1;
                dVar.success(objW);
                break;
            case "sharePdf":
                j.z(this.f10967a, (byte[]) iVar.a("doc"), (String) iVar.a("name"), (String) iVar.a("subject"), (String) iVar.a("body"), (ArrayList) iVar.a("emails"));
                objW = 1;
                dVar.success(objW);
                break;
            case "rasterPdf":
                new j(this.f10967a, this, ((Integer) iVar.a("job")).intValue()).x((byte[]) iVar.a("doc"), (ArrayList) iVar.a("pages"), (Double) iVar.a("scale"));
                objW = 1;
                dVar.success(objW);
                break;
            case "printingInfo":
                objW = j.w();
                dVar.success(objW);
                break;
            case "cancelJob":
                new j(this.f10967a, this, ((Integer) iVar.a("job")).intValue()).k(null);
                objW = 1;
                dVar.success(objW);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }
}
