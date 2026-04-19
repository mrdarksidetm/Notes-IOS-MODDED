package yc;

import android.net.Uri;
import ba.e;
import ba.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import yc.a1;

/* JADX INFO: loaded from: classes2.dex */
public class z2 {
    static ba.e a(a1.q qVar) {
        e.a aVarD = ba.e.D();
        aVarD.f(qVar.h());
        if (qVar.e() != null) {
            aVarD.c(qVar.e());
        }
        aVarD.d(qVar.f().booleanValue());
        if (qVar.d() != null) {
            aVarD.b(qVar.d(), qVar.b().booleanValue(), qVar.c());
        }
        if (qVar.g() != null) {
            aVarD.e(qVar.g());
        }
        return aVarD.a();
    }

    static ba.h b(Map<String, Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        if (map.get("token") != null) {
            ba.h hVar = u.f23920i.get(Integer.valueOf(((Integer) map.get("token")).intValue()));
            if (hVar != null) {
                return hVar;
            }
            throw v.b();
        }
        Object obj = map.get("signInMethod");
        Objects.requireNonNull(obj);
        String str5 = (String) obj;
        str = (String) map.get("secret");
        str2 = (String) map.get("idToken");
        str3 = (String) map.get("accessToken");
        str4 = (String) map.get("rawNonce");
        switch (str5) {
            case "twitter.com":
                Objects.requireNonNull(str3);
                Objects.requireNonNull(str);
                return ba.a1.a(str3, str);
            case "playgames.google.com":
                Object obj2 = map.get("serverAuthCode");
                Objects.requireNonNull(obj2);
                return ba.t0.a((String) obj2);
            case "google.com":
                return ba.g0.a(str2, str3);
            case "facebook.com":
                Objects.requireNonNull(str3);
                return ba.m.a(str3);
            case "oauth":
                Object obj3 = map.get("providerId");
                Objects.requireNonNull(obj3);
                n0.b bVarF = ba.n0.f((String) obj3);
                if (str3 != null) {
                    bVarF.b(str3);
                }
                Objects.requireNonNull(str2);
                if (str4 == null) {
                    bVarF.c(str2);
                } else {
                    bVarF.d(str2, str4);
                }
                return bVarF.a();
            case "phone":
                Object obj4 = map.get("verificationId");
                Objects.requireNonNull(obj4);
                Object obj5 = map.get("smsCode");
                Objects.requireNonNull(obj5);
                return com.google.firebase.auth.b.a((String) obj4, (String) obj5);
            case "password":
                Object obj6 = map.get("email");
                Objects.requireNonNull(obj6);
                Objects.requireNonNull(str);
                return ba.k.a((String) obj6, str);
            case "github.com":
                Objects.requireNonNull(str3);
                return ba.e0.a(str3);
            case "emailLink":
                Object obj7 = map.get("email");
                Objects.requireNonNull(obj7);
                Object obj8 = map.get("emailLink");
                Objects.requireNonNull(obj8);
                return ba.k.b((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    static List<Object> c(a1.b0 b0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b0Var.c().n());
        arrayList.add(b0Var.b());
        return arrayList;
    }

    static List<List<Object>> d(List<ba.j0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<a1.v> it = e(list).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    static List<a1.v> e(List<ba.j0> list) {
        ArrayList arrayList = new ArrayList();
        for (ba.j0 j0Var : list) {
            arrayList.add((j0Var instanceof ba.r0 ? new a1.v.a().e(((ba.r0) j0Var).g()) : new a1.v.a()).b(j0Var.k()).c(Double.valueOf(j0Var.u())).f(j0Var.d()).d(j0Var.x()).a());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static yc.a1.o f(ba.d r7) {
        /*
            yc.a1$o$a r0 = new yc.a1$o$a
            r0.<init>()
            yc.a1$p$a r1 = new yc.a1$p$a
            r1.<init>()
            int r2 = r7.a()
            r3 = 5
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 == r5) goto L2c
            if (r2 == r4) goto L29
            r6 = 4
            if (r2 == r6) goto L26
            if (r2 == r3) goto L23
            r6 = 6
            if (r2 == r6) goto L20
            goto L34
        L20:
            yc.a1$a r6 = yc.a1.a.REVERT_SECOND_FACTOR_ADDITION
            goto L31
        L23:
            yc.a1$a r6 = yc.a1.a.VERIFY_AND_CHANGE_EMAIL
            goto L31
        L26:
            yc.a1$a r6 = yc.a1.a.EMAIL_SIGN_IN
            goto L31
        L29:
            yc.a1$a r6 = yc.a1.a.RECOVER_EMAIL
            goto L31
        L2c:
            yc.a1$a r6 = yc.a1.a.VERIFY_EMAIL
            goto L31
        L2f:
            yc.a1$a r6 = yc.a1.a.PASSWORD_RESET
        L31:
            r0.c(r6)
        L34:
            ba.b r7 = r7.b()
            if (r7 == 0) goto L3c
            if (r2 == r5) goto L3e
        L3c:
            if (r2 != 0) goto L46
        L3e:
            java.lang.String r7 = r7.a()
            r1.b(r7)
            goto L5d
        L46:
            if (r2 == r4) goto L4a
            if (r2 != r3) goto L5d
        L4a:
            java.util.Objects.requireNonNull(r7)
            ba.a r7 = (ba.a) r7
            java.lang.String r2 = r7.a()
            r1.b(r2)
            java.lang.String r7 = r7.b()
            r1.c(r7)
        L5d:
            yc.a1$p r7 = r1.a()
            r0.b(r7)
            yc.a1$o r7 = r0.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.z2.f(ba.d):yc.a1$o");
    }

    private static a1.r g(ba.g gVar) {
        if (gVar == null) {
            return null;
        }
        a1.r.a aVar = new a1.r.a();
        aVar.b(Boolean.valueOf(gVar.v()));
        aVar.c(gVar.getProfile());
        aVar.d(gVar.c());
        aVar.e(gVar.j());
        return aVar.a();
    }

    static a1.s h(ba.h hVar) {
        if (hVar == null) {
            return null;
        }
        int iHashCode = hVar.hashCode();
        u.f23920i.put(Integer.valueOf(iHashCode), hVar);
        a1.s.a aVar = new a1.s.a();
        aVar.d(hVar.u());
        aVar.e(hVar.x());
        aVar.c(Long.valueOf(iHashCode));
        if (hVar instanceof ba.m0) {
            aVar.b(((ba.m0) hVar).A());
        }
        return aVar.a();
    }

    static a1.a0 i(ba.i iVar) {
        a1.a0.a aVar = new a1.a0.a();
        aVar.b(g(iVar.p()));
        aVar.c(h(iVar.q()));
        aVar.d(j(iVar.s()));
        return aVar.a();
    }

    static a1.b0 j(ba.a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        a1.b0.a aVar = new a1.b0.a();
        a1.c0.a aVar2 = new a1.c0.a();
        aVar2.c(a0Var.k());
        aVar2.d(a0Var.t());
        aVar2.f(Boolean.valueOf(a0Var.e()));
        aVar2.e(Boolean.valueOf(a0Var.D()));
        if (a0Var.z() != null) {
            aVar2.b(Long.valueOf(a0Var.z().i()));
            aVar2.g(Long.valueOf(a0Var.z().m()));
        }
        aVar2.h(a0Var.g());
        aVar2.i(k(a0Var.b()));
        aVar2.k(a0Var.d());
        aVar2.j(a0Var.C());
        aVar.c(aVar2.a());
        aVar.b(m(a0Var.B()));
        return aVar.a();
    }

    private static String k(Uri uri) {
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        if ("".equals(string)) {
            return null;
        }
        return string;
    }

    static a1.u l(ba.c0 c0Var) {
        a1.u.a aVar = new a1.u.a();
        aVar.h(c0Var.g());
        aVar.f(c0Var.e());
        aVar.b(Long.valueOf(c0Var.a() * 1000));
        aVar.d(Long.valueOf(c0Var.c() * 1000));
        aVar.e(Long.valueOf(c0Var.d() * 1000));
        aVar.c(c0Var.b());
        aVar.g(c0Var.f());
        return aVar.a();
    }

    private static List<Map<Object, Object>> m(List<? extends ba.b1> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (ba.b1 b1Var : new ArrayList(list)) {
            if (b1Var != null && !"firebase".equals(b1Var.c())) {
                arrayList.add(n(b1Var));
            }
        }
        return arrayList;
    }

    private static Map<Object, Object> n(ba.b1 b1Var) {
        HashMap map = new HashMap();
        map.put("displayName", b1Var.k());
        map.put("email", b1Var.t());
        map.put("isEmailVerified", Boolean.valueOf(b1Var.e()));
        map.put("phoneNumber", b1Var.g());
        map.put("photoUrl", k(b1Var.b()));
        map.put("uid", b1Var.d() == null ? "" : b1Var.d());
        map.put("providerId", b1Var.c());
        map.put("isAnonymous", Boolean.FALSE);
        return map;
    }
}
