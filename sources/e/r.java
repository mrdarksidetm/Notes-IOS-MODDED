package e;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g;
import e.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f10112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n3.a<Boolean> f10113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.k<q> f10114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q f10115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f10116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f10117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10119h;

    static final class a extends ae.s implements zd.l<e.b, i0> {
        a() {
            super(1);
        }

        public final void a(e.b bVar) {
            ae.r.f(bVar, "backEvent");
            r.this.n(bVar);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(e.b bVar) {
            a(bVar);
            return i0.f15558a;
        }
    }

    static final class b extends ae.s implements zd.l<e.b, i0> {
        b() {
            super(1);
        }

        public final void a(e.b bVar) {
            ae.r.f(bVar, "backEvent");
            r.this.m(bVar);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(e.b bVar) {
            a(bVar);
            return i0.f15558a;
        }
    }

    static final class c extends ae.s implements zd.a<i0> {
        c() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            r.this.l();
        }
    }

    static final class d extends ae.s implements zd.a<i0> {
        d() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            r.this.k();
        }
    }

    static final class e extends ae.s implements zd.a<i0> {
        e() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            r.this.l();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f10125a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(zd.a aVar) {
            ae.r.f(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        public final OnBackInvokedCallback b(final zd.a<i0> aVar) {
            ae.r.f(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: e.s
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    r.f.c(aVar);
                }
            };
        }

        public final void d(Object obj, int i10, Object obj2) {
            ae.r.f(obj, "dispatcher");
            ae.r.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            ae.r.f(obj, "dispatcher");
            ae.r.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f10126a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zd.l<e.b, i0> f10127a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ zd.l<e.b, i0> f10128b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ zd.a<i0> f10129c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ zd.a<i0> f10130d;

            /* JADX WARN: Multi-variable type inference failed */
            a(zd.l<? super e.b, i0> lVar, zd.l<? super e.b, i0> lVar2, zd.a<i0> aVar, zd.a<i0> aVar2) {
                this.f10127a = lVar;
                this.f10128b = lVar2;
                this.f10129c = aVar;
                this.f10130d = aVar2;
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                this.f10130d.invoke();
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                this.f10129c.invoke();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(BackEvent backEvent) {
                ae.r.f(backEvent, "backEvent");
                this.f10128b.invoke(new e.b(backEvent));
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(BackEvent backEvent) {
                ae.r.f(backEvent, "backEvent");
                this.f10127a.invoke(new e.b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(zd.l<? super e.b, i0> lVar, zd.l<? super e.b, i0> lVar2, zd.a<i0> aVar, zd.a<i0> aVar2) {
            ae.r.f(lVar, "onBackStarted");
            ae.r.f(lVar2, "onBackProgressed");
            ae.r.f(aVar, "onBackInvoked");
            ae.r.f(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    private final class h implements androidx.lifecycle.i, e.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.g f10131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f10132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e.c f10133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f10134d;

        public h(r rVar, androidx.lifecycle.g gVar, q qVar) {
            ae.r.f(gVar, "lifecycle");
            ae.r.f(qVar, "onBackPressedCallback");
            this.f10134d = rVar;
            this.f10131a = gVar;
            this.f10132b = qVar;
            gVar.a(this);
        }

        @Override // e.c
        public void cancel() {
            this.f10131a.c(this);
            this.f10132b.i(this);
            e.c cVar = this.f10133c;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f10133c = null;
        }

        @Override // androidx.lifecycle.i
        public void s(o4.e eVar, g.a aVar) {
            ae.r.f(eVar, "source");
            ae.r.f(aVar, "event");
            if (aVar == g.a.ON_START) {
                this.f10133c = this.f10134d.j(this.f10132b);
                return;
            }
            if (aVar != g.a.ON_STOP) {
                if (aVar == g.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                e.c cVar = this.f10133c;
                if (cVar != null) {
                    cVar.cancel();
                }
            }
        }
    }

    private final class i implements e.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f10135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f10136b;

        public i(r rVar, q qVar) {
            ae.r.f(qVar, "onBackPressedCallback");
            this.f10136b = rVar;
            this.f10135a = qVar;
        }

        @Override // e.c
        public void cancel() {
            this.f10136b.f10114c.remove(this.f10135a);
            if (ae.r.b(this.f10136b.f10115d, this.f10135a)) {
                this.f10135a.c();
                this.f10136b.f10115d = null;
            }
            this.f10135a.i(this);
            zd.a<i0> aVarB = this.f10135a.b();
            if (aVarB != null) {
                aVarB.invoke();
            }
            this.f10135a.k(null);
        }
    }

    /* synthetic */ class j extends ae.o implements zd.a<i0> {
        j(Object obj) {
            super(0, obj, r.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((r) this.receiver).q();
        }
    }

    /* synthetic */ class k extends ae.o implements zd.a<i0> {
        k(Object obj) {
            super(0, obj, r.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((r) this.receiver).q();
        }
    }

    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public r(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ r(Runnable runnable, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? null : runnable);
    }

    public r(Runnable runnable, n3.a<Boolean> aVar) {
        this.f10112a = runnable;
        this.f10113b = aVar;
        this.f10114c = new nd.k<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f10116e = i10 >= 34 ? g.f10126a.a(new a(), new b(), new c(), new d()) : f.f10125a.b(new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        q qVarPrevious;
        q qVar = this.f10115d;
        if (qVar == null) {
            nd.k<q> kVar = this.f10114c;
            ListIterator<q> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qVarPrevious = null;
                    break;
                } else {
                    qVarPrevious = listIterator.previous();
                    if (qVarPrevious.g()) {
                        break;
                    }
                }
            }
            qVar = qVarPrevious;
        }
        this.f10115d = null;
        if (qVar != null) {
            qVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(e.b bVar) {
        q qVarPrevious;
        q qVar = this.f10115d;
        if (qVar == null) {
            nd.k<q> kVar = this.f10114c;
            ListIterator<q> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qVarPrevious = null;
                    break;
                } else {
                    qVarPrevious = listIterator.previous();
                    if (qVarPrevious.g()) {
                        break;
                    }
                }
            }
            qVar = qVarPrevious;
        }
        if (qVar != null) {
            qVar.e(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(e.b bVar) {
        q qVarPrevious;
        nd.k<q> kVar = this.f10114c;
        ListIterator<q> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                qVarPrevious = null;
                break;
            } else {
                qVarPrevious = listIterator.previous();
                if (qVarPrevious.g()) {
                    break;
                }
            }
        }
        q qVar = qVarPrevious;
        if (this.f10115d != null) {
            k();
        }
        this.f10115d = qVar;
        if (qVar != null) {
            qVar.f(bVar);
        }
    }

    private final void p(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f10117f;
        OnBackInvokedCallback onBackInvokedCallback = this.f10116e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f10118g) {
            f.f10125a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f10118g = true;
        } else {
            if (z10 || !this.f10118g) {
                return;
            }
            f.f10125a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f10118g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z10 = this.f10119h;
        nd.k<q> kVar = this.f10114c;
        boolean z11 = false;
        if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
            Iterator<q> it = kVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().g()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f10119h = z11;
        if (z11 != z10) {
            n3.a<Boolean> aVar = this.f10113b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z11);
            }
        }
    }

    public final void h(q qVar) {
        ae.r.f(qVar, "onBackPressedCallback");
        j(qVar);
    }

    public final void i(o4.e eVar, q qVar) {
        ae.r.f(eVar, "owner");
        ae.r.f(qVar, "onBackPressedCallback");
        androidx.lifecycle.g lifecycle = eVar.getLifecycle();
        if (lifecycle.b() == g.b.DESTROYED) {
            return;
        }
        qVar.a(new h(this, lifecycle, qVar));
        q();
        qVar.k(new j(this));
    }

    public final e.c j(q qVar) {
        ae.r.f(qVar, "onBackPressedCallback");
        this.f10114c.add(qVar);
        i iVar = new i(this, qVar);
        qVar.a(iVar);
        q();
        qVar.k(new k(this));
        return iVar;
    }

    public final void l() {
        q qVarPrevious;
        q qVar = this.f10115d;
        if (qVar == null) {
            nd.k<q> kVar = this.f10114c;
            ListIterator<q> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qVarPrevious = null;
                    break;
                } else {
                    qVarPrevious = listIterator.previous();
                    if (qVarPrevious.g()) {
                        break;
                    }
                }
            }
            qVar = qVarPrevious;
        }
        this.f10115d = null;
        if (qVar != null) {
            qVar.d();
            return;
        }
        Runnable runnable = this.f10112a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        ae.r.f(onBackInvokedDispatcher, "invoker");
        this.f10117f = onBackInvokedDispatcher;
        p(this.f10119h);
    }
}
