package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ u8.h f8480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k0 f8481b;

    h0(k0 k0Var, u8.h hVar) {
        this.f8481b = k0Var;
        this.f8480a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.e eVar;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                u8.d dVarB = ((u8.k) w8.m.k(this.f8481b.f8493a)).b(this.f8480a);
                k0 k0Var = this.f8481b;
                k0Var.f8500h.sendMessage(k0Var.f8500h.obtainMessage(0, dVarB));
                threadLocal.set(Boolean.FALSE);
                k0 k0Var2 = this.f8481b;
                k0.o(this.f8480a);
                eVar = (com.google.android.gms.common.api.e) this.f8481b.f8499g.get();
                if (eVar == null) {
                    return;
                }
            } catch (RuntimeException e10) {
                k0 k0Var3 = this.f8481b;
                k0Var3.f8500h.sendMessage(k0Var3.f8500h.obtainMessage(1, e10));
                BasePendingResult.zaa.set(Boolean.FALSE);
                k0 k0Var4 = this.f8481b;
                k0.o(this.f8480a);
                eVar = (com.google.android.gms.common.api.e) this.f8481b.f8499g.get();
                if (eVar == null) {
                    return;
                }
            }
            eVar.j(this.f8481b);
        } catch (Throwable th) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            k0 k0Var5 = this.f8481b;
            k0.o(this.f8480a);
            com.google.android.gms.common.api.e eVar2 = (com.google.android.gms.common.api.e) this.f8481b.f8499g.get();
            if (eVar2 != null) {
                eVar2.j(this.f8481b);
            }
            throw th;
        }
    }
}
