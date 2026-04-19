package q8;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f19004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f19005b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f19005b = googleSignInAccount;
        this.f19004a = status;
    }

    public GoogleSignInAccount a() {
        return this.f19005b;
    }

    @Override // u8.h
    public Status getStatus() {
        return this.f19004a;
    }
}
