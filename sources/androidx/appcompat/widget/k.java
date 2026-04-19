package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.i0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f1754b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static k f1755c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i0 f1756a;

    class a implements i0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f1757a = {j.e.R, j.e.P, j.e.f13381a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f1758b = {j.e.f13395o, j.e.B, j.e.f13400t, j.e.f13396p, j.e.f13397q, j.e.f13399s, j.e.f13398r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f1759c = {j.e.O, j.e.Q, j.e.f13391k, j.e.K, j.e.L, j.e.M, j.e.N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f1760d = {j.e.f13403w, j.e.f13389i, j.e.f13402v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f1761e = {j.e.J, j.e.S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f1762f = {j.e.f13383c, j.e.f13387g, j.e.f13384d, j.e.f13388h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = n0.c(context, j.a.f13353w);
            return new ColorStateList(new int[][]{n0.f1822b, n0.f1825e, n0.f1823c, n0.f1829i}, new int[]{n0.b(context, j.a.f13351u), g3.a.c(iC, i10), g3.a.c(iC, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, n0.c(context, j.a.f13350t));
        }

        private ColorStateList j(Context context) {
            return h(context, n0.c(context, j.a.f13351u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = j.a.f13355y;
            ColorStateList colorStateListE = n0.e(context, i10);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = n0.f1822b;
                iArr2[0] = n0.b(context, i10);
                iArr[1] = n0.f1826f;
                iArr2[1] = n0.c(context, j.a.f13352v);
                iArr[2] = n0.f1829i;
                iArr2[2] = n0.c(context, i10);
            } else {
                int[] iArr3 = n0.f1822b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = n0.f1826f;
                iArr2[1] = n0.c(context, j.a.f13352v);
                iArr[2] = n0.f1829i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(i0 i0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = i0Var.i(context, j.e.F);
            Drawable drawableI2 = i0Var.i(context, j.e.G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (c0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = k.f1754b;
            }
            drawable.setColorFilter(k.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.i0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.k.a()
                int[] r1 = r6.f1757a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = j.a.f13354x
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.f1759c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = j.a.f13352v
                goto L14
            L22:
                int[] r1 = r6.f1760d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = j.e.f13401u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = j.e.f13392l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.c0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.n0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.k.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.i0.c
        public PorterDuff.Mode b(int i10) {
            if (i10 == j.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.i0.c
        public Drawable c(i0 i0Var, Context context, int i10) {
            int i11;
            if (i10 == j.e.f13390j) {
                return new LayerDrawable(new Drawable[]{i0Var.i(context, j.e.f13389i), i0Var.i(context, j.e.f13391k)});
            }
            if (i10 == j.e.f13405y) {
                i11 = j.d.f13374i;
            } else if (i10 == j.e.f13404x) {
                i11 = j.d.f13375j;
            } else {
                if (i10 != j.e.f13406z) {
                    return null;
                }
                i11 = j.d.f13376k;
            }
            return l(i0Var, context, i11);
        }

        @Override // androidx.appcompat.widget.i0.c
        public ColorStateList d(Context context, int i10) {
            if (i10 == j.e.f13393m) {
                return l.a.a(context, j.c.f13362e);
            }
            if (i10 == j.e.I) {
                return l.a.a(context, j.c.f13365h);
            }
            if (i10 == j.e.H) {
                return k(context);
            }
            if (i10 == j.e.f13386f) {
                return j(context);
            }
            if (i10 == j.e.f13382b) {
                return g(context);
            }
            if (i10 == j.e.f13385e) {
                return i(context);
            }
            if (i10 == j.e.D || i10 == j.e.E) {
                return l.a.a(context, j.c.f13364g);
            }
            if (f(this.f1758b, i10)) {
                return n0.e(context, j.a.f13354x);
            }
            if (f(this.f1761e, i10)) {
                return l.a.a(context, j.c.f13361d);
            }
            if (f(this.f1762f, i10)) {
                return l.a.a(context, j.c.f13360c);
            }
            if (i10 == j.e.A) {
                return l.a.a(context, j.c.f13363f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.i0.c
        public boolean e(Context context, int i10, Drawable drawable) {
            Drawable drawableFindDrawableByLayerId;
            int iC;
            if (i10 == j.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = j.a.f13354x;
                m(drawableFindDrawableByLayerId2, n0.c(context, i11), k.f1754b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), n0.c(context, i11), k.f1754b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                iC = n0.c(context, j.a.f13352v);
            } else {
                if (i10 != j.e.f13405y && i10 != j.e.f13404x && i10 != j.e.f13406z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(R.id.background), n0.b(context, j.a.f13354x), k.f1754b);
                Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i12 = j.a.f13352v;
                m(drawableFindDrawableByLayerId3, n0.c(context, i12), k.f1754b);
                drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                iC = n0.c(context, i12);
            }
            m(drawableFindDrawableByLayerId, iC, k.f1754b);
            return true;
        }
    }

    public static synchronized k b() {
        if (f1755c == null) {
            h();
        }
        return f1755c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return i0.k(i10, mode);
    }

    public static synchronized void h() {
        if (f1755c == null) {
            k kVar = new k();
            f1755c = kVar;
            kVar.f1756a = i0.g();
            f1755c.f1756a.t(new a());
        }
    }

    static void i(Drawable drawable, p0 p0Var, int[] iArr) {
        i0.v(drawable, p0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1756a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1756a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f1756a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1756a.r(context);
    }
}
