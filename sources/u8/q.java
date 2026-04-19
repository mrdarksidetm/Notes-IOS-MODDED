package u8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
final class q<R extends h> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f21747a;

    public q(com.google.android.gms.common.api.e eVar, h hVar) {
        super(eVar);
        this.f21747a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R createFailedResult(Status status) {
        return (R) this.f21747a;
    }
}
