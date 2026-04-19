package androidx.window.layout.adapter.sidecar;

import ae.j;
import ae.r;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import e3.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import m5.k;
import md.i0;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f5007f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SidecarInterface f5008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p5.a f5009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<IBinder, Activity> f5010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Activity, n3.a<Configuration>> f5011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f5012e;

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface sidecarInterfaceH;
            r.f(sidecarDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = SidecarCompat.this.f5010c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = SidecarCompat.f5007f.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterfaceH = sidecarCompat.h()) != null) {
                    windowLayoutInfo = sidecarInterfaceH.getWindowLayoutInfo(iBinderA);
                }
                b bVar = sidecarCompat.f5012e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.f5009b.f(windowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            r.f(iBinder, "windowToken");
            r.f(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f5010c.get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            p5.a aVar = SidecarCompat.this.f5009b;
            SidecarInterface sidecarInterfaceH = SidecarCompat.this.h();
            if (sidecarInterfaceH == null || (sidecarDeviceState = sidecarInterfaceH.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            k kVarF = aVar.f(sidecarWindowLayoutInfo, sidecarDeviceState);
            b bVar = SidecarCompat.this.f5012e;
            if (bVar != null) {
                bVar.a(activity, kVarF);
            }
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            r.f(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final i5.k c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return i5.k.f12550f.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    private static final class b implements a.InterfaceC0117a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0117a f5014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReentrantLock f5015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakHashMap<Activity, k> f5016c;

        public b(a.InterfaceC0117a interfaceC0117a) {
            r.f(interfaceC0117a, "callbackInterface");
            this.f5014a = interfaceC0117a;
            this.f5015b = new ReentrantLock();
            this.f5016c = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0117a
        public void a(Activity activity, k kVar) {
            r.f(activity, "activity");
            r.f(kVar, "newLayout");
            ReentrantLock reentrantLock = this.f5015b;
            reentrantLock.lock();
            try {
                if (r.b(kVar, this.f5016c.get(activity))) {
                    return;
                }
                this.f5016c.put(activity, kVar);
                reentrantLock.unlock();
                this.f5014a.a(activity, kVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            r.f(activity, "activity");
            ReentrantLock reentrantLock = this.f5015b;
            reentrantLock.lock();
            try {
                this.f5016c.put(activity, null);
                i0 i0Var = i0.f15558a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    private static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SidecarCompat f5017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<Activity> f5018b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            r.f(sidecarCompat, "sidecarCompat");
            r.f(activity, "activity");
            this.f5017a = sidecarCompat;
            this.f5018b = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.f(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f5018b.get();
            IBinder iBinderA = SidecarCompat.f5007f.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.f5017a.j(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.f(view, "view");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f5007f.b(context), new p5.a(null, 1, null));
        r.f(context, "context");
    }

    public SidecarCompat(SidecarInterface sidecarInterface, p5.a aVar) {
        r.f(aVar, "sidecarAdapter");
        this.f5008a = sidecarInterface;
        this.f5009b = aVar;
        this.f5010c = new LinkedHashMap();
        this.f5011d = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k(final Activity activity) {
        if (this.f5011d.get(activity) == null && (activity instanceof g)) {
            n3.a<Configuration> aVar = new n3.a() { // from class: p5.b
                @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
                public final void accept(Object obj) {
                    SidecarCompat.l(this.f18232a, activity, (Configuration) obj);
                }
            };
            this.f5011d.put(activity, aVar);
            ((g) activity).addOnConfigurationChangedListener(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SidecarCompat sidecarCompat, Activity activity, Configuration configuration) {
        r.f(sidecarCompat, "this$0");
        r.f(activity, "$activity");
        b bVar = sidecarCompat.f5012e;
        if (bVar != null) {
            bVar.a(activity, sidecarCompat.i(activity));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(Activity activity) {
        n3.a<Configuration> aVar = this.f5011d.get(activity);
        if (aVar == null) {
            return;
        }
        if (activity instanceof g) {
            ((g) activity).removeOnConfigurationChangedListener(aVar);
        }
        this.f5011d.remove(activity);
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void a(a.InterfaceC0117a interfaceC0117a) {
        r.f(interfaceC0117a, "extensionCallback");
        this.f5012e = new b(interfaceC0117a);
        SidecarInterface sidecarInterface = this.f5008a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f5009b, new TranslatingCallback()));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void b(Activity activity) {
        r.f(activity, "activity");
        IBinder iBinderA = f5007f.a(activity);
        if (iBinderA != null) {
            j(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        r.f(activity, "activity");
        IBinder iBinderA = f5007f.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f5008a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        m(activity);
        b bVar = this.f5012e;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z10 = this.f5010c.size() == 1;
        this.f5010c.remove(iBinderA);
        if (!z10 || (sidecarInterface = this.f5008a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final SidecarInterface h() {
        return this.f5008a;
    }

    public final k i(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        r.f(activity, "activity");
        IBinder iBinderA = f5007f.a(activity);
        if (iBinderA == null) {
            return new k(u.m());
        }
        SidecarInterface sidecarInterface = this.f5008a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        p5.a aVar = this.f5009b;
        SidecarInterface sidecarInterface2 = this.f5008a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return aVar.f(windowLayoutInfo, sidecarDeviceState);
    }

    public final void j(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        r.f(iBinder, "windowToken");
        r.f(activity, "activity");
        this.f5010c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f5008a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f5010c.size() == 1 && (sidecarInterface = this.f5008a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f5012e;
        if (bVar != null) {
            bVar.a(activity, i(activity));
        }
        k(activity);
    }

    public boolean n() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f5008a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            if (!r.b(returnType, Void.TYPE)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f5008a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f5008a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f5008a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!r.b(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f5008a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!r.b(returnType3, Void.TYPE)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f5008a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!r.b(returnType4, Void.TYPE)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                r.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            r.e(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                r.d(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (r.b(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
