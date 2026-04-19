package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import w8.j;
import w8.q;
import w8.r;
import w8.s;
import w8.t;

/* JADX INFO: loaded from: classes.dex */
public final class zzrm {
    private final s zza;
    private final AtomicLong zzb = new AtomicLong(-1);

    zzrm(Context context, String str) {
        this.zza = r.b(context, t.a().b("mlkit:vision").a());
    }

    public static zzrm zza(Context context) {
        return new zzrm(context, "mlkit:vision");
    }

    final /* synthetic */ void zzb(long j10, Exception exc) {
        this.zzb.set(j10);
    }

    public final synchronized void zzc(int i10, int i11, long j10, long j11) {
        AtomicLong atomicLong = this.zzb;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.zzb.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.zza.b(new q(0, Arrays.asList(new j(24335, i11, 0, j10, j11, null, null, 0, -1)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzrl
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zza.zzb(jElapsedRealtime, exc);
            }
        });
    }
}
