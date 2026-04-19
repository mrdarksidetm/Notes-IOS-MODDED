package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7167b = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7168e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f7169f = "Amazon Appstore required";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f7170g = "Amazon Appstore Update Required";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f7171j = 31536000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f7172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f7173i;

    public a(c cVar) {
        super(cVar);
        this.f7173i = cVar;
    }

    @Override // com.amazon.a.a.e.c
    protected long h() {
        return 31536000L;
    }

    @Override // com.amazon.a.a.i.h
    protected void i() {
        if (f7169f.equalsIgnoreCase(this.f7173i.e()) || f7170g.equalsIgnoreCase(this.f7173i.e())) {
            try {
                Activity activityB = this.f7172h.b();
                if (activityB == null) {
                    activityB = this.f7172h.a();
                }
                activityB.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f7168e)));
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        return f7167b;
    }
}
