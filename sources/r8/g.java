package r8;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s4.a implements v8.k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Semaphore f19223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Set f19224q;

    public g(Context context, Set set) {
        super(context);
        this.f19223p = new Semaphore(0);
        this.f19224q = set;
    }

    @Override // s4.a
    public final /* bridge */ /* synthetic */ Object C() {
        Iterator it = this.f19224q.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((com.google.android.gms.common.api.e) it.next()).g(this)) {
                i10++;
            }
        }
        try {
            this.f19223p.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // s4.b
    protected final void p() {
        this.f19223p.drainPermits();
        h();
    }
}
