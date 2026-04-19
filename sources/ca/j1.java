package ca;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
final class j1 implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f6699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Activity f6700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f6701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f6702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ h1 f6703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f6704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ c f6705h;

    j1(c cVar, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z10, boolean z11, h1 h1Var, TaskCompletionSource taskCompletionSource) {
        this.f6698a = firebaseAuth;
        this.f6699b = str;
        this.f6700c = activity;
        this.f6701d = z10;
        this.f6702e = z11;
        this.f6703f = h1Var;
        this.f6704g = taskCompletionSource;
        this.f6705h = cVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e(c.f6624b, "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        if (this.f6698a.m0().d("PHONE_PROVIDER")) {
            this.f6705h.h(this.f6698a, this.f6699b, this.f6700c, this.f6701d, this.f6702e, this.f6703f, this.f6704g);
        } else {
            this.f6704g.setResult(new t1().a());
        }
    }
}
