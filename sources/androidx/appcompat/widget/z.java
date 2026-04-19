package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import m3.b;

/* JADX INFO: loaded from: classes.dex */
public class z extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f1958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f1959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n f1960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f1962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Future<m3.b> f1963g;

    private interface a {
        void a(int[] iArr, int i10);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i10);

        void g(int i10, int i11, int i12, int i13);

        int h();

        int i();

        void j(int i10);

        int k();

        void l(int i10);
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.z.a
        public void a(int[] iArr, int i10) {
            z.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.z.a
        public int[] b() {
            return z.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.z.a
        public TextClassifier c() {
            return z.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.z.a
        public int d() {
            return z.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.z.a
        public void e(TextClassifier textClassifier) {
            z.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.z.a
        public void f(int i10) {
        }

        @Override // androidx.appcompat.widget.z.a
        public void g(int i10, int i11, int i12, int i13) {
            z.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.z.a
        public int h() {
            return z.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.z.a
        public int i() {
            return z.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.z.a
        public void j(int i10) {
        }

        @Override // androidx.appcompat.widget.z.a
        public int k() {
            return z.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.z.a
        public void l(int i10) {
            z.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.z.b, androidx.appcompat.widget.z.a
        public void f(int i10) {
            z.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.z.b, androidx.appcompat.widget.z.a
        public void j(int i10) {
            z.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public z(Context context) {
        this(context, null);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public z(Context context, AttributeSet attributeSet, int i10) {
        super(o0.b(context), attributeSet, i10);
        this.f1961e = false;
        this.f1962f = null;
        n0.a(this, getContext());
        e eVar = new e(this);
        this.f1957a = eVar;
        eVar.e(attributeSet, i10);
        y yVar = new y(this);
        this.f1958b = yVar;
        yVar.m(attributeSet, i10);
        yVar.b();
        this.f1959c = new x(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1960d == null) {
            this.f1960d = new n(this);
        }
        return this.f1960d;
    }

    private void q() {
        Future<m3.b> future = this.f1963g;
        if (future != null) {
            try {
                this.f1963g = null;
                androidx.core.widget.e.k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1957a;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (z0.f1967b) {
            return getSuperCaller().d();
        }
        y yVar = this.f1958b;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (z0.f1967b) {
            return getSuperCaller().i();
        }
        y yVar = this.f1958b;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (z0.f1967b) {
            return getSuperCaller().k();
        }
        y yVar = this.f1958b;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (z0.f1967b) {
            return getSuperCaller().b();
        }
        y yVar = this.f1958b;
        return yVar != null ? yVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (z0.f1967b) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        y yVar = this.f1958b;
        if (yVar != null) {
            return yVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.e.m(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.e.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.e.b(this);
    }

    a getSuperCaller() {
        a bVar;
        if (this.f1962f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                bVar = new c();
            } else if (i10 >= 26) {
                bVar = new b();
            }
            this.f1962f = bVar;
        }
        return this.f1962f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1957a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1957a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1958b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1958b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        q();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1959c) == null) ? getSuperCaller().c() : xVar.a();
    }

    public b.a getTextMetricsParamsCompat() {
        return androidx.core.widget.e.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1958b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        q();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        y yVar = this.f1958b;
        if ((yVar == null || z0.f1967b || !yVar.l()) ? false : true) {
            this.f1958b.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (z0.f1967b) {
            getSuperCaller().g(i10, i11, i12, i13);
            return;
        }
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (z0.f1967b) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (z0.f1967b) {
            getSuperCaller().l(i10);
            return;
        }
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1957a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1957a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? l.a.b(context, i10) : null, i11 != 0 ? l.a.b(context, i11) : null, i12 != 0 ? l.a.b(context, i12) : null, i13 != 0 ? l.a.b(context, i13) : null);
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? l.a.b(context, i10) : null, i11 != 0 ? l.a.b(context, i11) : null, i12 != 0 ? l.a.b(context, i12) : null, i13 != 0 ? l.a.b(context, i13) : null);
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.e.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i10);
        } else {
            androidx.core.widget.e.h(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i10);
        } else {
            androidx.core.widget.e.i(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.e.j(this, i10);
    }

    public void setPrecomputedText(m3.b bVar) {
        androidx.core.widget.e.k(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1957a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1957a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1958b.w(colorStateList);
        this.f1958b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1958b.x(mode);
        this.f1958b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1959c) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<m3.b> future) {
        this.f1963g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        androidx.core.widget.e.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (z0.f1967b) {
            super.setTextSize(i10, f10);
            return;
        }
        y yVar = this.f1958b;
        if (yVar != null) {
            yVar.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f1961e) {
            return;
        }
        Typeface typefaceA = null;
        if (typeface != null && i10 > 0) {
            typefaceA = g3.b.a(getContext(), typeface, i10);
        }
        this.f1961e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f1961e = false;
        }
    }
}
