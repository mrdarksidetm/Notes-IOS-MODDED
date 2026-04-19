package ca;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class k1 implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f6708a;

    k1(c cVar, TaskCompletionSource taskCompletionSource) {
        this.f6708a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e(c.f6624b, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        if ((exc instanceof ba.q) && ((ba.q) exc).a().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f6708a.setException(exc);
        } else {
            this.f6708a.setResult(new t1().a());
        }
    }
}
