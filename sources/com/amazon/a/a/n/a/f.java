package com.amazon.a.a.n.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.amazon.a.a.i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7338b = new com.amazon.a.a.o.c("DecisionDialog");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f7340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BlockingQueue<a> f7341e = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f7339c = Thread.currentThread();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.amazon.d.a.a f7344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f7345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Intent f7346c;

        public a(com.amazon.d.a.a aVar) {
            this.f7344a = aVar;
            this.f7345b = aVar.a();
            this.f7346c = aVar.b();
        }

        public com.amazon.d.a.a a() {
            return this.f7344a;
        }

        public String b() {
            return this.f7345b;
        }

        public Intent c() {
            return this.f7346c;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f7348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f7349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a f7350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f7351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f7352f;

        public b(com.amazon.d.a.f fVar) {
            this.f7347a = fVar.b();
            this.f7348b = fVar.c();
            this.f7349c = fVar.d();
            this.f7350d = a(fVar.e());
            this.f7351e = a(fVar.f());
            this.f7352f = a(fVar.g());
        }

        private a a(com.amazon.d.a.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new a(aVar);
        }

        public String a() {
            return this.f7347a;
        }

        public String b() {
            return this.f7348b;
        }

        public long c() {
            return this.f7349c;
        }

        public a d() {
            return this.f7352f;
        }

        public a e() {
            return this.f7351e;
        }

        public a f() {
            return this.f7350d;
        }
    }

    public f(com.amazon.d.a.f fVar) {
        this.f7340d = new b(fVar);
    }

    private void a(Activity activity, AlertDialog alertDialog, final a aVar, int i10) {
        if (aVar == null) {
            return;
        }
        alertDialog.setButton(i10, aVar.b(), new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.n.a.f.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                if (com.amazon.a.a.o.c.f7483a) {
                    f.f7338b.a("Choice selected!");
                }
                if (f.this.k()) {
                    f.this.f7341e.add(aVar);
                }
            }
        });
    }

    private boolean a(a aVar) {
        return (aVar == null || aVar.c() == null) ? false : true;
    }

    private ActivityInfo e(Activity activity) {
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            if (!com.amazon.a.a.o.c.f7484b) {
                return null;
            }
            f7338b.b("Unable to get info for activity: " + activity);
            return null;
        }
    }

    private Dialog f(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f7340d.a()).setMessage(this.f7340d.b()).setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        a(activity, alertDialogCreate, this.f7340d.f(), -1);
        a(activity, alertDialogCreate, this.f7340d.e(), -3);
        a(activity, alertDialogCreate, this.f7340d.d(), -2);
        return alertDialogCreate;
    }

    private com.amazon.d.a.a n() throws com.amazon.a.a.n.a.a.e {
        try {
            if (com.amazon.a.a.o.c.f7483a) {
                f7338b.a("Blocking while awaiting customer decision: " + Thread.currentThread());
            }
            return this.f7341e.take().a();
        } catch (InterruptedException unused) {
            if (com.amazon.a.a.o.c.f7483a) {
                f7338b.a("Interrupted while awaiting decision, throwing decision expired!");
            }
            throw new com.amazon.a.a.n.a.a.e(o());
        }
    }

    private e o() {
        return l() == com.amazon.a.a.i.d.NOT_COMPATIBLE ? e.APP_NOT_COMPATIBLE : e.EXPIRATION_DURATION_ELAPSED;
    }

    private boolean p() {
        return a(this.f7340d.f()) || a(this.f7340d.e()) || a(this.f7340d.d());
    }

    @Override // com.amazon.a.a.i.b
    protected void a(com.amazon.a.a.i.d dVar) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7338b.a("Expiring Decision Dialog: Thread: " + Thread.currentThread());
        }
        this.f7339c.interrupt();
    }

    @Override // com.amazon.a.a.i.b
    public boolean b(Activity activity) {
        if (!p()) {
            return true;
        }
        ActivityInfo activityInfoE = e(activity);
        if (activityInfoE == null) {
            return false;
        }
        boolean z10 = activityInfoE.launchMode == 3;
        com.amazon.a.a.o.c cVar = f7338b;
        cVar.a("Single instance: " + z10);
        boolean z11 = (activityInfoE.flags & 2) != 0;
        cVar.a("Finish on task launch:" + z11);
        boolean z12 = (activityInfoE.flags & 128) != 0;
        cVar.a("No History: " + z12);
        return (z10 || z11 || z12) ? false : true;
    }

    @Override // com.amazon.a.a.i.b
    public Dialog d(Activity activity) {
        return f(activity);
    }

    @Override // com.amazon.a.a.e.c
    protected long h() {
        return this.f7340d.c();
    }

    public com.amazon.d.a.a i() {
        if (com.amazon.a.a.o.c.f7483a) {
            f7338b.a("GetCustomerDecision: " + this.f7339c);
        }
        return n();
    }

    public String toString() {
        return "DecisionDialog: " + this.f7340d.a();
    }
}
