package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.model.AppstoreSDKModes;
import com.amazon.device.drm.model.RequestId;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f7744a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f7745b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f7746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f7747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LicensingListener f7748e;

    private d() {
    }

    public static d d() {
        return f7745b;
    }

    private void f() {
        if (this.f7748e == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    private void g() {
        if (this.f7747d == null) {
            throw new IllegalStateException("You must register a ApplicationContext before invoking this operation");
        }
    }

    public String a() {
        try {
            g();
            return (com.amazon.a.a.a((Application) this.f7747d.getApplicationContext()) ? AppstoreSDKModes.SANDBOX : AppstoreSDKModes.PRODUCTION).name();
        } catch (IllegalStateException unused) {
            return AppstoreSDKModes.UNKNOWN.name();
        }
    }

    public void a(Context context, Intent intent) {
        try {
            this.f7746c.a(context, intent);
        } catch (Exception e10) {
            com.amazon.device.drm.a.e.b.b(f7744a, "Error in onReceive: " + e10);
        }
    }

    public void a(Context context, LicensingListener licensingListener) {
        if (licensingListener == null || context == null) {
            throw new IllegalArgumentException("LicensingManager/Context cannot be null");
        }
        com.amazon.device.drm.a.e.b.a(f7744a, "LicensingListener registered: " + licensingListener);
        com.amazon.device.drm.a.e.b.a(f7744a, "LicensingListener Context: " + context);
        this.f7747d = context.getApplicationContext();
        this.f7748e = licensingListener;
        c cVarA = a.a().a(this.f7747d);
        this.f7746c = cVarA;
        if (cVarA == null) {
            com.amazon.device.drm.a.e.b.a(f7744a, "requestHandler is null");
        }
    }

    public LicensingListener b() {
        return this.f7748e;
    }

    public Context c() {
        return this.f7747d;
    }

    public RequestId e() {
        f();
        RequestId requestId = new RequestId();
        this.f7746c.a(requestId);
        return requestId;
    }
}
