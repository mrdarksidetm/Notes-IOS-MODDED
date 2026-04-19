package b9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class s extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5546a;

    s(t tVar, TaskCompletionSource taskCompletionSource) {
        this.f5546a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void onResult(Status status) {
        v8.n.c(status, Boolean.TRUE, this.f5546a);
    }
}
