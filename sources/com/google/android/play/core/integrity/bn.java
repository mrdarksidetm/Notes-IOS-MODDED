package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import q9.b0;

/* JADX INFO: loaded from: classes.dex */
final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.d f8803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.y f8804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f8806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f8807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f8808f;

    bn(Context context, q9.y yVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f8806d = taskCompletionSource;
        this.f8805c = context.getPackageName();
        this.f8804b = yVar;
        this.f8807e = atVar;
        this.f8808f = kVar;
        com.google.android.play.integrity.internal.d dVar = new com.google.android.play.integrity.internal.d(context, yVar, "ExpressIntegrityService", bo.f8809a, new b0() { // from class: com.google.android.play.core.integrity.bd
            @Override // q9.b0
            public final Object a(IBinder iBinder) {
                return q9.q.b(iBinder);
            }
        }, null);
        this.f8803a = dVar;
        dVar.c().post(new be(this, taskCompletionSource, context));
    }

    static /* bridge */ /* synthetic */ Bundle a(bn bnVar, String str, long j10, long j11, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f8805c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        q9.m.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(q9.m.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f8805c);
        bundle.putLong("cloud.prj", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        q9.m.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(q9.m.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f8806d.getTask().isSuccessful() && ((Integer) bnVar.f8806d.getTask().getResult()).intValue() == 0;
    }

    final Task c(Activity activity, Bundle bundle) {
        int i10 = bundle.getInt("dialog.intent.type");
        this.f8804b.d("requestAndShowDialog(%s)", Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f8803a.t(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j10, long j11, int i10) {
        this.f8804b.d("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f8803a.t(new bg(this, taskCompletionSource, 0, str, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j10, int i10) {
        this.f8804b.d("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f8803a.t(new bf(this, taskCompletionSource, 0, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
