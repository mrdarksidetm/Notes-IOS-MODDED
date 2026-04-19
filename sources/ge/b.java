package ge;

import java.util.NoSuchElementException;
import nd.r;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11528d;

    public b(char c10, char c11, int i10) {
        this.f11525a = i10;
        this.f11526b = c11;
        boolean z10 = true;
        if (i10 <= 0 ? ae.r.g(c10, c11) < 0 : ae.r.g(c10, c11) > 0) {
            z10 = false;
        }
        this.f11527c = z10;
        this.f11528d = z10 ? c10 : c11;
    }

    @Override // nd.r
    public char c() {
        int i10 = this.f11528d;
        if (i10 != this.f11526b) {
            this.f11528d = this.f11525a + i10;
        } else {
            if (!this.f11527c) {
                throw new NoSuchElementException();
            }
            this.f11527c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11527c;
    }
}
