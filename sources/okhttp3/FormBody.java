package okhttp3;

import ae.j;
import ae.r;
import hf.c;
import hf.d;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class FormBody extends RequestBody {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f16815d = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final MediaType f16816e = MediaType.f16856e.a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f16817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f16818c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Charset f16819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f16820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<String> f16821c;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(Charset charset) {
            this.f16819a = charset;
            this.f16820b = new ArrayList();
            this.f16821c = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i10, j jVar) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    private final long f(d dVar, boolean z10) throws EOFException {
        c cVarD;
        if (z10) {
            cVarD = new c();
        } else {
            r.c(dVar);
            cVarD = dVar.d();
        }
        int i10 = 0;
        int size = this.f16817b.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                cVarD.writeByte(38);
            }
            cVarD.z(this.f16817b.get(i10));
            cVarD.writeByte(61);
            cVarD.z(this.f16818c.get(i10));
            i10 = i11;
        }
        if (!z10) {
            return 0L;
        }
        long size2 = cVarD.size();
        cVarD.b();
        return size2;
    }

    @Override // okhttp3.RequestBody
    public long a() {
        return f(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType b() {
        return f16816e;
    }

    @Override // okhttp3.RequestBody
    public void e(d dVar) throws EOFException {
        r.f(dVar, "sink");
        f(dVar, false);
    }
}
