package u8;

import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<R extends h> {

    public interface a {
        void a(Status status);
    }

    public void addStatusListener(a aVar) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    public abstract R await();

    @ResultIgnorabilityUnspecified
    public abstract R await(long j10, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(i<? super R> iVar);

    public abstract void setResultCallback(i<? super R> iVar, long j10, TimeUnit timeUnit);

    public <S extends h> l<S> then(k<? super R, ? extends S> kVar) {
        throw new UnsupportedOperationException();
    }
}
