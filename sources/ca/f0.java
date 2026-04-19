package ca;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class f0 implements OnSuccessListener<ba.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f6660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f6661b;

    f0(y yVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f6660a = taskCompletionSource;
        this.f6661b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(ba.i iVar) {
        this.f6660a.setResult(iVar);
        y.d(this.f6661b);
    }
}
