package okhttp3;

import ae.j;
import ae.r;
import hf.c;
import hf.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import md.i0;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f17002a = new Companion(null);

    public static final class BomAwareReader extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f17003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Charset f17004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f17005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Reader f17006d;

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i0 i0Var;
            this.f17005c = true;
            Reader reader = this.f17006d;
            if (reader == null) {
                i0Var = null;
            } else {
                reader.close();
                i0Var = i0.f15558a;
            }
            if (i0Var == null) {
                this.f17003a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            r.f(cArr, "cbuf");
            if (this.f17005c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f17006d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f17003a.f0(), Util.I(this.f17003a, this.f17004b));
                this.f17006d = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i10, i11);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ ResponseBody c(Companion companion, byte[] bArr, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.b(bArr, mediaType);
        }

        public final ResponseBody a(final e eVar, final MediaType mediaType, final long j10) {
            r.f(eVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long a() {
                    return j10;
                }

                @Override // okhttp3.ResponseBody
                public MediaType b() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public e l() {
                    return eVar;
                }
            };
        }

        public final ResponseBody b(byte[] bArr, MediaType mediaType) {
            r.f(bArr, "<this>");
            return a(new c().write(bArr), mediaType, bArr.length);
        }
    }

    public abstract long a();

    public abstract MediaType b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.l(l());
    }

    public abstract e l();
}
