package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import ba.r0;
import ca.m1;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.b;

/* JADX INFO: loaded from: classes2.dex */
final class h implements OnCompleteListener<m1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a f8944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f8945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8946c;

    h(FirebaseAuth firebaseAuth, a aVar, String str) {
        this.f8944a = aVar;
        this.f8945b = str;
        this.f8946c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<m1> task) {
        String strB;
        String str;
        String strC = null;
        if (task.isSuccessful()) {
            String strD = task.getResult().d();
            strB = task.getResult().b();
            str = strD;
            strC = task.getResult().c();
        } else {
            String str2 = "Error while validating application identity: ";
            Exception exception = task.getException();
            if (exception != null) {
                str2 = "Error while validating application identity: " + exception.getMessage();
            }
            Log.e("FirebaseAuth", str2);
            if (exception != null && ca.c.i(exception)) {
                FirebaseAuth.k0((x9.l) exception, this.f8944a, this.f8945b);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                str = null;
                strB = null;
            }
        }
        long jLongValue = this.f8944a.i().longValue();
        b.AbstractC0181b abstractC0181bB0 = this.f8946c.b0(this.f8944a.j(), this.f8944a.g());
        if (TextUtils.isEmpty(str)) {
            abstractC0181bB0 = this.f8946c.a0(this.f8944a, abstractC0181bB0, task.getResult());
        }
        b.AbstractC0181b abstractC0181b = abstractC0181bB0;
        ca.r rVar = (ca.r) w8.m.k(this.f8944a.e());
        String str3 = (zzag.zzc(strC) && this.f8946c.m0() != null && this.f8946c.m0().d("PHONE_PROVIDER")) ? "NO_RECAPTCHA" : strC;
        if (rVar.B()) {
            this.f8946c.f8887e.zza(rVar, (String) w8.m.k(this.f8944a.j()), this.f8946c.f8891i, jLongValue, this.f8944a.f() != null, this.f8944a.m(), str, strB, str3, this.f8946c.I0(), abstractC0181b, this.f8944a.k(), this.f8944a.a());
        } else {
            this.f8946c.f8887e.zza(rVar, (r0) w8.m.k(this.f8944a.h()), this.f8946c.f8891i, jLongValue, this.f8944a.f() != null, this.f8944a.m(), str, strB, str3, this.f8946c.I0(), abstractC0181b, this.f8944a.k(), this.f8944a.a());
        }
    }
}
