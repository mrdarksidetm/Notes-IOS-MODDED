package k3;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f14377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f14378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f14379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14380d;

    public interface a {
        void onCancel();
    }

    private void c() {
        while (this.f14380d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f14377a) {
                return;
            }
            this.f14377a = true;
            this.f14380d = true;
            a aVar = this.f14378b;
            Object obj = this.f14379c;
            if (aVar != null) {
                try {
                    aVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f14380d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f14380d = false;
                notifyAll();
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            c();
            if (this.f14378b == aVar) {
                return;
            }
            this.f14378b = aVar;
            if (this.f14377a && aVar != null) {
                aVar.onCancel();
            }
        }
    }
}
