package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class j<A extends a.b, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t8.d[] f8484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8486c;

    public static class a<A extends a.b, ResultT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private v8.j f8487a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t8.d[] f8489c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8488b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8490d = 0;

        /* synthetic */ a(v8.h0 h0Var) {
        }

        public j<A, ResultT> a() {
            w8.m.b(this.f8487a != null, "execute parameter required");
            return new g0(this, this.f8489c, this.f8488b, this.f8490d);
        }

        public a<A, ResultT> b(v8.j<A, TaskCompletionSource<ResultT>> jVar) {
            this.f8487a = jVar;
            return this;
        }

        public a<A, ResultT> c(boolean z10) {
            this.f8488b = z10;
            return this;
        }

        public a<A, ResultT> d(t8.d... dVarArr) {
            this.f8489c = dVarArr;
            return this;
        }

        public a<A, ResultT> e(int i10) {
            this.f8490d = i10;
            return this;
        }
    }

    protected j(t8.d[] dVarArr, boolean z10, int i10) {
        this.f8484a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f8485b = z11;
        this.f8486c = i10;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    protected abstract void b(A a10, TaskCompletionSource<ResultT> taskCompletionSource);

    public boolean c() {
        return this.f8485b;
    }

    public final int d() {
        return this.f8486c;
    }

    public final t8.d[] e() {
        return this.f8484a;
    }
}
