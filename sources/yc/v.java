package yc;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import yc.a1;

/* JADX INFO: loaded from: classes2.dex */
public class v {
    static a1.g a() {
        return new a1.g("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
    }

    static a1.g b() {
        return new a1.g("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    static a1.g c() {
        return new a1.g("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null);
    }

    static a1.g d() {
        return new a1.g("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    static a1.g e(Exception exc) {
        if (exc == null) {
            return new a1.g("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap map = new HashMap();
        if (exc instanceof ba.u) {
            ba.u uVar = (ba.u) exc;
            HashMap map2 = new HashMap();
            ba.k0 k0VarB = uVar.b();
            List<ba.j0> listX = k0VarB.x();
            ba.l0 l0VarZ = k0VarB.z();
            String string = UUID.randomUUID().toString();
            w0.f23938b.put(string, l0VarZ);
            String string2 = UUID.randomUUID().toString();
            w0.f23939c.put(string2, k0VarB);
            List<List<Object>> listD = z2.d(listX);
            map2.put("appName", uVar.b().u().i().p());
            map2.put("multiFactorHints", listD);
            map2.put("multiFactorSessionId", string);
            map2.put("multiFactorResolverId", string2);
            return new a1.g(uVar.a(), uVar.getLocalizedMessage(), map2);
        }
        if ((exc instanceof x9.m) || (exc.getCause() != null && (exc.getCause() instanceof x9.m))) {
            return new a1.g("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
        if ((exc instanceof x9.c) || (exc.getCause() != null && (exc.getCause() instanceof x9.c))) {
            return new a1.g("api-not-available", "The requested API is not available.", null);
        }
        if ((exc instanceof x9.o) || (exc.getCause() != null && (exc.getCause() instanceof x9.o))) {
            return new a1.g("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
        }
        if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return new a1.g("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
        }
        if (message != null && message.contains("User has already been linked to the given provider.")) {
            return a();
        }
        String strA = exc instanceof ba.q ? ((ba.q) exc).a() : "UNKNOWN";
        if (exc instanceof ba.y) {
            message = ((ba.y) exc).b();
        }
        if (exc instanceof ba.x) {
            ba.x xVar = (ba.x) exc;
            String strB = xVar.b();
            if (strB != null) {
                map.put("email", strB);
            }
            ba.h hVarC = xVar.c();
            if (hVarC != null) {
                map.put("authCredential", z2.h(hVarC));
            }
        }
        return new a1.g(strA, message, map);
    }
}
