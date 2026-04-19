package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.b;

/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f1852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f1853c;

    private r0(Context context, TypedArray typedArray) {
        this.f1851a = context;
        this.f1852b = typedArray;
    }

    public static r0 s(Context context, int i10, int[] iArr) {
        return new r0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static r0 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new r0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static r0 u(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new r0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1852b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1852b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f1852b.hasValue(i10) || (resourceId = this.f1852b.getResourceId(i10, 0)) == 0 || (colorStateListA = l.a.a(this.f1851a, resourceId)) == null) ? this.f1852b.getColorStateList(i10) : colorStateListA;
    }

    public int d(int i10, int i11) {
        return this.f1852b.getDimensionPixelOffset(i10, i11);
    }

    public int e(int i10, int i11) {
        return this.f1852b.getDimensionPixelSize(i10, i11);
    }

    public Drawable f(int i10) {
        int resourceId;
        return (!this.f1852b.hasValue(i10) || (resourceId = this.f1852b.getResourceId(i10, 0)) == 0) ? this.f1852b.getDrawable(i10) : l.a.b(this.f1851a, resourceId);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (!this.f1852b.hasValue(i10) || (resourceId = this.f1852b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return k.b().d(this.f1851a, resourceId, true);
    }

    public float h(int i10, float f10) {
        return this.f1852b.getFloat(i10, f10);
    }

    public Typeface i(int i10, int i11, b.e eVar) {
        int resourceId = this.f1852b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1853c == null) {
            this.f1853c = new TypedValue();
        }
        return androidx.core.content.res.b.g(this.f1851a, resourceId, this.f1853c, i11, eVar);
    }

    public int j(int i10, int i11) {
        return this.f1852b.getInt(i10, i11);
    }

    public int k(int i10, int i11) {
        return this.f1852b.getInteger(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1852b.getLayoutDimension(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1852b.getResourceId(i10, i11);
    }

    public String n(int i10) {
        return this.f1852b.getString(i10);
    }

    public CharSequence o(int i10) {
        return this.f1852b.getText(i10);
    }

    public CharSequence[] p(int i10) {
        return this.f1852b.getTextArray(i10);
    }

    public TypedArray q() {
        return this.f1852b;
    }

    public boolean r(int i10) {
        return this.f1852b.hasValue(i10);
    }

    public void v() {
        this.f1852b.recycle();
    }
}
