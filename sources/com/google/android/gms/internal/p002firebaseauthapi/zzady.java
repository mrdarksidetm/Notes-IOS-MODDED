package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import ba.a0;
import ba.h;
import ca.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.firebase.auth.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import w8.m;
import x9.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzady<ResultT, CallbackT> implements zzaek<ResultT> {
    protected final int zza;
    protected f zzc;
    protected a0 zzd;
    protected CallbackT zze;
    protected z zzf;
    protected zzadw<ResultT> zzg;
    protected Executor zzi;
    protected zzagl zzj;
    protected zzage zzk;
    protected zzafl zzl;
    protected zzagv zzm;
    protected h zzn;
    protected String zzo;
    protected String zzp;
    protected zzzl zzq;
    protected zzagm zzr;
    protected zzagh zzs;
    protected zzahh zzt;
    private boolean zzu;
    protected final zzaea zzb = new zzaea(this);
    protected final List<b.AbstractC0181b> zzh = new ArrayList();

    private static class zza extends LifecycleCallback {
        private final List<b.AbstractC0181b> zza;

        private zza(v8.f fVar, List<b.AbstractC0181b> list) {
            super(fVar);
            this.mLifecycleFragment.j("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<b.AbstractC0181b> list) {
            v8.f fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.r("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzady(int i10) {
        this.zza = i10;
    }

    static /* synthetic */ void zza(zzady zzadyVar) {
        zzadyVar.zzb();
        m.o(zzadyVar.zzu, "no success or failure set on method implementation");
    }

    static /* synthetic */ void zza(zzady zzadyVar, Status status) {
        z zVar = zzadyVar.zzf;
        if (zVar != null) {
            zVar.zza(status);
        }
    }

    public final zzady<ResultT, CallbackT> zza(a0 a0Var) {
        this.zzd = (a0) m.l(a0Var, "firebaseUser cannot be null");
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(z zVar) {
        this.zzf = (z) m.l(zVar, "external failure callback cannot be null");
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(b.AbstractC0181b abstractC0181b, Activity activity, Executor executor, String str) {
        b.AbstractC0181b abstractC0181bZza = zzaer.zza(str, abstractC0181b, this);
        synchronized (this.zzh) {
            this.zzh.add((b.AbstractC0181b) m.k(abstractC0181bZza));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) m.k(executor);
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) m.l(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(f fVar) {
        this.zzc = (f) m.l(fVar, "firebaseApp cannot be null");
        return this;
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }
}
