package q1;

import ae.j;
import ae.r;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import f3.d;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParser f18939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18940b;

    public a(XmlPullParser xmlPullParser, int i10) {
        this.f18939a = xmlPullParser;
        this.f18940b = i10;
    }

    public /* synthetic */ a(XmlPullParser xmlPullParser, int i10, int i11, j jVar) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }

    private final void l(int i10) {
        this.f18940b = i10 | this.f18940b;
    }

    public final float a(TypedArray typedArray, int i10, float f10) {
        float dimension = typedArray.getDimension(i10, f10);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(TypedArray typedArray, int i10, float f10) {
        float f11 = typedArray.getFloat(i10, f10);
        l(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int c(TypedArray typedArray, int i10, int i11) {
        int i12 = typedArray.getInt(i10, i11);
        l(typedArray.getChangingConfigurations());
        return i12;
    }

    public final boolean d(TypedArray typedArray, String str, int i10, boolean z10) {
        boolean zE = f3.j.e(typedArray, this.f18939a, str, i10, z10);
        l(typedArray.getChangingConfigurations());
        return zE;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String str, int i10) {
        ColorStateList colorStateListG = f3.j.g(typedArray, this.f18939a, theme, str, i10);
        l(typedArray.getChangingConfigurations());
        return colorStateListG;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.b(this.f18939a, aVar.f18939a) && this.f18940b == aVar.f18940b;
    }

    public final d f(TypedArray typedArray, Resources.Theme theme, String str, int i10, int i11) {
        d dVarI = f3.j.i(typedArray, this.f18939a, theme, str, i10, i11);
        l(typedArray.getChangingConfigurations());
        return dVarI;
    }

    public final float g(TypedArray typedArray, String str, int i10, float f10) {
        float fJ = f3.j.j(typedArray, this.f18939a, str, i10, f10);
        l(typedArray.getChangingConfigurations());
        return fJ;
    }

    public final int h(TypedArray typedArray, String str, int i10, int i11) {
        int iK = f3.j.k(typedArray, this.f18939a, str, i10, i11);
        l(typedArray.getChangingConfigurations());
        return iK;
    }

    public int hashCode() {
        return (this.f18939a.hashCode() * 31) + Integer.hashCode(this.f18940b);
    }

    public final String i(TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser j() {
        return this.f18939a;
    }

    public final TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayQ = f3.j.q(resources, theme, attributeSet, iArr);
        l(typedArrayQ.getChangingConfigurations());
        return typedArrayQ;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f18939a + ", config=" + this.f18940b + ')';
    }
}
