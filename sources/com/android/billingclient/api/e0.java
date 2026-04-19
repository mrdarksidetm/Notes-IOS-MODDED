package com.android.billingclient.api;

import com.android.billingclient.api.e;
import com.revenuecat.purchases.google.ErrorsKt;

/* JADX INFO: loaded from: classes.dex */
final class e0 {
    static final e A;
    static final e B;
    static final e C;
    static final e D;
    static final e E;
    static final e F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e f8086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final e f8087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final e f8088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final e f8089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final e f8090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final e f8091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final e f8092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final e f8093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final e f8094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final e f8095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final e f8096k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final e f8097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final e f8098m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final e f8099n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final e f8100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final e f8101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final e f8102q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final e f8103r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final e f8104s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final e f8105t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final e f8106u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final e f8107v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final e f8108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final e f8109x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final e f8110y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final e f8111z;

    static {
        e.a aVarC = e.c();
        aVarC.c(3);
        aVarC.b(ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE);
        f8086a = aVarC.a();
        e.a aVarC2 = e.c();
        aVarC2.c(3);
        aVarC2.b("Google Play In-app Billing API version is less than 9");
        f8087b = aVarC2.a();
        e.a aVarC3 = e.c();
        aVarC3.c(3);
        aVarC3.b("Billing service unavailable on device.");
        f8088c = aVarC3.a();
        e.a aVarC4 = e.c();
        aVarC4.c(5);
        aVarC4.b("Client is already in the process of connecting to billing service.");
        f8089d = aVarC4.a();
        e.a aVarC5 = e.c();
        aVarC5.c(5);
        aVarC5.b("The list of SKUs can't be empty.");
        f8090e = aVarC5.a();
        e.a aVarC6 = e.c();
        aVarC6.c(5);
        aVarC6.b("SKU type can't be empty.");
        f8091f = aVarC6.a();
        e.a aVarC7 = e.c();
        aVarC7.c(5);
        aVarC7.b("Product type can't be empty.");
        f8092g = aVarC7.a();
        e.a aVarC8 = e.c();
        aVarC8.c(-2);
        aVarC8.b("Client does not support extra params.");
        f8093h = aVarC8.a();
        e.a aVarC9 = e.c();
        aVarC9.c(5);
        aVarC9.b("Invalid purchase token.");
        f8094i = aVarC9.a();
        e.a aVarC10 = e.c();
        aVarC10.c(6);
        aVarC10.b("An internal error occurred.");
        f8095j = aVarC10.a();
        e.a aVarC11 = e.c();
        aVarC11.c(5);
        aVarC11.b("SKU can't be null.");
        f8096k = aVarC11.a();
        e.a aVarC12 = e.c();
        aVarC12.c(0);
        f8097l = aVarC12.a();
        e.a aVarC13 = e.c();
        aVarC13.c(-1);
        aVarC13.b("Service connection is disconnected.");
        f8098m = aVarC13.a();
        e.a aVarC14 = e.c();
        aVarC14.c(2);
        aVarC14.b("Timeout communicating with service.");
        f8099n = aVarC14.a();
        e.a aVarC15 = e.c();
        aVarC15.c(-2);
        aVarC15.b("Client does not support subscriptions.");
        f8100o = aVarC15.a();
        e.a aVarC16 = e.c();
        aVarC16.c(-2);
        aVarC16.b("Client does not support subscriptions update.");
        f8101p = aVarC16.a();
        e.a aVarC17 = e.c();
        aVarC17.c(-2);
        aVarC17.b("Client does not support get purchase history.");
        f8102q = aVarC17.a();
        e.a aVarC18 = e.c();
        aVarC18.c(-2);
        aVarC18.b("Client does not support price change confirmation.");
        f8103r = aVarC18.a();
        e.a aVarC19 = e.c();
        aVarC19.c(-2);
        aVarC19.b("Play Store version installed does not support cross selling products.");
        f8104s = aVarC19.a();
        e.a aVarC20 = e.c();
        aVarC20.c(-2);
        aVarC20.b("Client does not support multi-item purchases.");
        f8105t = aVarC20.a();
        e.a aVarC21 = e.c();
        aVarC21.c(-2);
        aVarC21.b("Client does not support offer_id_token.");
        f8106u = aVarC21.a();
        e.a aVarC22 = e.c();
        aVarC22.c(-2);
        aVarC22.b("Client does not support ProductDetails.");
        f8107v = aVarC22.a();
        e.a aVarC23 = e.c();
        aVarC23.c(-2);
        aVarC23.b("Client does not support in-app messages.");
        f8108w = aVarC23.a();
        e.a aVarC24 = e.c();
        aVarC24.c(-2);
        aVarC24.b("Client does not support user choice billing.");
        f8109x = aVarC24.a();
        e.a aVarC25 = e.c();
        aVarC25.c(-2);
        aVarC25.b("Play Store version installed does not support external offer.");
        f8110y = aVarC25.a();
        e.a aVarC26 = e.c();
        aVarC26.c(5);
        aVarC26.b("Unknown feature");
        f8111z = aVarC26.a();
        e.a aVarC27 = e.c();
        aVarC27.c(-2);
        aVarC27.b("Play Store version installed does not support get billing config.");
        A = aVarC27.a();
        e.a aVarC28 = e.c();
        aVarC28.c(-2);
        aVarC28.b("Query product details with serialized docid is not supported.");
        B = aVarC28.a();
        e.a aVarC29 = e.c();
        aVarC29.c(4);
        aVarC29.b("Item is unavailable for purchase.");
        C = aVarC29.a();
        e.a aVarC30 = e.c();
        aVarC30.c(-2);
        aVarC30.b("Query product details with developer specified account is not supported.");
        D = aVarC30.a();
        e.a aVarC31 = e.c();
        aVarC31.c(-2);
        aVarC31.b("Play Store version installed does not support alternative billing only.");
        E = aVarC31.a();
        e.a aVarC32 = e.c();
        aVarC32.c(5);
        aVarC32.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        F = aVarC32.a();
    }

    static e a(int i10, String str) {
        e.a aVarC = e.c();
        aVarC.c(i10);
        aVarC.b(str);
        return aVarC.a();
    }
}
