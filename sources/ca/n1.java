package ca;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class n1 implements OnSuccessListener<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f6720a;

    n1(c cVar, TaskCompletionSource taskCompletionSource) {
        this.f6720a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(String str) {
        this.f6720a.setResult(new t1().d(str).a());
    }
}
