package l8;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class e extends a.AbstractC0174a {
    e() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0174a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, w8.c cVar, Object obj, e.b bVar, e.c cVar2) {
        return new r8.i(context, looper, cVar, (GoogleSignInOptions) obj, bVar, cVar2);
    }

    @Override // com.google.android.gms.common.api.a.e
    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.z();
    }
}
