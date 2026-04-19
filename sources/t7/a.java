package t7;

import ae.s;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import ge.o;
import l1.b0;
import l1.d;
import l1.k0;
import md.l;
import md.n;
import md.q;
import n1.f;
import o1.c;
import t0.k1;
import t0.k2;
import t0.k3;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c implements k2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Drawable f21294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k1 f21295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k1 f21296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f21297j;

    /* JADX INFO: renamed from: t7.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0432a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21298a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21298a = iArr;
        }
    }

    static final class b extends s implements zd.a<C0433a> {

        /* JADX INFO: renamed from: t7.a$b$a, reason: collision with other inner class name */
        public static final class C0433a implements Drawable.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f21300a;

            C0433a(a aVar) {
                this.f21300a = aVar;
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                ae.r.f(drawable, "d");
                a aVar = this.f21300a;
                aVar.u(aVar.r() + 1);
                a aVar2 = this.f21300a;
                aVar2.v(t7.b.c(aVar2.s()));
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
                ae.r.f(drawable, "d");
                ae.r.f(runnable, "what");
                t7.b.d().postAtTime(runnable, j10);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                ae.r.f(drawable, "d");
                ae.r.f(runnable, "what");
                t7.b.d().removeCallbacks(runnable);
            }
        }

        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0433a invoke() {
            return new C0433a(a.this);
        }
    }

    public a(Drawable drawable) {
        ae.r.f(drawable, "drawable");
        this.f21294g = drawable;
        this.f21295h = k3.e(0, null, 2, null);
        this.f21296i = k3.e(k1.l.c(t7.b.c(drawable)), null, 2, null);
        this.f21297j = n.b(new b());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    private final Drawable.Callback q() {
        return (Drawable.Callback) this.f21297j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int r() {
        return ((Number) this.f21295h.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long t() {
        return ((k1.l) this.f21296i.getValue()).m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int i10) {
        this.f21295h.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(long j10) {
        this.f21296i.setValue(k1.l.c(j10));
    }

    @Override // o1.c
    protected boolean a(float f10) {
        this.f21294g.setAlpha(o.l(ce.c.d(f10 * 255), 0, 255));
        return true;
    }

    @Override // t0.k2
    public void b() {
        c();
    }

    @Override // t0.k2
    public void c() {
        Object obj = this.f21294g;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.f21294g.setVisible(false, false);
        this.f21294g.setCallback(null);
    }

    @Override // t0.k2
    public void d() {
        this.f21294g.setCallback(q());
        this.f21294g.setVisible(true, true);
        Object obj = this.f21294g;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // o1.c
    protected boolean e(k0 k0Var) {
        this.f21294g.setColorFilter(k0Var != null ? d.b(k0Var) : null);
        return true;
    }

    @Override // o1.c
    protected boolean f(r rVar) {
        ae.r.f(rVar, "layoutDirection");
        Drawable drawable = this.f21294g;
        int i10 = C0432a.f21298a[rVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new q();
        }
        return drawable.setLayoutDirection(i11);
    }

    @Override // o1.c
    public long k() {
        return t();
    }

    @Override // o1.c
    protected void m(f fVar) {
        ae.r.f(fVar, "<this>");
        b0 b0VarD = fVar.M0().d();
        r();
        this.f21294g.setBounds(0, 0, ce.c.d(k1.l.i(fVar.c())), ce.c.d(k1.l.g(fVar.c())));
        try {
            b0VarD.h();
            this.f21294g.draw(l1.c.d(b0VarD));
        } finally {
            b0VarD.p();
        }
    }

    public final Drawable s() {
        return this.f21294g;
    }
}
