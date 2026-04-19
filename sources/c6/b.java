package c6;

import a6.f;
import ae.j;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import ce.c;
import ge.o;
import java.util.ArrayList;
import java.util.List;
import k6.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f6544m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f6545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<d5.a> f6549e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f6550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f6551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f6552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f6555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Drawable f6556l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    public b(Drawable drawable, Drawable drawable2, h hVar, int i10, boolean z10, boolean z11) {
        this.f6545a = hVar;
        this.f6546b = i10;
        this.f6547c = z10;
        this.f6548d = z11;
        this.f6550f = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f6551g = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f6553i = 255;
        this.f6555k = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f6556l = drawableMutate;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
        Drawable drawable3 = this.f6555k;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate == null) {
            return;
        }
        drawableMutate.setCallback(this);
    }

    private final int a(Integer num, Integer num2) {
        if (this.f6548d || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    private final void b() {
        this.f6554j = 2;
        this.f6555k = null;
        List<d5.a> list = this.f6549e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).a(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dC = f.c(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f6545a);
        double d10 = 2;
        int iC = c.c((((double) iWidth) - (((double) intrinsicWidth) * dC)) / d10);
        int iC2 = c.c((((double) iHeight) - (dC * ((double) intrinsicHeight))) / d10);
        drawable.setBounds(rect.left + iC, rect.top + iC2, rect.right - iC, rect.bottom - iC2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i10 = this.f6554j;
        if (i10 == 0) {
            Drawable drawable2 = this.f6555k;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f6553i);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        if (i10 == 2) {
            Drawable drawable3 = this.f6556l;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f6553i);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f6552h) / ((double) this.f6546b);
        double dJ = o.j(dUptimeMillis, 0.0d, 1.0d);
        int i11 = this.f6553i;
        int i12 = (int) (dJ * ((double) i11));
        if (this.f6547c) {
            i11 -= i12;
        }
        boolean z10 = dUptimeMillis >= 1.0d;
        if (!z10 && (drawable = this.f6555k) != null) {
            drawable.setAlpha(i11);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        Drawable drawable4 = this.f6556l;
        if (drawable4 != null) {
            drawable4.setAlpha(i12);
            iSave = canvas.save();
            try {
                drawable4.draw(canvas);
            } finally {
            }
        }
        if (z10) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6553i;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable;
        ColorFilter colorFilter;
        int i10 = this.f6554j;
        if (i10 == 0) {
            drawable = this.f6555k;
            if (drawable == null) {
                return null;
            }
        } else if (i10 == 1) {
            Drawable drawable2 = this.f6556l;
            if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
                return colorFilter;
            }
            drawable = this.f6555k;
            if (drawable == null) {
                return null;
            }
        } else if (i10 != 2 || (drawable = this.f6556l) == null) {
            return null;
        }
        return drawable.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f6551g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f6550f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6555k;
        Drawable drawable2 = this.f6556l;
        int i10 = this.f6554j;
        if (i10 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        if (i10 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f6554j == 1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6555k;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f6556l;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f6555k;
        boolean level = drawable != null ? drawable.setLevel(i10) : false;
        Drawable drawable2 = this.f6556l;
        return level || (drawable2 != null ? drawable2.setLevel(i10) : false);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6555k;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f6556l;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 256) {
            z10 = true;
        }
        if (z10) {
            this.f6553i = i10;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6555k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f6556l;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f6555k;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f6556l;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f6555k;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f6556l;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6555k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f6556l;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6555k;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f6556l;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f6555k;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f6556l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f6554j != 0) {
            return;
        }
        this.f6554j = 1;
        this.f6552h = SystemClock.uptimeMillis();
        List<d5.a> list = this.f6549e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f6555k;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f6556l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f6554j != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
