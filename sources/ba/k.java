package ba;

/* JADX INFO: loaded from: classes2.dex */
public class k {
    public static h a(String str, String str2) {
        w8.m.e(str);
        w8.m.e(str2);
        return new j(str, str2);
    }

    public static h b(String str, String str2) {
        if (j.B(str2)) {
            return new j(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
