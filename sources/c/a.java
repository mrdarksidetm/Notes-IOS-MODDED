package c;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c.a$a, reason: collision with other inner class name */
    class C0140a extends PrintDocumentAdapter.LayoutResultCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f5878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f5879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PrintDocumentAdapter f5880c;

        /* JADX INFO: renamed from: c.a$a$a, reason: collision with other inner class name */
        class C0141a extends PrintDocumentAdapter.WriteResultCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f5881a;

            C0141a(File file) {
                this.f5881a = file;
            }

            @Override // android.print.PrintDocumentAdapter.WriteResultCallback
            public void onWriteFinished(PageRange[] pageRangeArr) {
                super.onWriteFinished(pageRangeArr);
                if (pageRangeArr.length == 0) {
                    if (!this.f5881a.delete()) {
                        Log.e("PDF", "Unable to delete temporary file");
                    }
                    C0140a.this.f5879b.b("No page created");
                }
                C0140a.this.f5879b.a(this.f5881a);
                if (this.f5881a.delete()) {
                    return;
                }
                Log.e("PDF", "Unable to delete temporary file");
            }
        }

        C0140a(Context context, b bVar, PrintDocumentAdapter printDocumentAdapter) {
            this.f5878a = context;
            this.f5879b = bVar;
            this.f5880c = printDocumentAdapter;
        }

        @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
        public void onLayoutFinished(PrintDocumentInfo printDocumentInfo, boolean z10) {
            try {
                File fileCreateTempFile = File.createTempFile("printing", "pdf", this.f5878a.getCacheDir());
                try {
                    this.f5880c.onWrite(new PageRange[]{PageRange.ALL_PAGES}, ParcelFileDescriptor.open(fileCreateTempFile, 805306368), new CancellationSignal(), new C0141a(fileCreateTempFile));
                } catch (FileNotFoundException e10) {
                    if (!fileCreateTempFile.delete()) {
                        Log.e("PDF", "Unable to delete temporary file");
                    }
                    this.f5879b.b(e10.getMessage());
                }
            } catch (IOException e11) {
                this.f5879b.b(e11.getMessage());
            }
        }
    }

    public interface b {
        void a(File file);

        void b(String str);
    }

    public static void a(Context context, PrintDocumentAdapter printDocumentAdapter, PrintAttributes printAttributes, b bVar) {
        printDocumentAdapter.onLayout(null, printAttributes, null, new C0140a(context, bVar, printDocumentAdapter), null);
    }

    public static byte[] b(File file) throws IOException {
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            if (fileInputStream.read(bArr) == -1) {
                throw new IOException("EOF reached while trying to read the whole file");
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
