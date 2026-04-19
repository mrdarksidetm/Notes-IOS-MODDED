package r8;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
final class k extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f19227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f19228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(com.google.android.gms.common.api.e eVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(eVar);
        this.f19227a = context;
        this.f19228b = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ u8.h createFailedResult(Status status) {
        return new q8.b(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((w) ((i) bVar).getService()).f(new j(this), this.f19228b);
    }
}
