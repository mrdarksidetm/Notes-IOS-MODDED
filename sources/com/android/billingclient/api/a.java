package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0173a {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile g f8017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f8018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile v6.m f8019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile v6.p f8020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile boolean f8021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private volatile boolean f8022f;

        /* synthetic */ b(Context context, v6.x0 x0Var) {
            this.f8018b = context;
        }

        public a a() {
            if (this.f8018b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f8019c != null) {
                if (this.f8017a == null || !this.f8017a.a()) {
                    throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
                }
                return this.f8019c != null ? this.f8020d == null ? new com.android.billingclient.api.b((String) null, this.f8017a, this.f8018b, this.f8019c, (v6.a0) null, (d0) null, (ExecutorService) null) : new com.android.billingclient.api.b((String) null, this.f8017a, this.f8018b, this.f8019c, this.f8020d, (d0) null, (ExecutorService) null) : new com.android.billingclient.api.b(null, this.f8017a, this.f8018b, null, null, null);
            }
            if (this.f8020d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
            }
            if (this.f8021e || this.f8022f) {
                return new com.android.billingclient.api.b(null, this.f8018b, null, null);
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }

        @Deprecated
        public b b() {
            g.a aVarC = g.c();
            aVarC.b();
            c(aVarC.a());
            return this;
        }

        public b c(g gVar) {
            this.f8017a = gVar;
            return this;
        }

        public b d(v6.m mVar) {
            this.f8019c = mVar;
            return this;
        }
    }

    public static b h(Context context) {
        return new b(context, null);
    }

    public abstract void a(v6.a aVar, v6.b bVar);

    public abstract void b(v6.e eVar, v6.f fVar);

    public abstract void c();

    public abstract void d(v6.g gVar, v6.d dVar);

    public abstract e e(String str);

    public abstract boolean f();

    public abstract e g(Activity activity, d dVar);

    public abstract void i(i iVar, v6.j jVar);

    @Deprecated
    public abstract void j(v6.n nVar, v6.k kVar);

    public abstract void k(v6.o oVar, v6.l lVar);

    public abstract e l(Activity activity, f fVar, v6.h hVar);

    public abstract void m(v6.c cVar);
}
