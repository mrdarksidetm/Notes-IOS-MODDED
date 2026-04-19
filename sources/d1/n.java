package d1;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable<Integer>, be.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9390e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n f9391f = new n(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f9395d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final n a() {
            return n.f9391f;
        }
    }

    @sd.d(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, RCHTTPStatusCodes.UNSUCCESSFUL, 307}, m = "invokeSuspend")
    static final class b extends sd.i implements zd.p<ie.i<? super Integer>, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f9397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f9398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f9399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f9400e;

        b(qd.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ie.i<? super Integer> iVar, qd.d<? super md.i0> dVar) {
            return ((b) create(iVar, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            b bVar = n.this.new b(dVar);
            bVar.f9400e = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:31:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b4 -> B:31:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f0 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private n(long j10, long j11, int i10, int[] iArr) {
        this.f9392a = j10;
        this.f9393b = j11;
        this.f9394c = i10;
        this.f9395d = iArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return ie.k.b(new b(null)).iterator();
    }

    public final n o(n nVar) {
        n nVar2 = f9391f;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar2;
        }
        int i10 = nVar.f9394c;
        int i11 = this.f9394c;
        if (i10 == i11) {
            int[] iArr = nVar.f9395d;
            int[] iArr2 = this.f9395d;
            if (iArr == iArr2) {
                return new n(this.f9392a & (~nVar.f9392a), this.f9393b & (~nVar.f9393b), i11, iArr2);
            }
        }
        Iterator<Integer> it = nVar.iterator();
        n nVarR = this;
        while (it.hasNext()) {
            nVarR = nVarR.r(it.next().intValue());
        }
        return nVarR;
    }

    public final n r(int i10) {
        int[] iArr;
        int iB;
        int i11 = this.f9394c;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f9393b;
            if ((j11 & j10) != 0) {
                return new n(this.f9392a, j11 & (~j10), i11, this.f9395d);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f9392a;
            if ((j13 & j12) != 0) {
                return new n(j13 & (~j12), this.f9393b, i11, this.f9395d);
            }
        } else if (i12 < 0 && (iArr = this.f9395d) != null && (iB = o.b(iArr, i10)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new n(this.f9392a, this.f9393b, this.f9394c, null);
            }
            int[] iArr2 = new int[length];
            if (iB > 0) {
                nd.o.f(iArr, iArr2, 0, 0, iB);
            }
            if (iB < length) {
                nd.o.f(iArr, iArr2, iB, iB + 1, length + 1);
            }
            return new n(this.f9392a, this.f9393b, this.f9394c, iArr2);
        }
        return this;
    }

    public final boolean s(int i10) {
        int[] iArr;
        int i11 = i10 - this.f9394c;
        if (i11 >= 0 && i11 < 64) {
            return ((1 << i11) & this.f9393b) != 0;
        }
        if (i11 >= 64 && i11 < 128) {
            return ((1 << (i11 - 64)) & this.f9392a) != 0;
        }
        if (i11 <= 0 && (iArr = this.f9395d) != null) {
            return o.b(iArr, i10) >= 0;
        }
        return false;
    }

    public final int t(int i10) {
        int[] iArr = this.f9395d;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.f9393b;
        if (j10 != 0) {
            return this.f9394c + o.c(j10);
        }
        long j11 = this.f9392a;
        return j11 != 0 ? this.f9394c + 64 + o.c(j11) : i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(nd.v.x(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb2.append(d1.b.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }

    public final n u(n nVar) {
        n nVar2 = f9391f;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar;
        }
        int i10 = nVar.f9394c;
        int i11 = this.f9394c;
        if (i10 == i11) {
            int[] iArr = nVar.f9395d;
            int[] iArr2 = this.f9395d;
            if (iArr == iArr2) {
                return new n(this.f9392a | nVar.f9392a, this.f9393b | nVar.f9393b, i11, iArr2);
            }
        }
        if (this.f9395d == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                nVar = nVar.v(it.next().intValue());
            }
            return nVar;
        }
        Iterator<Integer> it2 = nVar.iterator();
        n nVarV = this;
        while (it2.hasNext()) {
            nVarV = nVarV.v(it2.next().intValue());
        }
        return nVarV;
    }

    public final n v(int i10) {
        int i11;
        int[] iArrB0;
        int i12 = this.f9394c;
        int i13 = i10 - i12;
        long j10 = 0;
        if (i13 >= 0 && i13 < 64) {
            long j11 = 1 << i13;
            long j12 = this.f9393b;
            if ((j12 & j11) == 0) {
                return new n(this.f9392a, j12 | j11, i12, this.f9395d);
            }
        } else if (i13 >= 64 && i13 < 128) {
            long j13 = 1 << (i13 - 64);
            long j14 = this.f9392a;
            if ((j14 & j13) == 0) {
                return new n(j14 | j13, this.f9393b, i12, this.f9395d);
            }
        } else if (i13 < 128) {
            int[] iArr = this.f9395d;
            if (iArr == null) {
                return new n(this.f9392a, this.f9393b, i12, new int[]{i10});
            }
            int iB = o.b(iArr, i10);
            if (iB < 0) {
                int i14 = -(iB + 1);
                int length = iArr.length + 1;
                int[] iArr2 = new int[length];
                nd.o.f(iArr, iArr2, 0, 0, i14);
                nd.o.f(iArr, iArr2, i14 + 1, i14, length - 1);
                iArr2[i14] = i10;
                return new n(this.f9392a, this.f9393b, this.f9394c, iArr2);
            }
        } else if (!s(i10)) {
            long j15 = this.f9392a;
            long j16 = this.f9393b;
            int i15 = this.f9394c;
            ArrayList arrayList = null;
            int i16 = ((i10 + 1) / 64) * 64;
            long j17 = j16;
            long j18 = j15;
            while (true) {
                if (i15 >= i16) {
                    i11 = i15;
                    break;
                }
                if (j17 != j10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.f9395d;
                        if (iArr3 != null) {
                            for (int i17 : iArr3) {
                                arrayList.add(Integer.valueOf(i17));
                            }
                        }
                    }
                    for (int i18 = 0; i18 < 64; i18++) {
                        if (((1 << i18) & j17) != 0) {
                            arrayList.add(Integer.valueOf(i18 + i15));
                        }
                    }
                    j10 = 0;
                }
                if (j18 == j10) {
                    j17 = j10;
                    i11 = i16;
                    break;
                }
                i15 += 64;
                j17 = j18;
                j18 = j10;
            }
            if (arrayList == null || (iArrB0 = nd.c0.B0(arrayList)) == null) {
                iArrB0 = this.f9395d;
            }
            return new n(j18, j17, i11, iArrB0).v(i10);
        }
        return this;
    }
}
