package db;

import ae.j;
import ae.r;
import android.annotation.SuppressLint;
import android.content.Context;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c.b;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.File;
import java.io.IOException;
import xd.i;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9925a = new b(null);

    /* JADX INFO: renamed from: db.a$a, reason: collision with other inner class name */
    public interface InterfaceC0229a {
        void a();

        void b(String str);
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(j jVar) {
            this();
        }
    }

    public static final class c extends WebViewClient {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f9927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f9928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f9929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC0229a f9931f;

        c(WebView webView, Context context, String str, String str2, InterfaceC0229a interfaceC0229a) {
            this.f9927b = webView;
            this.f9928c = context;
            this.f9929d = str;
            this.f9930e = str2;
            this.f9931f = interfaceC0229a;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            r.f(webView, "view");
            r.f(str, "url");
            super.onPageFinished(webView, str);
            a.this.b(this.f9927b, this.f9928c, this.f9929d, this.f9930e, this.f9931f);
        }
    }

    public static final class d implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0229a f9932a;

        d(InterfaceC0229a interfaceC0229a) {
            this.f9932a = interfaceC0229a;
        }

        @Override // c.b.a
        public void a() {
            this.f9932a.a();
        }

        @Override // c.b.a
        public void b(String str) {
            r.f(str, "filePath");
            this.f9932a.b(str);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(String str, Context context, String str2, String str3, InterfaceC0229a interfaceC0229a) throws IOException {
        r.f(str, "filePath");
        r.f(context, "applicationContext");
        r.f(str2, "printSize");
        r.f(str3, "orientation");
        r.f(interfaceC0229a, "callback");
        WebView webView = new WebView(context);
        String strD = i.d(new File(str), je.d.f14191b);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.loadDataWithBaseURL(null, strD, "text/HTML", "UTF-8", null);
        webView.setWebViewClient(new c(webView, context, str2, str3, interfaceC0229a));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(WebView webView, Context context, String str, String str2, InterfaceC0229a interfaceC0229a) {
        r.f(webView, "webView");
        r.f(context, "applicationContext");
        r.f(str, "printSize");
        r.f(str2, "orientation");
        r.f(interfaceC0229a, "callback");
        File filesDir = context.getFilesDir();
        PrintAttributes.MediaSize mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A4;
        int iHashCode = str.hashCode();
        if (iHashCode != 64032) {
            switch (iHashCode) {
                case 2063:
                    if (str.equals("A0")) {
                        mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A0;
                    }
                    break;
                case 2064:
                    if (str.equals("A1")) {
                        mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A1;
                    }
                    break;
                case 2065:
                    if (str.equals("A2")) {
                        mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A2;
                    }
                    break;
                case 2066:
                    if (str.equals("A3")) {
                        mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A3;
                    }
                    break;
                case 2067:
                    if (str.equals("A4")) {
                        mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A4;
                    }
                    break;
                case 2068:
                    if (str.equals("A5")) {
                        mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A5;
                    }
                    break;
                case 2069:
                    if (str.equals("A6")) {
                        mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A6;
                    }
                    break;
                case 2070:
                    if (str.equals("A7")) {
                        mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A7;
                    }
                    break;
                case 2071:
                    if (str.equals("A8")) {
                        mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A8;
                    }
                    break;
                case 2072:
                    if (str.equals("A9")) {
                        mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A9;
                    }
                    break;
            }
        } else if (str.equals("A10")) {
            mediaSizeAsPortrait = PrintAttributes.MediaSize.ISO_A10;
        }
        if (r.b(str2, "LANDSCAPE")) {
            mediaSizeAsPortrait = mediaSizeAsPortrait.asLandscape();
        } else if (r.b(str2, "PORTRAIT")) {
            mediaSizeAsPortrait = mediaSizeAsPortrait.asPortrait();
        }
        PrintAttributes printAttributesBuild = new PrintAttributes.Builder().setMediaSize(mediaSizeAsPortrait).setResolution(new PrintAttributes.Resolution("pdf", "pdf", RCHTTPStatusCodes.UNSUCCESSFUL, RCHTTPStatusCodes.UNSUCCESSFUL)).setMinMargins(PrintAttributes.Margins.NO_MARGINS).build();
        r.e(printAttributesBuild, "build(...)");
        c.b bVar = new c.b(printAttributesBuild);
        webView.createPrintDocumentAdapter();
        PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView.createPrintDocumentAdapter("TemporaryDocumentName");
        r.c(printDocumentAdapterCreatePrintDocumentAdapter);
        r.c(filesDir);
        bVar.a(printDocumentAdapterCreatePrintDocumentAdapter, filesDir, "TemporaryDocumentFile.pdf", new d(interfaceC0229a));
    }
}
