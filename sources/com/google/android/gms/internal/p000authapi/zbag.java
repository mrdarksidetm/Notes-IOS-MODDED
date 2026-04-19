package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import n8.h;
import n8.i;
import n8.s;
import w8.m;
import x8.e;

/* JADX INFO: loaded from: classes.dex */
public final class zbag extends d implements n8.d {
    private static final a.g zba;
    private static final a.AbstractC0174a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbad zbadVar = new zbad();
        zbb = zbadVar;
        zbc = new a("Auth.Api.Identity.CredentialSaving.API", zbadVar, gVar);
    }

    public zbag(Activity activity, s sVar) {
        super(activity, (a<s>) zbc, sVar, d.a.f8400c);
        this.zbd = zbat.zba();
    }

    public zbag(Context context, s sVar) {
        super(context, (a<s>) zbc, sVar, d.a.f8400c);
        this.zbd = zbat.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status;
        return (intent == null || (status = (Status) e.b(intent, "status", Status.CREATOR)) == null) ? Status.f8387h : status;
    }

    public final Task<h> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        m.k(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.a aVarC = SaveAccountLinkingTokenRequest.C(saveAccountLinkingTokenRequest);
        aVarC.f(this.zbd);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequestA = aVarC.a();
        return doRead(j.a().d(zbas.zbg).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api.zbab
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zbn) ((zbh) obj).getService()).zbc(new zbae(this.zba, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) m.k(saveAccountLinkingTokenRequestA));
            }
        }).c(false).e(1535).a());
    }

    @Override // n8.d
    public final Task<n8.j> savePassword(i iVar) {
        m.k(iVar);
        i.a aVarZ = i.z(iVar);
        aVarZ.c(this.zbd);
        final i iVarA = aVarZ.a();
        return doRead(j.a().d(zbas.zbe).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api.zbac
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zbn) ((zbh) obj).getService()).zbd(new zbaf(this.zba, (TaskCompletionSource) obj2), (i) m.k(iVarA));
            }
        }).c(false).e(1536).a());
    }
}
