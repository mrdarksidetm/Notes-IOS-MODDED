package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public class h<A extends a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<A, L> f8470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f8471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f8472c;

    public static class a<A extends a.b, L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private v8.j f8473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v8.j f8474b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f8476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private t8.d[] f8477e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f8479g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f8475c = new Runnable() { // from class: v8.z
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f8478f = true;

        /* synthetic */ a(v8.a0 a0Var) {
        }

        public h<A, L> a() {
            w8.m.b(this.f8473a != null, "Must set register function");
            w8.m.b(this.f8474b != null, "Must set unregister function");
            w8.m.b(this.f8476d != null, "Must set holder");
            return new h<>(new d0(this, this.f8476d, this.f8477e, this.f8478f, this.f8479g), new e0(this, (e.a) w8.m.l(this.f8476d.b(), "Key must not be null")), this.f8475c, null);
        }

        public a<A, L> b(v8.j<A, TaskCompletionSource<Void>> jVar) {
            this.f8473a = jVar;
            return this;
        }

        public a<A, L> c(boolean z10) {
            this.f8478f = z10;
            return this;
        }

        public a<A, L> d(t8.d... dVarArr) {
            this.f8477e = dVarArr;
            return this;
        }

        public a<A, L> e(int i10) {
            this.f8479g = i10;
            return this;
        }

        public a<A, L> f(v8.j<A, TaskCompletionSource<Boolean>> jVar) {
            this.f8474b = jVar;
            return this;
        }

        public a<A, L> g(e<L> eVar) {
            this.f8476d = eVar;
            return this;
        }
    }

    /* synthetic */ h(g gVar, k kVar, Runnable runnable, v8.b0 b0Var) {
        this.f8470a = gVar;
        this.f8471b = kVar;
        this.f8472c = runnable;
    }

    public static <A extends a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
