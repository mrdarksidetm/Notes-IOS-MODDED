package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jc.a;
import x9.f;
import x9.n;

/* JADX INFO: loaded from: classes2.dex */
public class a implements jc.a, b.InterfaceC0314b, b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map<String, String> f13101c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13103b = false;

    private Task<b.f> D(final f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: zc.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f24343a.G(fVar, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private b.e E(n nVar) {
        b.e.a aVar = new b.e.a();
        aVar.b(nVar.b());
        aVar.c(nVar.c());
        if (nVar.f() != null) {
            aVar.e(nVar.f());
        }
        if (nVar.g() != null) {
            aVar.f(nVar.g());
        }
        aVar.d(nVar.d());
        aVar.g(nVar.h());
        aVar.h(nVar.e());
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                f.o(str).i();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(f fVar, TaskCompletionSource taskCompletionSource) {
        try {
            b.f.a aVar = new b.f.a();
            aVar.c(fVar.p());
            aVar.d(E(fVar.q()));
            aVar.b(Boolean.valueOf(fVar.w()));
            aVar.e((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(fVar)));
            taskCompletionSource.setResult(aVar.a());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(b.e eVar, String str, TaskCompletionSource taskCompletionSource) {
        try {
            n nVarA = new n.b().b(eVar.b()).c(eVar.c()).d(eVar.e()).f(eVar.f()).g(eVar.g()).h(eVar.h()).e(eVar.i()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (eVar.d() != null) {
                f13101c.put(str, eVar.d());
            }
            taskCompletionSource.setResult((b.f) Tasks.await(D(f.v(this.f13102a, nVarA, str))));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(TaskCompletionSource taskCompletionSource) {
        try {
            if (this.f13103b) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.f13103b = true;
            }
            List<f> listM = f.m(this.f13102a);
            ArrayList arrayList = new ArrayList(listM.size());
            Iterator<f> it = listM.iterator();
            while (it.hasNext()) {
                arrayList.add((b.f) Tasks.await(D(it.next())));
            }
            taskCompletionSource.setResult(arrayList);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(b.g gVar, Task task) {
        if (task.isSuccessful()) {
            gVar.success(task.getResult());
        } else {
            gVar.a(task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(TaskCompletionSource taskCompletionSource) {
        try {
            n nVarA = n.a(this.f13102a);
            if (nVarA == null) {
                taskCompletionSource.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
            } else {
                taskCompletionSource.setResult(E(nVarA));
            }
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            f.o(str).E(bool);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            f.o(str).D(bool.booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private <T> void N(TaskCompletionSource<T> taskCompletionSource, final b.g<T> gVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: zc.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                io.flutter.plugins.firebase.core.a.J(gVar, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.b.InterfaceC0314b
    public void b(final String str, final b.e eVar, b.g<b.f> gVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: zc.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f24332a.H(eVar, str, taskCompletionSource);
            }
        });
        N(taskCompletionSource, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.b.InterfaceC0314b
    public void c(b.g<List<b.f>> gVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: zc.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f24330a.I(taskCompletionSource);
            }
        });
        N(taskCompletionSource, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.b.InterfaceC0314b
    public void d(b.g<b.e> gVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: zc.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f24328a.K(taskCompletionSource);
            }
        });
        N(taskCompletionSource, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.b.a
    public void j(final String str, final Boolean bool, b.g<Void> gVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: zc.f
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.core.a.M(str, bool, taskCompletionSource);
            }
        });
        N(taskCompletionSource, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.b.a
    public void k(final String str, b.g<Void> gVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: zc.a
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.core.a.F(str, taskCompletionSource);
            }
        });
        N(taskCompletionSource, gVar);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        b.InterfaceC0314b.f(bVar.b(), this);
        b.a.e(bVar.b(), this);
        this.f13102a = bVar.a();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f13102a = null;
        b.InterfaceC0314b.f(bVar.b(), null);
        b.a.e(bVar.b(), null);
    }

    @Override // io.flutter.plugins.firebase.core.b.a
    public void r(final String str, final Boolean bool, b.g<Void> gVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: zc.e
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.core.a.L(str, bool, taskCompletionSource);
            }
        });
        N(taskCompletionSource, gVar);
    }
}
