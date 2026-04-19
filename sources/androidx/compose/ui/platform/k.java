package androidx.compose.ui.platform;

import a2.e1;
import a2.w0;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.i;
import androidx.compose.ui.platform.k;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.g;
import b2.n1;
import com.google.android.gms.common.api.a;
import g2.g;
import g2.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import md.i0;
import n2.t;
import nd.m0;
import nd.r0;
import p3.g;

/* JADX INFO: loaded from: classes.dex */
public final class k extends androidx.core.view.a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final d f2992g0 = new d(null);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f2993h0 = 8;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int[] f2994i0 = {f1.e.f11042a, f1.e.f11043b, f1.e.f11054m, f1.e.f11065x, f1.e.A, f1.e.B, f1.e.C, f1.e.D, f1.e.E, f1.e.F, f1.e.f11044c, f1.e.f11045d, f1.e.f11046e, f1.e.f11047f, f1.e.f11048g, f1.e.f11049h, f1.e.f11050i, f1.e.f11051j, f1.e.f11052k, f1.e.f11053l, f1.e.f11055n, f1.e.f11056o, f1.e.f11057p, f1.e.f11058q, f1.e.f11059r, f1.e.f11060s, f1.e.f11061t, f1.e.f11062u, f1.e.f11063v, f1.e.f11064w, f1.e.f11066y, f1.e.f11067z};
    private boolean A;
    private androidx.compose.ui.platform.coreshims.a B;
    private final z.a<Integer, androidx.compose.ui.platform.coreshims.c> C;
    private final z.b<Integer> D;
    private g E;
    private Map<Integer, n1> F;
    private z.b<Integer> G;
    private HashMap<Integer, Integer> H;
    private HashMap<Integer, Integer> I;
    private final String X;
    private final String Y;
    private final r2.u Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Map<Integer, i> f2995a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private i f2996b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f2997c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.compose.ui.platform.i f2998d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final Runnable f2999d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final List<y> f3001e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final zd.l<y, i0> f3003f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AccessibilityManager f3004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f3006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f3007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<AccessibilityServiceInfo> f3008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private EnumC0064k f3009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Handler f3010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p3.k f3011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f3012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AccessibilityNodeInfo f3013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f3014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final HashMap<Integer, g2.j> f3015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashMap<Integer, g2.j> f3016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private z.d0<z.d0<CharSequence>> f3017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private z.d0<Map<CharSequence, Integer>> f3018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f3019v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f3020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final z.b<a2.f0> f3021x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ne.d<i0> f3022y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f3023z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3000e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zd.l<? super AccessibilityEvent, Boolean> f3002f = new o();

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = k.this.f3004g;
            k kVar = k.this;
            accessibilityManager.addAccessibilityStateChangeListener(kVar.f3006i);
            accessibilityManager.addTouchExplorationStateChangeListener(kVar.f3007j);
            if (k.this.g0()) {
                return;
            }
            k kVar2 = k.this;
            kVar2.h1(kVar2.h0(view));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            k.this.f3010m.removeCallbacks(k.this.f2999d0);
            AccessibilityManager accessibilityManager = k.this.f3004g;
            k kVar = k.this;
            accessibilityManager.removeAccessibilityStateChangeListener(kVar.f3006i);
            accessibilityManager.removeTouchExplorationStateChangeListener(kVar.f3007j);
            k.this.h1(null);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3025a = new b();

        private b() {
        }

        public static final void a(p3.g gVar, g2.p pVar) {
            g2.a aVar;
            if (!androidx.compose.ui.platform.m.p(pVar) || (aVar = (g2.a) g2.m.a(pVar.v(), g2.k.f11332a.t())) == null) {
                return;
            }
            gVar.b(new g.a(R.id.accessibilityActionSetProgress, aVar.b()));
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f3026a = new c();

        private c() {
        }

        public static final void a(p3.g gVar, g2.p pVar) {
            if (androidx.compose.ui.platform.m.p(pVar)) {
                g2.l lVarV = pVar.v();
                g2.k kVar = g2.k.f11332a;
                g2.a aVar = (g2.a) g2.m.a(lVarV, kVar.o());
                if (aVar != null) {
                    gVar.b(new g.a(R.id.accessibilityActionPageUp, aVar.b()));
                }
                g2.a aVar2 = (g2.a) g2.m.a(pVar.v(), kVar.l());
                if (aVar2 != null) {
                    gVar.b(new g.a(R.id.accessibilityActionPageDown, aVar2.b()));
                }
                g2.a aVar3 = (g2.a) g2.m.a(pVar.v(), kVar.m());
                if (aVar3 != null) {
                    gVar.b(new g.a(R.id.accessibilityActionPageLeft, aVar3.b()));
                }
                g2.a aVar4 = (g2.a) g2.m.a(pVar.v(), kVar.n());
                if (aVar4 != null) {
                    gVar.b(new g.a(R.id.accessibilityActionPageRight, aVar4.b()));
                }
            }
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(ae.j jVar) {
            this();
        }
    }

    private final class e extends AccessibilityNodeProvider {
        public e() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            k.this.O(i10, accessibilityNodeInfo, str, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            AccessibilityNodeInfo accessibilityNodeInfoZ = k.this.Z(i10);
            if (k.this.f3014q && i10 == k.this.f3012o) {
                k.this.f3013p = accessibilityNodeInfoZ;
            }
            return accessibilityNodeInfoZ;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            return createAccessibilityNodeInfo(k.this.f3012o);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return k.this.K0(i10, i11, bundle);
        }
    }

    private static final class f implements Comparator<g2.p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f3028a = new f();

        private f() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g2.p pVar, g2.p pVar2) {
            k1.h hVarJ = pVar.j();
            k1.h hVarJ2 = pVar2.j();
            int iCompare = Float.compare(hVarJ.f(), hVarJ2.f());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(hVarJ.i(), hVarJ2.i());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(hVarJ.c(), hVarJ2.c());
            return iCompare3 != 0 ? iCompare3 : Float.compare(hVarJ.g(), hVarJ2.g());
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g2.p f3029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f3032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f3033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f3034f;

        public g(g2.p pVar, int i10, int i11, int i12, int i13, long j10) {
            this.f3029a = pVar;
            this.f3030b = i10;
            this.f3031c = i11;
            this.f3032d = i12;
            this.f3033e = i13;
            this.f3034f = j10;
        }

        public final int a() {
            return this.f3030b;
        }

        public final int b() {
            return this.f3032d;
        }

        public final int c() {
            return this.f3031c;
        }

        public final g2.p d() {
            return this.f3029a;
        }

        public final int e() {
            return this.f3033e;
        }

        public final long f() {
            return this.f3034f;
        }
    }

    private static final class h implements Comparator<g2.p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f3035a = new h();

        private h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g2.p pVar, g2.p pVar2) {
            k1.h hVarJ = pVar.j();
            k1.h hVarJ2 = pVar2.j();
            int iCompare = Float.compare(hVarJ2.g(), hVarJ.g());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(hVarJ.i(), hVarJ2.i());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(hVarJ.c(), hVarJ2.c());
            return iCompare3 != 0 ? iCompare3 : Float.compare(hVarJ2.f(), hVarJ.f());
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g2.p f3036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g2.l f3037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<Integer> f3038c = new LinkedHashSet();

        public i(g2.p pVar, Map<Integer, n1> map) {
            this.f3036a = pVar;
            this.f3037b = pVar.v();
            List<g2.p> listS = pVar.s();
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                g2.p pVar2 = listS.get(i10);
                if (map.containsKey(Integer.valueOf(pVar2.n()))) {
                    this.f3038c.add(Integer.valueOf(pVar2.n()));
                }
            }
        }

        public final Set<Integer> a() {
            return this.f3038c;
        }

        public final g2.p b() {
            return this.f3036a;
        }

        public final g2.l c() {
            return this.f3037b;
        }

        public final boolean d() {
            return this.f3037b.f(g2.s.f11377a.q());
        }
    }

    private static final class j implements Comparator<md.s<? extends k1.h, ? extends List<g2.p>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f3039a = new j();

        private j() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(md.s<k1.h, ? extends List<g2.p>> sVar, md.s<k1.h, ? extends List<g2.p>> sVar2) {
            int iCompare = Float.compare(sVar.c().i(), sVar2.c().i());
            return iCompare != 0 ? iCompare : Float.compare(sVar.c().c(), sVar2.c().c());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.k$k, reason: collision with other inner class name */
    private enum EnumC0064k {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f3043a = new l();

        private l() {
        }

        private final void b(k kVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            n1 n1Var;
            g2.p pVarB;
            g2.a aVar;
            zd.l lVar;
            m0 m0VarA = n3.b.a(longSparseArray);
            while (m0VarA.hasNext()) {
                long jNextLong = m0VarA.nextLong();
                ViewTranslationResponse viewTranslationResponse = longSparseArray.get(jNextLong);
                if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (n1Var = (n1) kVar.i0().get(Integer.valueOf((int) jNextLong))) != null && (pVarB = n1Var.b()) != null && (aVar = (g2.a) g2.m.a(pVarB.v(), g2.k.f11332a.w())) != null && (lVar = (zd.l) aVar.a()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(k kVar, LongSparseArray longSparseArray) {
            f3043a.b(kVar, longSparseArray);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
        /* JADX WARN: Type inference failed for: r4v1, types: [android.view.translation.ViewTranslationRequest$Builder] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(androidx.compose.ui.platform.k r15, long[] r16, int[] r17, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> r18) {
            /*
                r14 = this;
                r0 = r16
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L59
                r3 = r0[r2]
                java.util.Map r5 = androidx.compose.ui.platform.k.z(r15)
                int r3 = (int) r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r5.get(r3)
                b2.n1 r3 = (b2.n1) r3
                if (r3 == 0) goto L37
                g2.p r3 = r3.b()
                if (r3 == 0) goto L37
                android.view.translation.ViewTranslationRequest$Builder r4 = new android.view.translation.ViewTranslationRequest$Builder
                androidx.compose.ui.platform.i r5 = r15.q0()
                android.view.autofill.AutofillId r5 = r5.getAutofillId()
                int r6 = r3.n()
                long r6 = (long) r6
                r4.<init>(r5, r6)
                java.lang.String r9 = androidx.compose.ui.platform.m.h(r3)
                if (r9 != 0) goto L3a
            L37:
                r4 = r18
                goto L56
            L3a:
                r10 = 0
                r11 = 0
                r12 = 6
                r13 = 0
                i2.d r3 = new i2.d
                r8 = r3
                r8.<init>(r9, r10, r11, r12, r13)
                android.view.translation.TranslationRequestValue r3 = android.view.translation.TranslationRequestValue.forText(r3)
                java.lang.String r5 = "android:text"
                r4.setValue(r5, r3)
                android.view.translation.ViewTranslationRequest r3 = r4.build()
                r4 = r18
                r4.accept(r3)
            L56:
                int r2 = r2 + 1
                goto L4
            L59:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.k.l.c(androidx.compose.ui.platform.k, long[], int[], java.util.function.Consumer):void");
        }

        public final void d(final k kVar, final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (ae.r.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(kVar, longSparseArray);
            } else {
                kVar.q0().post(new Runnable() { // from class: androidx.compose.ui.platform.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.l.e(kVar, longSparseArray);
                    }
                });
            }
        }
    }

    public /* synthetic */ class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3044a;

        static {
            int[] iArr = new int[h2.a.values().length];
            try {
                iArr[h2.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h2.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h2.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3044a = iArr;
        }
    }

    @sd.d(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2213, 2249}, m = "boundsUpdatesEventLoop$ui_release")
    static final class n extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f3046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f3047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f3048d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3050f;

        n(qd.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3048d = obj;
            this.f3050f |= Integer.MIN_VALUE;
            return k.this.Q(this);
        }
    }

    static final class o extends ae.s implements zd.l<AccessibilityEvent, Boolean> {
        o() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(k.this.q0().getParent().requestSendAccessibilityEvent(k.this.q0(), accessibilityEvent));
        }
    }

    static final class p extends ae.s implements zd.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f3052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f3053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(y yVar, k kVar) {
            super(0);
            this.f3052a = yVar;
            this.f3053b = kVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2() {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.k.p.invoke2():void");
        }
    }

    static final class q extends ae.s implements zd.l<y, i0> {
        q() {
            super(1);
        }

        public final void a(y yVar) {
            k.this.S0(yVar);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(y yVar) {
            a(yVar);
            return i0.f15558a;
        }
    }

    static final class r extends ae.s implements zd.l<a2.f0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f3055a = new r();

        r() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(a2.f0 f0Var) {
            g2.l lVarG = f0Var.G();
            return Boolean.valueOf(lVarG != null && lVarG.u());
        }
    }

    static final class s extends ae.s implements zd.l<a2.f0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f3056a = new s();

        s() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(a2.f0 f0Var) {
            return Boolean.valueOf(f0Var.h0().q(w0.a(8)));
        }
    }

    static final class t extends ae.s implements zd.p<g2.p, g2.p, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f3057a = new t();

        t() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(g2.p pVar, g2.p pVar2) {
            g2.l lVarM = pVar.m();
            g2.s sVar = g2.s.f11377a;
            g2.w<Float> wVarC = sVar.C();
            b2.q qVar = b2.q.f5390a;
            return Integer.valueOf(Float.compare(((Number) lVarM.r(wVarC, qVar)).floatValue(), ((Number) pVar2.m().r(sVar.C(), qVar)).floatValue()));
        }
    }

    public k(androidx.compose.ui.platform.i iVar) {
        this.f2998d = iVar;
        Object systemService = iVar.getContext().getSystemService("accessibility");
        ae.r.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f3004g = accessibilityManager;
        this.f3006i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: b2.j
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                androidx.compose.ui.platform.k.c0(this.f5307a, z10);
            }
        };
        this.f3007j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: b2.k
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                androidx.compose.ui.platform.k.u1(this.f5312a, z10);
            }
        };
        this.f3008k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f3009l = EnumC0064k.SHOW_ORIGINAL;
        this.f3010m = new Handler(Looper.getMainLooper());
        this.f3011n = new p3.k(new e());
        this.f3012o = Integer.MIN_VALUE;
        this.f3015r = new HashMap<>();
        this.f3016s = new HashMap<>();
        this.f3017t = new z.d0<>(0, 1, null);
        this.f3018u = new z.d0<>(0, 1, null);
        this.f3019v = -1;
        this.f3021x = new z.b<>(0, 1, null);
        this.f3022y = ne.g.b(1, null, null, 6, null);
        this.f3023z = true;
        this.C = new z.a<>();
        this.D = new z.b<>(0, 1, null);
        this.F = r0.e();
        this.G = new z.b<>(0, 1, null);
        this.H = new HashMap<>();
        this.I = new HashMap<>();
        this.X = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.Y = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.Z = new r2.u();
        this.f2995a0 = new LinkedHashMap();
        this.f2996b0 = new i(iVar.getSemanticsOwner().a(), r0.e());
        iVar.addOnAttachStateChangeListener(new a());
        this.f2999d0 = new Runnable() { // from class: b2.l
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.platform.k.T0(this.f5371a);
            }
        };
        this.f3001e0 = new ArrayList();
        this.f3003f0 = new q();
    }

    private final boolean A0() {
        return this.f3005h || (this.f3004g.isEnabled() && this.f3004g.isTouchExplorationEnabled());
    }

    private final void A1() {
        g2.l lVarC;
        z.b<? extends Integer> bVar = new z.b<>(0, 1, null);
        Iterator<Integer> it = this.G.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            n1 n1Var = i0().get(Integer.valueOf(iIntValue));
            g2.p pVarB = n1Var != null ? n1Var.b() : null;
            if (pVarB == null || !androidx.compose.ui.platform.m.y(pVarB)) {
                bVar.add(Integer.valueOf(iIntValue));
                i iVar = this.f2995a0.get(Integer.valueOf(iIntValue));
                b1(iIntValue, 32, (iVar == null || (lVarC = iVar.c()) == null) ? null : (String) g2.m.a(lVarC, g2.s.f11377a.q()));
            }
        }
        this.G.o(bVar);
        this.f2995a0.clear();
        for (Map.Entry<Integer, n1> entry : i0().entrySet()) {
            if (androidx.compose.ui.platform.m.y(entry.getValue().b()) && this.G.add(entry.getKey())) {
                b1(entry.getKey().intValue(), 16, (String) entry.getValue().b().v().o(g2.s.f11377a.q()));
            }
            this.f2995a0.put(entry.getKey(), new i(entry.getValue().b(), i0()));
        }
        this.f2996b0 = new i(this.f2998d.getSemanticsOwner().a(), i0());
    }

    private final void B0() {
        androidx.compose.ui.platform.coreshims.a aVar = this.B;
        if (aVar != null && Build.VERSION.SDK_INT >= 29) {
            if (!this.C.isEmpty()) {
                List listC0 = nd.c0.C0(this.C.values());
                ArrayList arrayList = new ArrayList(listC0.size());
                int size = listC0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((androidx.compose.ui.platform.coreshims.c) listC0.get(i10)).f());
                }
                aVar.d(arrayList);
                this.C.clear();
            }
            if (!this.D.isEmpty()) {
                List listC02 = nd.c0.C0(this.D);
                ArrayList arrayList2 = new ArrayList(listC02.size());
                int size2 = listC02.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList2.add(Long.valueOf(((Number) listC02.get(i11)).intValue()));
                }
                aVar.e(nd.c0.D0(arrayList2));
                this.D.clear();
            }
        }
    }

    private final void B1(g2.p pVar) {
        g2.a aVar;
        zd.l lVar;
        Boolean bool;
        g2.l lVarV = pVar.v();
        Boolean bool2 = (Boolean) g2.m.a(lVarV, g2.s.f11377a.n());
        if (this.f3009l == EnumC0064k.SHOW_ORIGINAL && ae.r.b(bool2, Boolean.TRUE)) {
            g2.a aVar2 = (g2.a) g2.m.a(lVarV, g2.k.f11332a.x());
            if (aVar2 == null || (lVar = (zd.l) aVar2.a()) == null) {
                return;
            } else {
                bool = Boolean.FALSE;
            }
        } else if (this.f3009l != EnumC0064k.SHOW_TRANSLATED || !ae.r.b(bool2, Boolean.FALSE) || (aVar = (g2.a) g2.m.a(lVarV, g2.k.f11332a.x())) == null || (lVar = (zd.l) aVar.a()) == null) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(a2.f0 f0Var) {
        if (this.f3021x.add(f0Var)) {
            this.f3022y.i(i0.f15558a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019d A[PHI: r0 r1
  0x019d: PHI (r0v132 g2.p) = (r0v131 g2.p), (r0v120 g2.p) binds: [B:96:0x01ba, B:87:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x019d: PHI (r1v52 g2.l) = (r1v51 g2.l), (r1v55 g2.l) binds: [B:96:0x01ba, B:87:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01aa A[PHI: r0
  0x01aa: PHI (r0v121 g2.p) = (r0v120 g2.p), (r0v131 g2.p), (r0v131 g2.p), (r0v120 g2.p) binds: [B:85:0x0195, B:94:0x01b4, B:96:0x01ba, B:87:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bf A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01aa -> B:90:0x01ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01ba -> B:88:0x019d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K0(int r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 1702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.k.K0(int, int, android.os.Bundle):boolean");
    }

    private static final boolean L0(g2.j jVar, float f10) {
        return (f10 < 0.0f && jVar.c().invoke().floatValue() > 0.0f) || (f10 > 0.0f && jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue());
    }

    private static final float M0(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    private final void N0(int i10, p3.g gVar, g2.p pVar) {
        g.a aVar;
        boolean zBooleanValue;
        Resources resources;
        int i11;
        gVar.e0("android.view.View");
        g2.l lVarV = pVar.v();
        g2.s sVar = g2.s.f11377a;
        g2.i iVar = (g2.i) g2.m.a(lVarV, sVar.t());
        if (iVar != null) {
            iVar.n();
            if (pVar.w() || pVar.s().isEmpty()) {
                i.a aVar2 = g2.i.f11320b;
                if (g2.i.k(iVar.n(), aVar2.g())) {
                    resources = this.f2998d.getContext().getResources();
                    i11 = f1.f.f11075h;
                } else if (g2.i.k(iVar.n(), aVar2.f())) {
                    resources = this.f2998d.getContext().getResources();
                    i11 = f1.f.f11074g;
                } else {
                    String strE = androidx.compose.ui.platform.m.E(iVar.n());
                    if (!g2.i.k(iVar.n(), aVar2.d()) || pVar.z() || pVar.v().u()) {
                        gVar.e0(strE);
                    }
                }
                gVar.A0(resources.getString(i11));
            }
            i0 i0Var = i0.f15558a;
        }
        if (pVar.v().f(g2.k.f11332a.v())) {
            gVar.e0("android.widget.EditText");
        }
        if (pVar.m().f(sVar.y())) {
            gVar.e0("android.widget.TextView");
        }
        gVar.u0(this.f2998d.getContext().getPackageName());
        gVar.q0(androidx.compose.ui.platform.m.A(pVar));
        List<g2.p> listS = pVar.s();
        int size = listS.size();
        for (int i12 = 0; i12 < size; i12++) {
            g2.p pVar2 = listS.get(i12);
            if (i0().containsKey(Integer.valueOf(pVar2.n()))) {
                androidx.compose.ui.viewinterop.b bVar = this.f2998d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(pVar2.p());
                if (bVar != null) {
                    gVar.c(bVar);
                } else if (pVar2.n() != -1) {
                    gVar.d(this.f2998d, pVar2.n());
                }
            }
        }
        if (i10 == this.f3012o) {
            gVar.Z(true);
            aVar = g.a.f18200l;
        } else {
            gVar.Z(false);
            aVar = g.a.f18199k;
        }
        gVar.b(aVar);
        l1(pVar, gVar);
        i1(pVar, gVar);
        k1(pVar, gVar);
        j1(pVar, gVar);
        g2.l lVarV2 = pVar.v();
        g2.s sVar2 = g2.s.f11377a;
        h2.a aVar3 = (h2.a) g2.m.a(lVarV2, sVar2.B());
        if (aVar3 != null) {
            if (aVar3 == h2.a.On) {
                gVar.d0(true);
            } else if (aVar3 == h2.a.Off) {
                gVar.d0(false);
            }
            i0 i0Var2 = i0.f15558a;
        }
        Boolean bool = (Boolean) g2.m.a(pVar.v(), sVar2.v());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (iVar == null ? false : g2.i.k(iVar.n(), g2.i.f11320b.g())) {
                gVar.D0(zBooleanValue2);
            } else {
                gVar.d0(zBooleanValue2);
            }
            i0 i0Var3 = i0.f15558a;
        }
        if (!pVar.v().u() || pVar.s().isEmpty()) {
            gVar.i0(androidx.compose.ui.platform.m.w(pVar));
        }
        String str = (String) g2.m.a(pVar.v(), sVar2.x());
        if (str != null) {
            g2.p pVarQ = pVar;
            while (true) {
                if (pVarQ == null) {
                    zBooleanValue = false;
                    break;
                }
                g2.l lVarV3 = pVarQ.v();
                g2.t tVar = g2.t.f11412a;
                if (lVarV3.f(tVar.a())) {
                    zBooleanValue = ((Boolean) pVarQ.v().o(tVar.a())).booleanValue();
                    break;
                }
                pVarQ = pVarQ.q();
            }
            if (zBooleanValue) {
                gVar.L0(str);
            }
        }
        g2.l lVarV4 = pVar.v();
        g2.s sVar3 = g2.s.f11377a;
        if (((i0) g2.m.a(lVarV4, sVar3.h())) != null) {
            gVar.p0(true);
            i0 i0Var4 = i0.f15558a;
        }
        gVar.y0(pVar.m().f(sVar3.r()));
        g2.l lVarV5 = pVar.v();
        g2.k kVar = g2.k.f11332a;
        gVar.k0(lVarV5.f(kVar.v()));
        gVar.l0(androidx.compose.ui.platform.m.p(pVar));
        gVar.n0(pVar.v().f(sVar3.g()));
        if (gVar.M()) {
            gVar.o0(((Boolean) pVar.v().o(sVar3.g())).booleanValue());
            if (gVar.N()) {
                gVar.a(2);
            } else {
                gVar.a(1);
            }
        }
        gVar.M0(androidx.compose.ui.platform.m.B(pVar));
        g2.g gVar2 = (g2.g) g2.m.a(pVar.v(), sVar3.p());
        if (gVar2 != null) {
            int iH = gVar2.h();
            g.a aVar4 = g2.g.f11311b;
            gVar.r0((g2.g.e(iH, aVar4.b()) || !g2.g.e(iH, aVar4.a())) ? 1 : 2);
            i0 i0Var5 = i0.f15558a;
        }
        gVar.f0(false);
        g2.a aVar5 = (g2.a) g2.m.a(pVar.v(), kVar.i());
        if (aVar5 != null) {
            boolean zB = ae.r.b(g2.m.a(pVar.v(), sVar3.v()), Boolean.TRUE);
            gVar.f0(!zB);
            if (androidx.compose.ui.platform.m.p(pVar) && !zB) {
                gVar.b(new g.a(16, aVar5.b()));
            }
            i0 i0Var6 = i0.f15558a;
        }
        gVar.s0(false);
        g2.a aVar6 = (g2.a) g2.m.a(pVar.v(), kVar.k());
        if (aVar6 != null) {
            gVar.s0(true);
            if (androidx.compose.ui.platform.m.p(pVar)) {
                gVar.b(new g.a(32, aVar6.b()));
            }
            i0 i0Var7 = i0.f15558a;
        }
        g2.a aVar7 = (g2.a) g2.m.a(pVar.v(), kVar.c());
        if (aVar7 != null) {
            gVar.b(new g.a(16384, aVar7.b()));
            i0 i0Var8 = i0.f15558a;
        }
        if (androidx.compose.ui.platform.m.p(pVar)) {
            g2.a aVar8 = (g2.a) g2.m.a(pVar.v(), kVar.v());
            if (aVar8 != null) {
                gVar.b(new g.a(2097152, aVar8.b()));
                i0 i0Var9 = i0.f15558a;
            }
            g2.a aVar9 = (g2.a) g2.m.a(pVar.v(), kVar.j());
            if (aVar9 != null) {
                gVar.b(new g.a(R.id.accessibilityActionImeEnter, aVar9.b()));
                i0 i0Var10 = i0.f15558a;
            }
            g2.a aVar10 = (g2.a) g2.m.a(pVar.v(), kVar.e());
            if (aVar10 != null) {
                gVar.b(new g.a(65536, aVar10.b()));
                i0 i0Var11 = i0.f15558a;
            }
            g2.a aVar11 = (g2.a) g2.m.a(pVar.v(), kVar.p());
            if (aVar11 != null) {
                if (gVar.N() && this.f2998d.getClipboardManager().a()) {
                    gVar.b(new g.a(32768, aVar11.b()));
                }
                i0 i0Var12 = i0.f15558a;
            }
        }
        String strM0 = m0(pVar);
        if (!(strM0 == null || strM0.length() == 0)) {
            gVar.H0(f0(pVar), e0(pVar));
            g2.a aVar12 = (g2.a) g2.m.a(pVar.v(), kVar.u());
            gVar.b(new g.a(131072, aVar12 != null ? aVar12.b() : null));
            gVar.a(256);
            gVar.a(512);
            gVar.t0(11);
            List list = (List) g2.m.a(pVar.v(), sVar3.c());
            if ((list == null || list.isEmpty()) && pVar.v().f(kVar.h()) && !androidx.compose.ui.platform.m.q(pVar)) {
                gVar.t0(gVar.v() | 4 | 16);
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("androidx.compose.ui.semantics.id");
            CharSequence charSequenceA = gVar.A();
            if (!(charSequenceA == null || charSequenceA.length() == 0) && pVar.v().f(kVar.h())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (pVar.v().f(sVar3.x())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            androidx.compose.ui.platform.h.f2923a.a(gVar.N0(), arrayList);
        }
        g2.h hVar = (g2.h) g2.m.a(pVar.v(), sVar3.s());
        if (hVar != null) {
            gVar.e0(pVar.v().f(kVar.t()) ? "android.widget.SeekBar" : "android.widget.ProgressBar");
            if (hVar != g2.h.f11315d.a()) {
                gVar.z0(g.C0382g.a(1, hVar.c().d().floatValue(), hVar.c().f().floatValue(), hVar.b()));
            }
            if (pVar.v().f(kVar.t()) && androidx.compose.ui.platform.m.p(pVar)) {
                if (hVar.b() < ge.o.c(hVar.c().f().floatValue(), hVar.c().d().floatValue())) {
                    gVar.b(g.a.f18205q);
                }
                if (hVar.b() > ge.o.g(hVar.c().d().floatValue(), hVar.c().f().floatValue())) {
                    gVar.b(g.a.f18206r);
                }
            }
        }
        b.a(gVar, pVar);
        c2.a.d(pVar, gVar);
        c2.a.e(pVar, gVar);
        g2.j jVar = (g2.j) g2.m.a(pVar.v(), sVar3.i());
        g2.a aVar13 = (g2.a) g2.m.a(pVar.v(), kVar.r());
        if (jVar != null && aVar13 != null) {
            if (!c2.a.b(pVar)) {
                gVar.e0("android.widget.HorizontalScrollView");
            }
            if (jVar.a().invoke().floatValue() > 0.0f) {
                gVar.C0(true);
            }
            if (androidx.compose.ui.platform.m.p(pVar)) {
                if (P0(jVar)) {
                    gVar.b(g.a.f18205q);
                    gVar.b(!(pVar.o().getLayoutDirection() == w2.r.Rtl) ? g.a.F : g.a.D);
                }
                if (O0(jVar)) {
                    gVar.b(g.a.f18206r);
                    gVar.b(!(pVar.o().getLayoutDirection() == w2.r.Rtl) ? g.a.D : g.a.F);
                }
            }
        }
        g2.j jVar2 = (g2.j) g2.m.a(pVar.v(), sVar3.D());
        if (jVar2 != null && aVar13 != null) {
            if (!c2.a.b(pVar)) {
                gVar.e0("android.widget.ScrollView");
            }
            if (jVar2.a().invoke().floatValue() > 0.0f) {
                gVar.C0(true);
            }
            if (androidx.compose.ui.platform.m.p(pVar)) {
                if (P0(jVar2)) {
                    gVar.b(g.a.f18205q);
                    gVar.b(g.a.E);
                }
                if (O0(jVar2)) {
                    gVar.b(g.a.f18206r);
                    gVar.b(g.a.C);
                }
            }
        }
        if (i13 >= 29) {
            c.a(gVar, pVar);
        }
        gVar.v0((CharSequence) g2.m.a(pVar.v(), sVar3.q()));
        if (androidx.compose.ui.platform.m.p(pVar)) {
            g2.a aVar14 = (g2.a) g2.m.a(pVar.v(), kVar.g());
            if (aVar14 != null) {
                gVar.b(new g.a(262144, aVar14.b()));
                i0 i0Var13 = i0.f15558a;
            }
            g2.a aVar15 = (g2.a) g2.m.a(pVar.v(), kVar.b());
            if (aVar15 != null) {
                gVar.b(new g.a(524288, aVar15.b()));
                i0 i0Var14 = i0.f15558a;
            }
            g2.a aVar16 = (g2.a) g2.m.a(pVar.v(), kVar.f());
            if (aVar16 != null) {
                gVar.b(new g.a(1048576, aVar16.b()));
                i0 i0Var15 = i0.f15558a;
            }
            if (pVar.v().f(kVar.d())) {
                List list2 = (List) pVar.v().o(kVar.d());
                int size2 = list2.size();
                int[] iArr = f2994i0;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
                z.d0<CharSequence> d0Var = new z.d0<>(0, 1, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (this.f3018u.e(i10)) {
                    Map<CharSequence, Integer> mapF = this.f3018u.f(i10);
                    List listJ0 = nd.p.J0(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list2.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        g2.e eVar = (g2.e) list2.get(i14);
                        ae.r.c(mapF);
                        if (mapF.containsKey(eVar.b())) {
                            Integer num = mapF.get(eVar.b());
                            ae.r.c(num);
                            d0Var.i(num.intValue(), eVar.b());
                            linkedHashMap.put(eVar.b(), num);
                            listJ0.remove(num);
                            gVar.b(new g.a(num.intValue(), eVar.b()));
                        } else {
                            arrayList2.add(eVar);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i15 = 0; i15 < size4; i15++) {
                        g2.e eVar2 = (g2.e) arrayList2.get(i15);
                        int iIntValue = ((Number) listJ0.get(i15)).intValue();
                        d0Var.i(iIntValue, eVar2.b());
                        linkedHashMap.put(eVar2.b(), Integer.valueOf(iIntValue));
                        gVar.b(new g.a(iIntValue, eVar2.b()));
                    }
                } else {
                    int size5 = list2.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        g2.e eVar3 = (g2.e) list2.get(i16);
                        int i17 = f2994i0[i16];
                        d0Var.i(i17, eVar3.b());
                        linkedHashMap.put(eVar3.b(), Integer.valueOf(i17));
                        gVar.b(new g.a(i17, eVar3.b()));
                    }
                }
                this.f3017t.i(i10, d0Var);
                this.f3018u.i(i10, linkedHashMap);
            }
        }
        gVar.B0(z0(pVar));
        Integer num2 = this.H.get(Integer.valueOf(i10));
        if (num2 != null) {
            num2.intValue();
            View viewD = androidx.compose.ui.platform.m.D(this.f2998d.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (viewD != null) {
                gVar.J0(viewD);
            } else {
                gVar.K0(this.f2998d, num2.intValue());
            }
            O(i10, gVar.N0(), this.X, null);
            i0 i0Var16 = i0.f15558a;
        }
        Integer num3 = this.I.get(Integer.valueOf(i10));
        if (num3 != null) {
            num3.intValue();
            View viewD2 = androidx.compose.ui.platform.m.D(this.f2998d.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (viewD2 != null) {
                gVar.I0(viewD2);
                O(i10, gVar.N0(), this.Y, null);
            }
            i0 i0Var17 = i0.f15558a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        g2.p pVarB;
        Integer num;
        n1 n1Var = i0().get(Integer.valueOf(i10));
        if (n1Var == null || (pVarB = n1Var.b()) == null) {
            return;
        }
        String strM0 = m0(pVarB);
        if (ae.r.b(str, this.X)) {
            num = this.H.get(Integer.valueOf(i10));
            if (num == null) {
                return;
            }
        } else {
            if (!ae.r.b(str, this.Y)) {
                if (!pVarB.v().f(g2.k.f11332a.h()) || bundle == null || !ae.r.b(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    g2.l lVarV = pVarB.v();
                    g2.s sVar = g2.s.f11377a;
                    if (!lVarV.f(sVar.x()) || bundle == null || !ae.r.b(str, "androidx.compose.ui.semantics.testTag")) {
                        if (ae.r.b(str, "androidx.compose.ui.semantics.id")) {
                            accessibilityNodeInfo.getExtras().putInt(str, pVarB.n());
                            return;
                        }
                        return;
                    } else {
                        String str2 = (String) g2.m.a(pVarB.v(), sVar.x());
                        if (str2 != null) {
                            accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                            return;
                        }
                        return;
                    }
                }
                int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i12 > 0 && i11 >= 0) {
                    if (i11 < (strM0 != null ? strM0.length() : a.e.API_PRIORITY_OTHER)) {
                        i2.d0 d0VarP0 = p0(pVarB.v());
                        if (d0VarP0 == null) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i13 = 0; i13 < i12; i13++) {
                            int i14 = i11 + i13;
                            arrayList.add(i14 >= d0VarP0.k().j().length() ? null : s1(pVarB, d0VarP0.d(i14)));
                        }
                        accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                return;
            }
            num = this.I.get(Integer.valueOf(i10));
            if (num == null) {
                return;
            }
        }
        accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
    }

    private static final boolean O0(g2.j jVar) {
        return (jVar.c().invoke().floatValue() > 0.0f && !jVar.b()) || (jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue() && jVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect P(n1 n1Var) {
        Rect rectA = n1Var.a();
        long j10 = this.f2998d.j(k1.g.a(rectA.left, rectA.top));
        long j11 = this.f2998d.j(k1.g.a(rectA.right, rectA.bottom));
        return new Rect((int) Math.floor(k1.f.o(j10)), (int) Math.floor(k1.f.p(j10)), (int) Math.ceil(k1.f.o(j11)), (int) Math.ceil(k1.f.p(j11)));
    }

    private static final boolean P0(g2.j jVar) {
        return (jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue() && !jVar.b()) || (jVar.c().invoke().floatValue() > 0.0f && jVar.b());
    }

    private final boolean Q0(int i10, List<y> list) {
        boolean z10;
        y yVarR = androidx.compose.ui.platform.m.r(list, i10);
        if (yVarR != null) {
            z10 = false;
        } else {
            y yVar = new y(i10, this.f3001e0, null, null, null, null);
            z10 = true;
            yVarR = yVar;
        }
        this.f3001e0.add(yVarR);
        return z10;
    }

    private final void R(int i10, androidx.compose.ui.platform.coreshims.c cVar) {
        if (cVar == null) {
            return;
        }
        if (this.D.contains(Integer.valueOf(i10))) {
            this.D.remove(Integer.valueOf(i10));
        } else {
            this.C.put(Integer.valueOf(i10), cVar);
        }
    }

    private final boolean R0(int i10) {
        if (!A0() || u0(i10)) {
            return false;
        }
        int i11 = this.f3012o;
        if (i11 != Integer.MIN_VALUE) {
            a1(this, i11, 65536, null, null, 12, null);
        }
        this.f3012o = i10;
        this.f2998d.invalidate();
        a1(this, i10, 32768, null, null, 12, null);
        return true;
    }

    private final void S(int i10) {
        if (this.C.containsKey(Integer.valueOf(i10))) {
            this.C.remove(Integer.valueOf(i10));
        } else {
            this.D.add(Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(y yVar) {
        if (yVar.O()) {
            this.f2998d.getSnapshotObserver().i(yVar, this.f3003f0, new p(yVar, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(k kVar) {
        e1.c(kVar.f2998d, false, 1, null);
        kVar.V();
        kVar.f2997c0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean U(java.util.Collection<b2.n1> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            k1.f$a r0 = k1.f.f14338b
            long r0 = r0.b()
            boolean r0 = k1.f.l(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lb7
            boolean r0 = k1.f.r(r9)
            if (r0 != 0) goto L15
            goto Lb7
        L15:
            r0 = 1
            if (r7 != r0) goto L1f
            g2.s r7 = g2.s.f11377a
            g2.w r7 = r7.D()
            goto L27
        L1f:
            if (r7 != 0) goto Lb1
            g2.s r7 = g2.s.f11377a
            g2.w r7 = r7.i()
        L27:
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L33
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L33
            goto Lb0
        L33:
            java.util.Iterator r6 = r6.iterator()
        L37:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb0
            java.lang.Object r2 = r6.next()
            b2.n1 r2 = (b2.n1) r2
            android.graphics.Rect r3 = r2.a()
            k1.h r3 = l1.l1.b(r3)
            boolean r3 = r3.b(r9)
            if (r3 != 0) goto L53
        L51:
            r2 = r1
            goto Lad
        L53:
            g2.p r2 = r2.b()
            g2.l r2 = r2.m()
            java.lang.Object r2 = g2.m.a(r2, r7)
            g2.j r2 = (g2.j) r2
            if (r2 != 0) goto L64
            goto L51
        L64:
            boolean r3 = r2.b()
            if (r3 == 0) goto L6c
            int r3 = -r8
            goto L6d
        L6c:
            r3 = r8
        L6d:
            if (r8 != 0) goto L76
            boolean r4 = r2.b()
            if (r4 == 0) goto L76
            r3 = -1
        L76:
            if (r3 >= 0) goto L8c
            zd.a r2 = r2.c()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L51
            goto Lac
        L8c:
            zd.a r3 = r2.c()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            zd.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L51
        Lac:
            r2 = r0
        Lad:
            if (r2 == 0) goto L37
            r1 = r0
        Lb0:
            return r1
        Lb1:
            md.q r6 = new md.q
            r6.<init>()
            throw r6
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.k.U(java.util.Collection, boolean, int, long):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int U0(int i10) {
        if (i10 == this.f2998d.getSemanticsOwner().a().n()) {
            return -1;
        }
        return i10;
    }

    private final void V() {
        if (x0()) {
            V0(this.f2998d.getSemanticsOwner().a(), this.f2996b0);
        }
        if (y0()) {
            W0(this.f2998d.getSemanticsOwner().a(), this.f2996b0);
        }
        d1(i0());
        A1();
    }

    private final void V0(g2.p pVar, i iVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<g2.p> listS = pVar.s();
        int size = listS.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                Iterator<Integer> it = iVar.a().iterator();
                while (it.hasNext()) {
                    if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                    }
                }
                List<g2.p> listS2 = pVar.s();
                int size2 = listS2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    g2.p pVar2 = listS2.get(i11);
                    if (i0().containsKey(Integer.valueOf(pVar2.n()))) {
                        i iVar2 = this.f2995a0.get(Integer.valueOf(pVar2.n()));
                        ae.r.c(iVar2);
                        V0(pVar2, iVar2);
                    }
                }
                return;
            }
            g2.p pVar3 = listS.get(i10);
            if (i0().containsKey(Integer.valueOf(pVar3.n()))) {
                if (!iVar.a().contains(Integer.valueOf(pVar3.n()))) {
                    break;
                } else {
                    linkedHashSet.add(Integer.valueOf(pVar3.n()));
                }
            }
            i10++;
        }
        C0(pVar.p());
    }

    private final boolean W(int i10) {
        if (!u0(i10)) {
            return false;
        }
        this.f3012o = Integer.MIN_VALUE;
        this.f3013p = null;
        this.f2998d.invalidate();
        a1(this, i10, 65536, null, null, 12, null);
        return true;
    }

    private final void W0(g2.p pVar, i iVar) {
        List<g2.p> listS = pVar.s();
        int size = listS.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2.p pVar2 = listS.get(i10);
            if (i0().containsKey(Integer.valueOf(pVar2.n())) && !iVar.a().contains(Integer.valueOf(pVar2.n()))) {
                x1(pVar2);
            }
        }
        for (Map.Entry<Integer, i> entry : this.f2995a0.entrySet()) {
            if (!i0().containsKey(entry.getKey())) {
                S(entry.getKey().intValue());
            }
        }
        List<g2.p> listS2 = pVar.s();
        int size2 = listS2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            g2.p pVar3 = listS2.get(i11);
            if (i0().containsKey(Integer.valueOf(pVar3.n())) && this.f2995a0.containsKey(Integer.valueOf(pVar3.n()))) {
                i iVar2 = this.f2995a0.get(Integer.valueOf(pVar3.n()));
                ae.r.c(iVar2);
                W0(pVar3, iVar2);
            }
        }
    }

    private final void X() {
        g2.a aVar;
        zd.a aVar2;
        Iterator<n1> it = i0().values().iterator();
        while (it.hasNext()) {
            g2.l lVarV = it.next().b().v();
            if (g2.m.a(lVarV, g2.s.f11377a.n()) != null && (aVar = (g2.a) g2.m.a(lVarV, g2.k.f11332a.a())) != null && (aVar2 = (zd.a) aVar.a()) != null) {
            }
        }
    }

    private final void X0(int i10, String str) {
        androidx.compose.ui.platform.coreshims.a aVar = this.B;
        if (aVar != null && Build.VERSION.SDK_INT >= 29) {
            AutofillId autofillIdA = aVar.a(i10);
            if (autofillIdA == null) {
                throw new IllegalStateException("Invalid content capture ID".toString());
            }
            aVar.c(autofillIdA, str);
        }
    }

    private final AccessibilityEvent Y(int i10, int i11) {
        n1 n1Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.f2998d.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.f2998d, i10);
        if (x0() && (n1Var = i0().get(Integer.valueOf(i10))) != null) {
            accessibilityEventObtain.setPassword(n1Var.b().m().f(g2.s.f11377a.r()));
        }
        return accessibilityEventObtain;
    }

    private final boolean Y0(AccessibilityEvent accessibilityEvent) {
        if (!x0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f3014q = true;
        }
        try {
            return this.f3002f.invoke(accessibilityEvent).booleanValue();
        } finally {
            this.f3014q = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfo Z(int i10) {
        o4.e eVarA;
        androidx.lifecycle.g lifecycle;
        i.c viewTreeOwners = this.f2998d.getViewTreeOwners();
        if (((viewTreeOwners == null || (eVarA = viewTreeOwners.a()) == null || (lifecycle = eVarA.getLifecycle()) == null) ? null : lifecycle.b()) == g.b.DESTROYED) {
            return null;
        }
        p3.g gVarW = p3.g.W();
        n1 n1Var = i0().get(Integer.valueOf(i10));
        if (n1Var == null) {
            return null;
        }
        g2.p pVarB = n1Var.b();
        if (i10 == -1) {
            ViewParent viewParentX = androidx.core.view.h.x(this.f2998d);
            gVarW.w0(viewParentX instanceof View ? (View) viewParentX : null);
        } else {
            g2.p pVarQ = pVarB.q();
            Integer numValueOf = pVarQ != null ? Integer.valueOf(pVarQ.n()) : null;
            if (numValueOf == null) {
                throw new IllegalStateException(("semanticsNode " + i10 + " has null parent").toString());
            }
            int iIntValue = numValueOf.intValue();
            gVarW.x0(this.f2998d, iIntValue != this.f2998d.getSemanticsOwner().a().n() ? iIntValue : -1);
        }
        gVarW.E0(this.f2998d, i10);
        gVarW.b0(P(n1Var));
        N0(i10, gVarW, pVarB);
        return gVarW.N0();
    }

    private final boolean Z0(int i10, int i11, Integer num, List<String> list) {
        if (i10 == Integer.MIN_VALUE || !w0()) {
            return false;
        }
        AccessibilityEvent accessibilityEventY = Y(i10, i11);
        if (num != null) {
            accessibilityEventY.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventY.setContentDescription(y2.a.d(list, com.amazon.a.a.o.b.f.f7478a, null, null, 0, null, null, 62, null));
        }
        return Y0(accessibilityEventY);
    }

    private final AccessibilityEvent a0(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventY = Y(i10, 8192);
        if (num != null) {
            accessibilityEventY.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventY.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventY.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventY.getText().add(charSequence);
        }
        return accessibilityEventY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean a1(k kVar, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return kVar.Z0(i10, i11, num, list);
    }

    private final void b1(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventY = Y(U0(i10), 32);
        accessibilityEventY.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventY.getText().add(str);
        }
        Y0(accessibilityEventY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(k kVar, boolean z10) {
        kVar.f3008k = z10 ? kVar.f3004g.getEnabledAccessibilityServiceList(-1) : nd.u.m();
    }

    private final void c1(int i10) {
        g gVar = this.E;
        if (gVar != null) {
            if (i10 != gVar.d().n()) {
                return;
            }
            if (SystemClock.uptimeMillis() - gVar.f() <= 1000) {
                AccessibilityEvent accessibilityEventY = Y(U0(gVar.d().n()), 131072);
                accessibilityEventY.setFromIndex(gVar.b());
                accessibilityEventY.setToIndex(gVar.e());
                accessibilityEventY.setAction(gVar.a());
                accessibilityEventY.setMovementGranularity(gVar.c());
                accessibilityEventY.getText().add(m0(gVar.d()));
                Y0(accessibilityEventY);
            }
        }
        this.E = null;
    }

    private final void d0(g2.p pVar, ArrayList<g2.p> arrayList, Map<Integer, List<g2.p>> map) {
        boolean z10 = pVar.o().getLayoutDirection() == w2.r.Rtl;
        boolean zBooleanValue = ((Boolean) pVar.m().r(g2.s.f11377a.o(), b2.p.f5384a)).booleanValue();
        if ((zBooleanValue || z0(pVar)) && i0().keySet().contains(Integer.valueOf(pVar.n()))) {
            arrayList.add(pVar);
        }
        if (zBooleanValue) {
            map.put(Integer.valueOf(pVar.n()), r1(z10, nd.c0.F0(pVar.k())));
            return;
        }
        List<g2.p> listK = pVar.k();
        int size = listK.size();
        for (int i10 = 0; i10 < size; i10++) {
            d0(listK.get(i10), arrayList, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d1(java.util.Map<java.lang.Integer, b2.n1> r29) {
        /*
            Method dump skipped, instruction units count: 1507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.k.d1(java.util.Map):void");
    }

    private final int e0(g2.p pVar) {
        g2.l lVarV = pVar.v();
        g2.s sVar = g2.s.f11377a;
        return (lVarV.f(sVar.c()) || !pVar.v().f(sVar.z())) ? this.f3019v : i2.e0.g(((i2.e0) pVar.v().o(sVar.z())).n());
    }

    private final void e1(a2.f0 f0Var, z.b<Integer> bVar) {
        g2.l lVarG;
        a2.f0 f0VarS;
        if (f0Var.G0() && !this.f2998d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(f0Var)) {
            int size = this.f3021x.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (androidx.compose.ui.platform.m.z(this.f3021x.v(i10), f0Var)) {
                    return;
                }
            }
            if (!f0Var.h0().q(w0.a(8))) {
                f0Var = androidx.compose.ui.platform.m.s(f0Var, s.f3056a);
            }
            if (f0Var == null || (lVarG = f0Var.G()) == null) {
                return;
            }
            if (!lVarG.u() && (f0VarS = androidx.compose.ui.platform.m.s(f0Var, r.f3055a)) != null) {
                f0Var = f0VarS;
            }
            int iM0 = f0Var.m0();
            if (bVar.add(Integer.valueOf(iM0))) {
                a1(this, U0(iM0), 2048, 1, null, 8, null);
            }
        }
    }

    private final int f0(g2.p pVar) {
        g2.l lVarV = pVar.v();
        g2.s sVar = g2.s.f11377a;
        return (lVarV.f(sVar.c()) || !pVar.v().f(sVar.z())) ? this.f3019v : i2.e0.k(((i2.e0) pVar.v().o(sVar.z())).n());
    }

    private final void f1(a2.f0 f0Var) {
        if (f0Var.G0() && !this.f2998d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(f0Var)) {
            int iM0 = f0Var.m0();
            g2.j jVar = this.f3015r.get(Integer.valueOf(iM0));
            g2.j jVar2 = this.f3016s.get(Integer.valueOf(iM0));
            if (jVar == null && jVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventY = Y(iM0, 4096);
            if (jVar != null) {
                accessibilityEventY.setScrollX((int) jVar.c().invoke().floatValue());
                accessibilityEventY.setMaxScrollX((int) jVar.a().invoke().floatValue());
            }
            if (jVar2 != null) {
                accessibilityEventY.setScrollY((int) jVar2.c().invoke().floatValue());
                accessibilityEventY.setMaxScrollY((int) jVar2.a().invoke().floatValue());
            }
            Y0(accessibilityEventY);
        }
    }

    private final boolean g1(g2.p pVar, int i10, int i11, boolean z10) {
        String strM0;
        g2.l lVarV = pVar.v();
        g2.k kVar = g2.k.f11332a;
        if (lVarV.f(kVar.u()) && androidx.compose.ui.platform.m.p(pVar)) {
            zd.q qVar = (zd.q) ((g2.a) pVar.v().o(kVar.u())).a();
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        }
        if ((i10 == i11 && i11 == this.f3019v) || (strM0 = m0(pVar)) == null) {
            return false;
        }
        if (i10 < 0 || i10 != i11 || i11 > strM0.length()) {
            i10 = -1;
        }
        this.f3019v = i10;
        boolean z11 = strM0.length() > 0;
        Y0(a0(U0(pVar.n()), z11 ? Integer.valueOf(this.f3019v) : null, z11 ? Integer.valueOf(this.f3019v) : null, z11 ? Integer.valueOf(strM0.length()) : null, strM0));
        c1(pVar.n());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.platform.coreshims.a h0(View view) {
        androidx.compose.ui.platform.coreshims.b.c(view, 1);
        return androidx.compose.ui.platform.coreshims.b.b(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Integer, n1> i0() {
        if (this.f3023z) {
            this.f3023z = false;
            this.F = androidx.compose.ui.platform.m.t(this.f2998d.getSemanticsOwner());
            if (x0()) {
                m1();
            }
        }
        return this.F;
    }

    private final void i1(g2.p pVar, p3.g gVar) {
        g2.l lVarV = pVar.v();
        g2.s sVar = g2.s.f11377a;
        if (lVarV.f(sVar.f())) {
            gVar.j0(true);
            gVar.m0((CharSequence) g2.m.a(pVar.v(), sVar.f()));
        }
    }

    private final boolean j0(g2.p pVar) {
        g2.l lVarV = pVar.v();
        g2.s sVar = g2.s.f11377a;
        h2.a aVar = (h2.a) g2.m.a(lVarV, sVar.B());
        g2.i iVar = (g2.i) g2.m.a(pVar.v(), sVar.t());
        boolean z10 = aVar != null;
        Boolean bool = (Boolean) g2.m.a(pVar.v(), sVar.v());
        if (bool == null) {
            return z10;
        }
        bool.booleanValue();
        return iVar != null ? g2.i.k(iVar.n(), g2.i.f11320b.g()) : false ? z10 : true;
    }

    private final void j1(g2.p pVar, p3.g gVar) {
        gVar.c0(j0(pVar));
    }

    private final String k0(g2.p pVar) {
        Object string;
        Resources resources;
        int i10;
        g2.l lVarV = pVar.v();
        g2.s sVar = g2.s.f11377a;
        Object objA = g2.m.a(lVarV, sVar.w());
        h2.a aVar = (h2.a) g2.m.a(pVar.v(), sVar.B());
        g2.i iVar = (g2.i) g2.m.a(pVar.v(), sVar.t());
        if (aVar != null) {
            int i11 = m.f3044a[aVar.ordinal()];
            if (i11 == 1) {
                if ((iVar == null ? false : g2.i.k(iVar.n(), g2.i.f11320b.f())) && objA == null) {
                    resources = this.f2998d.getContext().getResources();
                    i10 = f1.f.f11072e;
                    objA = resources.getString(i10);
                }
            } else if (i11 == 2) {
                if ((iVar == null ? false : g2.i.k(iVar.n(), g2.i.f11320b.f())) && objA == null) {
                    resources = this.f2998d.getContext().getResources();
                    i10 = f1.f.f11071d;
                    objA = resources.getString(i10);
                }
            } else if (i11 == 3 && objA == null) {
                resources = this.f2998d.getContext().getResources();
                i10 = f1.f.f11069b;
                objA = resources.getString(i10);
            }
        }
        Boolean bool = (Boolean) g2.m.a(pVar.v(), sVar.v());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(iVar == null ? false : g2.i.k(iVar.n(), g2.i.f11320b.g())) && objA == null) {
                objA = this.f2998d.getContext().getResources().getString(zBooleanValue ? f1.f.f11073f : f1.f.f11070c);
            }
        }
        g2.h hVar = (g2.h) g2.m.a(pVar.v(), sVar.s());
        if (hVar != null) {
            if (hVar != g2.h.f11315d.a()) {
                if (objA == null) {
                    ge.e<Float> eVarC = hVar.c();
                    float fK = ge.o.k(((eVarC.f().floatValue() - eVarC.d().floatValue()) > 0.0f ? 1 : ((eVarC.f().floatValue() - eVarC.d().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (hVar.b() - eVarC.d().floatValue()) / (eVarC.f().floatValue() - eVarC.d().floatValue()), 0.0f, 1.0f);
                    int iL = 100;
                    if (fK == 0.0f) {
                        iL = 0;
                    } else {
                        if (!(fK == 1.0f)) {
                            iL = ge.o.l(ce.c.d(fK * 100), 1, 99);
                        }
                    }
                    string = this.f2998d.getContext().getResources().getString(f1.f.f11076i, Integer.valueOf(iL));
                    objA = string;
                }
            } else if (objA == null) {
                string = this.f2998d.getContext().getResources().getString(f1.f.f11068a);
                objA = string;
            }
        }
        return (String) objA;
    }

    private final void k1(g2.p pVar, p3.g gVar) {
        gVar.F0(k0(pVar));
    }

    private final SpannableString l0(g2.p pVar) {
        i2.d dVar;
        t.b fontFamilyResolver = this.f2998d.getFontFamilyResolver();
        i2.d dVarO0 = o0(pVar.v());
        SpannableString spannableStringB = null;
        SpannableString spannableString = (SpannableString) w1(dVarO0 != null ? r2.a.b(dVarO0, this.f2998d.getDensity(), fontFamilyResolver, this.Z) : null, 100000);
        List list = (List) g2.m.a(pVar.v(), g2.s.f11377a.y());
        if (list != null && (dVar = (i2.d) nd.c0.a0(list)) != null) {
            spannableStringB = r2.a.b(dVar, this.f2998d.getDensity(), fontFamilyResolver, this.Z);
        }
        return spannableString == null ? (SpannableString) w1(spannableStringB, 100000) : spannableString;
    }

    private final void l1(g2.p pVar, p3.g gVar) {
        gVar.G0(l0(pVar));
    }

    private final String m0(g2.p pVar) {
        i2.d dVar;
        if (pVar == null) {
            return null;
        }
        g2.l lVarV = pVar.v();
        g2.s sVar = g2.s.f11377a;
        if (lVarV.f(sVar.c())) {
            return y2.a.d((List) pVar.v().o(sVar.c()), com.amazon.a.a.o.b.f.f7478a, null, null, 0, null, null, 62, null);
        }
        boolean zF = pVar.v().f(g2.k.f11332a.v());
        g2.l lVarV2 = pVar.v();
        if (zF) {
            i2.d dVarO0 = o0(lVarV2);
            if (dVarO0 != null) {
                return dVarO0.j();
            }
            return null;
        }
        List list = (List) g2.m.a(lVarV2, sVar.y());
        if (list == null || (dVar = (i2.d) nd.c0.a0(list)) == null) {
            return null;
        }
        return dVar.j();
    }

    private final void m1() {
        this.H.clear();
        this.I.clear();
        n1 n1Var = i0().get(-1);
        g2.p pVarB = n1Var != null ? n1Var.b() : null;
        ae.r.c(pVarB);
        int i10 = 1;
        List<g2.p> listR1 = r1(pVarB.o().getLayoutDirection() == w2.r.Rtl, nd.u.s(pVarB));
        int iO = nd.u.o(listR1);
        if (1 > iO) {
            return;
        }
        while (true) {
            int iN = listR1.get(i10 - 1).n();
            int iN2 = listR1.get(i10).n();
            this.H.put(Integer.valueOf(iN), Integer.valueOf(iN2));
            this.I.put(Integer.valueOf(iN2), Integer.valueOf(iN));
            if (i10 == iO) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final b2.a n0(g2.p pVar, int i10) {
        androidx.compose.ui.platform.b bVarA;
        i2.d0 d0VarP0;
        if (pVar == null) {
            return null;
        }
        String strM0 = m0(pVar);
        if (strM0 == null || strM0.length() == 0) {
            return null;
        }
        if (i10 == 1) {
            bVarA = androidx.compose.ui.platform.c.f2878d.a(this.f2998d.getContext().getResources().getConfiguration().locale);
        } else {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        bVarA = androidx.compose.ui.platform.f.f2903c.a();
                    } else if (i10 != 16) {
                        return null;
                    }
                }
                if (!pVar.v().f(g2.k.f11332a.h()) || (d0VarP0 = p0(pVar.v())) == null) {
                    return null;
                }
                if (i10 == 4) {
                    androidx.compose.ui.platform.d dVarA = androidx.compose.ui.platform.d.f2886d.a();
                    dVarA.j(strM0, d0VarP0);
                    return dVarA;
                }
                androidx.compose.ui.platform.e eVarA = androidx.compose.ui.platform.e.f2893f.a();
                eVarA.j(strM0, d0VarP0, pVar);
                return eVarA;
            }
            bVarA = androidx.compose.ui.platform.g.f2918d.a(this.f2998d.getContext().getResources().getConfiguration().locale);
        }
        bVarA.e(strM0);
        return bVarA;
    }

    private final void n1() {
        g2.a aVar;
        zd.l lVar;
        Iterator<n1> it = i0().values().iterator();
        while (it.hasNext()) {
            g2.l lVarV = it.next().b().v();
            if (ae.r.b(g2.m.a(lVarV, g2.s.f11377a.n()), Boolean.FALSE) && (aVar = (g2.a) g2.m.a(lVarV, g2.k.f11332a.x())) != null && (lVar = (zd.l) aVar.a()) != null) {
            }
        }
    }

    private final i2.d o0(g2.l lVar) {
        return (i2.d) g2.m.a(lVar, g2.s.f11377a.e());
    }

    private final List<g2.p> o1(boolean z10, ArrayList<g2.p> arrayList, Map<Integer, List<g2.p>> map) {
        ArrayList arrayList2 = new ArrayList();
        int iO = nd.u.o(arrayList);
        int size = 0;
        if (iO >= 0) {
            int i10 = 0;
            while (true) {
                g2.p pVar = arrayList.get(i10);
                if (i10 == 0 || !q1(arrayList2, pVar)) {
                    arrayList2.add(new md.s(pVar.j(), nd.u.s(pVar)));
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        nd.y.B(arrayList2, j.f3039a);
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            md.s sVar = (md.s) arrayList2.get(i11);
            nd.y.B((List) sVar.d(), new b2.o(new b2.n(z10 ? h.f3035a : f.f3028a, a2.f0.Y.b())));
            arrayList3.addAll((Collection) sVar.d());
        }
        final t tVar = t.f3057a;
        nd.y.B(arrayList3, new Comparator() { // from class: b2.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return androidx.compose.ui.platform.k.p1(tVar, obj, obj2);
            }
        });
        while (size <= nd.u.o(arrayList3)) {
            List<g2.p> list = map.get(Integer.valueOf(((g2.p) arrayList3.get(size)).n()));
            if (list != null) {
                if (z0((g2.p) arrayList3.get(size))) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, list);
                size += list.size();
            } else {
                size++;
            }
        }
        return arrayList3;
    }

    private final i2.d0 p0(g2.l lVar) {
        zd.l lVar2;
        ArrayList arrayList = new ArrayList();
        g2.a aVar = (g2.a) g2.m.a(lVar, g2.k.f11332a.h());
        if (aVar == null || (lVar2 = (zd.l) aVar.a()) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (i2.d0) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p1(zd.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private static final boolean q1(ArrayList<md.s<k1.h, List<g2.p>>> arrayList, g2.p pVar) {
        float fI = pVar.j().i();
        float fC = pVar.j().c();
        boolean z10 = fI >= fC;
        int iO = nd.u.o(arrayList);
        if (iO >= 0) {
            int i10 = 0;
            while (true) {
                k1.h hVarC = arrayList.get(i10).c();
                if (!((z10 || ((hVarC.i() > hVarC.c() ? 1 : (hVarC.i() == hVarC.c() ? 0 : -1)) >= 0) || Math.max(fI, hVarC.i()) >= Math.min(fC, hVarC.c())) ? false : true)) {
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                } else {
                    arrayList.set(i10, new md.s<>(hVarC.l(0.0f, fI, Float.POSITIVE_INFINITY, fC), arrayList.get(i10).d()));
                    arrayList.get(i10).d().add(pVar);
                    return true;
                }
            }
        }
        return false;
    }

    private final void r0() {
        g2.a aVar;
        zd.l lVar;
        Iterator<n1> it = i0().values().iterator();
        while (it.hasNext()) {
            g2.l lVarV = it.next().b().v();
            if (ae.r.b(g2.m.a(lVarV, g2.s.f11377a.n()), Boolean.TRUE) && (aVar = (g2.a) g2.m.a(lVarV, g2.k.f11332a.x())) != null && (lVar = (zd.l) aVar.a()) != null) {
            }
        }
    }

    private final List<g2.p> r1(boolean z10, List<g2.p> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<g2.p> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d0(list.get(i10), arrayList, linkedHashMap);
        }
        return o1(z10, arrayList, linkedHashMap);
    }

    private final RectF s1(g2.p pVar, k1.h hVar) {
        if (pVar == null) {
            return null;
        }
        k1.h hVarQ = hVar.q(pVar.r());
        k1.h hVarI = pVar.i();
        k1.h hVarM = hVarQ.o(hVarI) ? hVarQ.m(hVarI) : null;
        if (hVarM == null) {
            return null;
        }
        long j10 = this.f2998d.j(k1.g.a(hVarM.f(), hVarM.i()));
        long j11 = this.f2998d.j(k1.g.a(hVarM.g(), hVarM.c()));
        return new RectF(k1.f.o(j10), k1.f.p(j10), k1.f.o(j11), k1.f.p(j11));
    }

    private final void t0(boolean z10) {
        if (z10) {
            x1(this.f2998d.getSemanticsOwner().a());
        } else {
            y1(this.f2998d.getSemanticsOwner().a());
        }
        B0();
    }

    private final androidx.compose.ui.platform.coreshims.c t1(g2.p pVar) {
        e2.a aVarA;
        AutofillId autofillIdA;
        String strE;
        androidx.compose.ui.platform.coreshims.a aVar = this.B;
        if (aVar == null || Build.VERSION.SDK_INT < 29 || (aVarA = androidx.compose.ui.platform.coreshims.b.a(this.f2998d)) == null) {
            return null;
        }
        if (pVar.q() != null) {
            autofillIdA = aVar.a(r3.n());
            if (autofillIdA == null) {
                return null;
            }
        } else {
            autofillIdA = aVarA.a();
        }
        androidx.compose.ui.platform.coreshims.c cVarB = aVar.b(autofillIdA, pVar.n());
        if (cVarB == null) {
            return null;
        }
        g2.l lVarV = pVar.v();
        g2.s sVar = g2.s.f11377a;
        if (lVarV.f(sVar.r())) {
            return null;
        }
        List list = (List) g2.m.a(lVarV, sVar.y());
        if (list != null) {
            cVarB.a("android.widget.TextView");
            cVarB.d(y2.a.d(list, "\n", null, null, 0, null, null, 62, null));
        }
        i2.d dVar = (i2.d) g2.m.a(lVarV, sVar.e());
        if (dVar != null) {
            cVarB.a("android.widget.EditText");
            cVarB.d(dVar);
        }
        List list2 = (List) g2.m.a(lVarV, sVar.c());
        if (list2 != null) {
            cVarB.b(y2.a.d(list2, "\n", null, null, 0, null, null, 62, null));
        }
        g2.i iVar = (g2.i) g2.m.a(lVarV, sVar.t());
        if (iVar != null && (strE = androidx.compose.ui.platform.m.E(iVar.n())) != null) {
            cVarB.a(strE);
        }
        i2.d0 d0VarP0 = p0(lVarV);
        if (d0VarP0 != null) {
            i2.c0 c0VarK = d0VarP0.k();
            cVarB.e(w2.t.h(c0VarK.i().n()) * c0VarK.b().getDensity() * c0VarK.b().y0(), 0, 0, 0);
        }
        k1.h hVarH = pVar.h();
        cVarB.c((int) hVarH.f(), (int) hVarH.i(), 0, 0, (int) hVarH.k(), (int) hVarH.e());
        return cVarB;
    }

    private final boolean u0(int i10) {
        return this.f3012o == i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u1(k kVar, boolean z10) {
        kVar.f3008k = kVar.f3004g.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean v0(g2.p pVar) {
        g2.l lVarV = pVar.v();
        g2.s sVar = g2.s.f11377a;
        return !lVarV.f(sVar.c()) && pVar.v().f(sVar.e());
    }

    private final boolean v1(g2.p pVar, int i10, boolean z10, boolean z11) {
        b2.a aVarN0;
        int iF0;
        int i11;
        int iN = pVar.n();
        Integer num = this.f3020w;
        if (num == null || iN != num.intValue()) {
            this.f3019v = -1;
            this.f3020w = Integer.valueOf(pVar.n());
        }
        String strM0 = m0(pVar);
        if ((strM0 == null || strM0.length() == 0) || (aVarN0 = n0(pVar, i10)) == null) {
            return false;
        }
        int iE0 = e0(pVar);
        if (iE0 == -1) {
            iE0 = z10 ? 0 : strM0.length();
        }
        int[] iArrA = z10 ? aVarN0.a(iE0) : aVarN0.b(iE0);
        if (iArrA == null) {
            return false;
        }
        int i12 = iArrA[0];
        int i13 = iArrA[1];
        if (z11 && v0(pVar)) {
            iF0 = f0(pVar);
            if (iF0 == -1) {
                iF0 = z10 ? i12 : i13;
            }
            i11 = z10 ? i13 : i12;
        } else {
            iF0 = z10 ? i13 : i12;
            i11 = iF0;
        }
        this.E = new g(pVar, z10 ? 256 : 512, i10, i12, i13, SystemClock.uptimeMillis());
        g1(pVar, iF0, i11, true);
        return true;
    }

    private final boolean w0() {
        return x0() || y0();
    }

    private final <T extends CharSequence> T w1(T t10, int i10) {
        boolean z10 = true;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("size should be greater than 0".toString());
        }
        if (t10 != null && t10.length() != 0) {
            z10 = false;
        }
        if (z10 || t10.length() <= i10) {
            return t10;
        }
        int i11 = i10 - 1;
        if (Character.isHighSurrogate(t10.charAt(i11)) && Character.isLowSurrogate(t10.charAt(i10))) {
            i10 = i11;
        }
        T t11 = (T) t10.subSequence(0, i10);
        ae.r.d(t11, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t11;
    }

    private final void x1(g2.p pVar) {
        if (y0()) {
            B1(pVar);
            R(pVar.n(), t1(pVar));
            List<g2.p> listS = pVar.s();
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                x1(listS.get(i10));
            }
        }
    }

    private final boolean y0() {
        return !androidx.compose.ui.platform.m.v() && (this.B != null || this.A);
    }

    private final void y1(g2.p pVar) {
        if (y0()) {
            S(pVar.n());
            List<g2.p> listS = pVar.s();
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                y1(listS.get(i10));
            }
        }
    }

    private final boolean z0(g2.p pVar) {
        return pVar.v().u() || (pVar.z() && (androidx.compose.ui.platform.m.w(pVar) != null || l0(pVar) != null || k0(pVar) != null || j0(pVar)));
    }

    private final void z1(int i10) {
        int i11 = this.f3000e;
        if (i11 == i10) {
            return;
        }
        this.f3000e = i10;
        a1(this, i10, 128, null, null, 12, null);
        a1(this, i11, 256, null, null, 12, null);
    }

    public final void D0() {
        this.f3009l = EnumC0064k.SHOW_ORIGINAL;
        X();
    }

    public final void E0(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        l.f3043a.c(this, jArr, iArr, consumer);
    }

    public final void F0() {
        this.f3009l = EnumC0064k.SHOW_ORIGINAL;
        r0();
    }

    public final void G0(a2.f0 f0Var) {
        this.f3023z = true;
        if (w0()) {
            C0(f0Var);
        }
    }

    public final void H0() {
        this.f3023z = true;
        if (!w0() || this.f2997c0) {
            return;
        }
        this.f2997c0 = true;
        this.f3010m.post(this.f2999d0);
    }

    public final void I0() {
        this.f3009l = EnumC0064k.SHOW_TRANSLATED;
        n1();
    }

    public final void J0(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        l.f3043a.d(this, longSparseArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:34:0x008b, B:36:0x0091, B:38:0x009a, B:39:0x00ab, B:41:0x00b2, B:42:0x00bb, B:18:0x004e), top: B:51:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d8 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Q(qd.d<? super md.i0> r12) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.k.Q(qd.d):java.lang.Object");
    }

    public final boolean T(boolean z10, int i10, long j10) {
        if (ae.r.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return U(i0().values(), z10, i10, j10);
        }
        return false;
    }

    @Override // androidx.core.view.a
    public p3.k b(View view) {
        return this.f3011n;
    }

    public final boolean b0(MotionEvent motionEvent) {
        if (!A0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iS0 = s0(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.f2998d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            z1(iS0);
            if (iS0 == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.f3000e == Integer.MIN_VALUE) {
            return this.f2998d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        z1(Integer.MIN_VALUE);
        return true;
    }

    public final boolean g0() {
        return this.A;
    }

    public final void h1(androidx.compose.ui.platform.coreshims.a aVar) {
        this.B = aVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(o4.e eVar) {
        t0(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(o4.e eVar) {
        t0(false);
    }

    public final androidx.compose.ui.platform.i q0() {
        return this.f2998d;
    }

    public final int s0(float f10, float f11) {
        androidx.compose.ui.node.a aVarH0;
        e1.c(this.f2998d, false, 1, null);
        a2.t tVar = new a2.t();
        this.f2998d.getRoot().v0(k1.g.a(f10, f11), tVar, (12 & 4) != 0, (12 & 8) != 0);
        e.c cVar = (e.c) nd.c0.k0(tVar);
        a2.f0 f0VarK = cVar != null ? a2.k.k(cVar) : null;
        if (((f0VarK == null || (aVarH0 = f0VarK.h0()) == null || !aVarH0.q(w0.a(8))) ? false : true) && androidx.compose.ui.platform.m.B(g2.q.a(f0VarK, false)) && this.f2998d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(f0VarK) == null) {
            return U0(f0VarK.m0());
        }
        return Integer.MIN_VALUE;
    }

    public final boolean x0() {
        if (this.f3005h) {
            return true;
        }
        return this.f3004g.isEnabled() && (this.f3008k.isEmpty() ^ true);
    }
}
