package s5;

import ae.r;
import ae.s;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import biz.cunning.cunning_document_scanner.fallback.DocumentScannerActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import jc.a;
import md.i0;
import sc.i;
import sc.j;
import sc.l;
import ya.b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements jc.a, j.c, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f19966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kc.c f19967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j.d f19968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Activity f19969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19970e = 3548984;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19971f = 3548983;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f19972g;

    static final class a extends s implements zd.l<IntentSender, i0> {
        a() {
            super(1);
        }

        public final void a(IntentSender intentSender) {
            Activity activity;
            try {
                Activity activity2 = d.this.f19969d;
                if (activity2 == null) {
                    r.t("activity");
                    activity = null;
                } else {
                    activity = activity2;
                }
                activity.startIntentSenderForResult(intentSender, d.this.f19970e, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                j.d dVar = d.this.f19968c;
                if (dVar != null) {
                    dVar.error("ERROR", "Failed to start document scanner", null);
                }
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(IntentSender intentSender) {
            a(intentSender);
            return i0.f15558a;
        }
    }

    private final void g(kc.c cVar) {
        this.f19967b = cVar;
        l lVar = this.f19966a;
        if (lVar == null) {
            this.f19966a = new l() { // from class: s5.a
                @Override // sc.l
                public final boolean onActivityResult(int i10, int i11, Intent intent) {
                    return d.h(this.f19962a, i10, i11, intent);
                }
            };
        } else {
            r.c(lVar);
            cVar.d(lVar);
        }
        l lVar2 = this.f19966a;
        r.c(lVar2);
        cVar.b(lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[PHI: r11 r12
  0x00a5: PHI (r11v12 java.util.List) = (r11v8 java.util.List), (r11v22 java.util.List) binds: [B:70:0x0112, B:41:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r12v4 sc.j$d) = (r12v2 sc.j$d), (r12v7 sc.j$d) binds: [B:70:0x0112, B:41:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3 A[PHI: r11
  0x00b3: PHI (r11v15 sc.j$d) = (r11v11 sc.j$d), (r11v30 sc.j$d) binds: [B:47:0x00b1, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean h(s5.d r10, int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.d.h(s5.d, int, int, android.content.Intent):boolean");
    }

    private final Intent i(int i10) {
        Activity activity = this.f19969d;
        if (activity == null) {
            r.t("activity");
            activity = null;
        }
        Intent intent = new Intent(activity, (Class<?>) DocumentScannerActivity.class);
        intent.putExtra("maxNumDocuments", i10);
        return intent;
    }

    private final void j() {
        kc.c cVar;
        l lVar = this.f19966a;
        if (lVar == null || (cVar = this.f19967b) == null) {
            return;
        }
        cVar.d(lVar);
    }

    private final void k(final int i10, boolean z10) {
        ya.b bVarA = new b.a().b(z10).c(i10).d(101, new int[0]).e(1).a();
        r.e(bVarA, "build(...)");
        ya.a aVarA = ya.c.a(bVarA);
        r.e(aVarA, "getClient(...)");
        Activity activity = this.f19969d;
        if (activity == null) {
            r.t("activity");
            activity = null;
        }
        Task<IntentSender> taskB = aVarA.b(activity);
        final a aVar = new a();
        taskB.addOnSuccessListener(new OnSuccessListener() { // from class: s5.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                d.l(aVar, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: s5.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                d.m(this.f19964a, i10, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(zd.l lVar, Object obj) {
        r.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(d dVar, int i10, Exception exc) {
        j.d dVar2;
        String str;
        r.f(dVar, "this$0");
        r.f(exc, "it");
        if (exc instanceof sa.a) {
            Intent intentI = dVar.i(i10);
            try {
                Activity activity = dVar.f19969d;
                if (activity == null) {
                    r.t("activity");
                    activity = null;
                }
                androidx.core.app.a.k(activity, intentI, dVar.f19971f, null);
                return;
            } catch (ActivityNotFoundException unused) {
                dVar2 = dVar.f19968c;
                if (dVar2 == null) {
                    return;
                } else {
                    str = "FAILED TO START ACTIVITY";
                }
            }
        } else {
            dVar2 = dVar.f19968c;
            if (dVar2 == null) {
                return;
            } else {
                str = "Failed to start document scanner Intent";
            }
        }
        dVar2.error("ERROR", str, null);
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        r.f(cVar, "binding");
        Activity activity = cVar.getActivity();
        r.e(activity, "getActivity(...)");
        this.f19969d = activity;
        g(cVar);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "flutterPluginBinding");
        j jVar = new j(bVar.b(), "cunning_document_scanner");
        this.f19972g = jVar;
        jVar.e(this);
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        j();
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        j jVar = this.f19972g;
        if (jVar == null) {
            r.t("channel");
            jVar = null;
        }
        jVar.e(null);
    }

    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        r.f(iVar, "call");
        r.f(dVar, "result");
        if (!r.b(iVar.f20503a, "getPictures")) {
            dVar.notImplemented();
            return;
        }
        Integer num = (Integer) iVar.a("noOfPages");
        if (num == null) {
            num = 50;
        }
        int iIntValue = num.intValue();
        Boolean bool = (Boolean) iVar.a("isGalleryImportAllowed");
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.f19968c = dVar;
        k(iIntValue, zBooleanValue);
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        r.f(cVar, "binding");
        g(cVar);
    }
}
