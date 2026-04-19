package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import q9.b0;

/* JADX INFO: loaded from: classes.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.d f8740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.y f8741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final at f8743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f8744e;

    aj(Context context, q9.y yVar, at atVar, k kVar) {
        this.f8742c = context.getPackageName();
        this.f8741b = yVar;
        this.f8743d = atVar;
        this.f8744e = kVar;
        if (q9.f.b(context)) {
            this.f8740a = new com.google.android.play.integrity.internal.d(context, yVar, "IntegrityService", ak.f8745a, new b0() { // from class: com.google.android.play.core.integrity.ae
                @Override // q9.b0
                public final Object a(IBinder iBinder) {
                    return q9.u.b(iBinder);
                }
            }, null);
        } else {
            yVar.b("Phonesky is not installed.", new Object[0]);
            this.f8740a = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f8742c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        q9.m.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(q9.m.a(arrayList)));
        return bundle;
    }

    final Task b(Activity activity, Bundle bundle) {
        if (this.f8740a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.f8741b.d("requestAndShowDialog(%s, %s)", this.f8742c, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f8740a.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f8740a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f8741b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f8740a.t(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
