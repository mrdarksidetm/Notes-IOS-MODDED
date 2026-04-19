package a3;

import ae.s;
import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import e.m;
import e.q;
import e.t;
import java.util.UUID;
import md.i0;
import w2.r;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
final class f extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zd.a<i0> f403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f408i;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    static final class b extends s implements l<q, i0> {
        b() {
            super(1);
        }

        public final void a(q qVar) {
            if (f.this.f404e.b()) {
                f.this.f403d.invoke();
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(q qVar) {
            a(qVar);
            return i0.f15558a;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f410a;

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
            f410a = iArr;
        }
    }

    public f(zd.a<i0> aVar, e eVar, View view, r rVar, w2.d dVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || eVar.a()) ? f1.g.f11077a : f1.g.f11078b), 0, 2, null);
        this.f403d = aVar;
        this.f404e = eVar;
        this.f405f = view;
        float fM = w2.h.m(8);
        this.f407h = fM;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        this.f408i = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        androidx.core.view.m.a(window, this.f404e.a());
        d dVar2 = new d(getContext(), window);
        dVar2.setTag(f1.e.H, "Dialog:" + uuid);
        dVar2.setClipChildren(false);
        dVar2.setElevation(dVar.G0(fM));
        dVar2.setOutlineProvider(new a());
        this.f406g = dVar2;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(dVar2);
        o4.r.b(dVar2, o4.r.a(view));
        o4.s.b(dVar2, o4.s.a(view));
        x4.g.b(dVar2, x4.g.a(view));
        l(this.f403d, this.f404e, rVar);
        t.b(getOnBackPressedDispatcher(), this, false, new b(), 2, null);
    }

    private static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof d) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    private final void j(r rVar) {
        d dVar = this.f406g;
        int i10 = c.f410a[rVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new md.q();
        }
        dVar.setLayoutDirection(i11);
    }

    private final void k(g gVar) {
        boolean zA = h.a(gVar, a3.b.a(this.f405f));
        Window window = getWindow();
        ae.r.c(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void h() {
        this.f406g.disposeComposition();
    }

    public final void i(t0.q qVar, p<? super t0.l, ? super Integer, i0> pVar) {
        this.f406g.f(qVar, pVar);
    }

    public final void l(zd.a<i0> aVar, e eVar, r rVar) {
        Window window;
        int i10;
        Window window2;
        this.f403d = aVar;
        this.f404e = eVar;
        k(eVar.d());
        j(rVar);
        if (eVar.e() && !this.f406g.d() && (window2 = getWindow()) != null) {
            window2.setLayout(-2, -2);
        }
        this.f406g.g(eVar.e());
        if (Build.VERSION.SDK_INT < 31) {
            if (eVar.a()) {
                window = getWindow();
                if (window == null) {
                    return;
                } else {
                    i10 = this.f408i;
                }
            } else {
                window = getWindow();
                if (window == null) {
                    return;
                } else {
                    i10 = 16;
                }
            }
            window.setSoftInputMode(i10);
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.f404e.c()) {
            this.f403d.invoke();
        }
        return zOnTouchEvent;
    }
}
