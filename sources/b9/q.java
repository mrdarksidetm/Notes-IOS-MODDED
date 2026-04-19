package b9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class q extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5541a;

    q(t tVar, TaskCompletionSource taskCompletionSource) {
        this.f5541a = taskCompletionSource;
    }

    @Override // b9.h
    public final void M(Status status, a9.g gVar) {
        v8.n.c(status, gVar, this.f5541a);
    }
}
