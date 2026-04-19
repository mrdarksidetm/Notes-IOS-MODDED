package bb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.g;
import java.util.ArrayList;
import java.util.HashMap;
import jc.a;
import o4.e;
import sc.c;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class c implements j.c, jc.a, kc.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f5673i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f5674j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f5675k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f5676l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kc.c f5677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bb.b f5678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Application f5679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a.b f5680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f5681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f5682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Activity f5683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j f5684h;

    class a implements c.d {
        a() {
        }

        @Override // sc.c.d
        public void a(Object obj, c.b bVar) {
            c.this.f5678b.p(bVar);
        }

        @Override // sc.c.d
        public void b(Object obj) {
            c.this.f5678b.p(null);
        }
    }

    private class b implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f5686a;

        b(Activity activity) {
            this.f5686a = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f5686a != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(e eVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(e eVar) {
            onActivityDestroyed(this.f5686a);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(e eVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(e eVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(e eVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(e eVar) {
            onActivityStopped(this.f5686a);
        }
    }

    /* JADX INFO: renamed from: bb.c$c, reason: collision with other inner class name */
    private static class C0134c implements j.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j.d f5688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f5689b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: bb.c$c$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f5690a;

            a(Object obj) {
                this.f5690a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0134c.this.f5688a.success(this.f5690a);
            }
        }

        /* JADX INFO: renamed from: bb.c$c$b */
        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f5692a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f5693b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f5694c;

            b(String str, String str2, Object obj) {
                this.f5692a = str;
                this.f5693b = str2;
                this.f5694c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0134c.this.f5688a.error(this.f5692a, this.f5693b, this.f5694c);
            }
        }

        /* JADX INFO: renamed from: bb.c$c$c, reason: collision with other inner class name */
        class RunnableC0135c implements Runnable {
            RunnableC0135c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0134c.this.f5688a.notImplemented();
            }
        }

        C0134c(j.d dVar) {
            this.f5688a = dVar;
        }

        @Override // sc.j.d
        public void error(String str, String str2, Object obj) {
            this.f5689b.post(new b(str, str2, obj));
        }

        @Override // sc.j.d
        public void notImplemented() {
            this.f5689b.post(new RunnableC0135c());
        }

        @Override // sc.j.d
        public void success(Object obj) {
            this.f5689b.post(new a(obj));
        }
    }

    private static String b(String str) {
        str.hashCode();
        switch (str) {
            case "custom":
            case "any":
                return "*/*";
            case "dir":
                return "dir";
            case "audio":
                return "audio/*";
            case "image":
                return "image/*";
            case "media":
                return "image/*,video/*";
            case "video":
                return "video/*";
            default:
                return null;
        }
    }

    private void c(sc.b bVar, Application application, Activity activity, kc.c cVar) {
        this.f5683g = activity;
        this.f5679c = application;
        this.f5678b = new bb.b(activity);
        j jVar = new j(bVar, "miguelruivo.flutter.plugins.filepicker");
        this.f5684h = jVar;
        jVar.e(this);
        new sc.c(bVar, "miguelruivo.flutter.plugins.filepickerevent").d(new a());
        this.f5682f = new b(activity);
        cVar.b(this.f5678b);
        g gVarA = nc.a.a(cVar);
        this.f5681e = gVarA;
        gVarA.a(this.f5682f);
    }

    private void d() {
        this.f5677a.d(this.f5678b);
        this.f5677a = null;
        b bVar = this.f5682f;
        if (bVar != null) {
            this.f5681e.c(bVar);
            this.f5679c.unregisterActivityLifecycleCallbacks(this.f5682f);
        }
        this.f5681e = null;
        this.f5678b.p(null);
        this.f5678b = null;
        this.f5684h.e(null);
        this.f5684h = null;
        this.f5679c = null;
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        this.f5677a = cVar;
        c(this.f5680d.b(), (Application) this.f5680d.a(), this.f5677a.getActivity(), this.f5677a);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        this.f5680d = bVar;
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        d();
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f5680d = null;
    }

    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        String[] strArrH;
        String str;
        if (this.f5683g == null) {
            dVar.error("no_activity", "file picker plugin requires a foreground activity", null);
            return;
        }
        C0134c c0134c = new C0134c(dVar);
        HashMap map = (HashMap) iVar.f20504b;
        String str2 = iVar.f20503a;
        if (str2 != null && str2.equals("clear")) {
            c0134c.success(Boolean.valueOf(d.a(this.f5683g.getApplicationContext())));
            return;
        }
        String str3 = iVar.f20503a;
        if (str3 != null && str3.equals("save")) {
            this.f5678b.o((String) map.get("fileName"), b((String) map.get("fileType")), (String) map.get("initialDirectory"), d.h((ArrayList) map.get("allowedExtensions")), (byte[]) map.get("bytes"), c0134c);
            return;
        }
        String strB = b(iVar.f20503a);
        f5673i = strB;
        if (strB != null) {
            if (strB != "dir") {
                f5674j = ((Boolean) map.get("allowMultipleSelection")).booleanValue();
                f5675k = ((Boolean) map.get("withData")).booleanValue();
                f5676l = ((Integer) map.get("compressionQuality")).intValue();
                strArrH = d.h((ArrayList) map.get("allowedExtensions"));
            }
            str = iVar.f20503a;
            if (str == null && str.equals("custom") && (strArrH == null || strArrH.length == 0)) {
                c0134c.error("FilePicker", "Unsupported filter. Make sure that you are only using the extension without the dot, (ie., jpg instead of .jpg). This could also have happened because you are using an unsupported file extension.  If the problem persists, you may want to consider using FileType.any instead.", null);
                return;
            } else {
                this.f5678b.s(f5673i, f5674j, f5675k, strArrH, f5676l, c0134c);
            }
        }
        c0134c.notImplemented();
        strArrH = null;
        str = iVar.f20503a;
        if (str == null) {
        }
        this.f5678b.s(f5673i, f5674j, f5675k, strArrH, f5676l, c0134c);
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        onAttachedToActivity(cVar);
    }
}
