package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import n8.b;
import n8.c;
import n8.d0;
import n8.f;
import n8.k;
import n8.l;
import w8.m;
import x8.e;

/* JADX INFO: loaded from: classes.dex */
public final class zbaq extends d implements k {
    private static final a.g zba;
    private static final a.AbstractC0174a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbal zbalVar = new zbal();
        zbb = zbalVar;
        zbc = new a("Auth.Api.Identity.SignIn.API", zbalVar, gVar);
    }

    public zbaq(Activity activity, d0 d0Var) {
        super(activity, (a<d0>) zbc, d0Var, d.a.f8400c);
        this.zbd = zbat.zba();
    }

    public zbaq(Context context, d0 d0Var) {
        super(context, (a<d0>) zbc, d0Var, d.a.f8400c);
        this.zbd = zbat.zba();
    }

    @Override // n8.k
    public final Task<c> beginSignIn(b bVar) {
        m.k(bVar);
        b.a aVarD = b.D(bVar);
        aVarD.g(this.zbd);
        final b bVarA = aVarD.a();
        return doRead(j.a().d(zbas.zba).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api.zbaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zbw) ((zbar) obj).getService()).zbc(new zbam(this.zba, (TaskCompletionSource) obj2), (b) m.k(bVarA));
            }
        }).c(false).e(1553).a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws com.google.android.gms.common.api.b {
        if (intent == null) {
            throw new com.google.android.gms.common.api.b(Status.f8387h);
        }
        Status status = (Status) e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new com.google.android.gms.common.api.b(Status.f8389j);
        }
        if (!status.B()) {
            throw new com.google.android.gms.common.api.b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new com.google.android.gms.common.api.b(Status.f8387h);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final n8.e eVar) {
        m.k(eVar);
        return doRead(j.a().d(zbas.zbh).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                this.zba.zba(eVar, (zbar) obj, (TaskCompletionSource) obj2);
            }
        }).e(1653).a());
    }

    public final l getSignInCredentialFromIntent(Intent intent) throws com.google.android.gms.common.api.b {
        if (intent == null) {
            throw new com.google.android.gms.common.api.b(Status.f8387h);
        }
        Status status = (Status) e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new com.google.android.gms.common.api.b(Status.f8389j);
        }
        if (!status.B()) {
            throw new com.google.android.gms.common.api.b(status);
        }
        l lVar = (l) e.b(intent, "sign_in_credential", l.CREATOR);
        if (lVar != null) {
            return lVar;
        }
        throw new com.google.android.gms.common.api.b(Status.f8387h);
    }

    @Override // n8.k
    public final Task<PendingIntent> getSignInIntent(f fVar) {
        m.k(fVar);
        f.a aVarC = f.C(fVar);
        aVarC.f(this.zbd);
        final f fVarA = aVarC.a();
        return doRead(j.a().d(zbas.zbf).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api.zbak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((zbw) ((zbar) obj).getService()).zbe(new zbao(this.zba, (TaskCompletionSource) obj2), (f) m.k(fVarA));
            }
        }).e(1555).a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<com.google.android.gms.common.api.e> it = com.google.android.gms.common.api.e.c().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
        com.google.android.gms.common.api.internal.c.a();
        return doWrite(j.a().d(zbas.zbb).b(new v8.j() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                this.zba.zbb((zbar) obj, (TaskCompletionSource) obj2);
            }
        }).c(false).e(1554).a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zba(n8.e eVar, zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbd(new zbap(this, taskCompletionSource), eVar, this.zbd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zbb(zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbf(new zban(this, taskCompletionSource), this.zbd);
    }
}
