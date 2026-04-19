package androidx.compose.ui.platform.coreshims;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2885a;

    private static class a {
        static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
            viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
        }

        static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void e(ViewStructure viewStructure, float f10, int i10, int i11, int i12) {
            viewStructure.setTextStyle(f10, i10, i11, i12);
        }
    }

    private c(ViewStructure viewStructure) {
        this.f2885a = viewStructure;
    }

    public static c g(ViewStructure viewStructure) {
        return new c(viewStructure);
    }

    public void a(String str) {
        a.a((ViewStructure) this.f2885a, str);
    }

    public void b(CharSequence charSequence) {
        a.b((ViewStructure) this.f2885a, charSequence);
    }

    public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
        a.c((ViewStructure) this.f2885a, i10, i11, i12, i13, i14, i15);
    }

    public void d(CharSequence charSequence) {
        a.d((ViewStructure) this.f2885a, charSequence);
    }

    public void e(float f10, int i10, int i11, int i12) {
        a.e((ViewStructure) this.f2885a, f10, i10, i11, i12);
    }

    public ViewStructure f() {
        return (ViewStructure) this.f2885a;
    }
}
