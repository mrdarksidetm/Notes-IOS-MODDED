package okhttp3;

import ae.j;
import ae.r;
import hf.c;
import hf.d;
import hf.f;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes2.dex */
public final class MultipartBody extends RequestBody {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Companion f16863f = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final MediaType f16864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final MediaType f16865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final MediaType f16866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final MediaType f16867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final MediaType f16868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f16869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f16870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f16871n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f16872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Part> f16873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MediaType f16874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f16875e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f16876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaType f16877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<Part> f16878c;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(String str) {
            r.f(str, "boundary");
            this.f16876a = f.f11960d.d(str);
            this.f16877b = MultipartBody.f16864g;
            this.f16878c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i10, j jVar) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                r.e(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public static final class Part {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Companion f16879c = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Headers f16880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RequestBody f16881b;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }
        }

        public final RequestBody a() {
            return this.f16881b;
        }

        public final Headers b() {
            return this.f16880a;
        }
    }

    static {
        MediaType.Companion companion = MediaType.f16856e;
        f16864g = companion.a("multipart/mixed");
        f16865h = companion.a("multipart/alternative");
        f16866i = companion.a("multipart/digest");
        f16867j = companion.a("multipart/parallel");
        f16868k = companion.a("multipart/form-data");
        f16869l = new byte[]{58, 32};
        f16870m = new byte[]{13, 10};
        f16871n = new byte[]{45, 45};
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long f(d dVar, boolean z10) throws EOFException {
        c cVar;
        if (z10) {
            dVar = new c();
            cVar = dVar;
        } else {
            cVar = 0;
        }
        int size = this.f16873c.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Part part = this.f16873c.get(i10);
            Headers headersB = part.b();
            RequestBody requestBodyA = part.a();
            r.c(dVar);
            dVar.write(f16871n);
            dVar.g(this.f16872b);
            dVar.write(f16870m);
            if (headersB != null) {
                int size2 = headersB.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    dVar.z(headersB.f(i12)).write(f16869l).z(headersB.n(i12)).write(f16870m);
                }
            }
            MediaType mediaTypeB = requestBodyA.b();
            if (mediaTypeB != null) {
                dVar.z("Content-Type: ").z(mediaTypeB.toString()).write(f16870m);
            }
            long jA = requestBodyA.a();
            if (jA != -1) {
                dVar.z("Content-Length: ").c0(jA).write(f16870m);
            } else if (z10) {
                r.c(cVar);
                cVar.b();
                return -1L;
            }
            byte[] bArr = f16870m;
            dVar.write(bArr);
            if (z10) {
                j10 += jA;
            } else {
                requestBodyA.e(dVar);
            }
            dVar.write(bArr);
            i10 = i11;
        }
        r.c(dVar);
        byte[] bArr2 = f16871n;
        dVar.write(bArr2);
        dVar.g(this.f16872b);
        dVar.write(bArr2);
        dVar.write(f16870m);
        if (!z10) {
            return j10;
        }
        r.c(cVar);
        long size3 = j10 + cVar.size();
        cVar.b();
        return size3;
    }

    @Override // okhttp3.RequestBody
    public long a() throws EOFException {
        long j10 = this.f16875e;
        if (j10 != -1) {
            return j10;
        }
        long jF = f(null, true);
        this.f16875e = jF;
        return jF;
    }

    @Override // okhttp3.RequestBody
    public MediaType b() {
        return this.f16874d;
    }

    @Override // okhttp3.RequestBody
    public void e(d dVar) throws EOFException {
        r.f(dVar, "sink");
        f(dVar, false);
    }
}
