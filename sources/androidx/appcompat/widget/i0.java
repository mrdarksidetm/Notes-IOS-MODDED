package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static i0 f1738i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, z.d0<ColorStateList>> f1740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z.c0<String, b> f1741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z.d0<String> f1742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, z.m<WeakReference<Drawable.ConstantState>>> f1743d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f1744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f1746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f1737h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f1739j = new a(6);

    private static class a extends androidx.collection.a<Integer, PorterDuffColorFilter> {
        public a(int i10) {
            super(i10);
        }

        private static int a(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter b(int i10, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i10, mode)));
        }

        PorterDuffColorFilter c(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i10, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(i0 i0Var, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        boolean z10;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            z.m<WeakReference<Drawable.ConstantState>> mVar = this.f1743d.get(context);
            if (mVar == null) {
                mVar = new z.m<>();
                this.f1743d.put(context, mVar);
            }
            mVar.i(j10, new WeakReference<>(constantState));
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1740a == null) {
            this.f1740a = new WeakHashMap<>();
        }
        z.d0<ColorStateList> d0Var = this.f1740a.get(context);
        if (d0Var == null) {
            d0Var = new z.d0<>();
            this.f1740a.put(context, d0Var);
        }
        d0Var.b(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f1745f) {
            return;
        }
        this.f1745f = true;
        Drawable drawableI = i(context, n.b.f15604a);
        if (drawableI == null || !p(drawableI)) {
            this.f1745f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i10) {
        if (this.f1744e == null) {
            this.f1744e = new TypedValue();
        }
        TypedValue typedValue = this.f1744e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f1746g;
        Drawable drawableC = cVar == null ? null : cVar.c(this, context, i10);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableC);
        }
        return drawableC;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized i0 g() {
        if (f1738i == null) {
            i0 i0Var = new i0();
            f1738i = i0Var;
            o(i0Var);
        }
        return f1738i;
    }

    private synchronized Drawable h(Context context, long j10) {
        z.m<WeakReference<Drawable.ConstantState>> mVar = this.f1743d.get(context);
        if (mVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceE = mVar.e(j10);
        if (weakReferenceE != null) {
            Drawable.ConstantState constantState = weakReferenceE.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            mVar.j(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterB;
        a aVar = f1739j;
        porterDuffColorFilterB = aVar.b(i10, mode);
        if (porterDuffColorFilterB == null) {
            porterDuffColorFilterB = new PorterDuffColorFilter(i10, mode);
            aVar.c(i10, mode, porterDuffColorFilterB);
        }
        return porterDuffColorFilterB;
    }

    private ColorStateList m(Context context, int i10) {
        z.d0<ColorStateList> d0Var;
        WeakHashMap<Context, z.d0<ColorStateList>> weakHashMap = this.f1740a;
        if (weakHashMap == null || (d0Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return d0Var.f(i10);
    }

    private static void o(i0 i0Var) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof d5.c) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i10) {
        int next;
        z.c0<String, b> c0Var = this.f1741b;
        if (c0Var == null || c0Var.isEmpty()) {
            return null;
        }
        z.d0<String> d0Var = this.f1742c;
        if (d0Var != null) {
            String strF = d0Var.f(i10);
            if ("appcompat_skip_skip".equals(strF) || (strF != null && this.f1741b.get(strF) == null)) {
                return null;
            }
        } else {
            this.f1742c = new z.d0<>();
        }
        if (this.f1744e == null) {
            this.f1744e = new TypedValue();
        }
        TypedValue typedValue = this.f1744e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1742c.b(i10, name);
                b bVar = this.f1741b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableH == null) {
            this.f1742c.b(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL == null) {
            c cVar = this.f1746g;
            if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
                return null;
            }
            return drawable;
        }
        if (c0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableJ = androidx.core.graphics.drawable.a.j(drawable);
        androidx.core.graphics.drawable.a.g(drawableJ, colorStateListL);
        PorterDuff.Mode modeN = n(i10);
        if (modeN == null) {
            return drawableJ;
        }
        androidx.core.graphics.drawable.a.h(drawableJ, modeN);
        return drawableJ;
    }

    static void v(Drawable drawable, p0 p0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (c0.a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = p0Var.f1841d;
        if (z10 || p0Var.f1840c) {
            drawable.setColorFilter(f(z10 ? p0Var.f1838a : null, p0Var.f1840c ? p0Var.f1839b : f1737h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable drawableQ;
        c(context);
        drawableQ = q(context, i10);
        if (drawableQ == null) {
            drawableQ = e(context, i10);
        }
        if (drawableQ == null) {
            drawableQ = androidx.core.content.a.getDrawable(context, i10);
        }
        if (drawableQ != null) {
            drawableQ = u(context, i10, z10, drawableQ);
        }
        if (drawableQ != null) {
            c0.b(drawableQ);
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f1746g;
            colorStateListM = cVar == null ? null : cVar.d(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f1746g;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i10);
    }

    public synchronized void r(Context context) {
        z.m<WeakReference<Drawable.ConstantState>> mVar = this.f1743d.get(context);
        if (mVar != null) {
            mVar.b();
        }
    }

    synchronized Drawable s(Context context, y0 y0Var, int i10) {
        Drawable drawableQ = q(context, i10);
        if (drawableQ == null) {
            drawableQ = y0Var.a(i10);
        }
        if (drawableQ == null) {
            return null;
        }
        return u(context, i10, false, drawableQ);
    }

    public synchronized void t(c cVar) {
        this.f1746g = cVar;
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f1746g;
        return cVar != null && cVar.a(context, i10, drawable);
    }
}
