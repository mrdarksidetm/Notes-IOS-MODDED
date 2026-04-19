package w7;

import java.util.Arrays;
import w7.o;

/* JADX INFO: loaded from: classes.dex */
final class d extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f22549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u7.d f22550c;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f22552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u7.d f22553c;

        b() {
        }

        @Override // w7.o.a
        public o a() {
            String str = "";
            if (this.f22551a == null) {
                str = " backendName";
            }
            if (this.f22553c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f22551a, this.f22552b, this.f22553c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w7.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f22551a = str;
            return this;
        }

        @Override // w7.o.a
        public o.a c(byte[] bArr) {
            this.f22552b = bArr;
            return this;
        }

        @Override // w7.o.a
        public o.a d(u7.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f22553c = dVar;
            return this;
        }
    }

    private d(String str, byte[] bArr, u7.d dVar) {
        this.f22548a = str;
        this.f22549b = bArr;
        this.f22550c = dVar;
    }

    @Override // w7.o
    public String b() {
        return this.f22548a;
    }

    @Override // w7.o
    public byte[] c() {
        return this.f22549b;
    }

    @Override // w7.o
    public u7.d d() {
        return this.f22550c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f22548a.equals(oVar.b())) {
            if (Arrays.equals(this.f22549b, oVar instanceof d ? ((d) oVar).f22549b : oVar.c()) && this.f22550c.equals(oVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f22548a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22549b)) * 1000003) ^ this.f22550c.hashCode();
    }
}
