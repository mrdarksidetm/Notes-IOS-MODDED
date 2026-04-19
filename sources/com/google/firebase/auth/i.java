package com.google.firebase.auth;

import android.util.Log;
import ca.m1;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class i implements OnCompleteListener<m1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a f8947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f8948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8949c;

    i(FirebaseAuth firebaseAuth, a aVar, String str) {
        this.f8947a = aVar;
        this.f8948b = str;
        this.f8949c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<m1> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", "Error while validating application identity: " + (exception != null ? exception.getMessage() : ""));
            if (exception != null && ca.c.i(exception)) {
                FirebaseAuth.k0((x9.l) exception, this.f8947a, this.f8948b);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        this.f8949c.j0(this.f8947a, task.getResult());
    }
}
