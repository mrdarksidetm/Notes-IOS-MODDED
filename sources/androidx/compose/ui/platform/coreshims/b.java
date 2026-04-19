package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public class b {

    static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.coreshims.b$b, reason: collision with other inner class name */
    private static class C0060b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    private static class c {
        static void a(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }
    }

    public static e2.a a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e2.a.b(a.a(view));
        }
        return null;
    }

    public static androidx.compose.ui.platform.coreshims.a b(View view) {
        ContentCaptureSession contentCaptureSessionA;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionA = C0060b.a(view)) == null) {
            return null;
        }
        return androidx.compose.ui.platform.coreshims.a.f(contentCaptureSessionA, view);
    }

    public static void c(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i10);
        }
    }
}
