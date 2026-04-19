package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import dc.l;
import dc.m;
import dc.x;
import gd.h;
import io.flutter.embedding.android.a;
import io.flutter.embedding.android.f;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m5.c;
import m5.k;
import vc.a;

/* JADX INFO: loaded from: classes2.dex */
public class b extends FrameLayout implements a.c, f.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f12762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f12763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.flutter.embedding.android.a f12764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    qc.b f12765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qc.b f12766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<qc.a> f12767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.flutter.embedding.engine.a f12769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set<f> f12770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private vc.a f12771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.flutter.plugin.editing.d f12772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private tc.a f12773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private uc.b f12774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.flutter.embedding.android.f f12775n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private dc.a f12776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private io.flutter.view.c f12777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextServicesManager f12778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private x f12779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final FlutterRenderer.h f12780s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final c.k f12781t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ContentObserver f12782u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final qc.a f12783v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final n3.a<k> f12784w;

    class a implements c.k {
        a() {
        }

        @Override // io.flutter.view.c.k
        public void a(boolean z10, boolean z11) {
            b.this.z(z10, z11);
        }
    }

    /* JADX INFO: renamed from: io.flutter.embedding.android.b$b, reason: collision with other inner class name */
    class C0308b extends ContentObserver {
        C0308b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            if (b.this.f12769h == null) {
                return;
            }
            cc.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            b.this.B();
        }
    }

    class c implements qc.a {
        c() {
        }

        @Override // qc.a
        public void b() {
            b.this.f12768g = false;
            Iterator it = b.this.f12767f.iterator();
            while (it.hasNext()) {
                ((qc.a) it.next()).b();
            }
        }

        @Override // qc.a
        public void e() {
            b.this.f12768g = true;
            Iterator it = b.this.f12767f.iterator();
            while (it.hasNext()) {
                ((qc.a) it.next()).e();
            }
        }
    }

    class d implements n3.a<k> {
        d() {
        }

        @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(k kVar) {
            b.this.setWindowInfoListenerDisplayFeatures(kVar);
        }
    }

    class e implements qc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FlutterRenderer f12789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f12790b;

        e(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.f12789a = flutterRenderer;
            this.f12790b = runnable;
        }

        @Override // qc.a
        public void b() {
        }

        @Override // qc.a
        public void e() {
            this.f12789a.u(this);
            this.f12790b.run();
            b bVar = b.this;
            if ((bVar.f12765d instanceof io.flutter.embedding.android.a) || bVar.f12764c == null) {
                return;
            }
            b.this.f12764c.d();
            b.this.x();
        }
    }

    public interface f {
        void a();

        void b(io.flutter.embedding.engine.a aVar);
    }

    private enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private b(Context context, AttributeSet attributeSet, l lVar) {
        super(context, attributeSet);
        this.f12767f = new HashSet();
        this.f12770i = new HashSet();
        this.f12780s = new FlutterRenderer.h();
        this.f12781t = new a();
        this.f12782u = new C0308b(new Handler(Looper.getMainLooper()));
        this.f12783v = new c();
        this.f12784w = new d();
        this.f12762a = lVar;
        this.f12765d = lVar;
        u();
    }

    private b(Context context, AttributeSet attributeSet, m mVar) {
        super(context, attributeSet);
        this.f12767f = new HashSet();
        this.f12770i = new HashSet();
        this.f12780s = new FlutterRenderer.h();
        this.f12781t = new a();
        this.f12782u = new C0308b(new Handler(Looper.getMainLooper()));
        this.f12783v = new c();
        this.f12784w = new d();
        this.f12763b = mVar;
        this.f12765d = mVar;
        u();
    }

    public b(Context context, l lVar) {
        this(context, (AttributeSet) null, lVar);
    }

    public b(Context context, m mVar) {
        this(context, (AttributeSet) null, mVar);
    }

    private void C() {
        if (!v()) {
            cc.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f12780s.f12954a = getResources().getDisplayMetrics().density;
        this.f12780s.f12969p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f12769h.s().y(this.f12780s);
    }

    private g o() {
        Context context = getContext();
        int i10 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return g.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    private int t(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void u() {
        View view;
        cc.b.f("FlutterView", "Initializing FlutterView");
        if (this.f12762a != null) {
            cc.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f12762a;
        } else if (this.f12763b != null) {
            cc.b.f("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f12763b;
        } else {
            cc.b.f("FlutterView", "Internally using a FlutterImageView.");
            view = this.f12764c;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean w(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        io.flutter.embedding.android.a aVar = this.f12764c;
        if (aVar != null) {
            aVar.g();
            removeView(this.f12764c);
            this.f12764c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z10, boolean z11) {
        boolean z12 = false;
        if (!this.f12769h.s().o() && !z10 && !z11) {
            z12 = true;
        }
        setWillNotDraw(z12);
    }

    public void A(Runnable runnable) {
        if (this.f12764c == null) {
            cc.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        qc.b bVar = this.f12766e;
        if (bVar == null) {
            cc.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f12765d = bVar;
        this.f12766e = null;
        FlutterRenderer flutterRendererS = this.f12769h.s();
        if (this.f12769h != null && flutterRendererS != null) {
            this.f12765d.a();
            flutterRendererS.j(new e(flutterRendererS, runnable));
        } else {
            this.f12764c.d();
            x();
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void B() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L1a
            rc.p$c r0 = rc.p.c.dark
            goto L1c
        L1a:
            rc.p$c r0 = rc.p.c.light
        L1c:
            android.view.textservice.TextServicesManager r3 = r6.f12778q
            if (r3 == 0) goto L43
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L41
            java.util.List r3 = dc.n.a(r3)
            java.util.stream.Stream r3 = r3.stream()
            dc.p r4 = new dc.p
            r4.<init>()
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.f12778q
            boolean r4 = dc.o.a(r4)
            if (r4 == 0) goto L43
            if (r3 == 0) goto L43
        L41:
            r3 = r2
            goto L44
        L43:
            r3 = r1
        L44:
            io.flutter.embedding.engine.a r4 = r6.f12769h
            rc.p r4 = r4.u()
            rc.p$b r4 = r4.d()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            rc.p$b r4 = r4.f(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            rc.p$b r4 = r4.c(r5)
            rc.p$b r3 = r4.d(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L7d
            r1 = r2
        L7d:
            rc.p$b r1 = r3.b(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            rc.p$b r1 = r1.g(r2)
            rc.p$b r0 = r1.e(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.b.B():void");
    }

    @Override // vc.a.c
    @TargetApi(24)
    public PointerIcon a(int i10) {
        return PointerIcon.getSystemIcon(getContext(), i10);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f12772k.j(sparseArray);
    }

    @Override // io.flutter.embedding.android.f.e
    public void b(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // io.flutter.embedding.android.f.e
    public boolean c(KeyEvent keyEvent) {
        return this.f12772k.q(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f12769h;
        return aVar != null ? aVar.p().G(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (v() && this.f12775n.a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.f12777p;
        if (cVar == null || !cVar.C()) {
            return null;
        }
        return this.f12777p;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f12769h;
    }

    @Override // io.flutter.embedding.android.f.e
    public sc.b getBinaryMessenger() {
        return this.f12769h.j();
    }

    public io.flutter.embedding.android.a getCurrentImageSurface() {
        return this.f12764c;
    }

    public boolean k() {
        io.flutter.embedding.android.a aVar = this.f12764c;
        if (aVar != null) {
            return aVar.e();
        }
        return false;
    }

    public void l(qc.a aVar) {
        this.f12767f.add(aVar);
    }

    public void m(io.flutter.embedding.android.a aVar) {
        io.flutter.embedding.engine.a aVar2 = this.f12769h;
        if (aVar2 != null) {
            aVar.b(aVar2.s());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        cc.b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (v()) {
            if (aVar == this.f12769h) {
                cc.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                cc.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f12769h = aVar;
        FlutterRenderer flutterRendererS = aVar.s();
        this.f12768g = flutterRendererS.n();
        this.f12765d.b(flutterRendererS);
        flutterRendererS.j(this.f12783v);
        this.f12771j = new vc.a(this, this.f12769h.m());
        this.f12772k = new io.flutter.plugin.editing.d(this, this.f12769h.x(), this.f12769h.p());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f12778q = textServicesManager;
            this.f12773l = new tc.a(textServicesManager, this.f12769h.v());
        } catch (Exception unused) {
            cc.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f12774m = this.f12769h.l();
        this.f12775n = new io.flutter.embedding.android.f(this);
        this.f12776o = new dc.a(this.f12769h.s(), false);
        io.flutter.view.c cVar = new io.flutter.view.c(this, aVar.h(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f12769h.p());
        this.f12777p = cVar;
        cVar.a0(this.f12781t);
        z(this.f12777p.C(), this.f12777p.E());
        this.f12769h.p().a(this.f12777p);
        this.f12769h.p().E(this.f12769h.s());
        this.f12772k.p().restartInput(this);
        B();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f12782u);
        C();
        aVar.p().F(this);
        Iterator<f> it = this.f12770i.iterator();
        while (it.hasNext()) {
            it.next().b(aVar);
        }
        if (this.f12768g) {
            this.f12783v.e();
        }
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.h hVar = this.f12780s;
            hVar.f12965l = systemGestureInsets.top;
            hVar.f12966m = systemGestureInsets.right;
            hVar.f12967n = systemGestureInsets.bottom;
            hVar.f12968o = systemGestureInsets.left;
        }
        boolean z10 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z11 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i10 >= 30) {
            int iNavigationBars = z11 ? 0 | WindowInsets$Type.navigationBars() : 0;
            if (z10) {
                iNavigationBars |= WindowInsets$Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(iNavigationBars);
            FlutterRenderer.h hVar2 = this.f12780s;
            hVar2.f12957d = insets.top;
            hVar2.f12958e = insets.right;
            hVar2.f12959f = insets.bottom;
            hVar2.f12960g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets$Type.ime());
            FlutterRenderer.h hVar3 = this.f12780s;
            hVar3.f12961h = insets2.top;
            hVar3.f12962i = insets2.right;
            hVar3.f12963j = insets2.bottom;
            hVar3.f12964k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets$Type.systemGestures());
            FlutterRenderer.h hVar4 = this.f12780s;
            hVar4.f12965l = insets3.top;
            hVar4.f12966m = insets3.right;
            hVar4.f12967n = insets3.bottom;
            hVar4.f12968o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                FlutterRenderer.h hVar5 = this.f12780s;
                hVar5.f12957d = Math.max(Math.max(hVar5.f12957d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                FlutterRenderer.h hVar6 = this.f12780s;
                hVar6.f12958e = Math.max(Math.max(hVar6.f12958e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                FlutterRenderer.h hVar7 = this.f12780s;
                hVar7.f12959f = Math.max(Math.max(hVar7.f12959f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                FlutterRenderer.h hVar8 = this.f12780s;
                hVar8.f12960g = Math.max(Math.max(hVar8.f12960g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            g gVarO = g.NONE;
            if (!z11) {
                gVarO = o();
            }
            this.f12780s.f12957d = z10 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f12780s.f12958e = (gVarO == g.RIGHT || gVarO == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f12780s.f12959f = (z11 && t(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f12780s.f12960g = (gVarO == g.LEFT || gVarO == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.h hVar9 = this.f12780s;
            hVar9.f12961h = 0;
            hVar9.f12962i = 0;
            hVar9.f12963j = t(windowInsets);
            this.f12780s.f12964k = 0;
        }
        cc.b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f12780s.f12957d + ", Left: " + this.f12780s.f12960g + ", Right: " + this.f12780s.f12958e + "\nKeyboard insets: Bottom: " + this.f12780s.f12963j + ", Left: " + this.f12780s.f12964k + ", Right: " + this.f12780s.f12962i + "System Gesture Insets - Left: " + this.f12780s.f12968o + ", Top: " + this.f12780s.f12965l + ", Right: " + this.f12780s.f12966m + ", Bottom: " + this.f12780s.f12963j);
        C();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12779r = r();
        Activity activityE = h.e(getContext());
        x xVar = this.f12779r;
        if (xVar == null || activityE == null) {
            return;
        }
        xVar.a(activityE, androidx.core.content.a.getMainExecutor(getContext()), this.f12784w);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f12769h != null) {
            cc.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f12774m.d(configuration);
            B();
            h.c(getContext(), this.f12769h);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !v() ? super.onCreateInputConnection(editorInfo) : this.f12772k.n(this, this.f12775n, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        x xVar = this.f12779r;
        if (xVar != null) {
            xVar.b(this.f12784w);
        }
        this.f12779r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (v() && this.f12776o.j(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !v() ? super.onHoverEvent(motionEvent) : this.f12777p.L(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        this.f12772k.y(viewStructure, i10);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        cc.b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i12 + " x " + i13 + ", it is now " + i10 + " x " + i11);
        FlutterRenderer.h hVar = this.f12780s;
        hVar.f12955b = i10;
        hVar.f12956c = i11;
        C();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!v()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f12776o.k(motionEvent);
    }

    public void p() {
        this.f12765d.c();
        io.flutter.embedding.android.a aVar = this.f12764c;
        if (aVar == null) {
            io.flutter.embedding.android.a aVarQ = q();
            this.f12764c = aVarQ;
            addView(aVarQ);
        } else {
            aVar.k(getWidth(), getHeight());
        }
        this.f12766e = this.f12765d;
        io.flutter.embedding.android.a aVar2 = this.f12764c;
        this.f12765d = aVar2;
        io.flutter.embedding.engine.a aVar3 = this.f12769h;
        if (aVar3 != null) {
            aVar2.b(aVar3.s());
        }
    }

    public io.flutter.embedding.android.a q() {
        return new io.flutter.embedding.android.a(getContext(), getWidth(), getHeight(), a.b.background);
    }

    protected x r() {
        try {
            return new x(new l5.a(m5.f.f15442a.d(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        cc.b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f12769h);
        if (!v()) {
            cc.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator<f> it = this.f12770i.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f12782u);
        this.f12769h.p().P();
        this.f12769h.p().d();
        this.f12777p.S();
        this.f12777p = null;
        this.f12772k.p().restartInput(this);
        this.f12772k.o();
        this.f12775n.d();
        tc.a aVar = this.f12773l;
        if (aVar != null) {
            aVar.b();
        }
        vc.a aVar2 = this.f12771j;
        if (aVar2 != null) {
            aVar2.c();
        }
        FlutterRenderer flutterRendererS = this.f12769h.s();
        this.f12768g = false;
        flutterRendererS.u(this.f12783v);
        flutterRendererS.A();
        flutterRendererS.x(false);
        qc.b bVar = this.f12766e;
        if (bVar != null && this.f12765d == this.f12764c) {
            this.f12765d = bVar;
        }
        this.f12765d.d();
        x();
        this.f12766e = null;
        this.f12769h = null;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        qc.b bVar = this.f12765d;
        if (bVar instanceof l) {
            ((l) bVar).setVisibility(i10);
        }
    }

    @TargetApi(28)
    protected void setWindowInfoListenerDisplayFeatures(k kVar) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<m5.a> listA = kVar.a();
        ArrayList arrayList = new ArrayList();
        for (m5.a aVar : listA) {
            cc.b.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + aVar.getBounds().toString() + " and type = " + aVar.getClass().getSimpleName());
            if (aVar instanceof m5.c) {
                m5.c cVar = (m5.c) aVar;
                arrayList.add(new FlutterRenderer.c(aVar.getBounds(), cVar.b() == c.a.f15417d ? FlutterRenderer.e.HINGE : FlutterRenderer.e.FOLD, cVar.getState() == c.C0352c.f15424c ? FlutterRenderer.d.POSTURE_FLAT : cVar.getState() == c.C0352c.f15425d ? FlutterRenderer.d.POSTURE_HALF_OPENED : FlutterRenderer.d.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.c(aVar.getBounds(), FlutterRenderer.e.UNKNOWN, FlutterRenderer.d.UNKNOWN));
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                cc.b.f("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new FlutterRenderer.c(rect, FlutterRenderer.e.CUTOUT));
            }
        }
        this.f12780s.f12970q = arrayList;
        C();
    }

    public boolean v() {
        io.flutter.embedding.engine.a aVar = this.f12769h;
        return aVar != null && aVar.s() == this.f12765d.getAttachedRenderer();
    }

    public void y(qc.a aVar) {
        this.f12767f.remove(aVar);
    }
}
