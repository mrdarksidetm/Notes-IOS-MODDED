package c;

import ae.r;
import android.os.CancellationSignal;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PrintAttributes f5883a;

    public interface a {
        void a();

        void b(String str);
    }

    /* JADX INFO: renamed from: c.b$b, reason: collision with other inner class name */
    public static final class C0142b extends PrintDocumentAdapter.LayoutResultCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PrintDocumentAdapter f5884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f5885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f5887d;

        /* JADX INFO: renamed from: c.b$b$a */
        public static final class a extends PrintDocumentAdapter.WriteResultCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f5888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f5889b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f5890c;

            a(a aVar, File file, String str) {
                this.f5888a = aVar;
                this.f5889b = file;
                this.f5890c = str;
            }

            @Override // android.print.PrintDocumentAdapter.WriteResultCallback
            public void onWriteFinished(PageRange[] pageRangeArr) {
                r.f(pageRangeArr, "pages");
                super.onWriteFinished(pageRangeArr);
                if (pageRangeArr.length == 0) {
                    this.f5888a.a();
                }
                File file = new File(this.f5889b, this.f5890c);
                a aVar = this.f5888a;
                String absolutePath = file.getAbsolutePath();
                r.e(absolutePath, "getAbsolutePath(...)");
                aVar.b(absolutePath);
            }
        }

        C0142b(PrintDocumentAdapter printDocumentAdapter, File file, String str, a aVar) {
            this.f5884a = printDocumentAdapter;
            this.f5885b = file;
            this.f5886c = str;
            this.f5887d = aVar;
        }

        @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
        public void onLayoutFinished(PrintDocumentInfo printDocumentInfo, boolean z10) {
            r.f(printDocumentInfo, "info");
            this.f5884a.onWrite(new PageRange[]{PageRange.ALL_PAGES}, c.b(this.f5885b, this.f5886c), new CancellationSignal(), new a(this.f5887d, this.f5885b, this.f5886c));
        }
    }

    public b(PrintAttributes printAttributes) {
        r.f(printAttributes, "printAttributes");
        this.f5883a = printAttributes;
    }

    public final void a(PrintDocumentAdapter printDocumentAdapter, File file, String str, a aVar) {
        r.f(printDocumentAdapter, "printAdapter");
        r.f(file, "path");
        r.f(str, "fileName");
        r.f(aVar, "callback");
        printDocumentAdapter.onLayout(null, this.f5883a, null, new C0142b(printDocumentAdapter, file, str, aVar), null);
    }
}
