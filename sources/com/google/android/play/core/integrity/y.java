package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes.dex */
abstract class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8849c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8851e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.y f8847a = new q9.y("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8850d = new Object();

    y(String str, long j10) {
        this.f8848b = str;
        this.f8849c = j10;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.f8850d) {
            if (this.f8851e) {
                return Tasks.forResult(0);
            }
            this.f8851e = true;
            this.f8847a.a("checkAndShowDialog(%s)", Integer.valueOf(i10));
            Bundle bundle = new Bundle();
            bundle.putInt("dialog.intent.type", i10);
            bundle.putString("package.name", this.f8848b);
            bundle.putInt("playcore.integrity.version.major", 1);
            bundle.putInt("playcore.integrity.version.minor", 3);
            bundle.putInt("playcore.integrity.version.patch", 0);
            bundle.putLong("request.token.sid", this.f8849c);
            return b(activity, bundle);
        }
    }

    abstract Task b(Activity activity, Bundle bundle);
}
