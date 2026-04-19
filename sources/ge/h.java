package ge;

import java.util.NoSuchElementException;
import nd.l0;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11540d;

    public h(int i10, int i11, int i12) {
        this.f11537a = i12;
        this.f11538b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f11539c = z10;
        this.f11540d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11539c;
    }

    @Override // nd.l0
    public int nextInt() {
        int i10 = this.f11540d;
        if (i10 != this.f11538b) {
            this.f11540d = this.f11537a + i10;
        } else {
            if (!this.f11539c) {
                throw new NoSuchElementException();
            }
            this.f11539c = false;
        }
        return i10;
    }
}
