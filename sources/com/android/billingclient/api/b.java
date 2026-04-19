package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.i;
import com.google.android.gms.internal.play_billing.zzaa;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzgz;
import com.google.android.gms.internal.play_billing.zzhb;
import com.google.android.gms.internal.play_billing.zzs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class b extends a {
    private boolean A;
    private ExecutorService B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f8025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f8027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile t0 f8028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f8029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d0 f8030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile zzs f8031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile y f8032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f8039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f8041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f8042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8046v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8049y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private g f8050z;

    private b(Context context, g gVar, v6.m mVar, String str, String str2, v6.p pVar, d0 d0Var, ExecutorService executorService) {
        this.f8025a = 0;
        this.f8027c = new Handler(Looper.getMainLooper());
        this.f8035k = 0;
        this.f8026b = str;
        n(context, mVar, gVar, pVar, str, null);
    }

    b(String str, Context context, d0 d0Var, ExecutorService executorService) {
        this.f8025a = 0;
        this.f8027c = new Handler(Looper.getMainLooper());
        this.f8035k = 0;
        String strW = W();
        this.f8026b = strW;
        this.f8029e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strW);
        zzgtVarZzy.zzm(this.f8029e.getPackageName());
        this.f8030f = new f0(this.f8029e, (zzgu) zzgtVarZzy.zzf());
        this.f8029e.getPackageName();
    }

    b(String str, g gVar, Context context, v6.g0 g0Var, d0 d0Var, ExecutorService executorService) {
        this.f8025a = 0;
        this.f8027c = new Handler(Looper.getMainLooper());
        this.f8035k = 0;
        this.f8026b = W();
        this.f8029e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(W());
        zzgtVarZzy.zzm(this.f8029e.getPackageName());
        this.f8030f = new f0(this.f8029e, (zzgu) zzgtVarZzy.zzf());
        zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f8028d = new t0(this.f8029e, null, null, null, null, this.f8030f);
        this.f8050z = gVar;
        this.f8029e.getPackageName();
    }

    b(String str, g gVar, Context context, v6.m mVar, v6.a0 a0Var, d0 d0Var, ExecutorService executorService) {
        String strW = W();
        this.f8025a = 0;
        this.f8027c = new Handler(Looper.getMainLooper());
        this.f8035k = 0;
        this.f8026b = strW;
        o(context, mVar, gVar, null, strW, null);
    }

    b(String str, g gVar, Context context, v6.m mVar, v6.p pVar, d0 d0Var, ExecutorService executorService) {
        this(context, gVar, mVar, W(), null, pVar, null, null);
    }

    static /* bridge */ /* synthetic */ v6.m0 P(b bVar, String str, int i10) {
        zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzc = zzb.zzc(bVar.f8038n, bVar.f8046v, bVar.f8050z.a(), bVar.f8050z.b(), bVar.f8026b);
        List list = null;
        String string = null;
        while (true) {
            try {
                Bundle bundleZzj = bVar.f8038n ? bVar.f8031g.zzj(true != bVar.f8046v ? 9 : 19, bVar.f8029e.getPackageName(), str, string, bundleZzc) : bVar.f8031g.zzi(3, bVar.f8029e.getPackageName(), str, string);
                p0 p0VarA = q0.a(bundleZzj, "BillingClient", "getPurchase()");
                e eVarA = p0VarA.a();
                if (eVarA != e0.f8097l) {
                    bVar.Y(c0.a(p0VarA.b(), 9, eVarA));
                    return new v6.m0(eVarA, list);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z10 = false;
                for (int i11 = 0; i11 < stringArrayList2.size(); i11++) {
                    String str2 = stringArrayList2.get(i11);
                    String str3 = stringArrayList3.get(i11);
                    zzb.zzj("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i11))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.f())) {
                            zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e10) {
                        zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e10);
                        e eVar = e0.f8095j;
                        bVar.Y(c0.a(51, 9, eVar));
                        return new v6.m0(eVar, null);
                    }
                }
                if (z10) {
                    bVar.Y(c0.a(26, 9, e0.f8095j));
                }
                string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new v6.m0(e0.f8097l, arrayList);
                }
                list = null;
            } catch (Exception e11) {
                e eVar2 = e0.f8098m;
                bVar.Y(c0.a(52, 9, eVar2));
                zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e11);
                return new v6.m0(eVar2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler S() {
        return Looper.myLooper() == null ? this.f8027c : new Handler(Looper.myLooper());
    }

    private final e T(final e eVar) {
        if (Thread.interrupted()) {
            return eVar;
        }
        this.f8027c.post(new Runnable() { // from class: com.android.billingclient.api.u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8235a.H(eVar);
            }
        });
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e U() {
        return (this.f8025a == 0 || this.f8025a == 3) ? e0.f8098m : e0.f8095j;
    }

    private final String V(i iVar) {
        if (TextUtils.isEmpty(null)) {
            return this.f8029e.getPackageName();
        }
        return null;
    }

    private static String W() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.0.0";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future X(Callable callable, long j10, final Runnable runnable, Handler handler) {
        if (this.B == null) {
            this.B = Executors.newFixedThreadPool(zzb.zza, new s(this));
        }
        try {
            final Future futureSubmit = this.B.submit(callable);
            handler.postDelayed(new Runnable() { // from class: v6.y0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            zzb.zzl("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(zzga zzgaVar) {
        this.f8030f.d(zzgaVar, this.f8035k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(zzge zzgeVar) {
        this.f8030f.b(zzgeVar, this.f8035k);
    }

    private final void a0(String str, final v6.k kVar) {
        if (!f()) {
            e eVar = e0.f8098m;
            Y(c0.a(2, 11, eVar));
            kVar.a(eVar, null);
        } else if (X(new u(this, str, kVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f8192a.M(kVar);
            }
        }, S()) == null) {
            e eVarU = U();
            Y(c0.a(25, 11, eVarU));
            kVar.a(eVarU, null);
        }
    }

    private final void b0(String str, final v6.l lVar) {
        if (!f()) {
            e eVar = e0.f8098m;
            Y(c0.a(2, 9, eVar));
            lVar.a(eVar, zzai.zzk());
        } else {
            if (TextUtils.isEmpty(str)) {
                zzb.zzk("BillingClient", "Please provide a valid product type.");
                e eVar2 = e0.f8092g;
                Y(c0.a(50, 9, eVar2));
                lVar.a(eVar2, zzai.zzk());
                return;
            }
            if (X(new t(this, str, lVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8176a.N(lVar);
                }
            }, S()) == null) {
                e eVarU = U();
                Y(c0.a(25, 9, eVarU));
                lVar.a(eVarU, zzai.zzk());
            }
        }
    }

    private final boolean c0() {
        return this.f8046v && this.f8050z.b();
    }

    private final void d0(e eVar, int i10, int i11) {
        zzge zzgeVar = null;
        zzga zzgaVar = null;
        if (eVar.b() == 0) {
            int i12 = c0.f8056a;
            try {
                zzgd zzgdVarZzy = zzge.zzy();
                zzgdVarZzy.zzm(5);
                zzgz zzgzVarZzy = zzhb.zzy();
                zzgzVarZzy.zzl(i11);
                zzgdVarZzy.zzl((zzhb) zzgzVarZzy.zzf());
                zzgeVar = (zzge) zzgdVarZzy.zzf();
            } catch (Exception e10) {
                zzb.zzl("BillingLogger", "Unable to create logging payload", e10);
            }
            Z(zzgeVar);
            return;
        }
        int i13 = c0.f8056a;
        try {
            zzfz zzfzVarZzy = zzga.zzy();
            zzgg zzggVarZzy = zzgk.zzy();
            zzggVarZzy.zzn(eVar.b());
            zzggVarZzy.zzm(eVar.a());
            zzggVarZzy.zzo(i10);
            zzfzVarZzy.zzl(zzggVarZzy);
            zzfzVarZzy.zzn(5);
            zzgz zzgzVarZzy2 = zzhb.zzy();
            zzgzVarZzy2.zzl(i11);
            zzfzVarZzy.zzm((zzhb) zzgzVarZzy2.zzf());
            zzgaVar = (zzga) zzfzVarZzy.zzf();
        } catch (Exception e11) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e11);
        }
        Y(zzgaVar);
    }

    static /* bridge */ /* synthetic */ b0 j0(b bVar, String str) {
        zzb.zzj("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzc = zzb.zzc(bVar.f8038n, bVar.f8046v, bVar.f8050z.a(), bVar.f8050z.b(), bVar.f8026b);
        String string = null;
        while (bVar.f8036l) {
            try {
                Bundle bundleZzh = bVar.f8031g.zzh(6, bVar.f8029e.getPackageName(), str, string, bundleZzc);
                p0 p0VarA = q0.a(bundleZzh, "BillingClient", "getPurchaseHistory()");
                e eVarA = p0VarA.a();
                if (eVarA != e0.f8097l) {
                    bVar.Y(c0.a(p0VarA.b(), 11, eVarA));
                    return new b0(eVarA, null);
                }
                ArrayList<String> stringArrayList = bundleZzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z10 = false;
                for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                    String str2 = stringArrayList2.get(i10);
                    String str3 = stringArrayList3.get(i10);
                    zzb.zzj("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.d())) {
                            zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e10) {
                        zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e10);
                        e eVar = e0.f8095j;
                        bVar.Y(c0.a(51, 11, eVar));
                        return new b0(eVar, null);
                    }
                }
                if (z10) {
                    bVar.Y(c0.a(26, 11, e0.f8095j));
                }
                string = bundleZzh.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new b0(e0.f8097l, arrayList);
                }
            } catch (RemoteException e11) {
                zzb.zzl("BillingClient", "Got exception trying to get purchase history, try to reconnect", e11);
                e eVar2 = e0.f8098m;
                bVar.Y(c0.a(59, 11, eVar2));
                return new b0(eVar2, null);
            }
        }
        zzb.zzk("BillingClient", "getPurchaseHistory is not supported on current device");
        return new b0(e0.f8102q, null);
    }

    private void n(Context context, v6.m mVar, g gVar, v6.p pVar, String str, d0 d0Var) {
        this.f8029e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(str);
        zzgtVarZzy.zzm(this.f8029e.getPackageName());
        if (d0Var == null) {
            d0Var = new f0(this.f8029e, (zzgu) zzgtVarZzy.zzf());
        }
        this.f8030f = d0Var;
        if (mVar == null) {
            zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f8028d = new t0(this.f8029e, mVar, null, null, pVar, this.f8030f);
        this.f8050z = gVar;
        this.A = pVar != null;
    }

    private void o(Context context, v6.m mVar, g gVar, v6.a0 a0Var, String str, d0 d0Var) {
        this.f8029e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(str);
        zzgtVarZzy.zzm(this.f8029e.getPackageName());
        if (d0Var == null) {
            d0Var = new f0(this.f8029e, (zzgu) zzgtVarZzy.zzf());
        }
        this.f8030f = d0Var;
        if (mVar == null) {
            zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f8028d = new t0(this.f8029e, mVar, null, a0Var, null, this.f8030f);
        this.f8050z = gVar;
        this.A = a0Var != null;
        this.f8029e.getPackageName();
    }

    final /* synthetic */ void G(v6.b bVar) {
        e eVar = e0.f8099n;
        Y(c0.a(24, 3, eVar));
        bVar.a(eVar);
    }

    final /* synthetic */ void H(e eVar) {
        if (this.f8028d.d() != null) {
            this.f8028d.d().onPurchasesUpdated(eVar, null);
        } else {
            zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final /* synthetic */ void I(v6.f fVar, v6.e eVar) {
        e eVar2 = e0.f8099n;
        Y(c0.a(24, 4, eVar2));
        fVar.a(eVar2, eVar.a());
    }

    final /* synthetic */ void J(v6.d dVar) {
        e eVar = e0.f8099n;
        Y(c0.a(24, 13, eVar));
        dVar.a(eVar, null);
    }

    final /* synthetic */ void K(v6.j jVar) {
        e eVar = e0.f8099n;
        Y(c0.a(24, 7, eVar));
        jVar.a(eVar, new ArrayList());
    }

    final /* synthetic */ void M(v6.k kVar) {
        e eVar = e0.f8099n;
        Y(c0.a(24, 11, eVar));
        kVar.a(eVar, null);
    }

    final /* synthetic */ void N(v6.l lVar) {
        e eVar = e0.f8099n;
        Y(c0.a(24, 9, eVar));
        lVar.a(eVar, zzai.zzk());
    }

    @Override // com.android.billingclient.api.a
    public final void a(final v6.a aVar, final v6.b bVar) {
        if (!f()) {
            e eVar = e0.f8098m;
            Y(c0.a(2, 3, eVar));
            bVar.a(eVar);
            return;
        }
        if (TextUtils.isEmpty(aVar.a())) {
            zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            e eVar2 = e0.f8094i;
            Y(c0.a(26, 3, eVar2));
            bVar.a(eVar2);
            return;
        }
        if (!this.f8038n) {
            e eVar3 = e0.f8087b;
            Y(c0.a(27, 3, eVar3));
            bVar.a(eVar3);
        } else if (X(new Callable() { // from class: com.android.billingclient.api.w0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f8242a.n0(aVar, bVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.x0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8246a.G(bVar);
            }
        }, S()) == null) {
            e eVarU = U();
            Y(c0.a(25, 3, eVarU));
            bVar.a(eVarU);
        }
    }

    @Override // com.android.billingclient.api.a
    public final void b(final v6.e eVar, final v6.f fVar) {
        if (!f()) {
            e eVar2 = e0.f8098m;
            Y(c0.a(2, 4, eVar2));
            fVar.a(eVar2, eVar.a());
        } else if (X(new Callable() { // from class: com.android.billingclient.api.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f8180a.o0(eVar, fVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f8183a.I(fVar, eVar);
            }
        }, S()) == null) {
            e eVarU = U();
            Y(c0.a(25, 4, eVarU));
            fVar.a(eVarU, eVar.a());
        }
    }

    @Override // com.android.billingclient.api.a
    public final void c() {
        Z(c0.c(12));
        try {
            try {
                if (this.f8028d != null) {
                    this.f8028d.f();
                }
                if (this.f8032h != null) {
                    this.f8032h.c();
                }
                if (this.f8032h != null && this.f8031g != null) {
                    zzb.zzj("BillingClient", "Unbinding from service.");
                    this.f8029e.unbindService(this.f8032h);
                    this.f8032h = null;
                }
                this.f8031g = null;
                ExecutorService executorService = this.B;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.B = null;
                }
            } catch (Exception e10) {
                zzb.zzl("BillingClient", "There was an exception while ending connection!", e10);
            }
        } finally {
            this.f8025a = 3;
        }
    }

    @Override // com.android.billingclient.api.a
    public void d(v6.g gVar, final v6.d dVar) {
        if (!f()) {
            zzb.zzk("BillingClient", "Service disconnected.");
            e eVar = e0.f8098m;
            Y(c0.a(2, 13, eVar));
            dVar.a(eVar, null);
            return;
        }
        if (!this.f8045u) {
            zzb.zzk("BillingClient", "Current client doesn't support get billing config.");
            e eVar2 = e0.A;
            Y(c0.a(32, 13, eVar2));
            dVar.a(eVar2, null);
            return;
        }
        String str = this.f8026b;
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (X(new Callable() { // from class: com.android.billingclient.api.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f8252a.p0(bundle, dVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8258a.J(dVar);
            }
        }, S()) == null) {
            e eVarU = U();
            Y(c0.a(25, 13, eVarU));
            dVar.a(eVarU, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    @Override // com.android.billingclient.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.e e(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.e(java.lang.String):com.android.billingclient.api.e");
    }

    @Override // com.android.billingclient.api.a
    public final boolean f() {
        return (this.f8025a != 2 || this.f8031g == null || this.f8032h == null) ? false : true;
    }

    final /* synthetic */ Bundle f0(int i10, String str, String str2, d dVar, Bundle bundle) {
        return this.f8031g.zzg(i10, this.f8029e.getPackageName(), str, str2, null, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x042e  */
    @Override // com.android.billingclient.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.e g(android.app.Activity r33, final com.android.billingclient.api.d r34) {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.g(android.app.Activity, com.android.billingclient.api.d):com.android.billingclient.api.e");
    }

    final /* synthetic */ Bundle g0(String str, String str2) {
        return this.f8031g.zzf(3, this.f8029e.getPackageName(), str, str2, null);
    }

    @Override // com.android.billingclient.api.a
    public final void i(final i iVar, final v6.j jVar) {
        if (!f()) {
            e eVar = e0.f8098m;
            Y(c0.a(2, 7, eVar));
            jVar.a(eVar, new ArrayList());
        } else {
            if (!this.f8044t) {
                zzb.zzk("BillingClient", "Querying product details is not supported.");
                e eVar2 = e0.f8107v;
                Y(c0.a(20, 7, eVar2));
                jVar.a(eVar2, new ArrayList());
                return;
            }
            if (X(new Callable() { // from class: com.android.billingclient.api.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f8195a.q0(iVar, jVar);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8199a.K(jVar);
                }
            }, S()) == null) {
                e eVarU = U();
                Y(c0.a(25, 7, eVarU));
                jVar.a(eVarU, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.a
    public final void j(v6.n nVar, v6.k kVar) {
        a0(nVar.b(), kVar);
    }

    @Override // com.android.billingclient.api.a
    public final void k(v6.o oVar, v6.l lVar) {
        b0(oVar.b(), lVar);
    }

    @Override // com.android.billingclient.api.a
    public final e l(final Activity activity, f fVar, v6.h hVar) {
        if (!f()) {
            zzb.zzk("BillingClient", "Service disconnected.");
            return e0.f8098m;
        }
        if (!this.f8040p) {
            zzb.zzk("BillingClient", "Current client doesn't support showing in-app messages.");
            return e0.f8108w;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        d3.f.a(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f8026b);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", fVar.b());
        final v vVar = new v(this, this.f8027c, hVar);
        X(new Callable() { // from class: com.android.billingclient.api.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f8203a.r0(bundle, activity, vVar);
                return null;
            }
        }, 5000L, null, this.f8027c);
        return e0.f8097l;
    }

    @Override // com.android.billingclient.api.a
    public final void m(v6.c cVar) {
        if (f()) {
            zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            Z(c0.c(6));
            cVar.onBillingSetupFinished(e0.f8097l);
            return;
        }
        int i10 = 1;
        if (this.f8025a == 1) {
            zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            e eVar = e0.f8089d;
            Y(c0.a(37, 6, eVar));
            cVar.onBillingSetupFinished(eVar);
            return;
        }
        if (this.f8025a == 3) {
            zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            e eVar2 = e0.f8098m;
            Y(c0.a(38, 6, eVar2));
            cVar.onBillingSetupFinished(eVar2);
            return;
        }
        this.f8025a = 1;
        zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.f8032h = new y(this, cVar, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f8029e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i10 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i10 = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f8026b);
                    if (this.f8029e.bindService(intent2, this.f8032h, 1)) {
                        zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i10 = 39;
                    }
                }
            }
        }
        this.f8025a = 0;
        zzb.zzj("BillingClient", "Billing service unavailable on device.");
        e eVar3 = e0.f8088c;
        Y(c0.a(i10, 6, eVar3));
        cVar.onBillingSetupFinished(eVar3);
    }

    final /* synthetic */ Object n0(v6.a aVar, v6.b bVar) {
        try {
            zzs zzsVar = this.f8031g;
            String packageName = this.f8029e.getPackageName();
            String strA = aVar.a();
            String str = this.f8026b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle bundleZzd = zzsVar.zzd(9, packageName, strA, bundle);
            bVar.a(e0.a(zzb.zzb(bundleZzd, "BillingClient"), zzb.zzg(bundleZzd, "BillingClient")));
            return null;
        } catch (Exception e10) {
            zzb.zzl("BillingClient", "Error acknowledge purchase!", e10);
            e eVar = e0.f8098m;
            Y(c0.a(28, 3, eVar));
            bVar.a(eVar);
            return null;
        }
    }

    final /* synthetic */ Object o0(v6.e eVar, v6.f fVar) {
        int iZza;
        String strZzg;
        String strA = eVar.a();
        try {
            zzb.zzj("BillingClient", "Consuming purchase with token: " + strA);
            if (this.f8038n) {
                zzs zzsVar = this.f8031g;
                String packageName = this.f8029e.getPackageName();
                boolean z10 = this.f8038n;
                String str = this.f8026b;
                Bundle bundle = new Bundle();
                if (z10) {
                    bundle.putString("playBillingLibraryVersion", str);
                }
                Bundle bundleZze = zzsVar.zze(9, packageName, strA, bundle);
                iZza = bundleZze.getInt("RESPONSE_CODE");
                strZzg = zzb.zzg(bundleZze, "BillingClient");
            } else {
                iZza = this.f8031g.zza(3, this.f8029e.getPackageName(), strA);
                strZzg = "";
            }
            e eVarA = e0.a(iZza, strZzg);
            if (iZza == 0) {
                zzb.zzj("BillingClient", "Successfully consumed purchase.");
            } else {
                zzb.zzk("BillingClient", "Error consuming purchase with token. Response code: " + iZza);
                Y(c0.a(23, 4, eVarA));
            }
            fVar.a(eVarA, strA);
            return null;
        } catch (Exception e10) {
            zzb.zzl("BillingClient", "Error consuming purchase!", e10);
            e eVar2 = e0.f8098m;
            Y(c0.a(29, 4, eVar2));
            fVar.a(eVar2, strA);
            return null;
        }
    }

    final /* synthetic */ Object p0(Bundle bundle, v6.d dVar) {
        e eVar;
        try {
            this.f8031g.zzp(18, this.f8029e.getPackageName(), bundle, new z(dVar, this.f8030f, this.f8035k, null));
        } catch (DeadObjectException e10) {
            zzb.zzl("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e10);
            eVar = e0.f8098m;
            Y(c0.a(62, 13, eVar));
            dVar.a(eVar, null);
        } catch (Exception e11) {
            zzb.zzl("BillingClient", "getBillingConfig got an exception.", e11);
            eVar = e0.f8095j;
            Y(c0.a(62, 13, eVar));
            dVar.a(eVar, null);
        }
        return null;
    }

    final /* synthetic */ Object q0(i iVar, v6.j jVar) {
        String strZzg;
        Object obj;
        int iZzb;
        int i10;
        zzga zzgaVarA;
        zzga zzgaVarA2;
        ArrayList arrayList = new ArrayList();
        String strC = iVar.c();
        zzai zzaiVarB = iVar.b();
        int size = zzaiVarB.size();
        int i11 = 0;
        while (true) {
            strZzg = "Error trying to decode SkuDetails.";
            if (i11 >= size) {
                obj = null;
                strZzg = "";
                iZzb = 0;
                break;
            }
            int i12 = i11 + 20;
            ArrayList arrayList2 = new ArrayList(zzaiVarB.subList(i11, i12 > size ? size : i12));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(((i.b) arrayList2.get(i13)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f8026b);
            try {
                zzs zzsVar = this.f8031g;
                int i14 = true != this.f8047w ? 17 : 20;
                String packageName = this.f8029e.getPackageName();
                boolean zC0 = c0();
                String str = this.f8026b;
                V(iVar);
                V(iVar);
                V(iVar);
                zzai zzaiVar = zzaiVarB;
                Bundle bundle2 = new Bundle();
                bundle2.putString("playBillingLibraryVersion", str);
                bundle2.putBoolean(com.amazon.a.a.o.b.f7424ac, true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zC0) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i15 = size;
                int i16 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (i16 < size3) {
                    i.b bVar = (i.b) arrayList2.get(i16);
                    ArrayList arrayList6 = arrayList2;
                    try {
                        arrayList4.add(null);
                        z11 |= !TextUtils.isEmpty(null);
                        String strC2 = bVar.c();
                        int i17 = size3;
                        if (strC2.equals("first_party")) {
                            try {
                                zzaa.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                arrayList5.add(null);
                                z10 = true;
                            } catch (Exception e10) {
                                e = e10;
                                obj = null;
                                i10 = 6;
                                zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                Y(c0.a(43, 7, e0.f8095j));
                                strZzg = "An internal error occurred.";
                                iZzb = i10;
                                jVar.a(e0.a(iZzb, strZzg), arrayList);
                                return obj;
                            }
                        }
                        i16++;
                        size3 = i17;
                        arrayList2 = arrayList6;
                    } catch (Exception e11) {
                        e = e11;
                        obj = null;
                    }
                }
                if (z11) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z10) {
                    obj = null;
                    try {
                        if (!TextUtils.isEmpty(null)) {
                            bundle2.putString("accountName", null);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        i10 = 6;
                        zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                        Y(c0.a(43, 7, e0.f8095j));
                        strZzg = "An internal error occurred.";
                        iZzb = i10;
                        jVar.a(e0.a(iZzb, strZzg), arrayList);
                        return obj;
                    }
                } else {
                    obj = null;
                }
                int i18 = i14;
                i10 = 6;
                try {
                    Bundle bundleZzl = zzsVar.zzl(i18, packageName, strC, bundle, bundle2);
                    if (bundleZzl == null) {
                        zzb.zzk("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        zzgaVarA = c0.a(44, 7, e0.C);
                        break;
                    }
                    if (bundleZzl.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            zzb.zzk("BillingClient", "queryProductDetailsAsync got null response list");
                            zzgaVarA = c0.a(46, 7, e0.C);
                            break;
                        }
                        for (int i19 = 0; i19 < stringArrayList.size(); i19++) {
                            try {
                                h hVar = new h(stringArrayList.get(i19));
                                zzb.zzj("BillingClient", "Got product details: ".concat(hVar.toString()));
                                arrayList.add(hVar);
                            } catch (JSONException e13) {
                                zzb.zzl("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e13);
                                zzgaVarA2 = c0.a(47, 7, e0.a(6, "Error trying to decode SkuDetails."));
                                Y(zzgaVarA2);
                                iZzb = i10;
                                jVar.a(e0.a(iZzb, strZzg), arrayList);
                                return obj;
                            }
                        }
                        i11 = i12;
                        zzaiVarB = zzaiVar;
                        size = i15;
                    } else {
                        iZzb = zzb.zzb(bundleZzl, "BillingClient");
                        strZzg = zzb.zzg(bundleZzl, "BillingClient");
                        if (iZzb != 0) {
                            zzb.zzk("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb);
                            Y(c0.a(23, 7, e0.a(iZzb, strZzg)));
                        } else {
                            zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                            zzgaVarA2 = c0.a(45, 7, e0.a(6, strZzg));
                        }
                    }
                } catch (Exception e14) {
                    e = e14;
                    zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    Y(c0.a(43, 7, e0.f8095j));
                    strZzg = "An internal error occurred.";
                    iZzb = i10;
                    jVar.a(e0.a(iZzb, strZzg), arrayList);
                    return obj;
                }
            } catch (Exception e15) {
                e = e15;
                obj = null;
            }
        }
        Y(zzgaVarA);
        strZzg = "Item is unavailable for purchase.";
        iZzb = 4;
        jVar.a(e0.a(iZzb, strZzg), arrayList);
        return obj;
    }

    final /* synthetic */ Object r0(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        this.f8031g.zzt(12, this.f8029e.getPackageName(), bundle, new a0(new WeakReference(activity), resultReceiver, null));
        return null;
    }
}
