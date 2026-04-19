package p003if;

import ae.j;
import ae.r;
import hf.z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f12725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f12729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f12730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f12731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f12732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f12733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<z> f12734j;

    public d(z zVar, boolean z10, String str, long j10, long j11, long j12, int i10, Long l10, long j13) {
        r.f(zVar, "canonicalPath");
        r.f(str, "comment");
        this.f12725a = zVar;
        this.f12726b = z10;
        this.f12727c = str;
        this.f12728d = j10;
        this.f12729e = j11;
        this.f12730f = j12;
        this.f12731g = i10;
        this.f12732h = l10;
        this.f12733i = j13;
        this.f12734j = new ArrayList();
    }

    public /* synthetic */ d(z zVar, boolean z10, String str, long j10, long j11, long j12, int i10, Long l10, long j13, int i11, j jVar) {
        this(zVar, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j10, (i11 & 16) != 0 ? -1L : j11, (i11 & 32) != 0 ? -1L : j12, (i11 & 64) != 0 ? -1 : i10, (i11 & 128) != 0 ? null : l10, (i11 & 256) == 0 ? j13 : -1L);
    }

    public final z a() {
        return this.f12725a;
    }

    public final List<z> b() {
        return this.f12734j;
    }

    public final long c() {
        return this.f12729e;
    }

    public final int d() {
        return this.f12731g;
    }

    public final Long e() {
        return this.f12732h;
    }

    public final long f() {
        return this.f12733i;
    }

    public final long g() {
        return this.f12730f;
    }

    public final boolean h() {
        return this.f12726b;
    }
}
