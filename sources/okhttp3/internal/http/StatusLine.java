package okhttp3.internal.http;

import ae.j;
import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.net.ProtocolException;
import je.v;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public final class StatusLine {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f17284d = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Protocol f17285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17287c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final StatusLine a(String str) throws ProtocolException {
            Protocol protocol;
            String strSubstring;
            r.f(str, "statusLine");
            int i10 = 9;
            if (v.G(str, "HTTP/1.", false, 2, null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(r.m("Unexpected status line: ", str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(r.m("Unexpected status line: ", str));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!v.G(str, "ICY ", false, 2, null)) {
                    throw new ProtocolException(r.m("Unexpected status line: ", str));
                }
                protocol = Protocol.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (str.length() < i11) {
                throw new ProtocolException(r.m("Unexpected status line: ", str));
            }
            try {
                String strSubstring2 = str.substring(i10, i11);
                r.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (str.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i11) != ' ') {
                        throw new ProtocolException(r.m("Unexpected status line: ", str));
                    }
                    strSubstring = str.substring(i10 + 4);
                    r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(r.m("Unexpected status line: ", str));
            }
        }
    }

    public StatusLine(Protocol protocol, int i10, String str) {
        r.f(protocol, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL);
        r.f(str, "message");
        this.f17285a = protocol;
        this.f17286b = i10;
        this.f17287c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17285a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f17286b);
        sb2.append(' ');
        sb2.append(this.f17287c);
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
