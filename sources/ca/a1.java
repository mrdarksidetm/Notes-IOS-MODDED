package ca;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f6602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f6603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f6604c;

    private a1(Context context, v vVar) {
        this.f6604c = false;
        this.f6602a = 0;
        this.f6603b = vVar;
        com.google.android.gms.common.api.internal.a.c((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.a.b().a(new e1(this));
    }

    public a1(x9.f fVar) {
        this(fVar.l(), new v(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e() {
        return this.f6602a > 0 && !this.f6604c;
    }

    public final void b() {
        this.f6603b.b();
    }

    public final void d(zzagl zzaglVar) {
        if (zzaglVar == null) {
            return;
        }
        long jZza = zzaglVar.zza();
        if (jZza <= 0) {
            jZza = 3600;
        }
        long jZzb = zzaglVar.zzb() + (jZza * 1000);
        v vVar = this.f6603b;
        vVar.f6760b = jZzb;
        vVar.f6761c = -1L;
        if (e()) {
            this.f6603b.c();
        }
    }
}
