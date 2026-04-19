package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z0;
import androidx.core.content.res.b;
import androidx.core.view.c;
import androidx.lifecycle.g;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o3.g2;
import o3.h0;
import org.xmlpull.v1.XmlPullParser;
import p.b;
import p.e;
import z.c0;

/* JADX INFO: loaded from: classes.dex */
class e extends androidx.appcompat.app.d implements e.a, LayoutInflater.Factory2 {
    private boolean A;
    ViewGroup B;
    private TextView C;
    private View D;
    private boolean E;
    private boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean X;
    boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private u[] f973a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private u f974b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f975c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f976d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f977e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    boolean f978f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Configuration f979g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f980h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f981i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Object f982j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f983j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Context f984k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f985k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window f986l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private q f987l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o f988m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private q f989m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final k.b f990n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    boolean f991n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    androidx.appcompat.app.a f992o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    int f993o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    MenuInflater f994p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final Runnable f995p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f996q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f997q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private r.l f998r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private Rect f999r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h f1000s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private Rect f1001s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private v f1002t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private k.f f1003t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    p.b f1004u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private androidx.appcompat.app.j f1005u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ActionBarContextView f1006v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private OnBackInvokedDispatcher f1007v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    PopupWindow f1008w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private OnBackInvokedCallback f1009w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Runnable f1010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    androidx.core.view.l f1011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f1012z;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final c0<String, Integer> f970x0 = new c0<>();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final boolean f971y0 = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final int[] f972z0 = {R.attr.windowBackground};
    private static final boolean A0 = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean B0 = true;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.f993o0 & 1) != 0) {
                eVar.i0(0);
            }
            e eVar2 = e.this;
            if ((eVar2.f993o0 & 4096) != 0) {
                eVar2.i0(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
            e eVar3 = e.this;
            eVar3.f991n0 = false;
            eVar3.f993o0 = 0;
        }
    }

    class b implements h0 {
        b() {
        }

        @Override // o3.h0
        public androidx.core.view.o a(View view, androidx.core.view.o oVar) {
            int iL = oVar.l();
            int iE1 = e.this.e1(oVar, null);
            if (iL != iE1) {
                oVar = oVar.q(oVar.j(), iE1, oVar.k(), oVar.i());
            }
            return androidx.core.view.h.N(view, oVar);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            e.this.g0();
        }
    }

    class d implements Runnable {

        class a extends g2 {
            a() {
            }

            @Override // o3.f2
            public void b(View view) {
                e.this.f1006v.setAlpha(1.0f);
                e.this.f1011y.h(null);
                e.this.f1011y = null;
            }

            @Override // o3.g2, o3.f2
            public void c(View view) {
                e.this.f1006v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f1008w.showAtLocation(eVar.f1006v, 55, 0, 0);
            e.this.j0();
            if (!e.this.U0()) {
                e.this.f1006v.setAlpha(1.0f);
                e.this.f1006v.setVisibility(0);
            } else {
                e.this.f1006v.setAlpha(0.0f);
                e eVar2 = e.this;
                eVar2.f1011y = androidx.core.view.h.c(eVar2.f1006v).b(1.0f);
                e.this.f1011y.h(new a());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.e$e, reason: collision with other inner class name */
    class C0026e extends g2 {
        C0026e() {
        }

        @Override // o3.f2
        public void b(View view) {
            e.this.f1006v.setAlpha(1.0f);
            e.this.f1011y.h(null);
            e.this.f1011y = null;
        }

        @Override // o3.g2, o3.f2
        public void c(View view) {
            e.this.f1006v.setVisibility(0);
            if (e.this.f1006v.getParent() instanceof View) {
                androidx.core.view.h.T((View) e.this.f1006v.getParent());
            }
        }
    }

    private class f implements k.a {
        f() {
        }
    }

    interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    private final class h implements j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            e.this.Z(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackV0 = e.this.v0();
            if (callbackV0 == null) {
                return true;
            }
            callbackV0.onMenuOpened(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, eVar);
            return true;
        }
    }

    class i implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.a f1021a;

        class a extends g2 {
            a() {
            }

            @Override // o3.f2
            public void b(View view) {
                e.this.f1006v.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.f1008w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.f1006v.getParent() instanceof View) {
                    androidx.core.view.h.T((View) e.this.f1006v.getParent());
                }
                e.this.f1006v.k();
                e.this.f1011y.h(null);
                e eVar2 = e.this;
                eVar2.f1011y = null;
                androidx.core.view.h.T(eVar2.B);
            }
        }

        public i(b.a aVar) {
            this.f1021a = aVar;
        }

        @Override // p.b.a
        public boolean a(p.b bVar, Menu menu) {
            return this.f1021a.a(bVar, menu);
        }

        @Override // p.b.a
        public boolean b(p.b bVar, MenuItem menuItem) {
            return this.f1021a.b(bVar, menuItem);
        }

        @Override // p.b.a
        public boolean c(p.b bVar, Menu menu) {
            androidx.core.view.h.T(e.this.B);
            return this.f1021a.c(bVar, menu);
        }

        @Override // p.b.a
        public void d(p.b bVar) {
            this.f1021a.d(bVar);
            e eVar = e.this;
            if (eVar.f1008w != null) {
                eVar.f986l.getDecorView().removeCallbacks(e.this.f1010x);
            }
            e eVar2 = e.this;
            if (eVar2.f1006v != null) {
                eVar2.j0();
                e eVar3 = e.this;
                eVar3.f1011y = androidx.core.view.h.c(eVar3.f1006v).b(0.0f);
                e.this.f1011y.h(new a());
            }
            e eVar4 = e.this;
            k.b bVar2 = eVar4.f990n;
            if (bVar2 != null) {
                bVar2.onSupportActionModeFinished(eVar4.f1004u);
            }
            e eVar5 = e.this;
            eVar5.f1004u = null;
            androidx.core.view.h.T(eVar5.B);
            e.this.c1();
        }
    }

    static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.c b(Configuration configuration) {
            return androidx.core.os.c.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.c cVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(cVar.h()));
        }

        static void d(Configuration configuration, androidx.core.os.c cVar) {
            configuration.setLocales(LocaleList.forLanguageTags(cVar.h()));
        }
    }

    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    static class n {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final e eVar) {
            Objects.requireNonNull(eVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.f
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    eVar.D0();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    class o extends androidx.appcompat.view.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f1024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1027e;

        o(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f1026d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f1026d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f1025c = true;
                callback.onContentChanged();
            } finally {
                this.f1025c = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f1027e = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f1027e = false;
            }
        }

        @Override // androidx.appcompat.view.b, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f1026d ? a().dispatchKeyEvent(keyEvent) : e.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.b, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.G0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.f1024b = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            e.a aVar = new e.a(e.this.f984k, callback);
            p.b bVarP = e.this.P(aVar);
            if (bVarP != null) {
                return aVar.e(bVarP);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f1025c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.b, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.b, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            g gVar = this.f1024b;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.b, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            e.this.J0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.b, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f1027e) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                e.this.K0(i10);
            }
        }

        @Override // androidx.appcompat.view.b, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.b0(true);
            }
            g gVar = this.f1024b;
            boolean zOnPreparePanel = gVar != null && gVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.b0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.b, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            u uVarT0 = e.this.t0(0, true);
            if (uVarT0 == null || (eVar = uVarT0.f1046j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.b, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (e.this.B0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    private class p extends q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f1029c;

        p(Context context) {
            super();
            this.f1029c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.e.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.q
        public int c() {
            return k.a(this.f1029c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.q
        public void d() {
            e.this.T();
        }
    }

    abstract class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f1031a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f1031a;
            if (broadcastReceiver != null) {
                try {
                    e.this.f984k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1031a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f1031a == null) {
                this.f1031a = new a();
            }
            e.this.f984k.registerReceiver(this.f1031a, intentFilterB);
        }
    }

    private class r extends q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.o f1034c;

        r(androidx.appcompat.app.o oVar) {
            super();
            this.f1034c = oVar;
        }

        @Override // androidx.appcompat.app.e.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.q
        public int c() {
            return this.f1034c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.q
        public void d() {
            e.this.T();
        }
    }

    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            e.this.b0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(l.a.b(getContext(), i10));
        }
    }

    protected static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f1043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f1044h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f1045i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f1046j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f1047k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f1048l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f1049m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f1050n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f1051o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f1052p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f1053q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f1054r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f1055s;

        u(int i10) {
            this.f1037a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f1046j == null) {
                return null;
            }
            if (this.f1047k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f1048l, j.g.f13442j);
                this.f1047k = cVar;
                cVar.h(aVar);
                this.f1046j.b(this.f1047k);
            }
            return this.f1047k.b(this.f1043g);
        }

        public boolean b() {
            if (this.f1044h == null) {
                return false;
            }
            return this.f1045i != null || this.f1047k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1046j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f1047k);
            }
            this.f1046j = eVar;
            if (eVar == null || (cVar = this.f1047k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(j.a.f13331a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(j.a.E, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = j.i.f13468b;
            }
            themeNewTheme.applyStyle(i11, true);
            androidx.appcompat.view.a aVar = new androidx.appcompat.view.a(context, 0);
            aVar.getTheme().setTo(themeNewTheme);
            this.f1048l = aVar;
            TypedArray typedArrayObtainStyledAttributes = aVar.obtainStyledAttributes(j.j.f13593y0);
            this.f1038b = typedArrayObtainStyledAttributes.getResourceId(j.j.B0, 0);
            this.f1042f = typedArrayObtainStyledAttributes.getResourceId(j.j.A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class v implements j.a {
        v() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z11 = eVarD != eVar;
            e eVar2 = e.this;
            if (z11) {
                eVar = eVarD;
            }
            u uVarM0 = eVar2.m0(eVar);
            if (uVarM0 != null) {
                if (!z11) {
                    e.this.c0(uVarM0, z10);
                } else {
                    e.this.Y(uVarM0.f1037a, uVarM0, eVarD);
                    e.this.c0(uVarM0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackV0;
            if (eVar != eVar.D()) {
                return true;
            }
            e eVar2 = e.this;
            if (!eVar2.G || (callbackV0 = eVar2.v0()) == null || e.this.f978f0) {
                return true;
            }
            callbackV0.onMenuOpened(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, eVar);
            return true;
        }
    }

    e(Activity activity, k.b bVar) {
        this(activity, null, bVar, activity);
    }

    e(Dialog dialog, k.b bVar) {
        this(dialog.getContext(), dialog.getWindow(), bVar, dialog);
    }

    private e(Context context, Window window, k.b bVar, Object obj) {
        c0<String, Integer> c0Var;
        Integer num;
        androidx.appcompat.app.c cVarZ0;
        this.f1011y = null;
        this.f1012z = true;
        this.f980h0 = -100;
        this.f995p0 = new a();
        this.f984k = context;
        this.f990n = bVar;
        this.f982j = obj;
        if (this.f980h0 == -100 && (obj instanceof Dialog) && (cVarZ0 = Z0()) != null) {
            this.f980h0 = cVarZ0.getDelegate().o();
        }
        if (this.f980h0 == -100 && (num = (c0Var = f970x0).get(obj.getClass().getName())) != null) {
            this.f980h0 = num.intValue();
            c0Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            V(window);
        }
        androidx.appcompat.widget.k.h();
    }

    private void A0(int i10) {
        this.f993o0 = (1 << i10) | this.f993o0;
        if (this.f991n0) {
            return;
        }
        androidx.core.view.h.R(this.f986l.getDecorView(), this.f995p0);
        this.f991n0 = true;
    }

    private boolean F0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u uVarT0 = t0(i10, true);
        if (uVarT0.f1051o) {
            return false;
        }
        return P0(uVarT0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean I0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            p.b r0 = r4.f1004u
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.e$u r2 = r4.t0(r5, r0)
            if (r5 != 0) goto L43
            r.l r5 = r4.f998r
            if (r5 == 0) goto L43
            boolean r5 = r5.d()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f984k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            r.l r5 = r4.f998r
            boolean r5 = r5.b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f978f0
            if (r5 != 0) goto L62
            boolean r5 = r4.P0(r2, r6)
            if (r5 == 0) goto L62
            r.l r5 = r4.f998r
            boolean r0 = r5.h()
            goto L68
        L3c:
            r.l r5 = r4.f998r
            boolean r0 = r5.g()
            goto L68
        L43:
            boolean r5 = r2.f1051o
            if (r5 != 0) goto L64
            boolean r3 = r2.f1050n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f1049m
            if (r5 == 0) goto L62
            boolean r5 = r2.f1054r
            if (r5 == 0) goto L5b
            r2.f1049m = r1
            boolean r5 = r4.P0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.M0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.c0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f984k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.I0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void M0(androidx.appcompat.app.e.u r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.M0(androidx.appcompat.app.e$u, android.view.KeyEvent):void");
    }

    private boolean O0(u uVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f1049m || P0(uVar, keyEvent)) && (eVar = uVar.f1046j) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f998r == null) {
            c0(uVar, true);
        }
        return zPerformShortcut;
    }

    private boolean P0(u uVar, KeyEvent keyEvent) {
        r.l lVar;
        r.l lVar2;
        r.l lVar3;
        if (this.f978f0) {
            return false;
        }
        if (uVar.f1049m) {
            return true;
        }
        u uVar2 = this.f974b0;
        if (uVar2 != null && uVar2 != uVar) {
            c0(uVar2, false);
        }
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null) {
            uVar.f1045i = callbackV0.onCreatePanelView(uVar.f1037a);
        }
        int i10 = uVar.f1037a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (lVar3 = this.f998r) != null) {
            lVar3.c();
        }
        if (uVar.f1045i == null && (!z10 || !(N0() instanceof androidx.appcompat.app.m))) {
            androidx.appcompat.view.menu.e eVar = uVar.f1046j;
            if (eVar == null || uVar.f1054r) {
                if (eVar == null && (!z0(uVar) || uVar.f1046j == null)) {
                    return false;
                }
                if (z10 && this.f998r != null) {
                    if (this.f1000s == null) {
                        this.f1000s = new h();
                    }
                    this.f998r.a(uVar.f1046j, this.f1000s);
                }
                uVar.f1046j.e0();
                if (!callbackV0.onCreatePanelMenu(uVar.f1037a, uVar.f1046j)) {
                    uVar.c(null);
                    if (z10 && (lVar = this.f998r) != null) {
                        lVar.a(null, this.f1000s);
                    }
                    return false;
                }
                uVar.f1054r = false;
            }
            uVar.f1046j.e0();
            Bundle bundle = uVar.f1055s;
            if (bundle != null) {
                uVar.f1046j.P(bundle);
                uVar.f1055s = null;
            }
            if (!callbackV0.onPreparePanel(0, uVar.f1045i, uVar.f1046j)) {
                if (z10 && (lVar2 = this.f998r) != null) {
                    lVar2.a(null, this.f1000s);
                }
                uVar.f1046j.d0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.f1052p = z11;
            uVar.f1046j.setQwertyMode(z11);
            uVar.f1046j.d0();
        }
        uVar.f1049m = true;
        uVar.f1050n = false;
        this.f974b0 = uVar;
        return true;
    }

    private void Q0(boolean z10) {
        r.l lVar = this.f998r;
        if (lVar == null || !lVar.d() || (ViewConfiguration.get(this.f984k).hasPermanentMenuKey() && !this.f998r.f())) {
            u uVarT0 = t0(0, true);
            uVarT0.f1053q = true;
            c0(uVarT0, false);
            M0(uVarT0, null);
            return;
        }
        Window.Callback callbackV0 = v0();
        if (this.f998r.b() && z10) {
            this.f998r.g();
            if (this.f978f0) {
                return;
            }
            callbackV0.onPanelClosed(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, t0(0, true).f1046j);
            return;
        }
        if (callbackV0 == null || this.f978f0) {
            return;
        }
        if (this.f991n0 && (this.f993o0 & 1) != 0) {
            this.f986l.getDecorView().removeCallbacks(this.f995p0);
            this.f995p0.run();
        }
        u uVarT02 = t0(0, true);
        androidx.appcompat.view.menu.e eVar = uVarT02.f1046j;
        if (eVar == null || uVarT02.f1054r || !callbackV0.onPreparePanel(0, uVarT02.f1045i, eVar)) {
            return;
        }
        callbackV0.onMenuOpened(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, uVarT02.f1046j);
        this.f998r.h();
    }

    private boolean R(boolean z10) {
        return S(z10, true);
    }

    private int R0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
    }

    private boolean S(boolean z10, boolean z11) {
        if (this.f978f0) {
            return false;
        }
        int iX = X();
        int iC0 = C0(this.f984k, iX);
        androidx.core.os.c cVarW = Build.VERSION.SDK_INT < 33 ? W(this.f984k) : null;
        if (!z11 && cVarW != null) {
            cVarW = s0(this.f984k.getResources().getConfiguration());
        }
        boolean zB1 = b1(iC0, cVarW, z10);
        if (iX == 0) {
            r0(this.f984k).e();
        } else {
            q qVar = this.f987l0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (iX == 3) {
            q0(this.f984k).e();
        } else {
            q qVar2 = this.f989m0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return zB1;
    }

    private void U() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.f986l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f984k.obtainStyledAttributes(j.j.f13593y0);
        typedArrayObtainStyledAttributes.getValue(j.j.K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(j.j.L0, contentFrameLayout.getMinWidthMinor());
        int i10 = j.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = j.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = j.j.G0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = j.j.H0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void V(Window window) {
        if (this.f986l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o oVar = new o(callback);
        this.f988m = oVar;
        window.setCallback(oVar);
        r0 r0VarT = r0.t(this.f984k, null, f972z0);
        Drawable drawableG = r0VarT.g(0);
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        r0VarT.v();
        this.f986l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f1007v0 != null) {
            return;
        }
        L(null);
    }

    private boolean V0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f986l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || androidx.core.view.h.G((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int X() {
        int i10 = this.f980h0;
        return i10 != -100 ? i10 : androidx.appcompat.app.d.m();
    }

    private void Y0() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private androidx.appcompat.app.c Z0() {
        for (Context baseContext = this.f984k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void a0() {
        q qVar = this.f987l0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.f989m0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a1(Configuration configuration) {
        Activity activity = (Activity) this.f982j;
        if (activity instanceof o4.e) {
            if (!((o4.e) activity).getLifecycle().b().b(g.b.CREATED)) {
                return;
            }
        } else if (!this.f977e0 || this.f978f0) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b1(int r9, androidx.core.os.c r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f984k
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.d0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f984k
            int r1 = r8.p0(r1)
            android.content.res.Configuration r2 = r8.f979g0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f984k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.c r2 = r8.s0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.c r0 = r8.s0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = r6
        L3b:
            if (r0 == 0) goto L47
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.148E-41)
        L47:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L71
            if (r11 == 0) goto L71
            boolean r11 = r8.f976d0
            if (r11 == 0) goto L71
            boolean r11 = androidx.appcompat.app.e.A0
            if (r11 != 0) goto L5a
            boolean r11 = r8.f977e0
            if (r11 == 0) goto L71
        L5a:
            java.lang.Object r11 = r8.f982j
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L71
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L71
            java.lang.Object r11 = r8.f982j
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.a.f(r11)
            r11 = r7
            goto L72
        L71:
            r11 = r6
        L72:
            if (r11 != 0) goto L7f
            if (r3 == 0) goto L7f
            r11 = r3 & r1
            if (r11 != r3) goto L7b
            r6 = r7
        L7b:
            r8.d1(r4, r0, r6, r5)
            goto L80
        L7f:
            r7 = r11
        L80:
            if (r7 == 0) goto L9c
            java.lang.Object r11 = r8.f982j
            boolean r1 = r11 instanceof androidx.appcompat.app.c
            if (r1 == 0) goto L9c
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L91
            androidx.appcompat.app.c r11 = (androidx.appcompat.app.c) r11
            r11.onNightModeChanged(r9)
        L91:
            r9 = r3 & 4
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.f982j
            androidx.appcompat.app.c r9 = (androidx.appcompat.app.c) r9
            r9.onLocalesChanged(r10)
        L9c:
            if (r7 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            android.content.Context r9 = r8.f984k
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.c r9 = r8.s0(r9)
            r8.T0(r9)
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.b1(int, androidx.core.os.c, boolean):boolean");
    }

    private Configuration d0(Context context, int i10, androidx.core.os.c cVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (cVar != null) {
            S0(configuration2, cVar);
        }
        return configuration2;
    }

    private void d1(int i10, androidx.core.os.c cVar, boolean z10, Configuration configuration) {
        Resources resources = this.f984k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (cVar != null) {
            S0(configuration2, cVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.l.a(resources);
        }
        int i11 = this.f981i0;
        if (i11 != 0) {
            this.f984k.setTheme(i11);
            this.f984k.getTheme().applyStyle(this.f981i0, true);
        }
        if (z10 && (this.f982j instanceof Activity)) {
            a1(configuration2);
        }
    }

    private ViewGroup e0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f984k.obtainStyledAttributes(j.j.f13593y0);
        int i10 = j.j.D0;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(j.j.M0, false)) {
            H(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            H(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(j.j.E0, false)) {
            H(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(j.j.F0, false)) {
            H(10);
        }
        this.X = typedArrayObtainStyledAttributes.getBoolean(j.j.f13598z0, false);
        typedArrayObtainStyledAttributes.recycle();
        l0();
        this.f986l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f984k);
        if (this.Y) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.I ? j.g.f13447o : j.g.f13446n, (ViewGroup) null);
        } else if (this.X) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(j.g.f13438f, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            this.f984k.getTheme().resolveAttribute(j.a.f13336f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.a(this.f984k, typedValue.resourceId) : this.f984k).inflate(j.g.f13448p, (ViewGroup) null);
            r.l lVar = (r.l) viewGroup.findViewById(j.f.f13422p);
            this.f998r = lVar;
            lVar.setWindowCallback(v0());
            if (this.H) {
                this.f998r.i(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
            }
            if (this.E) {
                this.f998r.i(2);
            }
            if (this.F) {
                this.f998r.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.X + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.Y + " }");
        }
        androidx.core.view.h.i0(viewGroup, new b());
        if (this.f998r == null) {
            this.C = (TextView) viewGroup.findViewById(j.f.M);
        }
        z0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(j.f.f13408b);
        ViewGroup viewGroup2 = (ViewGroup) this.f986l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f986l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void f1(View view) {
        Context context;
        int i10;
        if ((androidx.core.view.h.B(view) & 8192) != 0) {
            context = this.f984k;
            i10 = j.c.f13359b;
        } else {
            context = this.f984k;
            i10 = j.c.f13358a;
        }
        view.setBackgroundColor(androidx.core.content.a.getColor(context, i10));
    }

    private void k0() {
        if (this.A) {
            return;
        }
        this.B = e0();
        CharSequence charSequenceU0 = u0();
        if (!TextUtils.isEmpty(charSequenceU0)) {
            r.l lVar = this.f998r;
            if (lVar != null) {
                lVar.setWindowTitle(charSequenceU0);
            } else if (N0() != null) {
                N0().x(charSequenceU0);
            } else {
                TextView textView = this.C;
                if (textView != null) {
                    textView.setText(charSequenceU0);
                }
            }
        }
        U();
        L0(this.B);
        this.A = true;
        u uVarT0 = t0(0, false);
        if (this.f978f0) {
            return;
        }
        if (uVarT0 == null || uVarT0.f1046j == null) {
            A0(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
    }

    private void l0() {
        if (this.f986l == null) {
            Object obj = this.f982j;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.f986l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration n0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            l.a(configuration, configuration2, configuration3);
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                m.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int p0(Context context) {
        if (!this.f985k0 && (this.f982j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f982j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f983j0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f983j0 = 0;
            }
        }
        this.f985k0 = true;
        return this.f983j0;
    }

    private q q0(Context context) {
        if (this.f989m0 == null) {
            this.f989m0 = new p(context);
        }
        return this.f989m0;
    }

    private q r0(Context context) {
        if (this.f987l0 == null) {
            this.f987l0 = new r(androidx.appcompat.app.o.a(context));
        }
        return this.f987l0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w0() {
        /*
            r3 = this;
            r3.k0()
            boolean r0 = r3.G
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.f992o
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f982j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.p r0 = new androidx.appcompat.app.p
            java.lang.Object r1 = r3.f982j
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.H
            r0.<init>(r1, r2)
        L1d:
            r3.f992o = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.p r0 = new androidx.appcompat.app.p
            java.lang.Object r1 = r3.f982j
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.f992o
            if (r0 == 0) goto L37
            boolean r1 = r3.f997q0
            r0.t(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.w0():void");
    }

    private boolean x0(u uVar) {
        View view = uVar.f1045i;
        if (view != null) {
            uVar.f1044h = view;
            return true;
        }
        if (uVar.f1046j == null) {
            return false;
        }
        if (this.f1002t == null) {
            this.f1002t = new v();
        }
        View view2 = (View) uVar.a(this.f1002t);
        uVar.f1044h = view2;
        return view2 != null;
    }

    private boolean y0(u uVar) {
        uVar.d(o0());
        uVar.f1043g = new t(uVar.f1048l);
        uVar.f1039c = 81;
        return true;
    }

    private boolean z0(u uVar) {
        Context context = this.f984k;
        int i10 = uVar.f1037a;
        if ((i10 == 0 || i10 == 108) && this.f998r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(j.a.f13336f, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(j.a.f13337g, typedValue, true);
            } else {
                theme.resolveAttribute(j.a.f13337g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.a aVar = new androidx.appcompat.view.a(context, 0);
                aVar.getTheme().setTo(themeNewTheme);
                context = aVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        uVar.c(eVar);
        return true;
    }

    @Override // androidx.appcompat.app.d
    public void A(Bundle bundle) {
        k0();
    }

    @Override // androidx.appcompat.app.d
    public void B() {
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null) {
            aVarS.v(true);
        }
    }

    public boolean B0() {
        return this.f1012z;
    }

    @Override // androidx.appcompat.app.d
    public void C(Bundle bundle) {
    }

    int C0(Context context, int i10) {
        q qVarR0;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    qVarR0 = q0(context);
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                qVarR0 = r0(context);
            }
            return qVarR0.c();
        }
        return i10;
    }

    @Override // androidx.appcompat.app.d
    public void D() {
        S(true, false);
    }

    boolean D0() {
        boolean z10 = this.f975c0;
        this.f975c0 = false;
        u uVarT0 = t0(0, false);
        if (uVarT0 != null && uVarT0.f1051o) {
            if (!z10) {
                c0(uVarT0, true);
            }
            return true;
        }
        p.b bVar = this.f1004u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarS = s();
        return aVarS != null && aVarS.g();
    }

    @Override // androidx.appcompat.app.d
    public void E() {
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null) {
            aVarS.v(false);
        }
    }

    boolean E0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f975c0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean G0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null && aVarS.p(i10, keyEvent)) {
            return true;
        }
        u uVar = this.f974b0;
        if (uVar != null && O0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            u uVar2 = this.f974b0;
            if (uVar2 != null) {
                uVar2.f1050n = true;
            }
            return true;
        }
        if (this.f974b0 == null) {
            u uVarT0 = t0(0, true);
            P0(uVarT0, keyEvent);
            boolean zO0 = O0(uVarT0, keyEvent.getKeyCode(), keyEvent, 1);
            uVarT0.f1049m = false;
            if (zO0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public boolean H(int i10) {
        int iR0 = R0(i10);
        if (this.Y && iR0 == 108) {
            return false;
        }
        if (this.G && iR0 == 1) {
            this.G = false;
        }
        if (iR0 == 1) {
            Y0();
            this.Y = true;
            return true;
        }
        if (iR0 == 2) {
            Y0();
            this.E = true;
            return true;
        }
        if (iR0 == 5) {
            Y0();
            this.F = true;
            return true;
        }
        if (iR0 == 10) {
            Y0();
            this.I = true;
            return true;
        }
        if (iR0 == 108) {
            Y0();
            this.G = true;
            return true;
        }
        if (iR0 != 109) {
            return this.f986l.requestFeature(iR0);
        }
        Y0();
        this.H = true;
        return true;
    }

    boolean H0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                I0(0, keyEvent);
                return true;
            }
        } else if (D0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void I(int i10) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f984k).inflate(i10, viewGroup);
        this.f988m.c(this.f986l.getCallback());
    }

    @Override // androidx.appcompat.app.d
    public void J(View view) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f988m.c(this.f986l.getCallback());
    }

    void J0(int i10) {
        androidx.appcompat.app.a aVarS;
        if (i10 != 108 || (aVarS = s()) == null) {
            return;
        }
        aVarS.h(true);
    }

    @Override // androidx.appcompat.app.d
    public void K(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f988m.c(this.f986l.getCallback());
    }

    void K0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a aVarS = s();
            if (aVarS != null) {
                aVarS.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            u uVarT0 = t0(i10, true);
            if (uVarT0.f1051o) {
                c0(uVarT0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.d
    public void L(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.L(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f1007v0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f1009w0) != null) {
            n.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f1009w0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f982j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = n.a((Activity) this.f982j);
            }
        }
        this.f1007v0 = onBackInvokedDispatcher;
        c1();
    }

    void L0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.d
    public void M(Toolbar toolbar) {
        if (this.f982j instanceof Activity) {
            androidx.appcompat.app.a aVarS = s();
            if (aVarS instanceof androidx.appcompat.app.p) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f994p = null;
            if (aVarS != null) {
                aVarS.o();
            }
            this.f992o = null;
            if (toolbar != null) {
                androidx.appcompat.app.m mVar = new androidx.appcompat.app.m(toolbar, u0(), this.f988m);
                this.f992o = mVar;
                this.f988m.e(mVar.f1075c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f988m.e(null);
            }
            u();
        }
    }

    @Override // androidx.appcompat.app.d
    public void N(int i10) {
        this.f981i0 = i10;
    }

    final androidx.appcompat.app.a N0() {
        return this.f992o;
    }

    @Override // androidx.appcompat.app.d
    public final void O(CharSequence charSequence) {
        this.f996q = charSequence;
        r.l lVar = this.f998r;
        if (lVar != null) {
            lVar.setWindowTitle(charSequence);
            return;
        }
        if (N0() != null) {
            N0().x(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.d
    public p.b P(b.a aVar) {
        k.b bVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        p.b bVar2 = this.f1004u;
        if (bVar2 != null) {
            bVar2.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null) {
            p.b bVarZ = aVarS.z(iVar);
            this.f1004u = bVarZ;
            if (bVarZ != null && (bVar = this.f990n) != null) {
                bVar.onSupportActionModeStarted(bVarZ);
            }
        }
        if (this.f1004u == null) {
            this.f1004u = X0(iVar);
        }
        c1();
        return this.f1004u;
    }

    void S0(Configuration configuration, androidx.core.os.c cVar) {
        l.d(configuration, cVar);
    }

    public boolean T() {
        return R(true);
    }

    void T0(androidx.core.os.c cVar) {
        l.c(cVar);
    }

    final boolean U0() {
        ViewGroup viewGroup;
        return this.A && (viewGroup = this.B) != null && androidx.core.view.h.H(viewGroup);
    }

    androidx.core.os.c W(Context context) {
        androidx.core.os.c cVarR;
        if (Build.VERSION.SDK_INT >= 33 || (cVarR = androidx.appcompat.app.d.r()) == null) {
            return null;
        }
        androidx.core.os.c cVarS0 = s0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.c cVarB = androidx.appcompat.app.k.b(cVarR, cVarS0);
        return cVarB.f() ? cVarS0 : cVarB;
    }

    boolean W0() {
        if (this.f1007v0 == null) {
            return false;
        }
        u uVarT0 = t0(0, false);
        return (uVarT0 != null && uVarT0.f1051o) || this.f1004u != null;
    }

    p.b X0(b.a aVar) {
        p.b bVarOnWindowStartingSupportActionMode;
        Context aVar2;
        k.b bVar;
        j0();
        p.b bVar2 = this.f1004u;
        if (bVar2 != null) {
            bVar2.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        k.b bVar3 = this.f990n;
        if (bVar3 == null || this.f978f0) {
            bVarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                bVarOnWindowStartingSupportActionMode = bVar3.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
                bVarOnWindowStartingSupportActionMode = null;
            }
        }
        if (bVarOnWindowStartingSupportActionMode != null) {
            this.f1004u = bVarOnWindowStartingSupportActionMode;
        } else {
            if (this.f1006v == null) {
                if (this.X) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f984k.getTheme();
                    theme.resolveAttribute(j.a.f13336f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f984k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        aVar2 = new androidx.appcompat.view.a(this.f984k, 0);
                        aVar2.getTheme().setTo(themeNewTheme);
                    } else {
                        aVar2 = this.f984k;
                    }
                    this.f1006v = new ActionBarContextView(aVar2);
                    PopupWindow popupWindow = new PopupWindow(aVar2, (AttributeSet) null, j.a.f13339i);
                    this.f1008w = popupWindow;
                    androidx.core.widget.d.b(popupWindow, 2);
                    this.f1008w.setContentView(this.f1006v);
                    this.f1008w.setWidth(-1);
                    aVar2.getTheme().resolveAttribute(j.a.f13332b, typedValue, true);
                    this.f1006v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, aVar2.getResources().getDisplayMetrics()));
                    this.f1008w.setHeight(-2);
                    this.f1010x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.B.findViewById(j.f.f13414h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(o0()));
                        this.f1006v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f1006v != null) {
                j0();
                this.f1006v.k();
                p.d dVar = new p.d(this.f1006v.getContext(), this.f1006v, aVar, this.f1008w == null);
                if (aVar.a(dVar, dVar.e())) {
                    dVar.k();
                    this.f1006v.h(dVar);
                    this.f1004u = dVar;
                    if (U0()) {
                        this.f1006v.setAlpha(0.0f);
                        androidx.core.view.l lVarB = androidx.core.view.h.c(this.f1006v).b(1.0f);
                        this.f1011y = lVarB;
                        lVarB.h(new C0026e());
                    } else {
                        this.f1006v.setAlpha(1.0f);
                        this.f1006v.setVisibility(0);
                        if (this.f1006v.getParent() instanceof View) {
                            androidx.core.view.h.T((View) this.f1006v.getParent());
                        }
                    }
                    if (this.f1008w != null) {
                        this.f986l.getDecorView().post(this.f1010x);
                    }
                } else {
                    this.f1004u = null;
                }
            }
        }
        p.b bVar4 = this.f1004u;
        if (bVar4 != null && (bVar = this.f990n) != null) {
            bVar.onSupportActionModeStarted(bVar4);
        }
        c1();
        return this.f1004u;
    }

    void Y(int i10, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i10 >= 0) {
                u[] uVarArr = this.f973a0;
                if (i10 < uVarArr.length) {
                    uVar = uVarArr[i10];
                }
            }
            if (uVar != null) {
                menu = uVar.f1046j;
            }
        }
        if ((uVar == null || uVar.f1051o) && !this.f978f0) {
            this.f988m.d(this.f986l.getCallback(), i10, menu);
        }
    }

    void Z(androidx.appcompat.view.menu.e eVar) {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.f998r.j();
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null && !this.f978f0) {
            callbackV0.onPanelClosed(com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, eVar);
        }
        this.Z = false;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        u uVarM0;
        Window.Callback callbackV0 = v0();
        if (callbackV0 == null || this.f978f0 || (uVarM0 = m0(eVar.D())) == null) {
            return false;
        }
        return callbackV0.onMenuItemSelected(uVarM0.f1037a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        Q0(true);
    }

    void b0(int i10) {
        c0(t0(i10, true), true);
    }

    void c0(u uVar, boolean z10) {
        ViewGroup viewGroup;
        r.l lVar;
        if (z10 && uVar.f1037a == 0 && (lVar = this.f998r) != null && lVar.b()) {
            Z(uVar.f1046j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f984k.getSystemService("window");
        if (windowManager != null && uVar.f1051o && (viewGroup = uVar.f1043g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                Y(uVar.f1037a, uVar, null);
            }
        }
        uVar.f1049m = false;
        uVar.f1050n = false;
        uVar.f1051o = false;
        uVar.f1044h = null;
        uVar.f1053q = true;
        if (this.f974b0 == uVar) {
            this.f974b0 = null;
        }
        if (uVar.f1037a == 0) {
            c1();
        }
    }

    void c1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zW0 = W0();
            if (zW0 && this.f1009w0 == null) {
                this.f1009w0 = n.b(this.f1007v0, this);
            } else {
                if (zW0 || (onBackInvokedCallback = this.f1009w0) == null) {
                    return;
                }
                n.c(this.f1007v0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.d
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ((ViewGroup) this.B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f988m.c(this.f986l.getCallback());
    }

    final int e1(androidx.core.view.o oVar, Rect rect) {
        boolean z10;
        boolean z11;
        int iL = oVar != null ? oVar.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f1006v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1006v.getLayoutParams();
            if (this.f1006v.isShown()) {
                if (this.f999r0 == null) {
                    this.f999r0 = new Rect();
                    this.f1001s0 = new Rect();
                }
                Rect rect2 = this.f999r0;
                Rect rect3 = this.f1001s0;
                if (oVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(oVar.j(), oVar.l(), oVar.k(), oVar.i());
                }
                z0.a(this.B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                androidx.core.view.o oVarY = androidx.core.view.h.y(this.B);
                int iJ = oVarY == null ? 0 : oVarY.j();
                int iK = oVarY == null ? 0 : oVarY.k();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f984k);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    f1(this.D);
                }
                if (!this.I && z) {
                    iL = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                this.f1006v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View f0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        k.f fVar;
        boolean z11 = false;
        if (this.f1003t0 == null) {
            String string = this.f984k.obtainStyledAttributes(j.j.f13593y0).getString(j.j.C0);
            if (string == null) {
                fVar = new k.f();
            } else {
                try {
                    this.f1003t0 = (k.f) this.f984k.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    fVar = new k.f();
                    this.f1003t0 = fVar;
                }
            }
            this.f1003t0 = fVar;
        }
        boolean z12 = f971y0;
        boolean zV0 = true;
        if (z12) {
            if (this.f1005u0 == null) {
                this.f1005u0 = new androidx.appcompat.app.j();
            }
            if (this.f1005u0.a(attributeSet)) {
                z10 = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    }
                    z10 = z11;
                } else {
                    zV0 = V0((ViewParent) view);
                }
                z11 = zV0;
                z10 = z11;
            }
        } else {
            z10 = z11;
        }
        return this.f1003t0.r(view, str, context, attributeSet, z10, z12, true, y0.c());
    }

    @Override // androidx.appcompat.app.d
    public Context g(Context context) {
        this.f976d0 = true;
        int iC0 = C0(context, X());
        if (androidx.appcompat.app.d.v(context)) {
            androidx.appcompat.app.d.Q(context);
        }
        androidx.core.os.c cVarW = W(context);
        if (B0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, d0(context, iC0, cVarW, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.a) {
            try {
                ((androidx.appcompat.view.a) context).a(d0(context, iC0, cVarW, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!A0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = j.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationD0 = d0(context, iC0, cVarW, configuration2.equals(configuration3) ? null : n0(configuration2, configuration3), true);
        androidx.appcompat.view.a aVar = new androidx.appcompat.view.a(context, j.i.f13470d);
        aVar.a(configurationD0);
        boolean z10 = false;
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            b.f.a(aVar.getTheme());
        }
        return super.g(aVar);
    }

    void g0() {
        androidx.appcompat.view.menu.e eVar;
        r.l lVar = this.f998r;
        if (lVar != null) {
            lVar.j();
        }
        if (this.f1008w != null) {
            this.f986l.getDecorView().removeCallbacks(this.f1010x);
            if (this.f1008w.isShowing()) {
                try {
                    this.f1008w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1008w = null;
        }
        j0();
        u uVarT0 = t0(0, false);
        if (uVarT0 == null || (eVar = uVarT0.f1046j) == null) {
            return;
        }
        eVar.close();
    }

    boolean h0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f982j;
        if (((obj instanceof c.a) || (obj instanceof k.e)) && (decorView = this.f986l.getDecorView()) != null && androidx.core.view.c.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f988m.b(this.f986l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? E0(keyCode, keyEvent) : H0(keyCode, keyEvent);
    }

    void i0(int i10) {
        u uVarT0;
        u uVarT02 = t0(i10, true);
        if (uVarT02.f1046j != null) {
            Bundle bundle = new Bundle();
            uVarT02.f1046j.Q(bundle);
            if (bundle.size() > 0) {
                uVarT02.f1055s = bundle;
            }
            uVarT02.f1046j.e0();
            uVarT02.f1046j.clear();
        }
        uVarT02.f1054r = true;
        uVarT02.f1053q = true;
        if ((i10 != 108 && i10 != 0) || this.f998r == null || (uVarT0 = t0(0, false)) == null) {
            return;
        }
        uVarT0.f1049m = false;
        P0(uVarT0, null);
    }

    @Override // androidx.appcompat.app.d
    public <T extends View> T j(int i10) {
        k0();
        return (T) this.f986l.findViewById(i10);
    }

    void j0() {
        androidx.core.view.l lVar = this.f1011y;
        if (lVar != null) {
            lVar.c();
        }
    }

    @Override // androidx.appcompat.app.d
    public Context l() {
        return this.f984k;
    }

    u m0(Menu menu) {
        u[] uVarArr = this.f973a0;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            u uVar = uVarArr[i10];
            if (uVar != null && uVar.f1046j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.d
    public final k.a n() {
        return new f();
    }

    @Override // androidx.appcompat.app.d
    public int o() {
        return this.f980h0;
    }

    final Context o0() {
        androidx.appcompat.app.a aVarS = s();
        Context contextJ = aVarS != null ? aVarS.j() : null;
        return contextJ == null ? this.f984k : contextJ;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f0(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.d
    public MenuInflater q() {
        if (this.f994p == null) {
            w0();
            androidx.appcompat.app.a aVar = this.f992o;
            this.f994p = new p.f(aVar != null ? aVar.j() : this.f984k);
        }
        return this.f994p;
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.app.a s() {
        w0();
        return this.f992o;
    }

    androidx.core.os.c s0(Configuration configuration) {
        return l.b(configuration);
    }

    @Override // androidx.appcompat.app.d
    public void t() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f984k);
        if (layoutInflaterFrom.getFactory() == null) {
            o3.i.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof e) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    protected u t0(int i10, boolean z10) {
        u[] uVarArr = this.f973a0;
        if (uVarArr == null || uVarArr.length <= i10) {
            u[] uVarArr2 = new u[i10 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f973a0 = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i10];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(i10);
        uVarArr[i10] = uVar2;
        return uVar2;
    }

    @Override // androidx.appcompat.app.d
    public void u() {
        if (N0() == null || s().l()) {
            return;
        }
        A0(0);
    }

    final CharSequence u0() {
        Object obj = this.f982j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f996q;
    }

    final Window.Callback v0() {
        return this.f986l.getCallback();
    }

    @Override // androidx.appcompat.app.d
    public void x(Configuration configuration) {
        androidx.appcompat.app.a aVarS;
        if (this.G && this.A && (aVarS = s()) != null) {
            aVarS.n(configuration);
        }
        androidx.appcompat.widget.k.b().g(this.f984k);
        this.f979g0 = new Configuration(this.f984k.getResources().getConfiguration());
        S(false, false);
    }

    @Override // androidx.appcompat.app.d
    public void y(Bundle bundle) {
        this.f976d0 = true;
        R(false);
        l0();
        Object obj = this.f982j;
        if (obj instanceof Activity) {
            String strC = null;
            try {
                strC = d3.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarN0 = N0();
                if (aVarN0 == null) {
                    this.f997q0 = true;
                } else {
                    aVarN0.t(true);
                }
            }
            androidx.appcompat.app.d.d(this);
        }
        this.f979g0 = new Configuration(this.f984k.getResources().getConfiguration());
        this.f977e0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f982j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.d.F(r3)
        L9:
            boolean r0 = r3.f991n0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f986l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f995p0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f978f0 = r0
            int r0 = r3.f980h0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f982j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            z.c0<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.e.f970x0
            java.lang.Object r1 = r3.f982j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f980h0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            z.c0<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.e.f970x0
            java.lang.Object r1 = r3.f982j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f992o
            if (r0 == 0) goto L5b
            r0.o()
        L5b:
            r3.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.z():void");
    }
}
