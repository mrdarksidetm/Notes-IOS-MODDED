package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzi;

/* JADX INFO: loaded from: classes.dex */
final class m extends zzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f8598a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, Looper looper) {
        super(looper);
        this.f8598a = bVar;
    }

    private static final void a(Message message) {
        n nVar = (n) message.obj;
        nVar.b();
        nVar.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f8598a.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f8598a.enableLocalFallback()) || message.what == 5)) && !this.f8598a.isConnecting()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f8598a.zzB = new t8.b(message.arg2);
            if (b.zzo(this.f8598a)) {
                b bVar = this.f8598a;
                if (!bVar.zzC) {
                    bVar.zzp(3, null);
                    return;
                }
            }
            b bVar2 = this.f8598a;
            t8.b bVar3 = bVar2.zzB != null ? bVar2.zzB : new t8.b(8);
            this.f8598a.zzc.a(bVar3);
            this.f8598a.onConnectionFailed(bVar3);
            return;
        }
        if (i11 == 5) {
            b bVar4 = this.f8598a;
            t8.b bVar5 = bVar4.zzB != null ? bVar4.zzB : new t8.b(8);
            this.f8598a.zzc.a(bVar5);
            this.f8598a.onConnectionFailed(bVar5);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            t8.b bVar6 = new t8.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f8598a.zzc.a(bVar6);
            this.f8598a.onConnectionFailed(bVar6);
            return;
        }
        if (i11 == 6) {
            this.f8598a.zzp(5, null);
            b bVar7 = this.f8598a;
            if (bVar7.zzw != null) {
                bVar7.zzw.c(message.arg2);
            }
            this.f8598a.onConnectionSuspended(message.arg2);
            b.zzn(this.f8598a, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f8598a.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((n) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
