package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import j8.d;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public class UserRecoverableAuthException extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Intent f8289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PendingIntent f8290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f8291c;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, null, b.LEGACY);
    }

    private UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, b bVar) {
        super(str);
        this.f8290b = pendingIntent;
        this.f8289a = intent;
        this.f8291c = (b) m.k(bVar);
    }

    public static UserRecoverableAuthException b(String str, Intent intent, PendingIntent pendingIntent) {
        m.k(intent);
        m.k(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, b.AUTH_INSTANTIATION);
    }

    public Intent a() {
        String str;
        Intent intent = this.f8289a;
        if (intent != null) {
            return new Intent(intent);
        }
        int iOrdinal = this.f8291c.ordinal();
        if (iOrdinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (iOrdinal == 1) {
            str = "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.";
        } else {
            if (iOrdinal != 2) {
                return null;
            }
            str = "this instantiation of UserRecoverableAuthException doesn't support an Intent.";
        }
        Log.e("Auth", str);
        return null;
    }
}
