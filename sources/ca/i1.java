package ca;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class i1 implements OnSuccessListener<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f6695a;

    i1(c cVar, TaskCompletionSource taskCompletionSource) {
        this.f6695a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(String str) {
        this.f6695a.setResult(new t1().c(str).a());
    }
}
