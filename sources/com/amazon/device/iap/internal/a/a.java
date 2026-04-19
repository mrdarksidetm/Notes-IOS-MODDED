package com.amazon.device.iap.internal.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.a.a.i.h;

/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7766b = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7767e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f7768f = "Amazon Appstore required";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f7769g = "Amazon Appstore Update Required";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f7770j = 31536000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f7771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.amazon.a.a.i.c f7772i;

    public a(com.amazon.a.a.i.c cVar) {
        super(cVar);
        this.f7772i = cVar;
    }

    @Override // com.amazon.a.a.e.c
    protected long h() {
        return 31536000L;
    }

    @Override // com.amazon.a.a.i.h
    protected void i() {
        com.amazon.device.iap.internal.util.b.a(f7766b, "doAction");
        if (f7768f.equalsIgnoreCase(this.f7772i.e()) || f7769g.equalsIgnoreCase(this.f7772i.e())) {
            try {
                Activity activityB = this.f7771h.b();
                if (activityB == null) {
                    activityB = this.f7771h.a();
                }
                activityB.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f7767e)));
            } catch (Exception e10) {
                com.amazon.device.iap.internal.util.b.b(f7766b, "Exception in PurchaseItemCommandTask.OnSuccess: " + e10);
            }
        }
    }

    public String toString() {
        return f7766b;
    }
}
