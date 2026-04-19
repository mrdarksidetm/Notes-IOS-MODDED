package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.w;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.loader.app.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import o4.e;
import o4.h;
import o4.i;
import s4.b;
import z.d0;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f4406c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f4407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f4408b;

    public static class a<D> extends h<D> implements b.InterfaceC0411b<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f4409l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Bundle f4410m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final s4.b<D> f4411n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private e f4412o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private C0107b<D> f4413p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private s4.b<D> f4414q;

        a(int i10, Bundle bundle, s4.b<D> bVar, s4.b<D> bVar2) {
            this.f4409l = i10;
            this.f4410m = bundle;
            this.f4411n = bVar;
            this.f4414q = bVar2;
            bVar.r(i10, this);
        }

        @Override // s4.b.InterfaceC0411b
        public void a(s4.b<D> bVar, D d10) {
            if (b.f4406c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(d10);
                return;
            }
            if (b.f4406c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(d10);
        }

        @Override // androidx.lifecycle.l
        protected void j() {
            if (b.f4406c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f4411n.u();
        }

        @Override // androidx.lifecycle.l
        protected void k() {
            if (b.f4406c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f4411n.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.l
        public void m(i<? super D> iVar) {
            super.m(iVar);
            this.f4412o = null;
            this.f4413p = null;
        }

        @Override // o4.h, androidx.lifecycle.l
        public void n(D d10) {
            super.n(d10);
            s4.b<D> bVar = this.f4414q;
            if (bVar != null) {
                bVar.s();
                this.f4414q = null;
            }
        }

        s4.b<D> o(boolean z10) {
            if (b.f4406c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f4411n.b();
            this.f4411n.a();
            C0107b<D> c0107b = this.f4413p;
            if (c0107b != null) {
                m(c0107b);
                if (z10) {
                    c0107b.d();
                }
            }
            this.f4411n.w(this);
            if ((c0107b == null || c0107b.c()) && !z10) {
                return this.f4411n;
            }
            this.f4411n.s();
            return this.f4414q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4409l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4410m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4411n);
            this.f4411n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f4413p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f4413p);
                this.f4413p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        s4.b<D> q() {
            return this.f4411n;
        }

        void r() {
            e eVar = this.f4412o;
            C0107b<D> c0107b = this.f4413p;
            if (eVar == null || c0107b == null) {
                return;
            }
            super.m(c0107b);
            h(eVar, c0107b);
        }

        s4.b<D> s(e eVar, a.InterfaceC0106a<D> interfaceC0106a) {
            C0107b<D> c0107b = new C0107b<>(this.f4411n, interfaceC0106a);
            h(eVar, c0107b);
            C0107b<D> c0107b2 = this.f4413p;
            if (c0107b2 != null) {
                m(c0107b2);
            }
            this.f4412o = eVar;
            this.f4413p = c0107b;
            return this.f4411n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f4409l);
            sb2.append(" : ");
            Class<?> cls = this.f4411n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0107b<D> implements i<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s4.b<D> f4415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a.InterfaceC0106a<D> f4416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4417c = false;

        C0107b(s4.b<D> bVar, a.InterfaceC0106a<D> interfaceC0106a) {
            this.f4415a = bVar;
            this.f4416b = interfaceC0106a;
        }

        @Override // o4.i
        public void a(D d10) {
            if (b.f4406c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f4415a + ": " + this.f4415a.d(d10));
            }
            this.f4417c = true;
            this.f4416b.a(this.f4415a, d10);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f4417c);
        }

        boolean c() {
            return this.f4417c;
        }

        void d() {
            if (this.f4417c) {
                if (b.f4406c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f4415a);
                }
                this.f4416b.c(this.f4415a);
            }
        }

        public String toString() {
            return this.f4416b.toString();
        }
    }

    static class c extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final y.b f4418c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d0<a> f4419a = new d0<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f4420b = false;

        static class a implements y.b {
            a() {
            }

            @Override // androidx.lifecycle.y.b
            public <T extends w> T create(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c c(z zVar) {
            return (c) new y(zVar, f4418c).a(c.class);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4419a.j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f4419a.j(); i10++) {
                    a aVarK = this.f4419a.k(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4419a.h(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarK.toString());
                    aVarK.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void b() {
            this.f4420b = false;
        }

        <D> a<D> d(int i10) {
            return this.f4419a.f(i10);
        }

        boolean e() {
            return this.f4420b;
        }

        void f() {
            int iJ = this.f4419a.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                this.f4419a.k(i10).r();
            }
        }

        void g(int i10, a aVar) {
            this.f4419a.i(i10, aVar);
        }

        void h() {
            this.f4420b = true;
        }

        @Override // androidx.lifecycle.w
        protected void onCleared() {
            super.onCleared();
            int iJ = this.f4419a.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                this.f4419a.k(i10).o(true);
            }
            this.f4419a.c();
        }
    }

    b(e eVar, z zVar) {
        this.f4407a = eVar;
        this.f4408b = c.c(zVar);
    }

    private <D> s4.b<D> e(int i10, Bundle bundle, a.InterfaceC0106a<D> interfaceC0106a, s4.b<D> bVar) {
        try {
            this.f4408b.h();
            s4.b<D> bVarB = interfaceC0106a.b(i10, bundle);
            if (bVarB == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarB.getClass().isMemberClass() && !Modifier.isStatic(bVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarB);
            }
            a aVar = new a(i10, bundle, bVarB, bVar);
            if (f4406c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f4408b.g(i10, aVar);
            this.f4408b.b();
            return aVar.s(this.f4407a, interfaceC0106a);
        } catch (Throwable th) {
            this.f4408b.b();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4408b.a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public <D> s4.b<D> c(int i10, Bundle bundle, a.InterfaceC0106a<D> interfaceC0106a) {
        if (this.f4408b.e()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarD = this.f4408b.d(i10);
        if (f4406c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarD == null) {
            return e(i10, bundle, interfaceC0106a, null);
        }
        if (f4406c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarD);
        }
        return aVarD.s(this.f4407a, interfaceC0106a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f4408b.f();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f4407a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
