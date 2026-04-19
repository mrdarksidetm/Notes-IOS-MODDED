package com.google.firebase.auth;

import ba.y0;
import ca.d1;
import com.google.android.gms.internal.p002firebaseauthapi.zzahh;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
final class r implements Continuation<zzahh, Task<y0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8981a;

    r(FirebaseAuth firebaseAuth) {
        this.f8981a = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<y0> then(Task<zzahh> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) w8.m.k(task.getException()));
        }
        zzahh result = task.getResult();
        if (result instanceof zzahn) {
            zzahn zzahnVar = (zzahn) result;
            return Tasks.forResult(new d1(w8.m.e(zzahnVar.zzf()), w8.m.e(zzahnVar.zze()), zzahnVar.zzc(), zzahnVar.zzb(), zzahnVar.zzd(), w8.m.e(zzahnVar.zza()), this.f8981a));
        }
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + result.getClass().getName() + ".");
    }
}
