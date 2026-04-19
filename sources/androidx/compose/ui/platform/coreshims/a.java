package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f2884b;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.coreshims.a$a, reason: collision with other inner class name */
    private static class C0059a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    private static class b {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private static class c {
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private a(ContentCaptureSession contentCaptureSession, View view) {
        this.f2883a = contentCaptureSession;
        this.f2884b = view;
    }

    public static a f(ContentCaptureSession contentCaptureSession, View view) {
        return new a(contentCaptureSession, view);
    }

    public AutofillId a(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f2883a;
        e2.a aVarA = androidx.compose.ui.platform.coreshims.b.a(this.f2884b);
        Objects.requireNonNull(aVarA);
        return b.a(contentCaptureSession, aVarA.a(), j10);
    }

    public androidx.compose.ui.platform.coreshims.c b(AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return androidx.compose.ui.platform.coreshims.c.g(b.c((ContentCaptureSession) this.f2883a, autofillId, j10));
        }
        return null;
    }

    public void c(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e((ContentCaptureSession) this.f2883a, autofillId, charSequence);
        }
    }

    public void d(List<ViewStructure> list) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            c.a((ContentCaptureSession) this.f2883a, list);
            return;
        }
        if (i10 >= 29) {
            ViewStructure viewStructureB = b.b((ContentCaptureSession) this.f2883a, this.f2884b);
            C0059a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d((ContentCaptureSession) this.f2883a, viewStructureB);
            for (int i11 = 0; i11 < list.size(); i11++) {
                b.d((ContentCaptureSession) this.f2883a, list.get(i11));
            }
            ViewStructure viewStructureB2 = b.b((ContentCaptureSession) this.f2883a, this.f2884b);
            C0059a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d((ContentCaptureSession) this.f2883a, viewStructureB2);
        }
    }

    public void e(long[] jArr) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f2883a;
            e2.a aVarA = androidx.compose.ui.platform.coreshims.b.a(this.f2884b);
            Objects.requireNonNull(aVarA);
            b.f(contentCaptureSession, aVarA.a(), jArr);
            return;
        }
        if (i10 >= 29) {
            ViewStructure viewStructureB = b.b((ContentCaptureSession) this.f2883a, this.f2884b);
            C0059a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d((ContentCaptureSession) this.f2883a, viewStructureB);
            ContentCaptureSession contentCaptureSession2 = (ContentCaptureSession) this.f2883a;
            e2.a aVarA2 = androidx.compose.ui.platform.coreshims.b.a(this.f2884b);
            Objects.requireNonNull(aVarA2);
            b.f(contentCaptureSession2, aVarA2.a(), jArr);
            ViewStructure viewStructureB2 = b.b((ContentCaptureSession) this.f2883a, this.f2884b);
            C0059a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d((ContentCaptureSession) this.f2883a, viewStructureB2);
        }
    }
}
