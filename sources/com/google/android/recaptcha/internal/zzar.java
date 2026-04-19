package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;
import le.a2;
import le.f1;
import le.u;
import le.u0;
import le.w;
import le.x;
import qd.d;
import qd.g;
import te.a;
import te.c;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzar implements u0 {
    private final /* synthetic */ x zza;

    zzar(x xVar) {
        this.zza = xVar;
    }

    @Override // le.a2
    public final u attachChild(w wVar) {
        return this.zza.attachChild(wVar);
    }

    @Override // le.u0
    public final Object await(d dVar) {
        return this.zza.await(dVar);
    }

    @Override // le.a2
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // le.a2
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // le.a2
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }

    @Override // qd.g.b, qd.g
    public final Object fold(Object obj, p pVar) {
        return this.zza.fold(obj, pVar);
    }

    @Override // qd.g.b, qd.g
    public final g.b get(g.c cVar) {
        return this.zza.get(cVar);
    }

    @Override // le.a2
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // le.a2
    public final ie.g getChildren() {
        return this.zza.getChildren();
    }

    @Override // le.u0
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // le.u0
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // qd.g.b
    public final g.c getKey() {
        return this.zza.getKey();
    }

    @Override // le.u0
    public final c getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // le.a2
    public final a getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // le.a2
    public final a2 getParent() {
        return this.zza.getParent();
    }

    @Override // le.a2
    public final f1 invokeOnCompletion(l lVar) {
        return this.zza.invokeOnCompletion(lVar);
    }

    @Override // le.a2
    public final f1 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return this.zza.invokeOnCompletion(z10, z11, lVar);
    }

    @Override // le.a2
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // le.a2
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // le.a2
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // le.a2
    public final Object join(d dVar) {
        return this.zza.join(dVar);
    }

    @Override // qd.g.b, qd.g
    public final g minusKey(g.c cVar) {
        return this.zza.minusKey(cVar);
    }

    @Override // le.a2
    public final a2 plus(a2 a2Var) {
        return this.zza.plus(a2Var);
    }

    @Override // qd.g
    public final g plus(g gVar) {
        return this.zza.plus(gVar);
    }

    @Override // le.a2
    public final boolean start() {
        return this.zza.start();
    }
}
