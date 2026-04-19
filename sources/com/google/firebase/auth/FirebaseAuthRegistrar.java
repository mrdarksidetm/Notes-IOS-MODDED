package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import da.d0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    static /* synthetic */ FirebaseAuth lambda$getComponents$0(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, da.d dVar) {
        return new ca.e((x9.f) dVar.a(x9.f.class), dVar.c(aa.a.class), dVar.c(la.i.class), (Executor) dVar.f(d0Var), (Executor) dVar.f(d0Var2), (Executor) dVar.f(d0Var3), (ScheduledExecutorService) dVar.f(d0Var4), (Executor) dVar.f(d0Var5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<da.c<?>> getComponents() {
        final d0 d0VarA = d0.a(y9.a.class, Executor.class);
        final d0 d0VarA2 = d0.a(y9.b.class, Executor.class);
        final d0 d0VarA3 = d0.a(y9.c.class, Executor.class);
        final d0 d0VarA4 = d0.a(y9.c.class, ScheduledExecutorService.class);
        final d0 d0VarA5 = d0.a(y9.d.class, Executor.class);
        return Arrays.asList(da.c.f(FirebaseAuth.class, ca.b.class).b(da.q.i(x9.f.class)).b(da.q.j(la.i.class)).b(da.q.h(d0VarA)).b(da.q.h(d0VarA2)).b(da.q.h(d0VarA3)).b(da.q.h(d0VarA4)).b(da.q.h(d0VarA5)).b(da.q.g(aa.a.class)).d(new da.g() { // from class: com.google.firebase.auth.e
            @Override // da.g
            public final Object a(da.d dVar) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(d0VarA, d0VarA2, d0VarA3, d0VarA4, d0VarA5, dVar);
            }
        }).c(), la.h.a(), pa.h.b("fire-auth", "23.1.0"));
    }
}
