package r8;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.p000authapi.zbat;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GoogleSignInOptions f19225a;

    public i(Context context, Looper looper, w8.c cVar, GoogleSignInOptions googleSignInOptions, e.b bVar, e.c cVar2) {
        super(context, looper, 91, cVar, bVar, cVar2);
        GoogleSignInOptions.a aVar = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar.j(zbat.zba());
        if (!cVar.e().isEmpty()) {
            Iterator<Scope> it = cVar.e().iterator();
            while (it.hasNext()) {
                aVar.f(it.next(), new Scope[0]);
            }
        }
        this.f19225a = aVar.a();
    }

    public final GoogleSignInOptions c() {
        return this.f19225a;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new w(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final Intent getSignInIntent() {
        return q.c(getContext(), this.f19225a);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean providesSignIn() {
        return true;
    }
}
