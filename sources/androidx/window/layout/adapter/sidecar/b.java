package androidx.window.layout.adapter.sidecar;

import ae.j;
import ae.r;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.adapter.sidecar.b;
import i5.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import md.i0;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n5.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile b f5020d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.window.layout.adapter.sidecar.a f5022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<c> f5023b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5019c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ReentrantLock f5021e = new ReentrantLock();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final b a(Context context) {
            r.f(context, "context");
            if (b.f5020d == null) {
                ReentrantLock reentrantLock = b.f5021e;
                reentrantLock.lock();
                try {
                    if (b.f5020d == null) {
                        b.f5020d = new b(b.f5019c.b(context));
                    }
                    i0 i0Var = i0.f15558a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            b bVar = b.f5020d;
            r.c(bVar);
            return bVar;
        }

        public final androidx.window.layout.adapter.sidecar.a b(Context context) {
            r.f(context, "context");
            try {
                if (!c(SidecarCompat.f5007f.c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.n()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean c(k kVar) {
            return kVar != null && kVar.compareTo(k.f12550f.a()) >= 0;
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.adapter.sidecar.b$b, reason: collision with other inner class name */
    public final class C0118b implements a.InterfaceC0117a {
        public C0118b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0117a
        public void a(Activity activity, m5.k kVar) {
            r.f(activity, "activity");
            r.f(kVar, "newLayout");
            for (c cVar : b.this.g()) {
                if (r.b(cVar.d(), activity)) {
                    cVar.b(kVar);
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f5025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f5026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n3.a<m5.k> f5027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private m5.k f5028d;

        public c(Activity activity, Executor executor, n3.a<m5.k> aVar) {
            r.f(activity, "activity");
            r.f(executor, "executor");
            r.f(aVar, "callback");
            this.f5025a = activity;
            this.f5026b = executor;
            this.f5027c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c cVar, m5.k kVar) {
            r.f(cVar, "this$0");
            r.f(kVar, "$newLayoutInfo");
            cVar.f5027c.accept(kVar);
        }

        public final void b(final m5.k kVar) {
            r.f(kVar, "newLayoutInfo");
            this.f5028d = kVar;
            this.f5026b.execute(new Runnable() { // from class: p5.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.c(this.f18234a, kVar);
                }
            });
        }

        public final Activity d() {
            return this.f5025a;
        }

        public final n3.a<m5.k> e() {
            return this.f5027c;
        }

        public final m5.k f() {
            return this.f5028d;
        }
    }

    public b(androidx.window.layout.adapter.sidecar.a aVar) {
        this.f5022a = aVar;
        androidx.window.layout.adapter.sidecar.a aVar2 = this.f5022a;
        if (aVar2 != null) {
            aVar2.a(new C0118b());
        }
    }

    private final void f(Activity activity) {
        androidx.window.layout.adapter.sidecar.a aVar;
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f5023b;
        boolean z10 = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (r.b(((c) it.next()).d(), activity)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10 || (aVar = this.f5022a) == null) {
            return;
        }
        aVar.c(activity);
    }

    private final boolean h(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f5023b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (r.b(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // n5.a
    public void a(n3.a<m5.k> aVar) {
        r.f(aVar, "callback");
        synchronized (f5021e) {
            if (this.f5022a == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (c cVar : this.f5023b) {
                if (cVar.e() == aVar) {
                    r.e(cVar, "callbackWrapper");
                    arrayList.add(cVar);
                }
            }
            this.f5023b.removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f(((c) it.next()).d());
            }
            i0 i0Var = i0.f15558a;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // n5.a
    public void b(Context context, Executor executor, n3.a<m5.k> aVar) {
        Object next;
        r.f(context, "context");
        r.f(executor, "executor");
        r.f(aVar, "callback");
        i0 i0Var = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f5021e;
            reentrantLock.lock();
            try {
                androidx.window.layout.adapter.sidecar.a aVar2 = this.f5022a;
                if (aVar2 == null) {
                    aVar.accept(new m5.k(u.m()));
                    return;
                }
                boolean zH = h(activity);
                c cVar = new c(activity, executor, aVar);
                this.f5023b.add(cVar);
                if (zH) {
                    Iterator<T> it = this.f5023b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (r.b(activity, ((c) next).d())) {
                                break;
                            }
                        }
                    }
                    c cVar2 = (c) next;
                    m5.k kVarF = cVar2 != null ? cVar2.f() : null;
                    if (kVarF != null) {
                        cVar.b(kVarF);
                    }
                } else {
                    aVar2.b(activity);
                }
                i0 i0Var2 = i0.f15558a;
                reentrantLock.unlock();
                i0Var = i0.f15558a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (i0Var == null) {
            aVar.accept(new m5.k(u.m()));
        }
    }

    public final CopyOnWriteArrayList<c> g() {
        return this.f5023b;
    }
}
