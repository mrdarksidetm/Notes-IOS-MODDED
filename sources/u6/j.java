package u6;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s6.d2;
import s6.d3;
import s6.f1;
import s6.g0;
import s6.g3;
import s6.h3;
import s6.i2;
import s6.j1;
import s6.m2;
import s6.n2;
import s6.p0;
import s6.v0;
import s6.v1;
import s6.w2;

/* JADX INFO: loaded from: classes.dex */
public final class j implements v0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ScheduledFuture<?> f21726f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f21727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f21728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f21729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f21730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i2 f21731e;

    static {
        System.loadLibrary(f1.a("44210C7DBB2A5B58"));
    }

    public j(Context context, w2 w2Var, String str, g0 g0Var, d dVar, t6.e eVar) {
        this.f21730d = context;
        i2 i2Var = new i2(context);
        this.f21731e = i2Var;
        h3 h3Var = new h3(g0Var, new f(new g3(context), i2Var), str, dVar, this);
        this.f21728b = h3Var;
        l lVar = new l(context, dVar.a(), i2Var);
        this.f21727a = new v1(context, w2Var, h3Var, g0Var, dVar, lVar);
        b bVar = new b(context, new d3(h3Var, lVar), i2Var);
        this.f21729c = bVar;
        bVar.c(context);
        i2Var.h();
        e(context);
        d(context, eVar);
        i(context);
        c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, t6.e eVar) {
        p0.f20248a.b(context);
        this.f21727a.a(d2.b(eVar), null);
        v1 v1Var = this.f21727a;
        v1Var.getClass();
        m2 m2Var = v1Var.f20352o;
        if (m2Var != null) {
            m2Var.a(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        for (j1 j1Var : this.f21727a.b()) {
            if (j1Var != null && !j1Var.c()) {
                j1Var.a(context);
            }
        }
        this.f21728b.b(context);
    }

    @Override // s6.v0
    public String a(String str) {
        return null;
    }

    public final void c(final Context context) {
        new Thread(new Runnable() { // from class: u6.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f21721a.h(context);
            }
        }).start();
    }

    public final void d(final Context context, final t6.e eVar) {
        new Thread(new Runnable() { // from class: u6.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f21723a.f(context, eVar);
            }
        }).start();
    }

    public final void e(Context context) {
        for (j1 j1Var : this.f21727a.b()) {
            if (j1Var != null && j1Var.c()) {
                j1Var.a(context);
            }
        }
    }

    public final Runnable g(Context context) {
        return new n2(this.f21727a, context);
    }

    public final void i(Context context) {
        f21726f = Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(g(context), 180L, 180L, TimeUnit.SECONDS);
    }
}
