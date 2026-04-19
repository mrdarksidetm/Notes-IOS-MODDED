package ca;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzagh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class l1 implements Continuation<zzagh, Task<IntegrityTokenResponse>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ IntegrityManager f6710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ c f6711c;

    l1(c cVar, String str, IntegrityManager integrityManager) {
        this.f6709a = str;
        this.f6710b = integrityManager;
        this.f6711c = cVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<IntegrityTokenResponse> then(Task<zzagh> task) {
        if (task.isSuccessful()) {
            this.f6711c.f6626a = task.getResult().zza();
            return this.f6710b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(task.getResult().zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f6709a.getBytes("UTF-8")), 11))).build());
        }
        Log.e(c.f6624b, "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
