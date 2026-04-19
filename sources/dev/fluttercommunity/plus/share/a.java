package dev.fluttercommunity.plus.share;

import ae.r;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;
import sc.j;
import sc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0232a f10064d = new C0232a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j.d f10066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f10067c;

    /* JADX INFO: renamed from: dev.fluttercommunity.plus.share.a$a, reason: collision with other inner class name */
    public static final class C0232a {
        private C0232a() {
        }

        public /* synthetic */ C0232a(ae.j jVar) {
            this();
        }
    }

    public a(Context context) {
        r.f(context, "context");
        this.f10065a = context;
        this.f10067c = new AtomicBoolean(true);
    }

    private final void b(String str) {
        j.d dVar;
        if (!this.f10067c.compareAndSet(false, true) || (dVar = this.f10066b) == null) {
            return;
        }
        r.c(dVar);
        dVar.success(str);
        this.f10066b = null;
    }

    public final void a() {
        this.f10067c.set(true);
        this.f10066b = null;
    }

    public final void c(j.d dVar) {
        j.d dVar2;
        r.f(dVar, "callback");
        if (!this.f10067c.compareAndSet(true, false) && (dVar2 = this.f10066b) != null) {
            dVar2.success("dev.fluttercommunity.plus/share/unavailable");
        }
        SharePlusPendingIntent.f10062a.b("");
        this.f10067c.set(false);
        this.f10066b = dVar;
    }

    public final void d() {
        b("dev.fluttercommunity.plus/share/unavailable");
    }

    @Override // sc.l
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 22643) {
            return false;
        }
        b(SharePlusPendingIntent.f10062a.a());
        return true;
    }
}
