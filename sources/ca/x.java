package ca;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes2.dex */
final class x implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ u f6774a;

    x(u uVar) {
        this.f6774a = uVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (exc instanceof x9.m) {
            v.f6758h.g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f6774a.f6752b.d();
        }
    }
}
