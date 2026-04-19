package x7;

import java.util.Arrays;
import x7.f;

/* JADX INFO: loaded from: classes.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable<w7.i> f23051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f23052b;

    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable<w7.i> f23053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f23054b;

        b() {
        }

        @Override // x7.f.a
        public f a() {
            String str = "";
            if (this.f23053a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f23053a, this.f23054b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x7.f.a
        public f.a b(Iterable<w7.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f23053a = iterable;
            return this;
        }

        @Override // x7.f.a
        public f.a c(byte[] bArr) {
            this.f23054b = bArr;
            return this;
        }
    }

    private a(Iterable<w7.i> iterable, byte[] bArr) {
        this.f23051a = iterable;
        this.f23052b = bArr;
    }

    @Override // x7.f
    public Iterable<w7.i> b() {
        return this.f23051a;
    }

    @Override // x7.f
    public byte[] c() {
        return this.f23052b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f23051a.equals(fVar.b())) {
            if (Arrays.equals(this.f23052b, fVar instanceof a ? ((a) fVar).f23052b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23051a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23052b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f23051a + ", extras=" + Arrays.toString(this.f23052b) + "}";
    }
}
