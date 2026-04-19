package ca;

import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z8.a f6707a = new z8.a("GetTokenResultFactory", new String[0]);

    public static ba.c0 a(String str) {
        Map map;
        try {
            map = m0.b(str);
        } catch (zzzh e10) {
            f6707a.b("Error parsing token claims", e10, new Object[0]);
            map = new HashMap();
        }
        return new ba.c0(str, map);
    }
}
