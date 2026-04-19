package ge;

import java.util.NoSuchElementException;
import nd.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11550d;

    public k(long j10, long j11, long j12) {
        this.f11547a = j12;
        this.f11548b = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f11549c = z10;
        this.f11550d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11549c;
    }

    @Override // nd.m0
    public long nextLong() {
        long j10 = this.f11550d;
        if (j10 != this.f11548b) {
            this.f11550d = this.f11547a + j10;
        } else {
            if (!this.f11549c) {
                throw new NoSuchElementException();
            }
            this.f11549c = false;
        }
        return j10;
    }
}
