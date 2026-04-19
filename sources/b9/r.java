package b9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class r extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f5542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a9.a f5544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f5545d;

    r(t tVar, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, a9.a aVar) {
        this.f5545d = tVar;
        this.f5542a = atomicReference;
        this.f5543b = taskCompletionSource;
        this.f5544c = aVar;
    }

    @Override // b9.h
    public final void M(Status status, a9.g gVar) {
        if (gVar != null) {
            this.f5542a.set(gVar);
        }
        v8.n.c(status, null, this.f5543b);
        if (!status.B() || (gVar != null && gVar.x())) {
            this.f5545d.doUnregisterEventListener(com.google.android.gms.common.api.internal.f.c(this.f5544c, a9.a.class.getSimpleName()), 27306);
        }
    }
}
