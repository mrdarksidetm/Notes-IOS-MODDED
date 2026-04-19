package ef;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintJob;
import android.print.PrintManager;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c.a;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Thread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class j extends PrintDocumentAdapter {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static PrintManager f10989h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ef.a f10991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PrintJob f10992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f10993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PrintDocumentAdapter.LayoutResultCallback f10995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f10996g;

    class a extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PrintAttributes.MediaSize f10997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrintAttributes.Margins f10998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f10999c;

        /* JADX INFO: renamed from: ef.j$a$a, reason: collision with other inner class name */
        class C0263a implements a.b {
            C0263a() {
            }

            @Override // c.a.b
            public void a(File file) {
                try {
                    j.this.f10991b.c(j.this, c.a.b(file));
                } catch (IOException e10) {
                    b(e10.getMessage());
                }
            }

            @Override // c.a.b
            public void b(String str) {
                j.this.f10991b.b(j.this, str);
            }
        }

        a(PrintAttributes.MediaSize mediaSize, PrintAttributes.Margins margins, WebView webView) {
            this.f10997a = mediaSize;
            this.f10998b = margins;
            this.f10999c = webView;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PrintAttributes printAttributesBuild = new PrintAttributes.Builder().setMediaSize(this.f10997a).setResolution(new PrintAttributes.Resolution("pdf", "pdf", 600, 600)).setMinMargins(this.f10998b).build();
            c.a.a(j.this.f10990a, this.f10999c.createPrintDocumentAdapter("printing"), printAttributesBuild, new C0263a());
        }
    }

    j(Context context, ef.a aVar, int i10) {
        this.f10990a = context;
        this.f10991b = aVar;
        this.f10996g = i10;
        f10989h = (PrintManager) context.getSystemService("print");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(boolean[] zArr) {
        PrintJob printJob = this.f10992c;
        int state = printJob == null ? 6 : printJob.getInfo().getState();
        if (state == 5) {
            this.f10991b.a(this, true, null);
            zArr[0] = false;
        } else if (state == 7) {
            this.f10991b.a(this, false, null);
            zArr[0] = false;
        } else if (state == 6) {
            this.f10991b.a(this, false, "Unable to print");
            zArr[0] = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Exception exc) {
        ef.a aVar = this.f10991b;
        PrintJob printJob = this.f10992c;
        aVar.a(this, printJob != null && printJob.isCompleted(), exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        final boolean[] zArr;
        int i10;
        try {
            zArr = new boolean[]{true};
            i10 = 3000;
        } catch (Exception e10) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ef.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10985a.o(e10);
                }
            });
        }
        while (zArr[0]) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ef.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10983a.n(zArr);
                }
            });
            i10--;
            if (i10 <= 0) {
                throw new Exception("Timeout waiting for the job to finish");
            }
            if (zArr[0]) {
                Thread.sleep(200L);
            }
            this.f10992c = null;
        }
        this.f10992c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(ByteBuffer byteBuffer, int i10, int i11) {
        this.f10991b.f(this, byteBuffer.array(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(String str) {
        this.f10991b.e(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(byte[] bArr, ArrayList arrayList, Double d10) {
        final String message = null;
        try {
            File fileCreateTempFile = File.createTempFile("printing", null, this.f10990a.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
            PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.dup(fileInputStream.getFD()));
            if (!fileCreateTempFile.delete()) {
                Log.e("PDF", "Unable to delete temporary file");
            }
            int size = arrayList != null ? arrayList.size() : pdfRenderer.getPageCount();
            for (int i10 = 0; i10 < size; i10++) {
                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(arrayList == null ? i10 : ((Integer) arrayList.get(i10)).intValue());
                final int iIntValue = Double.valueOf(((double) pageOpenPage.getWidth()) * d10.doubleValue()).intValue();
                final int iIntValue2 = Double.valueOf(((double) pageOpenPage.getHeight()) * d10.doubleValue()).intValue();
                Matrix matrix = new Matrix();
                matrix.setScale(d10.floatValue(), d10.floatValue());
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
                pageOpenPage.render(bitmapCreateBitmap, null, matrix, 1);
                pageOpenPage.close();
                final ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iIntValue * 4 * iIntValue2);
                bitmapCreateBitmap.copyPixelsToBuffer(byteBufferAllocate);
                bitmapCreateBitmap.recycle();
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ef.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10977a.q(byteBufferAllocate, iIntValue, iIntValue2);
                    }
                });
            }
            pdfRenderer.close();
            fileInputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
            message = e10.getMessage();
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ef.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f10981a.r(message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(String str) {
        this.f10991b.e(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Thread thread, Throwable th) {
        final String message = th.getMessage();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ef.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f10987a.t(message);
            }
        });
    }

    static HashMap<String, Object> w() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("directPrint", Boolean.FALSE);
        map.put("dynamicLayout", true);
        map.put("canPrint", true);
        map.put("canShare", Boolean.TRUE);
        map.put("canRaster", true);
        return map;
    }

    static void z(Context context, byte[] bArr, String str, String str2, String str3, ArrayList<String> arrayList) {
        try {
            File file = new File(context.getCacheDir(), "share");
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Unable to create cache directory");
            }
            File file2 = new File(file, str);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            Uri uriForFile = androidx.core.content.b.getUriForFile(context, context.getApplicationContext().getPackageName() + ".flutter.printing", file2);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("application/pdf");
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
            intent.putExtra("android.intent.extra.TEXT", str3);
            intent.putExtra("android.intent.extra.EMAIL", arrayList != null ? (String[]) arrayList.toArray(new String[0]) : null);
            Intent intentCreateChooser = Intent.createChooser(intent, null);
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intentCreateChooser, 65536).iterator();
            while (it.hasNext()) {
                context.grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
            }
            context.startActivity(intentCreateChooser);
            file2.deleteOnExit();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    void k(String str) {
        PrintDocumentAdapter.LayoutResultCallback layoutResultCallback = this.f10995f;
        if (layoutResultCallback != null) {
            layoutResultCallback.onLayoutCancelled();
        }
        PrintJob printJob = this.f10992c;
        if (printJob != null) {
            printJob.cancel();
        }
        this.f10991b.a(this, false, str);
    }

    void l(String str, PrintAttributes.MediaSize mediaSize, PrintAttributes.Margins margins, String str2) {
        Configuration configuration = this.f10990a.getResources().getConfiguration();
        configuration.fontScale = 1.0f;
        WebView webView = new WebView(this.f10990a.createConfigurationContext(configuration));
        webView.loadDataWithBaseURL(str2, str, "text/HTML", "UTF-8", null);
        webView.setWebViewClient(new a(mediaSize, margins, webView));
    }

    List<PrintAttributes.MediaSize> m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PrintAttributes.MediaSize.ISO_A0);
        arrayList.add(PrintAttributes.MediaSize.ISO_A1);
        arrayList.add(PrintAttributes.MediaSize.ISO_A2);
        arrayList.add(PrintAttributes.MediaSize.ISO_A3);
        arrayList.add(PrintAttributes.MediaSize.ISO_A4);
        arrayList.add(PrintAttributes.MediaSize.ISO_A5);
        arrayList.add(PrintAttributes.MediaSize.ISO_A6);
        arrayList.add(PrintAttributes.MediaSize.ISO_A7);
        arrayList.add(PrintAttributes.MediaSize.ISO_A8);
        arrayList.add(PrintAttributes.MediaSize.ISO_A9);
        arrayList.add(PrintAttributes.MediaSize.ISO_A10);
        arrayList.add(PrintAttributes.MediaSize.ISO_B0);
        arrayList.add(PrintAttributes.MediaSize.ISO_B1);
        arrayList.add(PrintAttributes.MediaSize.ISO_B2);
        arrayList.add(PrintAttributes.MediaSize.ISO_B3);
        arrayList.add(PrintAttributes.MediaSize.ISO_B4);
        arrayList.add(PrintAttributes.MediaSize.ISO_B5);
        arrayList.add(PrintAttributes.MediaSize.ISO_B6);
        arrayList.add(PrintAttributes.MediaSize.ISO_B7);
        arrayList.add(PrintAttributes.MediaSize.ISO_B8);
        arrayList.add(PrintAttributes.MediaSize.ISO_B9);
        arrayList.add(PrintAttributes.MediaSize.ISO_B10);
        arrayList.add(PrintAttributes.MediaSize.ISO_C0);
        arrayList.add(PrintAttributes.MediaSize.ISO_C1);
        arrayList.add(PrintAttributes.MediaSize.ISO_C2);
        arrayList.add(PrintAttributes.MediaSize.ISO_C3);
        arrayList.add(PrintAttributes.MediaSize.ISO_C4);
        arrayList.add(PrintAttributes.MediaSize.ISO_C5);
        arrayList.add(PrintAttributes.MediaSize.ISO_C6);
        arrayList.add(PrintAttributes.MediaSize.ISO_C7);
        arrayList.add(PrintAttributes.MediaSize.ISO_C8);
        arrayList.add(PrintAttributes.MediaSize.ISO_C9);
        arrayList.add(PrintAttributes.MediaSize.ISO_C10);
        arrayList.add(PrintAttributes.MediaSize.NA_LETTER);
        arrayList.add(PrintAttributes.MediaSize.NA_GOVT_LETTER);
        arrayList.add(PrintAttributes.MediaSize.NA_LEGAL);
        arrayList.add(PrintAttributes.MediaSize.NA_JUNIOR_LEGAL);
        arrayList.add(PrintAttributes.MediaSize.NA_LEDGER);
        arrayList.add(PrintAttributes.MediaSize.NA_TABLOID);
        arrayList.add(PrintAttributes.MediaSize.NA_INDEX_3X5);
        arrayList.add(PrintAttributes.MediaSize.NA_INDEX_4X6);
        arrayList.add(PrintAttributes.MediaSize.NA_INDEX_5X8);
        arrayList.add(PrintAttributes.MediaSize.NA_MONARCH);
        arrayList.add(PrintAttributes.MediaSize.NA_QUARTO);
        arrayList.add(PrintAttributes.MediaSize.NA_FOOLSCAP);
        arrayList.add(PrintAttributes.MediaSize.ROC_8K);
        arrayList.add(PrintAttributes.MediaSize.ROC_16K);
        arrayList.add(PrintAttributes.MediaSize.PRC_1);
        arrayList.add(PrintAttributes.MediaSize.PRC_2);
        arrayList.add(PrintAttributes.MediaSize.PRC_3);
        arrayList.add(PrintAttributes.MediaSize.PRC_4);
        arrayList.add(PrintAttributes.MediaSize.PRC_5);
        arrayList.add(PrintAttributes.MediaSize.PRC_6);
        arrayList.add(PrintAttributes.MediaSize.PRC_7);
        arrayList.add(PrintAttributes.MediaSize.PRC_8);
        arrayList.add(PrintAttributes.MediaSize.PRC_9);
        arrayList.add(PrintAttributes.MediaSize.PRC_10);
        arrayList.add(PrintAttributes.MediaSize.PRC_16K);
        arrayList.add(PrintAttributes.MediaSize.OM_PA_KAI);
        arrayList.add(PrintAttributes.MediaSize.OM_DAI_PA_KAI);
        arrayList.add(PrintAttributes.MediaSize.OM_JUURO_KU_KAI);
        arrayList.add(PrintAttributes.MediaSize.JIS_B10);
        arrayList.add(PrintAttributes.MediaSize.JIS_B9);
        arrayList.add(PrintAttributes.MediaSize.JIS_B8);
        arrayList.add(PrintAttributes.MediaSize.JIS_B7);
        arrayList.add(PrintAttributes.MediaSize.JIS_B6);
        arrayList.add(PrintAttributes.MediaSize.JIS_B5);
        arrayList.add(PrintAttributes.MediaSize.JIS_B4);
        arrayList.add(PrintAttributes.MediaSize.JIS_B3);
        arrayList.add(PrintAttributes.MediaSize.JIS_B2);
        arrayList.add(PrintAttributes.MediaSize.JIS_B1);
        arrayList.add(PrintAttributes.MediaSize.JIS_B0);
        arrayList.add(PrintAttributes.MediaSize.JIS_EXEC);
        arrayList.add(PrintAttributes.MediaSize.JPN_CHOU4);
        arrayList.add(PrintAttributes.MediaSize.JPN_CHOU3);
        arrayList.add(PrintAttributes.MediaSize.JPN_CHOU2);
        arrayList.add(PrintAttributes.MediaSize.JPN_HAGAKI);
        arrayList.add(PrintAttributes.MediaSize.JPN_OUFUKU);
        arrayList.add(PrintAttributes.MediaSize.JPN_KAHU);
        arrayList.add(PrintAttributes.MediaSize.JPN_KAKU2);
        arrayList.add(PrintAttributes.MediaSize.JPN_YOU4);
        return arrayList;
    }

    @Override // android.print.PrintDocumentAdapter
    public void onFinish() {
        new Thread(new Runnable() { // from class: ef.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f10971a.p();
            }
        }).start();
    }

    @Override // android.print.PrintDocumentAdapter
    public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
            return;
        }
        this.f10995f = layoutResultCallback;
        PrintAttributes.MediaSize mediaSize = printAttributes2.getMediaSize();
        PrintAttributes.Margins minMargins = printAttributes2.getMinMargins();
        this.f10991b.d(this, Double.valueOf((((double) mediaSize.getWidthMils()) * 72.0d) / 1000.0d), (((double) mediaSize.getHeightMils()) * 72.0d) / 1000.0d, (((double) minMargins.getLeftMils()) * 72.0d) / 1000.0d, (((double) minMargins.getTopMils()) * 72.0d) / 1000.0d, (((double) minMargins.getRightMils()) * 72.0d) / 1000.0d, (((double) minMargins.getBottomMils()) * 72.0d) / 1000.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.CancellationSignal] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0032 -> B:27:0x0035). Please report as a decompilation issue!!! */
    @Override // android.print.PrintDocumentAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onWrite(android.print.PageRange[] r2, android.os.ParcelFileDescriptor r3, android.os.CancellationSignal r4, android.print.PrintDocumentAdapter.WriteResultCallback r5) throws java.lang.Throwable {
        /*
            r1 = this;
            r2 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L25
            java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L25
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L25
            byte[] r2 = r1.f10993d     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L36
            int r3 = r2.length     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L36
            r0 = 0
            r4.write(r2, r0, r3)     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L36
            r2 = 1
            android.print.PageRange[] r2 = new android.print.PageRange[r2]     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L36
            android.print.PageRange r3 = android.print.PageRange.ALL_PAGES     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L36
            r2[r0] = r3     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L36
            r5.onWriteFinished(r2)     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L36
            r4.close()     // Catch: java.io.IOException -> L31
            goto L35
        L1f:
            r2 = move-exception
            goto L28
        L21:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L37
        L25:
            r3 = move-exception
            r4 = r2
            r2 = r3
        L28:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L35
            r4.close()     // Catch: java.io.IOException -> L31
            goto L35
        L31:
            r2 = move-exception
            r2.printStackTrace()
        L35:
            return
        L36:
            r2 = move-exception
        L37:
            if (r4 == 0) goto L41
            r4.close()     // Catch: java.io.IOException -> L3d
            goto L41
        L3d:
            r3 = move-exception
            r3.printStackTrace()
        L41:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.j.onWrite(android.print.PageRange[], android.os.ParcelFileDescriptor, android.os.CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback):void");
    }

    void v(String str, Double d10, Double d11) {
        PrintAttributes.MediaSize mediaSizeAsPortrait;
        this.f10994e = str;
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        int iIntValue = Double.valueOf((d10.doubleValue() * 1000.0d) / 72.0d).intValue();
        int iIntValue2 = Double.valueOf((d11.doubleValue() * 1000.0d) / 72.0d).intValue();
        boolean z10 = iIntValue2 >= iIntValue;
        Iterator<PrintAttributes.MediaSize> it = m().iterator();
        while (true) {
            if (!it.hasNext()) {
                mediaSizeAsPortrait = null;
                break;
            }
            PrintAttributes.MediaSize next = it.next();
            mediaSizeAsPortrait = z10 ? next.asPortrait() : next.asLandscape();
            if (iIntValue + 20 >= mediaSizeAsPortrait.getWidthMils() && iIntValue - 20 <= mediaSizeAsPortrait.getWidthMils() && iIntValue2 + 20 >= mediaSizeAsPortrait.getHeightMils() && iIntValue2 - 20 <= mediaSizeAsPortrait.getHeightMils()) {
                break;
            }
        }
        if (mediaSizeAsPortrait == null) {
            mediaSizeAsPortrait = z10 ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        }
        builder.setMediaSize(mediaSizeAsPortrait);
        this.f10992c = f10989h.print(str, this, builder.build());
    }

    void x(final byte[] bArr, final ArrayList<Integer> arrayList, final Double d10) {
        Thread thread = new Thread(new Runnable() { // from class: ef.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f10972a.s(bArr, arrayList, d10);
            }
        });
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: ef.d
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread2, Throwable th) {
                this.f10976a.u(thread2, th);
            }
        });
        thread.start();
    }

    void y(byte[] bArr) {
        this.f10993d = bArr;
        this.f10995f.onLayoutFinished(new PrintDocumentInfo.Builder(this.f10994e).setContentType(0).build(), true);
    }
}
