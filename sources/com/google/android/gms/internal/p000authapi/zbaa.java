package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import n8.n;
import n8.o;
import w8.m;
import x8.e;

/* JADX INFO: loaded from: classes.dex */
public final class zbaa extends d {
    private static final a.g zba;
    private static final a.AbstractC0174a zbb;
    private static final a zbc;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zby zbyVar = new zby();
        zbb = zbyVar;
        zbc = new a("Auth.Api.Identity.Authorization.API", zbyVar, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaa(Activity activity, o oVar) {
        a aVar = zbc;
        n nVarC = n.c(oVar);
        nVarC.a(zbat.zba());
        super(activity, (a<o>) aVar, nVarC.b(), d.a.f8400c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaa(Context context, o oVar) {
        a aVar = zbc;
        n nVarC = n.c(oVar);
        nVarC.a(zbat.zba());
        super(context, (a<o>) aVar, nVarC.b(), d.a.f8400c);
    }

    public final Task<n8.a> authorize(AuthorizationRequest authorizationRequest) {
        m.k(authorizationRequest);
        AuthorizationRequest.a aVarD = AuthorizationRequest.D(authorizationRequest);
        aVarD.g(((o) getApiOptions()).b());
        final AuthorizationRequest authorizationRequestA = aVarD.a();
        return doRead(j.a().d(zbas.zbc).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api.zbx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zbk) ((zbg) obj).getService()).zbc(new zbz(this.zba, (TaskCompletionSource) obj2), (AuthorizationRequest) m.k(authorizationRequestA));
            }
        }).c(false).e(1534).a());
    }

    public final n8.a getAuthorizationResultFromIntent(Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.f8387h);
        }
        Status status = (Status) e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.f8389j);
        }
        if (!status.B()) {
            throw new b(status);
        }
        n8.a aVar = (n8.a) e.b(intent, "authorization_result", n8.a.CREATOR);
        if (aVar != null) {
            return aVar;
        }
        throw new b(Status.f8387h);
    }
}
