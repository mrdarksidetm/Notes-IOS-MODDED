package k9;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;
import v8.n;

/* JADX INFO: loaded from: classes.dex */
final class c extends zzq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f14452a;

    c(a aVar, TaskCompletionSource taskCompletionSource) {
        this.f14452a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) {
        n.b(status, pendingIntent, this.f14452a);
    }
}
