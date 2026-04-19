package okhttp3;

import ae.j;
import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f16946b = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16954a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Protocol a(String str) throws IOException {
            r.f(str, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL);
            Protocol protocol = Protocol.HTTP_1_0;
            if (!r.b(str, protocol.f16954a)) {
                protocol = Protocol.HTTP_1_1;
                if (!r.b(str, protocol.f16954a)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!r.b(str, protocol.f16954a)) {
                        protocol = Protocol.HTTP_2;
                        if (!r.b(str, protocol.f16954a)) {
                            protocol = Protocol.SPDY_3;
                            if (!r.b(str, protocol.f16954a)) {
                                protocol = Protocol.QUIC;
                                if (!r.b(str, protocol.f16954a)) {
                                    throw new IOException(r.m("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    Protocol(String str) {
        this.f16954a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f16954a;
    }
}
