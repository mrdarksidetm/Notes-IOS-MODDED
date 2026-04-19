package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzco;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m4getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j10, d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 10000;
        }
        return recaptcha.m5getClientBWLJW6A(application, str, j10, dVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzco.zzh(application, str, 10000L);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j10) {
        return zzco.zzh(application, str, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5getClientBWLJW6A(android.app.Application r8, java.lang.String r9, long r10, qd.d<? super md.t<? extends com.google.android.recaptcha.RecaptchaClient>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.zza
            java.lang.Object r0 = rd.b.e()
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            md.u.b(r12)     // Catch: java.lang.Throwable -> L2a
            goto L48
        L2a:
            r8 = move-exception
            goto L4f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            md.u.b(r12)
            md.t$a r12 = md.t.f15576b     // Catch: java.lang.Throwable -> L2a
            com.google.android.recaptcha.internal.zzco r12 = com.google.android.recaptcha.internal.zzco.zza     // Catch: java.lang.Throwable -> L2a
            r6.zzc = r2     // Catch: java.lang.Throwable -> L2a
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r12 = com.google.android.recaptcha.internal.zzco.zzg(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L2a
            if (r12 != r0) goto L48
            return r0
        L48:
            com.google.android.recaptcha.internal.zzcx r12 = (com.google.android.recaptcha.internal.zzcx) r12     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = md.t.b(r12)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L4f:
            md.t$a r9 = md.t.f15576b
            java.lang.Object r8 = md.u.a(r8)
            java.lang.Object r8 = md.t.b(r8)
        L59:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m5getClientBWLJW6A(android.app.Application, java.lang.String, long, qd.d):java.lang.Object");
    }
}
