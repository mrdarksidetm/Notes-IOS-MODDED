package v8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public class m extends BasePendingResult<Status> {
    public m(com.google.android.gms.common.api.e eVar) {
        super(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ u8.h createFailedResult(Status status) {
        return status;
    }
}
