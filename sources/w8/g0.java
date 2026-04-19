package w8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import u8.d;
import w8.l;

/* JADX INFO: loaded from: classes.dex */
final class g0 implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ u8.d f22624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f22625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l.a f22626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ i0 f22627d;

    g0(u8.d dVar, TaskCompletionSource taskCompletionSource, l.a aVar, i0 i0Var) {
        this.f22624a = dVar;
        this.f22625b = taskCompletionSource;
        this.f22626c = aVar;
        this.f22627d = i0Var;
    }

    @Override // u8.d.a
    public final void a(Status status) {
        if (!status.B()) {
            this.f22625b.setException(a.a(status));
        } else {
            this.f22625b.setResult(this.f22626c.a(this.f22624a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
