package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f7888a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f7889b = "sku";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f7890c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f7891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f7892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PurchasingListener f7893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7894g = false;

    private d() {
    }

    public static d f() {
        return f7890c;
    }

    private void g() {
        if (this.f7893f == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    public PurchasingListener a() {
        return this.f7893f;
    }

    public RequestId a(UserDataRequest userDataRequest) {
        g();
        RequestId requestId = new RequestId();
        this.f7891d.a(requestId, userDataRequest);
        return requestId;
    }

    public RequestId a(String str) {
        f.a((Object) str, f7889b);
        g();
        RequestId requestId = new RequestId();
        this.f7891d.a(requestId, str);
        return requestId;
    }

    public RequestId a(Set<String> set) {
        f.a((Object) set, com.amazon.a.a.o.b.O);
        f.a((Collection<? extends Object>) set, com.amazon.a.a.o.b.O);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().trim().length() == 0) {
                throw new IllegalArgumentException("Empty SKU values are not allowed");
            }
        }
        if (set.size() <= 100) {
            g();
            RequestId requestId = new RequestId();
            this.f7891d.a(requestId, new LinkedHashSet(set));
            return requestId;
        }
        throw new IllegalArgumentException(set.size() + " SKUs were provided, but no more than 100 SKUs are allowed");
    }

    public RequestId a(boolean z10) {
        g();
        RequestId requestId = new RequestId();
        this.f7891d.a(requestId, z10);
        return requestId;
    }

    public void a(Context context, Intent intent) {
        try {
            this.f7891d.a(context, intent);
        } catch (Exception e10) {
            com.amazon.device.iap.internal.util.b.b(f7888a, "Error in onReceive: " + e10);
        }
    }

    public void a(Context context, PurchasingListener purchasingListener) {
        com.amazon.device.iap.internal.util.b.a(f7888a, "PurchasingListener registered: " + purchasingListener);
        com.amazon.device.iap.internal.util.b.a(f7888a, "PurchasingListener Context: " + context);
        if (purchasingListener == null || context == null) {
            throw new IllegalArgumentException("Neither PurchasingListener or its Context can be null");
        }
        this.f7892e = context.getApplicationContext();
        e eVarA = b.a().a(this.f7892e);
        this.f7891d = eVarA;
        if (eVarA == null) {
            com.amazon.device.iap.internal.util.b.a(f7888a, "requestHandler is null");
        }
        this.f7893f = purchasingListener;
    }

    public void a(String str, FulfillmentResult fulfillmentResult) {
        if (f.a(str)) {
            throw new IllegalArgumentException("Empty receiptId is not allowed");
        }
        f.a(fulfillmentResult, "fulfillmentResult");
        g();
        this.f7891d.a(new RequestId(), str, fulfillmentResult);
    }

    public Context b() {
        return this.f7892e;
    }

    public void c() {
        this.f7894g = true;
    }

    public boolean d() {
        return this.f7894g;
    }

    public boolean e() {
        g();
        return com.amazon.a.a.a((Application) this.f7892e.getApplicationContext());
    }
}
