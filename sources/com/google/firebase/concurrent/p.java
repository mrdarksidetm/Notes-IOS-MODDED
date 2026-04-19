package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
class p<V> extends b3.a<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledFuture<?> f9045h;

    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.w(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v10) {
            p.this.v(v10);
        }
    }

    interface b<T> {
        void a(Throwable th);

        void set(T t10);
    }

    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f9045h = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f9045h.compareTo(delayed);
    }

    @Override // b3.a
    protected void c() {
        this.f9045h.cancel(y());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f9045h.getDelay(timeUnit);
    }
}
