package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f8458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f8459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile a f8460c;

    public static final class a<L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f8461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8462b;

        a(L l10, String str) {
            this.f8461a = l10;
            this.f8462b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8461a == aVar.f8461a && this.f8462b.equals(aVar.f8462b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f8461a) * 31) + this.f8462b.hashCode();
        }
    }

    public interface b<L> {
        void notifyListener(L l10);

        void onNotifyListenerFailed();
    }

    e(Looper looper, L l10, String str) {
        this.f8458a = new f9.a(looper);
        this.f8459b = w8.m.l(l10, "Listener must not be null");
        this.f8460c = new a(l10, w8.m.e(str));
    }

    e(Executor executor, L l10, String str) {
        this.f8458a = (Executor) w8.m.l(executor, "Executor must not be null");
        this.f8459b = w8.m.l(l10, "Listener must not be null");
        this.f8460c = new a(l10, w8.m.e(str));
    }

    public void a() {
        this.f8459b = null;
        this.f8460c = null;
    }

    public a<L> b() {
        return this.f8460c;
    }

    public void c(final b<? super L> bVar) {
        w8.m.l(bVar, "Notifier must not be null");
        this.f8458a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8427a.d(bVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void d(b bVar) {
        Object obj = this.f8459b;
        if (obj == null) {
            bVar.onNotifyListenerFailed();
            return;
        }
        try {
            bVar.notifyListener(obj);
        } catch (RuntimeException e10) {
            bVar.onNotifyListenerFailed();
            throw e10;
        }
    }
}
