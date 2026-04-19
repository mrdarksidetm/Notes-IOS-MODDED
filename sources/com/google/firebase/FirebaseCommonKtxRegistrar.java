package com.google.firebase;

import ae.r;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import da.d0;
import da.g;
import da.q;
import java.util.List;
import java.util.concurrent.Executor;
import le.j0;
import le.r1;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f8879a = new a<>();

        @Override // da.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j0 a(da.d dVar) {
            Object objF = dVar.f(d0.a(y9.a.class, Executor.class));
            r.e(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return r1.a((Executor) objF);
        }
    }

    public static final class b<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f8880a = new b<>();

        @Override // da.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j0 a(da.d dVar) {
            Object objF = dVar.f(d0.a(y9.c.class, Executor.class));
            r.e(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return r1.a((Executor) objF);
        }
    }

    public static final class c<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f8881a = new c<>();

        @Override // da.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j0 a(da.d dVar) {
            Object objF = dVar.f(d0.a(y9.b.class, Executor.class));
            r.e(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return r1.a((Executor) objF);
        }
    }

    public static final class d<T> implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d<T> f8882a = new d<>();

        @Override // da.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j0 a(da.d dVar) {
            Object objF = dVar.f(d0.a(y9.d.class, Executor.class));
            r.e(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return r1.a((Executor) objF);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<da.c<?>> getComponents() {
        da.c cVarC = da.c.c(d0.a(y9.a.class, j0.class)).b(q.h(d0.a(y9.a.class, Executor.class))).d(a.f8879a).c();
        r.e(cVarC, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        da.c cVarC2 = da.c.c(d0.a(y9.c.class, j0.class)).b(q.h(d0.a(y9.c.class, Executor.class))).d(b.f8880a).c();
        r.e(cVarC2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        da.c cVarC3 = da.c.c(d0.a(y9.b.class, j0.class)).b(q.h(d0.a(y9.b.class, Executor.class))).d(c.f8881a).c();
        r.e(cVarC3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        da.c cVarC4 = da.c.c(d0.a(y9.d.class, j0.class)).b(q.h(d0.a(y9.d.class, Executor.class))).d(d.f8882a).c();
        r.e(cVarC4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return u.p(cVarC, cVarC2, cVarC3, cVarC4);
    }
}
