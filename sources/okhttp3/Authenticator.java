package okhttp3;

import ae.r;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* JADX INFO: loaded from: classes2.dex */
public interface Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f16619a = Companion.f16622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Authenticator f16620b = new Companion.AuthenticatorNone();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Authenticator f16621c = new JavaNetAuthenticator(null, 1, null);

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16622a = new Companion();

        private static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public Request a(Route route, Response response) {
                r.f(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }

    Request a(Route route, Response response);
}
