package ca;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class a0 implements OnSuccessListener<ba.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f6600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f6601b;

    a0(y yVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f6600a = taskCompletionSource;
        this.f6601b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(ba.i iVar) {
        this.f6600a.setResult(iVar);
        y.d(this.f6601b);
    }
}
