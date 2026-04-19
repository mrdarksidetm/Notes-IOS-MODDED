package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class z extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n0 f3784a;

    public static class a extends z {
        public a(String str) {
            super(str);
        }
    }

    public z(String str) {
        super(str);
        this.f3784a = null;
    }

    static z a() {
        return new z("Protocol message end-group tag did not match expected tag.");
    }

    static z b() {
        return new z("Protocol message contained an invalid tag (zero).");
    }

    static z c() {
        return new z("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static z e() {
        return new z("CodedInputStream encountered a malformed varint.");
    }

    static z f() {
        return new z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static z g() {
        return new z("Failed to parse the message.");
    }

    static z h() {
        return new z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static z j() {
        return new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static z k() {
        return new z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public z i(n0 n0Var) {
        this.f3784a = n0Var;
        return this;
    }
}
