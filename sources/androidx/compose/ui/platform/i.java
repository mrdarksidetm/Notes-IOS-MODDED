package androidx.compose.ui.platform;

import a2.d1;
import a2.e1;
import a2.f0;
import a2.g1;
import a2.h0;
import a2.m1;
import a2.q0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationCallback;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.a0;
import androidx.compose.ui.platform.i;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.DefaultLifecycleObserver;
import b2.c2;
import b2.d2;
import b2.e2;
import b2.l0;
import b2.p1;
import b2.r1;
import b2.x1;
import b2.y0;
import com.google.android.gms.common.api.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k1.f;
import l1.z0;
import md.i0;
import n2.s;
import n2.t;
import s1.a;
import t0.f3;
import t0.k1;
import t0.k3;
import t0.p3;
import t1.a;
import v1.n0;
import v1.o0;
import y1.t0;
import y1.u0;
import y1.x0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ViewGroup implements e1, e0, n0, DefaultLifecycleObserver {
    public static final b N0 = new b(null);
    public static final int O0 = 8;
    private static Class<?> P0;
    private static Method Q0;
    private final b2.e A;
    private final z1.f A0;
    private final b2.d B;
    private final r1 B0;
    private final g1 C;
    private MotionEvent C0;
    private boolean D;
    private long D0;
    private b2.g0 E;
    private final c2<d1> E0;
    private w F;
    private final v0.d<zd.a<i0>> F0;
    private w2.b G;
    private final l G0;
    private boolean H;
    private final Runnable H0;
    private final q0 I;
    private boolean I0;
    private final zd.a<i0> J0;
    private final s K0;
    private boolean L0;
    private final v1.y M0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.g f2924a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final x1 f2925a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f2926b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private long f2927b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2928c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final int[] f2929c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f2930d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final float[] f2931d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w2.d f2932e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final float[] f2933e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EmptySemanticsElement f2934f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final float[] f2935f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j1.i f2936g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private long f2937g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final DragAndDropModifierOnDragListener f2938h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f2939h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h1.c f2940i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private long f2941i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e2 f2942j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f2943j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.compose.ui.e f2944k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final k1 f2945k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.compose.ui.e f2946l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final p3 f2947l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final l1.c0 f2948m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private zd.l<? super c, i0> f2949m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a2.f0 f2950n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f2951n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m1 f2952o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f2953o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final g2.r f2954p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final ViewTreeObserver.OnTouchModeChangeListener f2955p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.compose.ui.platform.k f2956q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final p2.h0 f2957q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g1.n f2958r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final p2.g0 f2959r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<d1> f2960s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final AtomicReference f2961s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<d1> f2962t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final p1 f2963t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2964u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final s.b f2965u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final v1.i f2966v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final k1 f2967v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final v1.f0 f2968w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f2969w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private zd.l<? super Configuration, i0> f2970x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final k1 f2971x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g1.b f2972y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final r1.a f2973y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f2974z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final s1.c f2975z0;

    private static final class a implements ViewTranslationCallback {
        public boolean onClearTranslation(View view) {
            ae.r.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((i) view).f2956q.D0();
            return true;
        }

        public boolean onHideTranslation(View view) {
            ae.r.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((i) view).f2956q.F0();
            return true;
        }

        public boolean onShowTranslation(View view) {
            ae.r.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((i) view).f2956q.I0();
            return true;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b() {
            try {
                if (i.P0 == null) {
                    i.P0 = Class.forName(com.amazon.a.a.o.b.at);
                    Class cls = i.P0;
                    i.Q0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = i.Q0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o4.e f2976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x4.f f2977b;

        public c(o4.e eVar, x4.f fVar) {
            this.f2976a = eVar;
            this.f2977b = fVar;
        }

        public final o4.e a() {
            return this.f2976a;
        }

        public final x4.f b() {
            return this.f2977b;
        }
    }

    static final class d extends ae.s implements zd.l<s1.a, Boolean> {
        d() {
            super(1);
        }

        public final Boolean a(int i10) {
            a.C0409a c0409a = s1.a.f19913b;
            return Boolean.valueOf(s1.a.f(i10, c0409a.b()) ? i.this.isInTouchMode() : s1.a.f(i10, c0409a.a()) ? i.this.isInTouchMode() ? i.this.requestFocusFromTouch() : true : false);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Boolean invoke(s1.a aVar) {
            return a(aVar.i());
        }
    }

    static final class e extends ae.s implements zd.l<Configuration, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f2979a = new e();

        e() {
            super(1);
        }

        public final void a(Configuration configuration) {
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Configuration configuration) {
            a(configuration);
            return i0.f15558a;
        }
    }

    /* synthetic */ class f extends ae.o implements zd.q<h1.h, k1.l, zd.l<? super n1.f, ? extends i0>, Boolean> {
        f(Object obj) {
            super(3, obj, i.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        public final Boolean d(h1.h hVar, long j10, zd.l<? super n1.f, i0> lVar) {
            return Boolean.valueOf(((i) this.receiver).w0(hVar, j10, lVar));
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ Boolean invoke(h1.h hVar, k1.l lVar, zd.l<? super n1.f, ? extends i0> lVar2) {
            return d(hVar, lVar.m(), lVar2);
        }
    }

    static final class g extends ae.s implements zd.l<zd.a<? extends i0>, i0> {
        g() {
            super(1);
        }

        public final void a(zd.a<i0> aVar) {
            i.this.b(aVar);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(zd.a<? extends i0> aVar) {
            a(aVar);
            return i0.f15558a;
        }
    }

    static final class h extends ae.s implements zd.l<t1.b, Boolean> {
        h() {
            super(1);
        }

        public final Boolean a(KeyEvent keyEvent) {
            androidx.compose.ui.focus.b bVarV = i.this.V(keyEvent);
            return (bVarV == null || !t1.c.e(t1.d.b(keyEvent), t1.c.f21207a.a())) ? Boolean.FALSE : Boolean.valueOf(i.this.getFocusOwner().j(bVarV.o()));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Boolean invoke(t1.b bVar) {
            return a(bVar.f());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.i$i, reason: collision with other inner class name */
    static final class C0063i extends ae.s implements zd.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f2983b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0063i(boolean z10, i iVar) {
            super(0);
            this.f2982a = z10;
            this.f2983b = iVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f2982a) {
                this.f2983b.clearFocus();
            } else {
                this.f2983b.requestFocus();
            }
        }
    }

    public static final class j implements v1.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private v1.w f2984a = v1.w.f22013a.a();

        j() {
        }

        @Override // v1.y
        public void a(v1.w wVar) {
            if (wVar == null) {
                wVar = v1.w.f22013a.a();
            }
            this.f2984a = wVar;
            p.f3065a.a(i.this, wVar);
        }
    }

    static final class k extends ae.s implements zd.a<i0> {
        k() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MotionEvent motionEvent = i.this.C0;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    i.this.D0 = SystemClock.uptimeMillis();
                    i iVar = i.this;
                    iVar.post(iVar.G0);
                }
            }
        }
    }

    public static final class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.removeCallbacks(this);
            MotionEvent motionEvent = i.this.C0;
            if (motionEvent != null) {
                boolean z10 = false;
                boolean z11 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (!z11 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z10 = true;
                }
                if (z10) {
                    int i10 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i10 = 2;
                    }
                    i iVar = i.this;
                    iVar.u0(motionEvent, i10, iVar.D0, false);
                }
            }
        }
    }

    static final class m extends ae.s implements zd.l<x1.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f2988a = new m();

        m() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(x1.b bVar) {
            return Boolean.FALSE;
        }
    }

    static final class n extends ae.s implements zd.l<zd.a<? extends i0>, i0> {
        n() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(zd.a aVar) {
            aVar.invoke();
        }

        public final void b(final zd.a<i0> aVar) {
            Handler handler = i.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = i.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.n.c(aVar);
                    }
                });
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(zd.a<? extends i0> aVar) {
            b(aVar);
            return i0.f15558a;
        }
    }

    static final class o extends ae.s implements zd.a<c> {
        o() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return i.this.get_viewTreeOwners();
        }
    }

    public i(Context context, qd.g gVar) {
        super(context);
        this.f2924a = gVar;
        f.a aVar = k1.f.f14338b;
        this.f2926b = aVar.b();
        this.f2928c = true;
        this.f2930d = new h0(null, 1, 0 == true ? 1 : 0);
        this.f2932e = w2.a.a(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.f3120b;
        this.f2934f = emptySemanticsElement;
        this.f2936g = new FocusOwnerImpl(new g());
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new f(this));
        this.f2938h = dragAndDropModifierOnDragListener;
        this.f2940i = dragAndDropModifierOnDragListener;
        this.f2942j = new e2();
        e.a aVar2 = androidx.compose.ui.e.f2662a;
        androidx.compose.ui.e eVarA = androidx.compose.ui.input.key.a.a(aVar2, new h());
        this.f2944k = eVarA;
        androidx.compose.ui.e eVarA2 = androidx.compose.ui.input.rotary.a.a(aVar2, m.f2988a);
        this.f2946l = eVarA2;
        this.f2948m = new l1.c0();
        a2.f0 f0Var = new a2.f0(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        f0Var.n(x0.f23352b);
        f0Var.h(getDensity());
        f0Var.g(aVar2.h(emptySemanticsElement).h(eVarA2).h(getFocusOwner().c()).h(eVarA).h(dragAndDropModifierOnDragListener.d()));
        this.f2950n = f0Var;
        this.f2952o = this;
        this.f2954p = new g2.r(getRoot());
        androidx.compose.ui.platform.k kVar = new androidx.compose.ui.platform.k(this);
        this.f2956q = kVar;
        this.f2958r = new g1.n();
        this.f2960s = new ArrayList();
        this.f2966v = new v1.i();
        this.f2968w = new v1.f0(getRoot());
        this.f2970x = e.f2979a;
        this.f2972y = P() ? new g1.b(this, getAutofillTree()) : null;
        this.A = new b2.e(context);
        this.B = new b2.d(context);
        this.C = new g1(new n());
        this.I = new q0(getRoot());
        this.f2925a0 = new b2.f0(ViewConfiguration.get(context));
        this.f2927b0 = w2.o.a(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER);
        this.f2929c0 = new int[]{0, 0};
        float[] fArrC = z0.c(null, 1, null);
        this.f2931d0 = fArrC;
        this.f2933e0 = z0.c(null, 1, null);
        this.f2935f0 = z0.c(null, 1, null);
        this.f2937g0 = -1L;
        this.f2941i0 = aVar.a();
        this.f2943j0 = true;
        this.f2945k0 = k3.e(null, null, 2, null);
        this.f2947l0 = f3.e(new o());
        this.f2951n0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: b2.f
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                androidx.compose.ui.platform.i.X(this.f5244a);
            }
        };
        this.f2953o0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: b2.g
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                androidx.compose.ui.platform.i.r0(this.f5259a);
            }
        };
        this.f2955p0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: b2.h
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                androidx.compose.ui.platform.i.x0(this.f5265a, z10);
            }
        };
        p2.h0 h0Var = new p2.h0(getView(), this);
        this.f2957q0 = h0Var;
        this.f2959r0 = new p2.g0(b2.x.f().invoke(h0Var));
        this.f2961s0 = f1.h.a();
        this.f2963t0 = new l0(getTextInputService());
        this.f2965u0 = new b2.y(context);
        this.f2967v0 = f3.i(n2.x.a(context), f3.n());
        this.f2969w0 = W(context.getResources().getConfiguration());
        this.f2971x0 = k3.e(b2.x.e(context.getResources().getConfiguration()), null, 2, null);
        this.f2973y0 = new r1.b(this);
        this.f2975z0 = new s1.c(isInTouchMode() ? s1.a.f19913b.b() : s1.a.f19913b.a(), new d(), null);
        this.A0 = new z1.f(this);
        this.B0 = new b2.a0(this);
        this.E0 = new c2<>();
        this.F0 = new v0.d<>(new zd.a[16], 0);
        this.G0 = new l();
        this.H0 = new Runnable() { // from class: b2.i
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.platform.i.s0(this.f5277a);
            }
        };
        this.J0 = new k();
        int i10 = Build.VERSION.SDK_INT;
        this.K0 = i10 >= 29 ? new u() : new t(fArrC, null);
        setWillNotDraw(false);
        setFocusable(true);
        if (i10 >= 26) {
            q.f3066a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        androidx.core.view.h.W(this, kVar);
        zd.l<e0, i0> lVarA = e0.L.a();
        if (lVarA != null) {
            lVarA.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().t(this);
        if (i10 >= 29) {
            androidx.compose.ui.platform.n.f3063a.a(this);
        }
        this.M0 = new j();
    }

    private final boolean P() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final boolean R(a2.f0 f0Var) {
        if (this.H) {
            return true;
        }
        a2.f0 f0VarK0 = f0Var.k0();
        return f0VarK0 != null && !f0VarK0.L();
    }

    private final void S(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof i) {
                ((i) childAt).n();
            } else if (childAt instanceof ViewGroup) {
                S((ViewGroup) childAt);
            }
        }
    }

    private final long T(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return j0(size, size);
                }
                throw new IllegalStateException();
            }
            size = a.e.API_PRIORITY_OTHER;
        }
        return j0(0, size);
    }

    private final View U(int i10, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (ae.r.b(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i10))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewU = U(i10, viewGroup.getChildAt(i11));
            if (viewU != null) {
                return viewU;
            }
        }
        return null;
    }

    private final int W(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(i iVar) {
        iVar.y0();
    }

    private final int Y(MotionEvent motionEvent) {
        removeCallbacks(this.G0);
        try {
            l0(motionEvent);
            boolean z10 = true;
            this.f2939h0 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.C0;
                boolean z11 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && a0(motionEvent, motionEvent2)) {
                    if (f0(motionEvent2)) {
                        this.f2968w.b();
                    } else if (motionEvent2.getActionMasked() != 10 && z11) {
                        v0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z10 = false;
                }
                if (!z11 && z10 && actionMasked != 3 && actionMasked != 9 && g0(motionEvent)) {
                    v0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.C0 = MotionEvent.obtainNoHistory(motionEvent);
                return t0(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.f2939h0 = false;
        }
    }

    private final boolean Z(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        return getFocusOwner().m(new x1.b(f10 * androidx.core.view.i.j(viewConfiguration, getContext()), f10 * androidx.core.view.i.f(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    private final boolean a0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void c0(a2.f0 f0Var) {
        f0Var.B0();
        v0.d<a2.f0> dVarS0 = f0Var.s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            int i10 = 0;
            a2.f0[] f0VarArrN = dVarS0.n();
            do {
                c0(f0VarArrN[i10]);
                i10++;
            } while (i10 < iO);
        }
    }

    private final void d0(a2.f0 f0Var) {
        int i10 = 0;
        q0.I(this.I, f0Var, false, 2, null);
        v0.d<a2.f0> dVarS0 = f0Var.s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            a2.f0[] f0VarArrN = dVarS0.n();
            do {
                d0(f0VarArrN[i10]);
                i10++;
            } while (i10 < iO);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6 A[LOOP:0: B:35:0x0061->B:61:0x00a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9 A[EDGE_INSN: B:64:0x00a9->B:62:0x00a9 BREAK  A[LOOP:0: B:35:0x0061->B:61:0x00a6], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean e0(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L14
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L14
            r0 = r3
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L59
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L29
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L29
            r0 = r3
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L59
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L3e
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L3e
            r0 = r3
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L59
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L53
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L53
            r0 = r3
            goto L54
        L53:
            r0 = r2
        L54:
            if (r0 != 0) goto L57
            goto L59
        L57:
            r0 = r2
            goto L5a
        L59:
            r0 = r3
        L5a:
            if (r0 != 0) goto La9
            int r1 = r7.getPointerCount()
            r4 = r3
        L61:
            if (r4 >= r1) goto La9
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L75
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            r0 = r3
            goto L76
        L75:
            r0 = r2
        L76:
            if (r0 == 0) goto La3
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L8a
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8a
            r0 = r3
            goto L8b
        L8a:
            r0 = r2
        L8b:
            if (r0 == 0) goto La3
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L9d
            androidx.compose.ui.platform.x r0 = androidx.compose.ui.platform.x.f3103a
            boolean r0 = r0.a(r7, r4)
            if (r0 != 0) goto L9d
            r0 = r3
            goto L9e
        L9d:
            r0 = r2
        L9e:
            if (r0 == 0) goto La1
            goto La3
        La1:
            r0 = r2
            goto La4
        La3:
            r0 = r3
        La4:
            if (r0 != 0) goto La9
            int r4 = r4 + 1
            goto L61
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.i.e0(android.view.MotionEvent):boolean");
    }

    private final boolean f0(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean g0(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f <= x10 && x10 <= ((float) getWidth())) {
            if (0.0f <= y10 && y10 <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final c get_viewTreeOwners() {
        return (c) this.f2945k0.getValue();
    }

    private final boolean h0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.C0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
        }
        return true;
    }

    private final long j0(int i10, int i11) {
        return md.c0.b(md.c0.b(i11) | md.c0.b(md.c0.b(i10) << 32));
    }

    private final void k0() {
        if (this.f2939h0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f2937g0) {
            this.f2937g0 = jCurrentAnimationTimeMillis;
            m0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.f2929c0);
            int[] iArr = this.f2929c0;
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.f2929c0;
            this.f2941i0 = k1.g.a(f10 - iArr2[0], f11 - iArr2[1]);
        }
    }

    private final void l0(MotionEvent motionEvent) {
        this.f2937g0 = AnimationUtils.currentAnimationTimeMillis();
        m0();
        long jF = z0.f(this.f2933e0, k1.g.a(motionEvent.getX(), motionEvent.getY()));
        this.f2941i0 = k1.g.a(motionEvent.getRawX() - k1.f.o(jF), motionEvent.getRawY() - k1.f.p(jF));
    }

    private final void m0() {
        this.K0.a(this, this.f2933e0);
        y0.a(this.f2933e0, this.f2935f0);
    }

    private final void p0(a2.f0 f0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (f0Var != null) {
            while (f0Var != null && f0Var.d0() == f0.g.InMeasureBlock && R(f0Var)) {
                f0Var = f0Var.k0();
            }
            if (f0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void q0(i iVar, a2.f0 f0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = null;
        }
        iVar.p0(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(i iVar) {
        iVar.y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(i iVar) {
        iVar.I0 = false;
        MotionEvent motionEvent = iVar.C0;
        ae.r.c(motionEvent);
        if (!(motionEvent.getActionMasked() == 10)) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        iVar.t0(motionEvent);
    }

    private void setFontFamilyResolver(t.b bVar) {
        this.f2967v0.setValue(bVar);
    }

    private void setLayoutDirection(w2.r rVar) {
        this.f2971x0.setValue(rVar);
    }

    private final void set_viewTreeOwners(c cVar) {
        this.f2945k0.setValue(cVar);
    }

    private final int t0(MotionEvent motionEvent) {
        v1.e0 e0Var;
        if (this.L0) {
            this.L0 = false;
            this.f2942j.a(v1.l0.b(motionEvent.getMetaState()));
        }
        v1.d0 d0VarC = this.f2966v.c(motionEvent, this);
        if (d0VarC == null) {
            this.f2968w.b();
            return v1.g0.a(false, false);
        }
        List<v1.e0> listB = d0VarC.b();
        int size = listB.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                e0Var = listB.get(size);
                if (e0Var.a()) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
            e0Var = null;
        } else {
            e0Var = null;
        }
        v1.e0 e0Var2 = e0Var;
        if (e0Var2 != null) {
            this.f2926b = e0Var2.f();
        }
        int iA = this.f2968w.a(d0VarC, this, g0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || o0.c(iA)) {
            return iA;
        }
        this.f2966v.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long j11 = j(k1.g.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = k1.f.o(j11);
            pointerCoords.y = k1.f.p(j11);
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        v1.d0 d0VarC = this.f2966v.c(motionEventObtain, this);
        ae.r.c(d0VarC);
        this.f2968w.a(d0VarC, this, true);
        motionEventObtain.recycle();
    }

    static /* synthetic */ void v0(i iVar, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        iVar.u0(motionEvent, i10, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w0(h1.h hVar, long j10, zd.l<? super n1.f, i0> lVar) {
        Resources resources = getContext().getResources();
        return androidx.compose.ui.platform.o.f3064a.a(this, hVar, new h1.a(w2.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j10, lVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(i iVar, boolean z10) {
        iVar.f2975z0.b(z10 ? s1.a.f19913b.b() : s1.a.f19913b.a());
    }

    private final void y0() {
        getLocationOnScreen(this.f2929c0);
        long j10 = this.f2927b0;
        int iC = w2.n.c(j10);
        int iD = w2.n.d(j10);
        int[] iArr = this.f2929c0;
        boolean z10 = false;
        int i10 = iArr[0];
        if (iC != i10 || iD != iArr[1]) {
            this.f2927b0 = w2.o.a(i10, iArr[1]);
            if (iC != Integer.MAX_VALUE && iD != Integer.MAX_VALUE) {
                getRoot().S().F().A1();
                z10 = true;
            }
        }
        this.I.c(z10);
    }

    public final Object Q(qd.d<? super i0> dVar) {
        Object objQ = this.f2956q.Q(dVar);
        return objQ == rd.d.e() ? objQ : i0.f15558a;
    }

    public androidx.compose.ui.focus.b V(KeyEvent keyEvent) {
        int iC;
        long jA = t1.d.a(keyEvent);
        a.C0429a c0429a = t1.a.f21055b;
        if (t1.a.p(jA, c0429a.l())) {
            iC = t1.d.d(keyEvent) ? androidx.compose.ui.focus.b.f2698b.f() : androidx.compose.ui.focus.b.f2698b.e();
        } else if (t1.a.p(jA, c0429a.e())) {
            iC = androidx.compose.ui.focus.b.f2698b.g();
        } else if (t1.a.p(jA, c0429a.d())) {
            iC = androidx.compose.ui.focus.b.f2698b.d();
        } else {
            if (t1.a.p(jA, c0429a.f()) ? true : t1.a.p(jA, c0429a.k())) {
                iC = androidx.compose.ui.focus.b.f2698b.h();
            } else {
                if (t1.a.p(jA, c0429a.c()) ? true : t1.a.p(jA, c0429a.j())) {
                    iC = androidx.compose.ui.focus.b.f2698b.a();
                } else {
                    if (t1.a.p(jA, c0429a.b()) ? true : t1.a.p(jA, c0429a.g()) ? true : t1.a.p(jA, c0429a.i())) {
                        iC = androidx.compose.ui.focus.b.f2698b.b();
                    } else {
                        if (!(t1.a.p(jA, c0429a.a()) ? true : t1.a.p(jA, c0429a.h()))) {
                            return null;
                        }
                        iC = androidx.compose.ui.focus.b.f2698b.c();
                    }
                }
            }
        }
        return androidx.compose.ui.focus.b.i(iC);
    }

    @Override // a2.e1
    public void a(boolean z10) {
        zd.a<i0> aVar;
        if (this.I.k() || this.I.l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    aVar = this.J0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                aVar = null;
            }
            if (this.I.p(aVar)) {
                requestLayout();
            }
            q0.d(this.I, false, 1, null);
            i0 i0Var = i0.f15558a;
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        g1.b bVar;
        if (!P() || (bVar = this.f2972y) == null) {
            return;
        }
        g1.d.a(bVar, sparseArray);
    }

    @Override // a2.e1
    public void b(zd.a<i0> aVar) {
        if (this.F0.j(aVar)) {
            return;
        }
        this.F0.b(aVar);
    }

    public void b0() {
        c0(getRoot());
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f2956q.T(false, i10, this.f2926b);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f2956q.T(true, i10, this.f2926b);
    }

    @Override // a2.e1
    public void d(a2.f0 f0Var, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            if (!this.I.C(f0Var, z11) || !z12) {
                return;
            }
        } else if (!this.I.H(f0Var, z11) || !z12) {
            return;
        }
        p0(f0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            c0(getRoot());
        }
        e1.c(this, false, 1, null);
        d1.k.f9368e.k();
        this.f2964u = true;
        l1.c0 c0Var = this.f2948m;
        Canvas canvasW = c0Var.a().w();
        c0Var.a().x(canvas);
        getRoot().A(c0Var.a());
        c0Var.a().x(canvasW);
        if (!this.f2960s.isEmpty()) {
            int size = this.f2960s.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2960s.get(i10).h();
            }
        }
        if (a0.f2851p.b()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.f2960s.clear();
        this.f2964u = false;
        List<d1> list = this.f2962t;
        if (list != null) {
            ae.r.c(list);
            this.f2960s.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return Z(motionEvent);
            }
            if (!e0(motionEvent) && isAttachedToWindow()) {
                return o0.c(Y(motionEvent));
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.I0) {
            removeCallbacks(this.H0);
            this.H0.run();
        }
        if (e0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.f2956q.b0(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && g0(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.C0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.C0 = MotionEvent.obtainNoHistory(motionEvent);
                this.I0 = true;
                post(this.H0);
                return false;
            }
        } else if (!h0(motionEvent)) {
            return false;
        }
        return o0.c(Y(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f2942j.a(v1.l0.b(keyEvent.getMetaState()));
        return getFocusOwner().p(t1.b.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().l(t1.b.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.I0) {
            removeCallbacks(this.H0);
            MotionEvent motionEvent2 = this.C0;
            ae.r.c(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || a0(motionEvent, motionEvent2)) {
                this.H0.run();
            } else {
                this.I0 = false;
            }
        }
        if (e0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !h0(motionEvent)) {
            return false;
        }
        int iY = Y(motionEvent);
        if (o0.b(iY)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return o0.c(iY);
    }

    @Override // a2.e1
    public void e(a2.f0 f0Var) {
        this.f2956q.G0(f0Var);
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, InvocationTargetException {
        View viewU = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
                if (objInvoke instanceof View) {
                    viewU = (View) objInvoke;
                }
            } else {
                viewU = U(i10, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewU;
    }

    @Override // a2.e1
    public long g(long j10) {
        k0();
        return z0.f(this.f2933e0, j10);
    }

    @Override // a2.e1
    public b2.d getAccessibilityManager() {
        return this.B;
    }

    public final b2.g0 getAndroidViewsHandler$ui_release() {
        if (this.E == null) {
            b2.g0 g0Var = new b2.g0(getContext());
            this.E = g0Var;
            addView(g0Var);
        }
        b2.g0 g0Var2 = this.E;
        ae.r.c(g0Var2);
        return g0Var2;
    }

    @Override // a2.e1
    public g1.e getAutofill() {
        return this.f2972y;
    }

    @Override // a2.e1
    public g1.n getAutofillTree() {
        return this.f2958r;
    }

    @Override // a2.e1
    public b2.e getClipboardManager() {
        return this.A;
    }

    public final zd.l<Configuration, i0> getConfigurationChangeObserver() {
        return this.f2970x;
    }

    @Override // a2.e1
    public qd.g getCoroutineContext() {
        return this.f2924a;
    }

    @Override // a2.e1
    public w2.d getDensity() {
        return this.f2932e;
    }

    @Override // a2.e1
    public h1.c getDragAndDropManager() {
        return this.f2940i;
    }

    @Override // a2.e1
    public j1.i getFocusOwner() {
        return this.f2936g;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        i0 i0Var;
        k1.h hVarI = getFocusOwner().i();
        if (hVarI != null) {
            rect.left = ce.c.d(hVarI.f());
            rect.top = ce.c.d(hVarI.i());
            rect.right = ce.c.d(hVarI.g());
            rect.bottom = ce.c.d(hVarI.c());
            i0Var = i0.f15558a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // a2.e1
    public t.b getFontFamilyResolver() {
        return (t.b) this.f2967v0.getValue();
    }

    @Override // a2.e1
    public s.b getFontLoader() {
        return this.f2965u0;
    }

    @Override // a2.e1
    public r1.a getHapticFeedBack() {
        return this.f2973y0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.I.k();
    }

    @Override // a2.e1
    public s1.b getInputModeManager() {
        return this.f2975z0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f2937g0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, a2.e1
    public w2.r getLayoutDirection() {
        return (w2.r) this.f2971x0.getValue();
    }

    public long getMeasureIteration() {
        return this.I.o();
    }

    @Override // a2.e1
    public z1.f getModifierLocalManager() {
        return this.A0;
    }

    @Override // a2.e1
    public t0.a getPlacementScope() {
        return u0.b(this);
    }

    @Override // a2.e1
    public v1.y getPointerIconService() {
        return this.M0;
    }

    @Override // a2.e1
    public a2.f0 getRoot() {
        return this.f2950n;
    }

    public m1 getRootForTest() {
        return this.f2952o;
    }

    public g2.r getSemanticsOwner() {
        return this.f2954p;
    }

    @Override // a2.e1
    public h0 getSharedDrawScope() {
        return this.f2930d;
    }

    @Override // a2.e1
    public boolean getShowLayoutBounds() {
        return this.D;
    }

    @Override // a2.e1
    public g1 getSnapshotObserver() {
        return this.C;
    }

    @Override // a2.e1
    public p1 getSoftwareKeyboardController() {
        return this.f2963t0;
    }

    @Override // a2.e1
    public p2.g0 getTextInputService() {
        return this.f2959r0;
    }

    @Override // a2.e1
    public r1 getTextToolbar() {
        return this.B0;
    }

    public View getView() {
        return this;
    }

    @Override // a2.e1
    public x1 getViewConfiguration() {
        return this.f2925a0;
    }

    public final c getViewTreeOwners() {
        return (c) this.f2947l0.getValue();
    }

    @Override // a2.e1
    public d2 getWindowInfo() {
        return this.f2942j;
    }

    @Override // a2.e1
    public void h(a2.f0 f0Var, boolean z10, boolean z11) {
        if (z10) {
            if (!this.I.A(f0Var, z11)) {
                return;
            }
        } else if (!this.I.F(f0Var, z11)) {
            return;
        }
        q0(this, null, 1, null);
    }

    public final void i0(d1 d1Var, boolean z10) {
        List arrayList;
        if (z10) {
            if (this.f2964u) {
                arrayList = this.f2962t;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f2962t = arrayList;
                }
            } else {
                arrayList = this.f2960s;
            }
            arrayList.add(d1Var);
            return;
        }
        if (this.f2964u) {
            return;
        }
        this.f2960s.remove(d1Var);
        List<d1> list = this.f2962t;
        if (list != null) {
            list.remove(d1Var);
        }
    }

    @Override // v1.n0
    public long j(long j10) {
        k0();
        long jF = z0.f(this.f2933e0, j10);
        return k1.g.a(k1.f.o(jF) + k1.f.o(this.f2941i0), k1.f.p(jF) + k1.f.p(this.f2941i0));
    }

    @Override // v1.n0
    public void k(float[] fArr) {
        k0();
        z0.k(fArr, this.f2933e0);
        b2.x.i(fArr, k1.f.o(this.f2941i0), k1.f.p(this.f2941i0), this.f2931d0);
    }

    @Override // a2.e1
    public void l(a2.f0 f0Var, long j10) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.I.q(f0Var, j10);
            if (!this.I.k()) {
                q0.d(this.I, false, 1, null);
            }
            i0 i0Var = i0.f15558a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // a2.e1
    public void m(e1.b bVar) {
        this.I.v(bVar);
        q0(this, null, 1, null);
    }

    @Override // a2.e1
    public void n() {
        if (this.f2974z) {
            getSnapshotObserver().b();
            this.f2974z = false;
        }
        b2.g0 g0Var = this.E;
        if (g0Var != null) {
            S(g0Var);
        }
        while (this.F0.s()) {
            int iO = this.F0.o();
            for (int i10 = 0; i10 < iO; i10++) {
                zd.a<i0> aVar = this.F0.n()[i10];
                this.F0.A(i10, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.F0.y(0, iO);
        }
    }

    public final boolean n0(d1 d1Var) {
        if (this.F != null) {
            a0.f2851p.b();
        }
        this.E0.c(d1Var);
        return true;
    }

    public final void o0() {
        this.f2974z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        o4.e eVarA;
        androidx.lifecycle.g lifecycle;
        g1.b bVar;
        super.onAttachedToWindow();
        d0(getRoot());
        c0(getRoot());
        getSnapshotObserver().k();
        if (P() && (bVar = this.f2972y) != null) {
            g1.l.f11265a.a(bVar);
        }
        o4.e eVarA2 = o4.r.a(this);
        x4.f fVarA = x4.g.a(this);
        c viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(eVarA2 == null || fVarA == null || (eVarA2 == viewTreeOwners.a() && fVarA == viewTreeOwners.a()))) {
            if (eVarA2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (fVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (eVarA = viewTreeOwners.a()) != null && (lifecycle = eVarA.getLifecycle()) != null) {
                lifecycle.c(this);
            }
            eVarA2.getLifecycle().a(this);
            c cVar = new c(eVarA2, fVarA);
            set_viewTreeOwners(cVar);
            zd.l<? super c, i0> lVar = this.f2949m0;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
            this.f2949m0 = null;
        }
        this.f2975z0.b(isInTouchMode() ? s1.a.f19913b.b() : s1.a.f19913b.a());
        c viewTreeOwners2 = getViewTreeOwners();
        ae.r.c(viewTreeOwners2);
        viewTreeOwners2.a().getLifecycle().a(this);
        c viewTreeOwners3 = getViewTreeOwners();
        ae.r.c(viewTreeOwners3);
        viewTreeOwners3.a().getLifecycle().a(this.f2956q);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f2951n0);
        getViewTreeObserver().addOnScrollChangedListener(this.f2953o0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f2955p0);
        if (Build.VERSION.SDK_INT >= 31) {
            b2.u.f5412a.b(this, new a());
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        b2.z zVar = (b2.z) f1.h.c(this.f2961s0);
        return zVar == null ? this.f2957q0.i() : zVar.b();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2932e = w2.a.a(getContext());
        if (W(configuration) != this.f2969w0) {
            this.f2969w0 = W(configuration);
            setFontFamilyResolver(n2.x.a(getContext()));
        }
        this.f2970x.invoke(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        b2.z zVar = (b2.z) f1.h.c(this.f2961s0);
        return zVar == null ? this.f2957q0.f(editorInfo) : zVar.a(editorInfo);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        this.f2956q.E0(jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        g1.b bVar;
        o4.e eVarA;
        androidx.lifecycle.g lifecycle;
        o4.e eVarA2;
        androidx.lifecycle.g lifecycle2;
        super.onDetachedFromWindow();
        getSnapshotObserver().l();
        c viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (eVarA2 = viewTreeOwners.a()) != null && (lifecycle2 = eVarA2.getLifecycle()) != null) {
            lifecycle2.c(this);
        }
        c viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (eVarA = viewTreeOwners2.a()) != null && (lifecycle = eVarA.getLifecycle()) != null) {
            lifecycle.c(this.f2956q);
        }
        if (P() && (bVar = this.f2972y) != null) {
            g1.l.f11265a.b(bVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f2951n0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f2953o0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f2955p0);
        if (Build.VERSION.SDK_INT >= 31) {
            b2.u.f5412a.a(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z10 + ')');
        j1.s sVarH = getFocusOwner().h();
        sVarH.f13820b.b(new C0063i(z10, this));
        if (sVarH.f13821c) {
            if (z10) {
                getFocusOwner().d();
                return;
            } else {
                getFocusOwner().n();
                return;
            }
        }
        try {
            sVarH.f();
            if (z10) {
                getFocusOwner().d();
            } else {
                getFocusOwner().n();
            }
            i0 i0Var = i0.f15558a;
        } finally {
            sVarH.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.I.p(this.J0);
        this.G = null;
        y0();
        if (this.E != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                d0(getRoot());
            }
            long jT = T(i10);
            int iB = (int) md.c0.b(jT >>> 32);
            int iB2 = (int) md.c0.b(jT & 4294967295L);
            long jT2 = T(i11);
            long jA = w2.c.a(iB, iB2, (int) md.c0.b(jT2 >>> 32), (int) md.c0.b(4294967295L & jT2));
            w2.b bVar = this.G;
            boolean zG = false;
            if (bVar == null) {
                this.G = w2.b.b(jA);
                this.H = false;
            } else {
                if (bVar != null) {
                    zG = w2.b.g(bVar.t(), jA);
                }
                if (!zG) {
                    this.H = true;
                }
            }
            this.I.J(jA);
            this.I.r();
            setMeasuredDimension(getRoot().p0(), getRoot().M());
            if (this.E != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().p0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().M(), 1073741824));
            }
            i0 i0Var = i0.f15558a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        g1.b bVar;
        if (!P() || viewStructure == null || (bVar = this.f2972y) == null) {
            return;
        }
        g1.d.b(bVar, viewStructure);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(o4.e eVar) {
        setShowLayoutBounds(N0.b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (this.f2928c) {
            w2.r rVarG = b2.x.g(i10);
            setLayoutDirection(rVarG);
            getFocusOwner().a(rVarG);
        }
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        this.f2956q.J0(longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        boolean zB;
        this.f2942j.b(z10);
        this.L0 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || getShowLayoutBounds() == (zB = N0.b())) {
            return;
        }
        setShowLayoutBounds(zB);
        b0();
    }

    @Override // a2.e1
    public void p() {
        this.f2956q.H0();
    }

    @Override // a2.e1
    public void q(a2.f0 f0Var) {
    }

    public final void setConfigurationChangeObserver(zd.l<? super Configuration, i0> lVar) {
        this.f2970x = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.f2937g0 = j10;
    }

    public final void setOnViewTreeOwnersAvailable(zd.l<? super c, i0> lVar) {
        c viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f2949m0 = lVar;
    }

    @Override // a2.e1
    public void setShowLayoutBounds(boolean z10) {
        this.D = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // a2.e1
    public void u(a2.f0 f0Var, boolean z10) {
        this.I.g(f0Var, z10);
    }

    @Override // v1.n0
    public long v(long j10) {
        k0();
        return z0.f(this.f2935f0, k1.g.a(k1.f.o(j10) - k1.f.o(this.f2941i0), k1.f.p(j10) - k1.f.p(this.f2941i0)));
    }

    @Override // a2.e1
    public void w(a2.f0 f0Var) {
        this.I.t(f0Var);
        o0();
    }

    @Override // a2.e1
    public d1 x(zd.l<? super l1.b0, i0> lVar, zd.a<i0> aVar) {
        d1 d1VarB = this.E0.b();
        if (d1VarB != null) {
            d1VarB.b(lVar, aVar);
            return d1VarB;
        }
        if (isHardwareAccelerated() && this.f2943j0) {
            try {
                return new b2.k1(this, lVar, aVar);
            } catch (Throwable unused) {
                this.f2943j0 = false;
            }
        }
        if (this.F == null) {
            a0.c cVar = a0.f2851p;
            if (!cVar.a()) {
                cVar.d(new View(getContext()));
            }
            w wVar = cVar.b() ? new w(getContext()) : new b0(getContext());
            this.F = wVar;
            addView(wVar);
        }
        w wVar2 = this.F;
        ae.r.c(wVar2);
        return new a0(this, wVar2, lVar, aVar);
    }

    @Override // a2.e1
    public void y(a2.f0 f0Var) {
        this.I.E(f0Var);
        q0(this, null, 1, null);
    }
}
