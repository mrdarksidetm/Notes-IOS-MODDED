package v8;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;
import u8.d;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
public final class i<R extends u8.h> extends u8.c<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BasePendingResult f22251a;

    public i(u8.d dVar) {
        this.f22251a = (BasePendingResult) dVar;
    }

    @Override // u8.d
    public final void addStatusListener(d.a aVar) {
        this.f22251a.addStatusListener(aVar);
    }

    @Override // u8.d
    public final R await() {
        return (R) this.f22251a.await();
    }

    @Override // u8.d
    public final R await(long j10, TimeUnit timeUnit) {
        return (R) this.f22251a.await(j10, timeUnit);
    }

    @Override // u8.d
    public final void cancel() {
        this.f22251a.cancel();
    }

    @Override // u8.d
    public final boolean isCanceled() {
        return this.f22251a.isCanceled();
    }

    @Override // u8.d
    public final void setResultCallback(u8.i<? super R> iVar) {
        this.f22251a.setResultCallback(iVar);
    }

    @Override // u8.d
    public final void setResultCallback(u8.i<? super R> iVar, long j10, TimeUnit timeUnit) {
        this.f22251a.setResultCallback(iVar, j10, timeUnit);
    }

    @Override // u8.d
    public final <S extends u8.h> u8.l<S> then(u8.k<? super R, ? extends S> kVar) {
        return this.f22251a.then(kVar);
    }
}
