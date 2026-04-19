package okhttp3.internal.ws;

import ae.j;
import ae.r;
import je.u;
import je.v;
import je.w;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class WebSocketExtensions {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Companion f17665g = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f17667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f17669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17671f;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final WebSocketExtensions a(Headers headers) {
            r.f(headers, "responseHeaders");
            int size = headers.size();
            int i10 = 0;
            boolean z10 = false;
            Integer numL = null;
            boolean z11 = false;
            Integer numL2 = null;
            boolean z12 = false;
            boolean z13 = false;
            while (i10 < size) {
                int i11 = i10 + 1;
                if (v.t(headers.f(i10), "Sec-WebSocket-Extensions", true)) {
                    String strN = headers.n(i10);
                    int i12 = 0;
                    while (i12 < strN.length()) {
                        int iQ = Util.q(strN, ',', i12, 0, 4, null);
                        int iO = Util.o(strN, ';', i12, iQ);
                        String strY = Util.Y(strN, i12, iO);
                        int i13 = iO + 1;
                        if (v.t(strY, "permessage-deflate", true)) {
                            if (z10) {
                                z13 = true;
                            }
                            i12 = i13;
                            while (i12 < iQ) {
                                int iO2 = Util.o(strN, ';', i12, iQ);
                                int iO3 = Util.o(strN, '=', i12, iO2);
                                String strY2 = Util.Y(strN, i12, iO3);
                                String strT0 = iO3 < iO2 ? w.t0(Util.Y(strN, iO3 + 1, iO2), "\"") : null;
                                i12 = iO2 + 1;
                                if (v.t(strY2, "client_max_window_bits", true)) {
                                    if (numL != null) {
                                        z13 = true;
                                    }
                                    numL = strT0 == null ? null : u.l(strT0);
                                    if (numL == null) {
                                        z13 = true;
                                    }
                                } else if (v.t(strY2, "client_no_context_takeover", true)) {
                                    if (z11) {
                                        z13 = true;
                                    }
                                    if (strT0 != null) {
                                        z13 = true;
                                    }
                                    z11 = true;
                                } else if (v.t(strY2, "server_max_window_bits", true)) {
                                    if (numL2 != null) {
                                        z13 = true;
                                    }
                                    numL2 = strT0 == null ? null : u.l(strT0);
                                    if (numL2 == null) {
                                        z13 = true;
                                    }
                                } else if (v.t(strY2, "server_no_context_takeover", true)) {
                                    if (z12) {
                                        z13 = true;
                                    }
                                    if (strT0 != null) {
                                        z13 = true;
                                    }
                                    z12 = true;
                                } else {
                                    z13 = true;
                                }
                            }
                            z10 = true;
                        } else {
                            i12 = i13;
                            z13 = true;
                        }
                    }
                }
                i10 = i11;
            }
            return new WebSocketExtensions(z10, numL, z11, numL2, z12, z13);
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f17666a = z10;
        this.f17667b = num;
        this.f17668c = z11;
        this.f17669d = num2;
        this.f17670e = z12;
        this.f17671f = z13;
    }

    public /* synthetic */ WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, j jVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) == 0 ? num2 : null, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }

    public final boolean a(boolean z10) {
        return z10 ? this.f17668c : this.f17670e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f17666a == webSocketExtensions.f17666a && r.b(this.f17667b, webSocketExtensions.f17667b) && this.f17668c == webSocketExtensions.f17668c && r.b(this.f17669d, webSocketExtensions.f17669d) && this.f17670e == webSocketExtensions.f17670e && this.f17671f == webSocketExtensions.f17671f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z10 = this.f17666a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        Integer num = this.f17667b;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z11 = this.f17668c;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        int i11 = (iHashCode + r22) * 31;
        Integer num2 = this.f17669d;
        int iHashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.f17670e;
        ?? r23 = z12;
        if (z12) {
            r23 = 1;
        }
        int i12 = (iHashCode2 + r23) * 31;
        boolean z13 = this.f17671f;
        return i12 + (z13 ? 1 : z13);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f17666a + ", clientMaxWindowBits=" + this.f17667b + ", clientNoContextTakeover=" + this.f17668c + ", serverMaxWindowBits=" + this.f17669d + ", serverNoContextTakeover=" + this.f17670e + ", unknownValues=" + this.f17671f + ')';
    }
}
