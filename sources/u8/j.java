package u8;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class j<R extends h> implements i<R> {
    @Override // u8.i
    public final void a(R r10) {
        Status status = r10.getStatus();
        if (status.B()) {
            c(r10);
            return;
        }
        b(status);
        if (r10 instanceof f) {
            try {
                ((f) r10).release();
            } catch (RuntimeException e10) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r10)), e10);
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c(R r10);
}
