package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<T extends IInterface> extends b<T> implements a.f {
    private static volatile Executor zaa;
    private final w8.c zab;
    private final Set zac;
    private final Account zad;

    protected d(Context context, Handler handler, int i10, w8.c cVar) {
        super(context, handler, e.c(context), t8.g.m(), i10, null, null);
        this.zab = (w8.c) w8.m.k(cVar);
        this.zad = cVar.b();
        this.zac = zaa(cVar.e());
    }

    protected d(Context context, Looper looper, int i10, w8.c cVar) {
        this(context, looper, e.c(context), t8.g.m(), i10, cVar, null, null);
    }

    @Deprecated
    protected d(Context context, Looper looper, int i10, w8.c cVar, e.b bVar, e.c cVar2) {
        this(context, looper, i10, cVar, (v8.d) bVar, (v8.h) cVar2);
    }

    protected d(Context context, Looper looper, int i10, w8.c cVar, v8.d dVar, v8.h hVar) {
        this(context, looper, e.c(context), t8.g.m(), i10, cVar, (v8.d) w8.m.k(dVar), (v8.h) w8.m.k(hVar));
    }

    protected d(Context context, Looper looper, e eVar, t8.g gVar, int i10, w8.c cVar, v8.d dVar, v8.h hVar) {
        super(context, looper, eVar, gVar, i10, dVar == null ? null : new g(dVar), hVar == null ? null : new h(hVar), cVar.k());
        this.zab = cVar;
        this.zad = cVar.b();
        this.zac = zaa(cVar.e());
    }

    private final Set zaa(Set set) {
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.b
    protected Executor getBindServiceExecutor() {
        return null;
    }

    protected final w8.c getClientSettings() {
        return this.zab;
    }

    public t8.d[] getRequiredFeatures() {
        return new t8.d[0];
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    protected Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
