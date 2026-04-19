package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f3561b = new j(y.f3781c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f3562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator<g> f3563d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3564a = 0;

    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3565a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3566b;

        a() {
            this.f3566b = g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.g.InterfaceC0089g
        public byte a() {
            int i10 = this.f3565a;
            if (i10 >= this.f3566b) {
                throw new NoSuchElementException();
            }
            this.f3565a = i10 + 1;
            return g.this.r(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3565a < this.f3566b;
        }
    }

    static class b implements Comparator<g> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            InterfaceC0089g it = gVar.iterator();
            InterfaceC0089g it2 = gVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompare = Integer.compare(g.A(it.a()), g.A(it2.a()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(gVar.size(), gVar2.size());
        }
    }

    static abstract class c implements InterfaceC0089g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    private static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f3568f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f3569g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            g.f(i10, i10 + i11, bArr.length);
            this.f3568f = i10;
            this.f3569g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j
        protected int I() {
            return this.f3568f;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public byte b(int i10) {
            g.d(i10, size());
            return this.f3572e[this.f3568f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        protected void o(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f3572e, I() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        byte r(int i10) {
            return this.f3572e[this.f3568f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f3569g;
        }
    }

    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0089g extends Iterator<Byte> {
        byte a();
    }

    static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.datastore.preferences.protobuf.j f3570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f3571b;

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f3571b = bArr;
            this.f3570a = androidx.datastore.preferences.protobuf.j.g0(bArr);
        }

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public g a() {
            this.f3570a.c();
            return new j(this.f3571b);
        }

        public androidx.datastore.preferences.protobuf.j b() {
            return this.f3570a;
        }
    }

    static abstract class i extends g {
        i() {
        }

        @Override // androidx.datastore.preferences.protobuf.g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f3572e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f3572e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected final String C(Charset charset) {
            return new String(this.f3572e, I(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        final void G(e4.a aVar) {
            aVar.a(this.f3572e, I(), size());
        }

        final boolean H(g gVar, int i10, int i11) {
            if (i11 > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > gVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + gVar.size());
            }
            if (!(gVar instanceof j)) {
                return gVar.y(i10, i12).equals(y(0, i11));
            }
            j jVar = (j) gVar;
            byte[] bArr = this.f3572e;
            byte[] bArr2 = jVar.f3572e;
            int I = I() + i11;
            int I2 = I();
            int I3 = jVar.I() + i10;
            while (I2 < I) {
                if (bArr[I2] != bArr2[I3]) {
                    return false;
                }
                I2++;
                I3++;
            }
            return true;
        }

        protected int I() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte b(int i10) {
            return this.f3572e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iX = x();
            int iX2 = jVar.x();
            if (iX == 0 || iX2 == 0 || iX == iX2) {
                return H(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected void o(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f3572e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        byte r(int i10) {
            return this.f3572e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean s() {
            int I = I();
            return j1.n(this.f3572e, I, size() + I);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f3572e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final androidx.datastore.preferences.protobuf.h v() {
            return androidx.datastore.preferences.protobuf.h.j(this.f3572e, I(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected final int w(int i10, int i11, int i12) {
            return y.i(i10, this.f3572e, I() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final g y(int i10, int i11) {
            int iF = g.f(i10, i11, size());
            return iF == 0 ? g.f3561b : new e(this.f3572e, I() + i10, iF);
        }
    }

    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f3562c = androidx.datastore.preferences.protobuf.d.c() ? new k(aVar) : new d(aVar);
        f3563d = new b();
    }

    g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int A(byte b10) {
        return b10 & 255;
    }

    static g E(byte[] bArr) {
        return new j(bArr);
    }

    static g F(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void d(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int f(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static g k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static g l(byte[] bArr, int i10, int i11) {
        f(i10, i10 + i11, bArr.length);
        return new j(f3562c.a(bArr, i10, i11));
    }

    public static g n(String str) {
        return new j(str.getBytes(y.f3779a));
    }

    static h u(int i10) {
        return new h(i10, null);
    }

    public final String B(Charset charset) {
        return size() == 0 ? "" : C(charset);
    }

    protected abstract String C(Charset charset);

    public final String D() {
        return B(y.f3779a);
    }

    abstract void G(e4.a aVar);

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iW = this.f3564a;
        if (iW == 0) {
            int size = size();
            iW = w(size, 0, size);
            if (iW == 0) {
                iW = 1;
            }
            this.f3564a = iW;
        }
        return iW;
    }

    protected abstract void o(byte[] bArr, int i10, int i11, int i12);

    abstract byte r(int i10);

    public abstract boolean s();

    public abstract int size();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public InterfaceC0089g iterator() {
        return new a();
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract androidx.datastore.preferences.protobuf.h v();

    protected abstract int w(int i10, int i11, int i12);

    protected final int x() {
        return this.f3564a;
    }

    public abstract g y(int i10, int i11);

    public final byte[] z() {
        int size = size();
        if (size == 0) {
            return y.f3781c;
        }
        byte[] bArr = new byte[size];
        o(bArr, 0, 0, size);
        return bArr;
    }
}
