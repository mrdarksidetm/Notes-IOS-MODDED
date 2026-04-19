package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.api.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class a0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f1575l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f1576m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f1577n = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1578a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1579b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1580c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f1581d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1582e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f1583f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1584g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f1585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f1586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f1587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f f1588k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    private static final class b {
        static boolean a(View view) {
            return view.isInLayout();
        }
    }

    private static final class c {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = a.e.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.a0.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) a0.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.a0.d, androidx.appcompat.widget.a0.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.a0.f
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class f {
        f() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        boolean b(TextView textView) {
            return ((Boolean) a0.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    a0(TextView textView) {
        this.f1586i = textView;
        this.f1587j = textView.getContext();
        this.f1588k = Build.VERSION.SDK_INT >= 29 ? new e() : new d();
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1578a = 0;
        this.f1581d = -1.0f;
        this.f1582e = -1.0f;
        this.f1580c = -1.0f;
        this.f1583f = new int[0];
        this.f1579b = false;
    }

    private int e(RectF rectF) {
        int i10;
        int length = this.f1583f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i11 = 0;
        int i12 = 1;
        int i13 = length - 1;
        while (true) {
            int i14 = i12;
            int i15 = i11;
            i11 = i14;
            while (i11 <= i13) {
                i10 = (i11 + i13) / 2;
                if (x(this.f1583f[i10], rectF)) {
                    break;
                }
                i15 = i10 - 1;
                i13 = i15;
            }
            return this.f1583f[i15];
            i12 = i10 + 1;
        }
    }

    private static Method k(String str) {
        try {
            Method declaredMethod = f1576m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f1576m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static <T> T m(Object obj, String str, T t10) {
        try {
            return (T) k(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    private void s(float f10) {
        if (f10 != this.f1586i.getPaint().getTextSize()) {
            this.f1586i.getPaint().setTextSize(f10);
            boolean zA = b.a(this.f1586i);
            if (this.f1586i.getLayout() != null) {
                this.f1579b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f1586i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zA) {
                    this.f1586i.forceLayout();
                } else {
                    this.f1586i.requestLayout();
                }
                this.f1586i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f1578a == 1) {
            if (!this.f1584g || this.f1583f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1582e - this.f1581d) / this.f1580c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f1581d + (i10 * this.f1580c));
                }
                this.f1583f = b(iArr);
            }
            this.f1579b = true;
        } else {
            this.f1579b = false;
        }
        return this.f1579b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1583f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z10 = this.f1583f.length > 0;
        this.f1584g = z10;
        if (z10) {
            this.f1578a = 1;
            this.f1581d = r0[0];
            this.f1582e = r0[r1 - 1];
            this.f1580c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1586i.getText();
        TransformationMethod transformationMethod = this.f1586i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1586i)) != null) {
            text = transformation;
        }
        int iB = a.b(this.f1586i);
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f1586i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB);
        return (iB == -1 || (staticLayoutD.getLineCount() <= iB && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f1586i instanceof l);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f1578a = 1;
        this.f1581d = f10;
        this.f1582e = f11;
        this.f1580c = f12;
        this.f1584g = false;
    }

    void a() {
        if (n()) {
            if (this.f1579b) {
                if (this.f1586i.getMeasuredHeight() <= 0 || this.f1586i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1588k.b(this.f1586i) ? 1048576 : (this.f1586i.getMeasuredWidth() - this.f1586i.getTotalPaddingLeft()) - this.f1586i.getTotalPaddingRight();
                int height = (this.f1586i.getHeight() - this.f1586i.getCompoundPaddingBottom()) - this.f1586i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1575l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fE = e(rectF);
                    if (fE != this.f1586i.getTextSize()) {
                        t(0, fE);
                    }
                }
            }
            this.f1579b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return c.a(charSequence, alignment, i10, i11, this.f1586i, this.f1585h, this.f1588k);
    }

    int f() {
        return Math.round(this.f1582e);
    }

    int g() {
        return Math.round(this.f1581d);
    }

    int h() {
        return Math.round(this.f1580c);
    }

    int[] i() {
        return this.f1583f;
    }

    int j() {
        return this.f1578a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f1585h;
        if (textPaint == null) {
            this.f1585h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1585h.set(this.f1586i.getPaint());
        this.f1585h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f1578a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1587j;
        int[] iArr = j.j.f13503g0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1586i;
        androidx.core.view.h.U(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i11 = j.j.f13528l0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f1578a = typedArrayObtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = j.j.f13523k0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = j.j.f13513i0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i13) ? typedArrayObtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = j.j.f13508h0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = j.j.f13518j0;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f1578a = 0;
            return;
        }
        if (this.f1578a == 1) {
            if (!this.f1584g) {
                DisplayMetrics displayMetrics = this.f1587j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f1587j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1587j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1583f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1584g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f1587j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f10) {
        Context context = this.f1587j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
