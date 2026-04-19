package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import u8.d;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends u8.h> extends u8.d<R> {
    static final ThreadLocal zaa = new v0();
    public static final /* synthetic */ int zad = 0;
    private w0 resultGuardian;
    protected final a zab;
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private u8.i zah;
    private final AtomicReference zai;
    private u8.h zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private w8.f zao;
    private volatile k0 zap;
    private boolean zaq;

    public static class a<R extends u8.h> extends zau {
        public a() {
            super(Looper.getMainLooper());
        }

        public a(Looper looper) {
            super(looper);
        }

        public final void a(u8.i iVar, u8.h hVar) {
            int i10 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((u8.i) w8.m.k(iVar), hVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f8388i);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            u8.i iVar = (u8.i) pair.first;
            u8.h hVar = (u8.h) pair.second;
            try {
                iVar.a(hVar);
            } catch (RuntimeException e10) {
                BasePendingResult.zal(hVar);
                throw e10;
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(looper);
        this.zac = new WeakReference(null);
    }

    protected BasePendingResult(com.google.android.gms.common.api.e eVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(eVar != null ? eVar.f() : Looper.getMainLooper());
        this.zac = new WeakReference(eVar);
    }

    protected BasePendingResult(a<R> aVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = (a) w8.m.l(aVar, "CallbackHandler must not be null");
        this.zac = new WeakReference(null);
    }

    private final u8.h zaa() {
        u8.h hVar;
        synchronized (this.zae) {
            w8.m.o(!this.zal, "Result has already been consumed.");
            w8.m.o(isReady(), "Result is not ready.");
            hVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (((l0) this.zai.getAndSet(null)) == null) {
            return (u8.h) w8.m.k(hVar);
        }
        throw null;
    }

    private final void zab(u8.h hVar) {
        this.zaj = hVar;
        this.zak = hVar.getStatus();
        v8.j0 j0Var = null;
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            u8.i iVar = this.zah;
            if (iVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(iVar, zaa());
            } else if (this.zaj instanceof u8.f) {
                this.resultGuardian = new w0(this, j0Var);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d.a) arrayList.get(i10)).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(u8.h hVar) {
        if (hVar instanceof u8.f) {
            try {
                ((u8.f) hVar).release();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(hVar)), e10);
            }
        }
    }

    @Override // u8.d
    public final void addStatusListener(d.a aVar) {
        w8.m.b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            if (isReady()) {
                aVar.a(this.zak);
            } else {
                this.zag.add(aVar);
            }
        }
    }

    @Override // u8.d
    @ResultIgnorabilityUnspecified
    public final R await() {
        w8.m.j("await must not be called on the UI thread");
        w8.m.o(!this.zal, "Result has already been consumed");
        w8.m.o(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f8386g);
        }
        w8.m.o(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // u8.d
    @ResultIgnorabilityUnspecified
    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            w8.m.j("await must not be called on the UI thread when time is greater than zero.");
        }
        w8.m.o(!this.zal, "Result has already been consumed.");
        w8.m.o(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f8388i);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f8386g);
        }
        w8.m.o(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // u8.d
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                w8.f fVar = this.zao;
                if (fVar != null) {
                    try {
                        fVar.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(createFailedResult(Status.f8389j));
            }
        }
    }

    protected abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    @Override // u8.d
    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    protected final void setCancelToken(w8.f fVar) {
        synchronized (this.zae) {
            this.zao = fVar;
        }
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r10);
                return;
            }
            isReady();
            w8.m.o(!isReady(), "Results have already been set");
            w8.m.o(!this.zal, "Result has already been consumed");
            zab(r10);
        }
    }

    @Override // u8.d
    public final void setResultCallback(u8.i<? super R> iVar) {
        synchronized (this.zae) {
            if (iVar == null) {
                this.zah = null;
                return;
            }
            boolean z10 = true;
            w8.m.o(!this.zal, "Result has already been consumed.");
            if (this.zap != null) {
                z10 = false;
            }
            w8.m.o(z10, "Cannot set callbacks if then() has been called.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.a(iVar, zaa());
            } else {
                this.zah = iVar;
            }
        }
    }

    @Override // u8.d
    public final void setResultCallback(u8.i<? super R> iVar, long j10, TimeUnit timeUnit) {
        synchronized (this.zae) {
            if (iVar == null) {
                this.zah = null;
                return;
            }
            boolean z10 = true;
            w8.m.o(!this.zal, "Result has already been consumed.");
            if (this.zap != null) {
                z10 = false;
            }
            w8.m.o(z10, "Cannot set callbacks if then() has been called.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.a(iVar, zaa());
            } else {
                this.zah = iVar;
                a aVar = this.zab;
                aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j10));
            }
        }
    }

    @Override // u8.d
    public final <S extends u8.h> u8.l<S> then(u8.k<? super R, ? extends S> kVar) {
        u8.l<S> lVarB;
        w8.m.o(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            w8.m.o(this.zap == null, "Cannot call then() twice.");
            w8.m.o(this.zah == null, "Cannot call then() if callbacks are set.");
            w8.m.o(!this.zam, "Cannot call then() if result was canceled.");
            this.zaq = true;
            this.zap = new k0(this.zac);
            lVarB = this.zap.b(kVar);
            if (isReady()) {
                this.zab.a(this.zap, zaa());
            } else {
                this.zah = this.zap;
            }
        }
        return lVarB;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            if (((com.google.android.gms.common.api.e) this.zac.get()) == null || !this.zaq) {
                cancel();
            }
            zIsCanceled = isCanceled();
        }
        return zIsCanceled;
    }

    public final void zan(l0 l0Var) {
        this.zai.set(l0Var);
    }
}
