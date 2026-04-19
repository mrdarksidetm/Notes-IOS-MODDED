package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f1819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i4.f f1820b;

    n(TextView textView) {
        this.f1819a = textView;
        this.f1820b = new i4.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1820b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1820b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f1819a.getContext().obtainStyledAttributes(attributeSet, j.j.f13503g0, i10, 0);
        try {
            int i11 = j.j.f13573u0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z10) {
        this.f1820b.c(z10);
    }

    void e(boolean z10) {
        this.f1820b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f1820b.e(transformationMethod);
    }
}
