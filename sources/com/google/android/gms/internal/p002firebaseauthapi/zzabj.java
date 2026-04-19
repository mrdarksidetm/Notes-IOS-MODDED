package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import ba.a0;
import ba.c0;
import ba.c1;
import ba.d;
import ba.e;
import ba.h;
import ba.j;
import ba.o0;
import ba.p0;
import ba.r0;
import ba.u0;
import ba.v0;
import ca.e2;
import ca.g;
import ca.g1;
import ca.i;
import ca.l0;
import ca.o1;
import ca.r;
import ca.w;
import ca.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.b;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import w8.m;
import x9.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzabj extends zzaei {
    public zzabj(f fVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzadh(fVar, scheduledExecutorService);
        this.zzb = executor;
    }

    static g zza(f fVar, zzage zzageVar) {
        m.k(fVar);
        m.k(zzageVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e2(zzageVar, "firebase"));
        List<zzagr> listZzl = zzageVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i10 = 0; i10 < listZzl.size(); i10++) {
                arrayList.add(new e2(listZzl.get(i10)));
            }
        }
        g gVar = new g(fVar, arrayList);
        gVar.d0(new i(zzageVar.zzb(), zzageVar.zza()));
        gVar.e0(zzageVar.zzn());
        gVar.c0(zzageVar.zze());
        gVar.Y(l0.b(zzageVar.zzk()));
        gVar.W(zzageVar.zzd());
        return gVar;
    }

    public final Task<zzagh> zza() {
        return zza(new zzabt());
    }

    public final Task<Void> zza(a0 a0Var, w wVar) {
        return zza((zzabm) new zzabm().zza(a0Var).zza(wVar).zza((z) wVar));
    }

    public final Task<Void> zza(r rVar, r0 r0Var, String str, long j10, boolean z10, boolean z11, String str2, String str3, String str4, boolean z12, b.AbstractC0181b abstractC0181b, Executor executor, Activity activity) {
        zzacs zzacsVar = new zzacs(r0Var, m.e(rVar.zzc()), str, j10, z10, z11, str2, str3, str4, z12);
        zzacsVar.zza(abstractC0181b, activity, executor, r0Var.d());
        return zza(zzacsVar);
    }

    public final Task<zzahh> zza(r rVar, String str) {
        return zza(new zzact(rVar, str));
    }

    public final Task<Void> zza(r rVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, String str5, boolean z12, b.AbstractC0181b abstractC0181b, Executor executor, Activity activity) {
        zzacq zzacqVar = new zzacq(rVar, str, str2, j10, z10, z11, str3, str4, str5, z12);
        zzacqVar.zza(abstractC0181b, activity, executor, str);
        return zza(zzacqVar);
    }

    public final Task<Void> zza(String str) {
        return zza(new zzacl(str));
    }

    public final Task<zzagm> zza(String str, String str2) {
        return zza(new zzabs(str, str2));
    }

    public final Task<Void> zza(String str, String str2, e eVar) {
        eVar.F(7);
        return zza(new zzada(str, str2, eVar));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzacg(str, str2, str3, str4));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, c1 c1Var, g1 g1Var) {
        return zza((zzadb) new zzadb(c1Var).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<ba.i> zza(f fVar, a0 a0Var, h hVar, String str, g1 g1Var) {
        m.k(fVar);
        m.k(hVar);
        m.k(a0Var);
        m.k(g1Var);
        List<String> listA0 = a0Var.a0();
        if (listA0 != null && listA0.contains(hVar.u())) {
            return Tasks.forException(zzadg.zza(new Status(17015)));
        }
        if (hVar instanceof j) {
            j jVar = (j) hVar;
            return !jVar.D() ? zza((zzabv) new zzabv(jVar, str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var)) : zza((zzabw) new zzabw(jVar).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
        }
        if (hVar instanceof o0) {
            zzaer.zza();
            return zza((zzabx) new zzabx((o0) hVar).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
        }
        m.k(fVar);
        m.k(hVar);
        m.k(a0Var);
        m.k(g1Var);
        return zza((zzabu) new zzabu(hVar).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, j jVar, String str, g1 g1Var) {
        return zza((zzacb) new zzacb(jVar, str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, o0 o0Var, g1 g1Var) {
        zzaer.zza();
        return zza((zzacy) new zzacy(o0Var).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, o0 o0Var, String str, g1 g1Var) {
        zzaer.zza();
        return zza((zzacf) new zzacf(o0Var, str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<ba.i> zza(f fVar, a0 a0Var, p0 p0Var, String str, o1 o1Var) {
        zzaer.zza();
        zzabr zzabrVar = new zzabr(p0Var, str, null);
        zzabrVar.zza(fVar).zza(o1Var);
        if (a0Var != null) {
            zzabrVar.zza(a0Var);
        }
        return zza(zzabrVar);
    }

    public final Task<ba.i> zza(f fVar, a0 a0Var, v0 v0Var, String str, String str2, o1 o1Var) {
        zzabr zzabrVar = new zzabr(v0Var, str, str2);
        zzabrVar.zza(fVar).zza(o1Var);
        if (a0Var != null) {
            zzabrVar.zza(a0Var);
        }
        return zza(zzabrVar);
    }

    public final Task<Void> zza(f fVar, a0 a0Var, g1 g1Var) {
        return zza((zzach) new zzach().zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<c0> zza(f fVar, a0 a0Var, String str, g1 g1Var) {
        return zza((zzabq) new zzabq(str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, String str, String str2, g1 g1Var) {
        return zza((zzacv) new zzacv(a0Var.zze(), str, str2).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<Void> zza(f fVar, a0 a0Var, String str, String str2, String str3, String str4, g1 g1Var) {
        return zza((zzacd) new zzacd(str, str2, str3, str4).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<Void> zza(f fVar, e eVar, String str) {
        return zza((zzacj) new zzacj(str, eVar).zza(fVar));
    }

    public final Task<ba.i> zza(f fVar, h hVar, String str, o1 o1Var) {
        return zza((zzacn) new zzacn(hVar, str).zza(fVar).zza(o1Var));
    }

    public final Task<ba.i> zza(f fVar, j jVar, String str, o1 o1Var) {
        return zza((zzaco) new zzaco(jVar, str).zza(fVar).zza(o1Var));
    }

    public final Task<ba.i> zza(f fVar, o0 o0Var, String str, o1 o1Var) {
        zzaer.zza();
        return zza((zzacr) new zzacr(o0Var, str).zza(fVar).zza(o1Var));
    }

    public final Task<Void> zza(f fVar, p0 p0Var, a0 a0Var, String str, o1 o1Var) {
        zzaer.zza();
        zzabo zzaboVar = new zzabo(p0Var, a0Var.zze(), str, null);
        zzaboVar.zza(fVar).zza(o1Var);
        return zza(zzaboVar);
    }

    public final Task<Void> zza(f fVar, v0 v0Var, a0 a0Var, String str, String str2, o1 o1Var) {
        zzabo zzaboVar = new zzabo(v0Var, a0Var.zze(), str, str2);
        zzaboVar.zza(fVar).zza(o1Var);
        return zza(zzaboVar);
    }

    public final Task<ba.i> zza(f fVar, o1 o1Var, String str) {
        return zza((zzack) new zzack(str).zza(fVar).zza(o1Var));
    }

    public final Task<Void> zza(f fVar, String str, e eVar, String str2, String str3) {
        eVar.F(1);
        return zza((zzaci) new zzaci(str, eVar, str2, str3, "sendPasswordResetEmail").zza(fVar));
    }

    public final Task<Void> zza(f fVar, String str, String str2) {
        return zza((zzabi) new zzabi(str, str2).zza(fVar));
    }

    public final Task<ba.i> zza(f fVar, String str, String str2, o1 o1Var) {
        return zza((zzacm) new zzacm(str, str2).zza(fVar).zza(o1Var));
    }

    public final Task<Void> zza(f fVar, String str, String str2, String str3) {
        return zza((zzabk) new zzabk(str, str2, str3).zza(fVar));
    }

    public final Task<ba.i> zza(f fVar, String str, String str2, String str3, String str4, o1 o1Var) {
        return zza((zzabn) new zzabn(str, str2, str3, str4).zza(fVar).zza(o1Var));
    }

    public final void zza(f fVar, zzagz zzagzVar, b.AbstractC0181b abstractC0181b, Activity activity, Executor executor) {
        zza((zzadc) new zzadc(zzagzVar).zza(fVar).zza(abstractC0181b, activity, executor, zzagzVar.zzd()));
    }

    public final Task<Void> zzb(f fVar, a0 a0Var, h hVar, String str, g1 g1Var) {
        return zza((zzabz) new zzabz(hVar, str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<ba.i> zzb(f fVar, a0 a0Var, j jVar, String str, g1 g1Var) {
        return zza((zzaca) new zzaca(jVar, str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<ba.i> zzb(f fVar, a0 a0Var, o0 o0Var, String str, g1 g1Var) {
        zzaer.zza();
        return zza((zzace) new zzace(o0Var, str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<ba.i> zzb(f fVar, a0 a0Var, String str, g1 g1Var) {
        m.k(fVar);
        m.e(str);
        m.k(a0Var);
        m.k(g1Var);
        List<String> listA0 = a0Var.a0();
        if ((listA0 != null && !listA0.contains(str)) || a0Var.D()) {
            return Tasks.forException(zzadg.zza(new Status(17016, str)));
        }
        str.hashCode();
        return !str.equals(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD) ? zza((zzacx) new zzacx(str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var)) : zza((zzacu) new zzacu().zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<ba.i> zzb(f fVar, a0 a0Var, String str, String str2, String str3, String str4, g1 g1Var) {
        return zza((zzacc) new zzacc(str, str2, str3, str4).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<Void> zzb(f fVar, String str, e eVar, String str2, String str3) {
        eVar.F(6);
        return zza((zzaci) new zzaci(str, eVar, str2, str3, "sendSignInLinkToEmail").zza(fVar));
    }

    public final Task<d> zzb(f fVar, String str, String str2) {
        return zza((zzabl) new zzabl(str, str2).zza(fVar));
    }

    public final Task<ba.i> zzb(f fVar, String str, String str2, String str3, String str4, o1 o1Var) {
        return zza((zzacp) new zzacp(str, str2, str3, str4).zza(fVar).zza(o1Var));
    }

    public final Task<ba.i> zzc(f fVar, a0 a0Var, h hVar, String str, g1 g1Var) {
        return zza((zzaby) new zzaby(hVar, str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<Void> zzc(f fVar, a0 a0Var, String str, g1 g1Var) {
        return zza((zzacw) new zzacw(str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<u0> zzc(f fVar, String str, String str2) {
        return zza((zzabp) new zzabp(str, str2).zza(fVar));
    }

    public final Task<Void> zzd(f fVar, a0 a0Var, String str, g1 g1Var) {
        return zza((zzacz) new zzacz(str).zza(fVar).zza(a0Var).zza(g1Var).zza((z) g1Var));
    }

    public final Task<String> zzd(f fVar, String str, String str2) {
        return zza((zzadd) new zzadd(str, str2).zza(fVar));
    }
}
