package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v8.f;

/* JADX INFO: loaded from: classes.dex */
final class zzv extends LifecycleCallback {
    private final List zza;

    private zzv(f fVar) {
        super(fVar);
        this.zza = new ArrayList();
        this.mLifecycleFragment.j("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        f fragment = LifecycleCallback.getFragment(activity);
        synchronized (fragment) {
            zzvVar = (zzv) fragment.r("TaskOnStopCallback", zzv.class);
            if (zzvVar == null) {
                zzvVar = new zzv(fragment);
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.zza) {
            Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                if (zzqVar != null) {
                    zzqVar.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final void zzb(zzq zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzqVar));
        }
    }
}
