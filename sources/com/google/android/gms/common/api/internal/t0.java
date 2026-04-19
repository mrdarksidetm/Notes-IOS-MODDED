package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
final class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f8528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ u0 f8529b;

    t0(u0 u0Var, r0 r0Var) {
        this.f8529b = u0Var;
        this.f8528a = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8529b.f8531a) {
            t8.b bVarB = this.f8528a.b();
            if (bVarB.A()) {
                u0 u0Var = this.f8529b;
                u0Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(u0Var.getActivity(), (PendingIntent) w8.m.k(bVarB.z()), this.f8528a.a(), false), 1);
                return;
            }
            u0 u0Var2 = this.f8529b;
            if (u0Var2.f8534d.b(u0Var2.getActivity(), bVarB.u(), null) != null) {
                u0 u0Var3 = this.f8529b;
                u0Var3.f8534d.v(u0Var3.getActivity(), u0Var3.mLifecycleFragment, bVarB.u(), 2, this.f8529b);
                return;
            }
            if (bVarB.u() != 18) {
                this.f8529b.a(bVarB, this.f8528a.a());
                return;
            }
            u0 u0Var4 = this.f8529b;
            Dialog dialogQ = u0Var4.f8534d.q(u0Var4.getActivity(), u0Var4);
            u0 u0Var5 = this.f8529b;
            u0Var5.f8534d.r(u0Var5.getActivity().getApplicationContext(), new s0(this, dialogQ));
        }
    }
}
