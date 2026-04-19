package ba;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {
    public static Task<y0> a(l0 l0Var) {
        w8.m.k(l0Var);
        ca.r rVar = (ca.r) l0Var;
        return FirebaseAuth.getInstance(rVar.u().T()).V(rVar);
    }

    public static v0 b(y0 y0Var, String str) {
        return new v0((String) w8.m.k(str), (y0) w8.m.k(y0Var), null);
    }

    public static v0 c(String str, String str2) {
        return new v0((String) w8.m.k(str2), null, (String) w8.m.k(str));
    }
}
