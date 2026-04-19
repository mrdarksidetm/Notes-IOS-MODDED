package androidx.lifecycle;

import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class l<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f4339k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f4340a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t.b<o4.i<? super T>, l<T>.d> f4341b = new t.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f4342c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f4344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f4345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f4349j;

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (l.this.f4340a) {
                obj = l.this.f4345f;
                l.this.f4345f = l.f4339k;
            }
            l.this.n(obj);
        }
    }

    private class b extends l<T>.d {
        b(o4.i<? super T> iVar) {
            super(iVar);
        }

        @Override // androidx.lifecycle.l.d
        boolean d() {
            return true;
        }
    }

    class c extends l<T>.d implements i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final o4.e f4352e;

        c(o4.e eVar, o4.i<? super T> iVar) {
            super(iVar);
            this.f4352e = eVar;
        }

        @Override // androidx.lifecycle.l.d
        void b() {
            this.f4352e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.l.d
        boolean c(o4.e eVar) {
            return this.f4352e == eVar;
        }

        @Override // androidx.lifecycle.l.d
        boolean d() {
            return this.f4352e.getLifecycle().b().b(g.b.STARTED);
        }

        @Override // androidx.lifecycle.i
        public void s(o4.e eVar, g.a aVar) {
            g.b bVarB = this.f4352e.getLifecycle().b();
            if (bVarB == g.b.DESTROYED) {
                l.this.m(this.f4354a);
                return;
            }
            g.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f4352e.getLifecycle().b();
            }
        }
    }

    private abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final o4.i<? super T> f4354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f4355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4356c = -1;

        d(o4.i<? super T> iVar) {
            this.f4354a = iVar;
        }

        void a(boolean z10) {
            if (z10 == this.f4355b) {
                return;
            }
            this.f4355b = z10;
            l.this.c(z10 ? 1 : -1);
            if (this.f4355b) {
                l.this.e(this);
            }
        }

        void b() {
        }

        boolean c(o4.e eVar) {
            return false;
        }

        abstract boolean d();
    }

    public l() {
        Object obj = f4339k;
        this.f4345f = obj;
        this.f4349j = new a();
        this.f4344e = obj;
        this.f4346g = -1;
    }

    static void b(String str) {
        if (s.c.f().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(l<T>.d dVar) {
        if (dVar.f4355b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f4356c;
            int i11 = this.f4346g;
            if (i10 >= i11) {
                return;
            }
            dVar.f4356c = i11;
            dVar.f4354a.a((Object) this.f4344e);
        }
    }

    void c(int i10) {
        int i11 = this.f4342c;
        this.f4342c = i10 + i11;
        if (this.f4343d) {
            return;
        }
        this.f4343d = true;
        while (true) {
            try {
                int i12 = this.f4342c;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    j();
                } else if (z11) {
                    k();
                }
                i11 = i12;
            } finally {
                this.f4343d = false;
            }
        }
    }

    void e(l<T>.d dVar) {
        if (this.f4347h) {
            this.f4348i = true;
            return;
        }
        this.f4347h = true;
        do {
            this.f4348i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                t.b<o4.i<? super T>, l<T>.d>.d dVarD = this.f4341b.d();
                while (dVarD.hasNext()) {
                    d((d) dVarD.next().getValue());
                    if (this.f4348i) {
                        break;
                    }
                }
            }
        } while (this.f4348i);
        this.f4347h = false;
    }

    public T f() {
        T t10 = (T) this.f4344e;
        if (t10 != f4339k) {
            return t10;
        }
        return null;
    }

    public boolean g() {
        return this.f4342c > 0;
    }

    public void h(o4.e eVar, o4.i<? super T> iVar) {
        b("observe");
        if (eVar.getLifecycle().b() == g.b.DESTROYED) {
            return;
        }
        c cVar = new c(eVar, iVar);
        l<T>.d dVarL = this.f4341b.l(iVar, cVar);
        if (dVarL != null && !dVarL.c(eVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarL != null) {
            return;
        }
        eVar.getLifecycle().a(cVar);
    }

    public void i(o4.i<? super T> iVar) {
        b("observeForever");
        b bVar = new b(iVar);
        l<T>.d dVarL = this.f4341b.l(iVar, bVar);
        if (dVarL instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarL != null) {
            return;
        }
        bVar.a(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l(T t10) {
        boolean z10;
        synchronized (this.f4340a) {
            z10 = this.f4345f == f4339k;
            this.f4345f = t10;
        }
        if (z10) {
            s.c.f().c(this.f4349j);
        }
    }

    public void m(o4.i<? super T> iVar) {
        b("removeObserver");
        l<T>.d dVarN = this.f4341b.n(iVar);
        if (dVarN == null) {
            return;
        }
        dVarN.b();
        dVarN.a(false);
    }

    protected void n(T t10) {
        b("setValue");
        this.f4346g++;
        this.f4344e = t10;
        e(null);
    }
}
