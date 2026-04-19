package ge;

import nd.m0;

/* JADX INFO: loaded from: classes2.dex */
public class j implements Iterable<Long>, be.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11543d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11546c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public j(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f11544a = j10;
        this.f11545b = ud.c.d(j10, j11, j12);
        this.f11546c = j12;
    }

    public final long l() {
        return this.f11544a;
    }

    public final long n() {
        return this.f11545b;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public m0 iterator() {
        return new k(this.f11544a, this.f11545b, this.f11546c);
    }
}
