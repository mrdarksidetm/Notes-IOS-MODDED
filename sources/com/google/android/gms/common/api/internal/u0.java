package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile boolean f8531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AtomicReference f8532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f8533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final t8.g f8534d;

    u0(v8.f fVar, t8.g gVar) {
        super(fVar);
        this.f8532b = new AtomicReference(null);
        this.f8533c = new zau(Looper.getMainLooper());
        this.f8534d = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(t8.b bVar, int i10) {
        this.f8532b.set(null);
        b(bVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        this.f8532b.set(null);
        c();
    }

    private static final int e(r0 r0Var) {
        if (r0Var == null) {
            return -1;
        }
        return r0Var.a();
    }

    protected abstract void b(t8.b bVar, int i10);

    protected abstract void c();

    public final void h(t8.b bVar, int i10) {
        AtomicReference atomicReference;
        r0 r0Var = new r0(bVar, i10);
        do {
            atomicReference = this.f8532b;
            if (c0.u0.a(atomicReference, null, r0Var)) {
                this.f8533c.post(new t0(this, r0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i10, int i11, Intent intent) {
        r0 r0Var = (r0) this.f8532b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iG = this.f8534d.g(getActivity());
                if (iG == 0) {
                    d();
                    return;
                } else {
                    if (r0Var == null) {
                        return;
                    }
                    if (r0Var.b().u() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            d();
            return;
        } else if (i11 == 0) {
            if (r0Var != null) {
                a(new t8.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, r0Var.b().toString()), e(r0Var));
                return;
            }
            return;
        }
        if (r0Var != null) {
            a(r0Var.b(), r0Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new t8.b(13, null), e((r0) this.f8532b.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f8532b.set(bundle.getBoolean("resolving_error", false) ? new r0(new t8.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        r0 r0Var = (r0) this.f8532b.get();
        if (r0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", r0Var.a());
        bundle.putInt("failed_status", r0Var.b().u());
        bundle.putParcelable("failed_resolution", r0Var.b().z());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f8531a = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.f8531a = false;
    }
}
