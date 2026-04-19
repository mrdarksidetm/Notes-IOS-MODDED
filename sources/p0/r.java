package p0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import l1.j0;
import l1.l0;

/* JADX INFO: loaded from: classes.dex */
final class r extends RippleDrawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f17865e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j0 f17867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f17868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17869d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f17870a = new b();

        private b() {
        }

        public final void a(RippleDrawable rippleDrawable, int i10) {
            rippleDrawable.setRadius(i10);
        }
    }

    public r(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f17866a = z10;
    }

    private final long a(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        return j0.u(j10, ge.o.g(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j10, float f10) {
        long jA = a(j10, f10);
        j0 j0Var = this.f17867b;
        if (j0Var == null ? false : j0.w(j0Var.E(), jA)) {
            return;
        }
        this.f17867b = j0.m(jA);
        setColor(ColorStateList.valueOf(l0.i(jA)));
    }

    public final void c(int i10) {
        Integer num = this.f17868c;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f17868c = Integer.valueOf(i10);
        b.f17870a.a(this, i10);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f17866a) {
            this.f17869d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f17869d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f17869d;
    }
}
