package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f7250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Intent f7253d;

    public a(Activity activity, int i10, int i11, Intent intent) {
        this.f7250a = activity;
        this.f7251b = i10;
        this.f7252c = i11;
        this.f7253d = intent;
    }

    public Activity a() {
        return this.f7250a;
    }

    public int b() {
        return this.f7251b;
    }

    public Intent c() {
        return this.f7253d;
    }

    public int d() {
        return this.f7252c;
    }

    public String toString() {
        return "ActivtyResult: [ requestCode: " + this.f7251b + ", resultCode: " + this.f7252c + ", activity: " + this.f7250a + ", intent: " + this.f7253d + "]";
    }
}
