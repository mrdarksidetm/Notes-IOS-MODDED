package u8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
final class r<R extends h> extends BasePendingResult<R> {
    public r(com.google.android.gms.common.api.e eVar) {
        super(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R createFailedResult(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
