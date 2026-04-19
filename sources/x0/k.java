package x0;

import ae.r;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class k<E> extends a<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f22937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22938e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f22936c = i12;
        Object[] objArr2 = new Object[i12];
        this.f22937d = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f22938e = r52;
        objArr2[0] = objArr;
        l(i10 - r52, 1);
    }

    private final E j() {
        int iE = e() & 31;
        Object obj = this.f22937d[this.f22936c - 1];
        r.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[iE];
    }

    private final void l(int i10, int i11) {
        int i12 = (this.f22936c - i11) * 5;
        while (i11 < this.f22936c) {
            Object[] objArr = this.f22937d;
            Object obj = objArr[i11 - 1];
            r.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[l.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    private final void m(int i10) {
        int i11 = 0;
        while (l.a(e(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            l(e(), ((this.f22936c - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void n(Object[] objArr, int i10, int i11, int i12) {
        g(i10);
        i(i11);
        this.f22936c = i12;
        if (this.f22937d.length < i12) {
            this.f22937d = new Object[i12];
        }
        this.f22937d[0] = objArr;
        ?? r02 = i10 == i11 ? 1 : 0;
        this.f22938e = r02;
        l(i10 - r02, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eJ = j();
        g(e() + 1);
        if (e() == f()) {
            this.f22938e = true;
            return eJ;
        }
        m(0);
        return eJ;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        g(e() - 1);
        if (this.f22938e) {
            this.f22938e = false;
        } else {
            m(31);
        }
        return j();
    }
}
