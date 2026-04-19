package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.b;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f1934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p0 f1935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p0 f1936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p0 f1937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p0 f1938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p0 f1939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p0 f1940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p0 f1941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a0 f1942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1943j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1944k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f1945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1946m;

    class a extends b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f1949c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1947a = i10;
            this.f1948b = i11;
            this.f1949c = weakReference;
        }

        @Override // androidx.core.content.res.b.e
        /* JADX INFO: renamed from: h */
        public void f(int i10) {
        }

        @Override // androidx.core.content.res.b.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1947a) != -1) {
                typeface = f.a(typeface, i10, (this.f1948b & 2) != 0);
            }
            y.this.n(this.f1949c, typeface);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f1951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f1952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1953c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1951a = textView;
            this.f1952b = typeface;
            this.f1953c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1951a.setTypeface(this.f1952b, this.f1953c);
        }
    }

    static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    static class d {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class e {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class f {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    y(TextView textView) {
        this.f1934a = textView;
        this.f1942i = new a0(textView);
    }

    private void B(int i10, float f10) {
        this.f1942i.t(i10, f10);
    }

    private void C(Context context, r0 r0Var) {
        String strN;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f1943j = r0Var.j(j.j.V2, this.f1943j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iJ = r0Var.j(j.j.Y2, -1);
            this.f1944k = iJ;
            if (iJ != -1) {
                this.f1943j = (this.f1943j & 2) | 0;
            }
        }
        int i11 = j.j.X2;
        if (!r0Var.r(i11) && !r0Var.r(j.j.Z2)) {
            int i12 = j.j.U2;
            if (r0Var.r(i12)) {
                this.f1946m = false;
                int iJ2 = r0Var.j(i12, 1);
                if (iJ2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iJ2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iJ2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1945l = typeface;
                return;
            }
            return;
        }
        this.f1945l = null;
        int i13 = j.j.Z2;
        if (r0Var.r(i13)) {
            i11 = i13;
        }
        int i14 = this.f1944k;
        int i15 = this.f1943j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = r0Var.i(i11, this.f1943j, new a(i14, i15, new WeakReference(this.f1934a)));
                if (typefaceI != null) {
                    if (i10 >= 28 && this.f1944k != -1) {
                        typefaceI = f.a(Typeface.create(typefaceI, 0), this.f1944k, (this.f1943j & 2) != 0);
                    }
                    this.f1945l = typefaceI;
                }
                this.f1946m = this.f1945l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1945l != null || (strN = r0Var.n(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1944k == -1) {
            typefaceCreate = Typeface.create(strN, this.f1943j);
        } else {
            typefaceCreate = f.a(Typeface.create(strN, 0), this.f1944k, (this.f1943j & 2) != 0);
        }
        this.f1945l = typefaceCreate;
    }

    private void a(Drawable drawable, p0 p0Var) {
        if (drawable == null || p0Var == null) {
            return;
        }
        k.i(drawable, p0Var, this.f1934a.getDrawableState());
    }

    private static p0 d(Context context, k kVar, int i10) {
        ColorStateList colorStateListF = kVar.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        p0 p0Var = new p0();
        p0Var.f1841d = true;
        p0Var.f1838a = colorStateListF;
        return p0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrA = c.a(this.f1934a);
            TextView textView = this.f1934a;
            if (drawable5 == null) {
                drawable5 = drawableArrA[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrA[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrA[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrA[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrA2 = c.a(this.f1934a);
        Drawable drawable7 = drawableArrA2[0];
        if (drawable7 != null || drawableArrA2[2] != null) {
            TextView textView2 = this.f1934a;
            if (drawable2 == null) {
                drawable2 = drawableArrA2[1];
            }
            Drawable drawable8 = drawableArrA2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrA2[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1934a.getCompoundDrawables();
        TextView textView3 = this.f1934a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        p0 p0Var = this.f1941h;
        this.f1935b = p0Var;
        this.f1936c = p0Var;
        this.f1937d = p0Var;
        this.f1938e = p0Var;
        this.f1939f = p0Var;
        this.f1940g = p0Var;
    }

    void A(int i10, float f10) {
        if (z0.f1967b || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f1935b != null || this.f1936c != null || this.f1937d != null || this.f1938e != null) {
            Drawable[] compoundDrawables = this.f1934a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1935b);
            a(compoundDrawables[1], this.f1936c);
            a(compoundDrawables[2], this.f1937d);
            a(compoundDrawables[3], this.f1938e);
        }
        if (this.f1939f == null && this.f1940g == null) {
            return;
        }
        Drawable[] drawableArrA = c.a(this.f1934a);
        a(drawableArrA[0], this.f1939f);
        a(drawableArrA[2], this.f1940g);
    }

    void c() {
        this.f1942i.a();
    }

    int e() {
        return this.f1942i.f();
    }

    int f() {
        return this.f1942i.g();
    }

    int g() {
        return this.f1942i.h();
    }

    int[] h() {
        return this.f1942i.i();
    }

    int i() {
        return this.f1942i.j();
    }

    ColorStateList j() {
        p0 p0Var = this.f1941h;
        if (p0Var != null) {
            return p0Var.f1838a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        p0 p0Var = this.f1941h;
        if (p0Var != null) {
            return p0Var.f1839b;
        }
        return null;
    }

    boolean l() {
        return this.f1942i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1946m) {
            this.f1945l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (androidx.core.view.h.G(textView)) {
                    textView.post(new b(textView, typeface, this.f1943j));
                } else {
                    textView.setTypeface(typeface, this.f1943j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (z0.f1967b) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strN;
        r0 r0VarS = r0.s(context, i10, j.j.S2);
        int i11 = j.j.f13481b3;
        if (r0VarS.r(i11)) {
            s(r0VarS.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = j.j.T2;
        if (r0VarS.r(i13) && r0VarS.e(i13, -1) == 0) {
            this.f1934a.setTextSize(0, 0.0f);
        }
        C(context, r0VarS);
        if (i12 >= 26) {
            int i14 = j.j.f13476a3;
            if (r0VarS.r(i14) && (strN = r0VarS.n(i14)) != null) {
                e.d(this.f1934a, strN);
            }
        }
        r0VarS.v();
        Typeface typeface = this.f1945l;
        if (typeface != null) {
            this.f1934a.setTypeface(typeface, this.f1943j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        s3.b.f(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f1934a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f1942i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f1942i.q(iArr, i10);
    }

    void v(int i10) {
        this.f1942i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f1941h == null) {
            this.f1941h = new p0();
        }
        p0 p0Var = this.f1941h;
        p0Var.f1838a = colorStateList;
        p0Var.f1841d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f1941h == null) {
            this.f1941h = new p0();
        }
        p0 p0Var = this.f1941h;
        p0Var.f1839b = mode;
        p0Var.f1840c = mode != null;
        z();
    }
}
