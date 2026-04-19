package p0;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f17835f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17836g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f17837h = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f17838i = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f17839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f17840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f17841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f17842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zd.a<i0> f17843e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public l(Context context) {
        super(context);
    }

    private final void c(boolean z10) {
        r rVar = new r(z10);
        setBackground(rVar);
        this.f17839a = rVar;
    }

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f17842d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f17841c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f17837h : f17838i;
            r rVar = this.f17839a;
            if (rVar != null) {
                rVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: p0.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.setRippleState$lambda$2(this.f17834a);
                }
            };
            this.f17842d = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f17841c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(l lVar) {
        r rVar = lVar.f17839a;
        if (rVar != null) {
            rVar.setState(f17838i);
        }
        lVar.f17842d = null;
    }

    public final void b(g0.p pVar, boolean z10, long j10, int i10, long j11, float f10, zd.a<i0> aVar) {
        float fCenterX;
        float fCenterY;
        if (this.f17839a == null || !ae.r.b(Boolean.valueOf(z10), this.f17840b)) {
            c(z10);
            this.f17840b = Boolean.valueOf(z10);
        }
        r rVar = this.f17839a;
        ae.r.c(rVar);
        this.f17843e = aVar;
        f(j10, i10, j11, f10);
        if (z10) {
            fCenterX = k1.f.o(pVar.a());
            fCenterY = k1.f.p(pVar.a());
        } else {
            fCenterX = rVar.getBounds().centerX();
            fCenterY = rVar.getBounds().centerY();
        }
        rVar.setHotspot(fCenterX, fCenterY);
        setRippleState(true);
    }

    public final void d() {
        this.f17843e = null;
        Runnable runnable = this.f17842d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f17842d;
            ae.r.c(runnable2);
            runnable2.run();
        } else {
            r rVar = this.f17839a;
            if (rVar != null) {
                rVar.setState(f17838i);
            }
        }
        r rVar2 = this.f17839a;
        if (rVar2 == null) {
            return;
        }
        rVar2.setVisible(false, false);
        unscheduleDrawable(rVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j10, int i10, long j11, float f10) {
        r rVar = this.f17839a;
        if (rVar == null) {
            return;
        }
        rVar.c(i10);
        rVar.b(j11, f10);
        Rect rect = new Rect(0, 0, ce.c.d(k1.l.i(j10)), ce.c.d(k1.l.g(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        rVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        zd.a<i0> aVar = this.f17843e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
