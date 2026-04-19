package j8;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* JADX INFO: loaded from: classes.dex */
public class f extends UserRecoverableAuthException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14094d;

    f(int i10, String str, Intent intent) {
        super(str, intent);
        this.f14094d = i10;
    }
}
