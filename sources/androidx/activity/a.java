package androidx.activity;

import ae.r;
import ae.s;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.a;
import androidx.lifecycle.g;
import androidx.lifecycle.t;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import d3.x;
import d3.y;
import e.o;
import e.p;
import e.u;
import e.w;
import i.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import md.i0;
import md.l;
import o3.b0;
import o3.k;
import o3.n;
import o4.q;
import q4.a;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.core.app.e implements q, androidx.lifecycle.e, x4.f, u, h.g, h.c, e3.g, e3.h, x, y, k, p {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c(null);
    private z _viewModelStore;
    private final h.f activityResultRegistry;
    private int contentLayoutId;
    private final g.a contextAwareHelper;
    private final l defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final l fullyDrawnReporter$delegate;
    private final n menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final l onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<n3.a<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<n3.a<d3.g>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<n3.a<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<n3.a<d3.z>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<n3.a<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final e reportFullyDrawnExecutor;
    private final x4.e savedStateRegistryController;

    /* JADX INFO: renamed from: androidx.activity.a$a, reason: collision with other inner class name */
    public static final class C0022a implements androidx.lifecycle.i {
        C0022a() {
        }

        @Override // androidx.lifecycle.i
        public void s(o4.e eVar, g.a aVar) {
            r.f(eVar, "source");
            r.f(aVar, "event");
            a.this.ensureViewModelStore();
            a.this.getLifecycle().c(this);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f871a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            r.f(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            r.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    private static final class c {
        private c() {
        }

        public /* synthetic */ c(ae.j jVar) {
            this();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private z f873b;

        public final Object a() {
            return this.f872a;
        }

        public final z b() {
            return this.f873b;
        }

        public final void c(Object obj) {
            this.f872a = obj;
        }

        public final void d(z zVar) {
            this.f873b = zVar;
        }
    }

    private interface e extends Executor {
        void I(View view);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f874a = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f876c;

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(f fVar) {
            r.f(fVar, "this$0");
            Runnable runnable = fVar.f875b;
            if (runnable != null) {
                r.c(runnable);
                runnable.run();
                fVar.f875b = null;
            }
        }

        @Override // androidx.activity.a.e
        public void I(View view) {
            r.f(view, "view");
            if (this.f876c) {
                return;
            }
            this.f876c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // androidx.activity.a.e
        public void b() {
            a.this.getWindow().getDecorView().removeCallbacks(this);
            a.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            r.f(runnable, "runnable");
            this.f875b = runnable;
            View decorView = a.this.getWindow().getDecorView();
            r.e(decorView, "window.decorView");
            if (!this.f876c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.f.c(this.f883a);
                    }
                });
            } else if (r.b(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f875b;
            if (runnable != null) {
                runnable.run();
                this.f875b = null;
                if (!a.this.getFullyDrawnReporter().c()) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f874a) {
                return;
            }
            this.f876c = false;
            a.this.getWindow().getDecorView().post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static final class g extends h.f {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(g gVar, int i10, a.C0292a c0292a) {
            r.f(gVar, "this$0");
            gVar.f(i10, c0292a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
            r.f(gVar, "this$0");
            r.f(sendIntentException, "$e");
            gVar.e(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // h.f
        public <I, O> void i(final int i10, i.a<I, O> aVar, I i11, d3.c cVar) {
            r.f(aVar, "contract");
            a aVar2 = a.this;
            final a.C0292a<O> synchronousResult = aVar.getSynchronousResult(aVar2, i11);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.g.s(this.f10090a, i10, synchronousResult);
                    }
                });
                return;
            }
            Intent intentCreateIntent = aVar.createIntent(aVar2, i11);
            Bundle bundleB = null;
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                r.c(extras);
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(aVar2.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleB = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (cVar != null) {
                bundleB = cVar.b();
            }
            Bundle bundle = bundleB;
            if (r.b("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.a.g(aVar2, stringArrayExtra, i10);
                return;
            }
            if (!r.b("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentCreateIntent.getAction())) {
                androidx.core.app.a.k(aVar2, intentCreateIntent, i10, bundle);
                return;
            }
            h.h hVar = (h.h) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                r.c(hVar);
                androidx.core.app.a.l(aVar2, hVar.e(), i10, hVar.a(), hVar.b(), hVar.d(), 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.g.t(this.f10093a, i10, e10);
                    }
                });
            }
        }
    }

    static final class h extends s implements zd.a<androidx.lifecycle.u> {
        h() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.u invoke() {
            Application application = a.this.getApplication();
            a aVar = a.this;
            return new androidx.lifecycle.u(application, aVar, aVar.getIntent() != null ? a.this.getIntent().getExtras() : null);
        }
    }

    static final class i extends s implements zd.a<o> {

        /* JADX INFO: renamed from: androidx.activity.a$i$a, reason: collision with other inner class name */
        static final class C0023a extends s implements zd.a<i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f881a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0023a(a aVar) {
                super(0);
                this.f881a = aVar;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f881a.reportFullyDrawn();
            }
        }

        i() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return new o(a.this.reportFullyDrawnExecutor, new C0023a(a.this));
        }
    }

    static final class j extends s implements zd.a<e.r> {
        j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(a aVar) {
            r.f(aVar, "this$0");
            try {
                a.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!r.b(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!r.b(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a aVar, e.r rVar) {
            r.f(aVar, "this$0");
            r.f(rVar, "$dispatcher");
            aVar.addObserverForBackInvoker(rVar);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final e.r invoke() {
            final a aVar = a.this;
            final e.r rVar = new e.r(new Runnable() { // from class: androidx.activity.c
                @Override // java.lang.Runnable
                public final void run() {
                    a.j.d(aVar);
                }
            });
            final a aVar2 = a.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (r.b(Looper.myLooper(), Looper.getMainLooper())) {
                    aVar2.addObserverForBackInvoker(rVar);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.j.e(aVar2, rVar);
                        }
                    });
                }
            }
            return rVar;
        }
    }

    public a() {
        this.contextAwareHelper = new g.a();
        this.menuHostHelper = new n(new Runnable() { // from class: e.e
            @Override // java.lang.Runnable
            public final void run() {
                androidx.activity.a.menuHostHelper$lambda$0(this.f10085a);
            }
        });
        x4.e eVarA = x4.e.f22970d.a(this);
        this.savedStateRegistryController = eVarA;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = md.n.b(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
        }
        getLifecycle().a(new androidx.lifecycle.i() { // from class: e.f
            @Override // androidx.lifecycle.i
            public final void s(o4.e eVar, g.a aVar) {
                androidx.activity.a._init_$lambda$2(this.f10086a, eVar, aVar);
            }
        });
        getLifecycle().a(new androidx.lifecycle.i() { // from class: e.g
            @Override // androidx.lifecycle.i
            public final void s(o4.e eVar, g.a aVar) {
                androidx.activity.a._init_$lambda$3(this.f10087a, eVar, aVar);
            }
        });
        getLifecycle().a(new C0022a());
        eVarA.c();
        t.c(this);
        getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new d.c() { // from class: e.h
            @Override // x4.d.c
            public final Bundle a() {
                return androidx.activity.a._init_$lambda$4(this.f10088a);
            }
        });
        addOnContextAvailableListener(new g.b() { // from class: e.i
            @Override // g.b
            public final void a(Context context) {
                androidx.activity.a._init_$lambda$5(this.f10089a, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = md.n.b(new h());
        this.onBackPressedDispatcher$delegate = md.n.b(new j());
    }

    public a(int i10) {
        this();
        this.contentLayoutId = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(a aVar, o4.e eVar, g.a aVar2) {
        Window window;
        View viewPeekDecorView;
        r.f(aVar, "this$0");
        r.f(eVar, "<anonymous parameter 0>");
        r.f(aVar2, "event");
        if (aVar2 != g.a.ON_STOP || (window = aVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(a aVar, o4.e eVar, g.a aVar2) {
        r.f(aVar, "this$0");
        r.f(eVar, "<anonymous parameter 0>");
        r.f(aVar2, "event");
        if (aVar2 == g.a.ON_DESTROY) {
            aVar.contextAwareHelper.b();
            if (!aVar.isChangingConfigurations()) {
                aVar.getViewModelStore().a();
            }
            aVar.reportFullyDrawnExecutor.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(a aVar) {
        r.f(aVar, "this$0");
        Bundle bundle = new Bundle();
        aVar.activityResultRegistry.k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(a aVar, Context context) {
        r.f(aVar, "this$0");
        r.f(context, "it");
        Bundle bundleB = aVar.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (bundleB != null) {
            aVar.activityResultRegistry.j(bundleB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final e.r rVar) {
        getLifecycle().a(new androidx.lifecycle.i() { // from class: e.d
            @Override // androidx.lifecycle.i
            public final void s(o4.e eVar, g.a aVar) {
                androidx.activity.a.addObserverForBackInvoker$lambda$7(rVar, this, eVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(e.r rVar, a aVar, o4.e eVar, g.a aVar2) {
        r.f(rVar, "$dispatcher");
        r.f(aVar, "this$0");
        r.f(eVar, "<anonymous parameter 0>");
        r.f(aVar2, "event");
        if (aVar2 == g.a.ON_CREATE) {
            rVar.o(b.f871a.a(aVar));
        }
    }

    private final e createFullyDrawnExecutor() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new z();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(a aVar) {
        r.f(aVar, "this$0");
        aVar.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        r.e(decorView, "window.decorView");
        eVar.I(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // o3.k
    public void addMenuProvider(b0 b0Var) {
        r.f(b0Var, "provider");
        this.menuHostHelper.c(b0Var);
    }

    public void addMenuProvider(b0 b0Var, o4.e eVar) {
        r.f(b0Var, "provider");
        r.f(eVar, "owner");
        this.menuHostHelper.d(b0Var, eVar);
    }

    public void addMenuProvider(b0 b0Var, o4.e eVar, g.b bVar) {
        r.f(b0Var, "provider");
        r.f(eVar, "owner");
        r.f(bVar, "state");
        this.menuHostHelper.e(b0Var, eVar, bVar);
    }

    @Override // e3.g
    public final void addOnConfigurationChangedListener(n3.a<Configuration> aVar) {
        r.f(aVar, "listener");
        this.onConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(g.b bVar) {
        r.f(bVar, "listener");
        this.contextAwareHelper.a(bVar);
    }

    @Override // d3.x
    public final void addOnMultiWindowModeChangedListener(n3.a<d3.g> aVar) {
        r.f(aVar, "listener");
        this.onMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(n3.a<Intent> aVar) {
        r.f(aVar, "listener");
        this.onNewIntentListeners.add(aVar);
    }

    @Override // d3.y
    public final void addOnPictureInPictureModeChangedListener(n3.a<d3.z> aVar) {
        r.f(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // e3.h
    public final void addOnTrimMemoryListener(n3.a<Integer> aVar) {
        r.f(aVar, "listener");
        this.onTrimMemoryListeners.add(aVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        r.f(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // h.g
    public final h.f getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.e
    public q4.a getDefaultViewModelCreationExtras() {
        q4.b bVar = new q4.b(null, 1, null);
        if (getApplication() != null) {
            a.b<Application> bVar2 = y.a.f4399e;
            Application application = getApplication();
            r.e(application, "application");
            bVar.c(bVar2, application);
        }
        bVar.c(t.f4385a, this);
        bVar.c(t.f4386b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            bVar.c(t.f4387c, extras);
        }
        return bVar;
    }

    @Override // androidx.lifecycle.e
    public y.b getDefaultViewModelProviderFactory() {
        return (y.b) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public o getFullyDrawnReporter() {
        return (o) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // androidx.core.app.e, o4.e
    public androidx.lifecycle.g getLifecycle() {
        return super.getLifecycle();
    }

    @Override // e.u
    public final e.r getOnBackPressedDispatcher() {
        return (e.r) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // x4.f
    public final x4.d getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // o4.q
    public z getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
        }
        ensureViewModelStore();
        z zVar = this._viewModelStore;
        r.c(zVar);
        return zVar;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        r.e(decorView, "window.decorView");
        o4.r.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        r.e(decorView2, "window.decorView");
        o4.s.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        r.e(decorView3, "window.decorView");
        x4.g.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        r.e(decorView4, "window.decorView");
        e.x.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        r.e(decorView5, "window.decorView");
        w.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.e(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        r.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<n3.a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.e, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.p.f4372b.c(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        r.f(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.menuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        r.f(menuItem, "item");
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<n3.a<d3.g>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new d3.g(z10));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        r.f(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<n3.a<d3.g>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new d3.g(z10, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        r.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator<n3.a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        r.f(menu, "menu");
        this.menuHostHelper.i(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<n3.a<d3.z>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new d3.z(z10));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        r.f(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<n3.a<d3.z>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new d3.z(z10, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        r.f(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.menuHostHelper.k(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        r.f(strArr, "permissions");
        r.f(iArr, "grantResults");
        if (this.activityResultRegistry.e(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        z zVarB = this._viewModelStore;
        if (zVarB == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            zVarB = dVar.b();
        }
        if (zVarB == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.c(objOnRetainCustomNonConfigurationInstance);
        dVar2.d(zVarB);
        return dVar2;
    }

    @Override // androidx.core.app.e, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        r.f(bundle, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.j) {
            androidx.lifecycle.g lifecycle = getLifecycle();
            r.d(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.j) lifecycle).m(g.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<n3.a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    @Override // h.c
    public final <I, O> h.d<I> registerForActivityResult(i.a<I, O> aVar, h.b<O> bVar) {
        r.f(aVar, "contract");
        r.f(bVar, "callback");
        return registerForActivityResult(aVar, this.activityResultRegistry, bVar);
    }

    public final <I, O> h.d<I> registerForActivityResult(i.a<I, O> aVar, h.f fVar, h.b<O> bVar) {
        r.f(aVar, "contract");
        r.f(fVar, "registry");
        r.f(bVar, "callback");
        return fVar.m("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    @Override // o3.k
    public void removeMenuProvider(b0 b0Var) {
        r.f(b0Var, "provider");
        this.menuHostHelper.l(b0Var);
    }

    @Override // e3.g
    public final void removeOnConfigurationChangedListener(n3.a<Configuration> aVar) {
        r.f(aVar, "listener");
        this.onConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(g.b bVar) {
        r.f(bVar, "listener");
        this.contextAwareHelper.e(bVar);
    }

    @Override // d3.x
    public final void removeOnMultiWindowModeChangedListener(n3.a<d3.g> aVar) {
        r.f(aVar, "listener");
        this.onMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(n3.a<Intent> aVar) {
        r.f(aVar, "listener");
        this.onNewIntentListeners.remove(aVar);
    }

    @Override // d3.y
    public final void removeOnPictureInPictureModeChangedListener(n3.a<d3.z> aVar) {
        r.f(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // e3.h
    public final void removeOnTrimMemoryListener(n3.a<Integer> aVar) {
        r.f(aVar, "listener");
        this.onTrimMemoryListeners.remove(aVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        r.f(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (b5.a.h()) {
                b5.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
        } finally {
            b5.a.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        r.e(decorView, "window.decorView");
        eVar.I(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        r.e(decorView, "window.decorView");
        eVar.I(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        r.e(decorView, "window.decorView");
        eVar.I(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        r.f(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        r.f(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        r.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        r.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
