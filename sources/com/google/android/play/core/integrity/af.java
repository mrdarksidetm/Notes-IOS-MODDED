package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class af extends com.google.android.play.integrity.internal.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f8726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f8727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f8728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f8729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f8730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f8730e = ajVar;
        this.f8726a = bArr;
        this.f8727b = l10;
        this.f8728c = taskCompletionSource2;
        this.f8729d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.i
    public final void a(Exception exc) {
        if (exc instanceof q9.c) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.i
    protected final void b() {
        try {
            ((q9.v) this.f8730e.f8740a.e()).o(aj.a(this.f8730e, this.f8726a, this.f8727b, null), new ai(this.f8730e, this.f8728c));
        } catch (RemoteException e10) {
            this.f8730e.f8741b.c(e10, "requestIntegrityToken(%s)", this.f8729d);
            this.f8728c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
