package p9;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.b;
import w8.j0;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.google.android.gms.common.internal.d<g> implements o9.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f18284e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w8.c f18286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f18287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f18288d;

    public a(Context context, Looper looper, boolean z10, w8.c cVar, Bundle bundle, e.b bVar, e.c cVar2) {
        super(context, looper, 44, cVar, bVar, cVar2);
        this.f18285a = true;
        this.f18286b = cVar;
        this.f18287c = bundle;
        this.f18288d = cVar.j();
    }

    public static Bundle c(w8.c cVar) {
        cVar.i();
        Integer numJ = cVar.j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.b());
        if (numJ != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numJ.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o9.f
    public final void a(f fVar) {
        w8.m.l(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountD = this.f18286b.d();
            ((g) getService()).b(new j(1, new j0(accountD, ((Integer) w8.m.k(this.f18288d)).intValue(), com.google.android.gms.common.internal.b.DEFAULT_ACCOUNT.equals(accountD.name) ? r8.c.b(getContext()).c() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.m(new l(1, new t8.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // o9.f
    public final void b() {
        connect(new b.d());
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f18286b.g())) {
            this.f18287c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f18286b.g());
        }
        return this.f18287c;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return this.f18285a;
    }
}
