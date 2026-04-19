package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends com.amazon.a.a.e.c<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7174b = new com.amazon.a.a.o.c("Prompt");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f7175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Activity f7177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f7178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Dialog f7179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f7180h = new AtomicBoolean(false);

    public b() {
        int i10 = i();
        this.f7176d = i10;
        if (com.amazon.a.a.o.c.f7483a) {
            f7174b.a("Creating Prompt: " + i10);
        }
    }

    private void b(d dVar) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7174b.a("Expiring prompt pre-maturely: id: " + j() + ", prompt: " + this + ",, reason: " + dVar);
        }
        this.f7178f = dVar;
        c();
    }

    private boolean e(Activity activity) {
        if (this.f7175c.b(com.amazon.a.a.m.c.f7278e)) {
            return false;
        }
        return b(activity);
    }

    private void f(Activity activity) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7174b.a("Showing prompt, id: " + j() + ", prompt: " + this + ", activity: " + activity);
        }
        if (this.f7177e != null) {
            m();
        }
        activity.showDialog(j());
    }

    private int i() {
        int iNextInt = new Random().nextInt(2146249079) + 1234567;
        if (iNextInt <= 1234567) {
            return 1234567;
        }
        return iNextInt;
    }

    private void m() {
        if (com.amazon.a.a.o.c.f7483a) {
            f7174b.b("Dismissing dialog: " + this.f7176d);
        }
        try {
            this.f7177e.dismissDialog(this.f7176d);
            this.f7177e.removeDialog(this.f7176d);
        } catch (Exception unused) {
            if (com.amazon.a.a.o.c.f7483a) {
                f7174b.b("Unable to remove dialog: " + this.f7176d);
            }
        }
        this.f7177e = null;
        this.f7179g = null;
    }

    public final void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        if (e(activity)) {
            f(activity);
        } else {
            b(d.NOT_COMPATIBLE);
        }
    }

    public void a(Activity activity, boolean z10) {
        if (activity != this.f7177e) {
            if (com.amazon.a.a.o.c.f7483a) {
                f7174b.a("Unrecognized context");
            }
        } else {
            if (!z10 || this.f7179g.isShowing()) {
                return;
            }
            if (com.amazon.a.a.o.c.f7483a) {
                f7174b.a("showing dialog because it was not showing");
            }
            this.f7179g.show();
        }
    }

    protected abstract void a(d dVar);

    protected boolean b(Activity activity) {
        return true;
    }

    public final Dialog c(Activity activity) {
        this.f7177e = activity;
        Dialog dialogD = d(activity);
        this.f7179g = dialogD;
        dialogD.setCancelable(false);
        this.f7179g.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.amazon.a.a.i.b.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return i10 == 84;
            }
        });
        return this.f7179g;
    }

    protected abstract Dialog d(Activity activity);

    @Override // com.amazon.a.a.e.a
    protected final void d() {
        if (com.amazon.a.a.o.c.f7483a) {
            f7174b.a("Expiring prompt: " + this);
        }
        this.f7138a.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.b.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                b.this.k();
            }

            public String toString() {
                return "DismissPromptTask: " + b.this.toString();
            }
        });
        a(l());
    }

    public int j() {
        return this.f7176d;
    }

    protected final boolean k() {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f7483a) {
            f7174b.a("Dismissing Prompt: " + this.f7176d);
        }
        if (!this.f7180h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f7483a) {
                f7174b.b("Prompt has already been dismissed");
            }
            return false;
        }
        if (this.f7177e != null) {
            m();
        }
        f();
        return true;
    }

    protected d l() {
        if (!g()) {
            return null;
        }
        d dVar = this.f7178f;
        return dVar == null ? d.EXPIRATION_DURATION_ELAPSED : dVar;
    }
}
