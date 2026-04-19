package okhttp3;

import ae.j;
import ae.r;
import hf.d;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f16966a = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ RequestBody b(Companion companion, byte[] bArr, MediaType mediaType, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.a(bArr, mediaType, i10, i11);
        }

        public final RequestBody a(final byte[] bArr, final MediaType mediaType, final int i10, final int i11) {
            r.f(bArr, "<this>");
            Util.k(bArr.length, i10, i11);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long a() {
                    return i11;
                }

                @Override // okhttp3.RequestBody
                public MediaType b() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void e(d dVar) {
                    r.f(dVar, "sink");
                    dVar.write(bArr, i10, i11);
                }
            };
        }
    }

    public long a() {
        return -1L;
    }

    public abstract MediaType b();

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public abstract void e(d dVar);
}
