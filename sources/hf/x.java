package hf;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends nd.c<f> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f12022d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f[] f12023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f12024c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        private final void a(long j10, c cVar, int i10, List<? extends f> list, int i11, int i12, List<Integer> list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            c cVar2;
            int i17 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i18 = i11; i18 < i12; i18++) {
                if (!(list.get(i18).F() >= i17)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            f fVar = list.get(i11);
            f fVar2 = list.get(i12 - 1);
            int i19 = -1;
            if (i17 == fVar.F()) {
                int iIntValue = list2.get(i11).intValue();
                int i20 = i11 + 1;
                f fVar3 = list.get(i20);
                i13 = i20;
                i14 = iIntValue;
                fVar = fVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (fVar.j(i17) == fVar2.j(i17)) {
                int iMin = Math.min(fVar.F(), fVar2.F());
                int i21 = 0;
                for (int i22 = i17; i22 < iMin && fVar.j(i22) == fVar2.j(i22); i22++) {
                    i21++;
                }
                long jC = j10 + c(cVar) + ((long) 2) + ((long) i21) + 1;
                cVar.writeInt(-i21);
                cVar.writeInt(i14);
                int i23 = i17 + i21;
                while (i17 < i23) {
                    cVar.writeInt(fVar.j(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (!(i23 == list.get(i13).F())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    cVar.writeInt(list2.get(i13).intValue());
                    return;
                } else {
                    c cVar3 = new c();
                    cVar.writeInt(((int) (c(cVar3) + jC)) * (-1));
                    a(jC, cVar3, i23, list, i13, i12, list2);
                    cVar.T(cVar3);
                    return;
                }
            }
            int i24 = 1;
            for (int i25 = i13 + 1; i25 < i12; i25++) {
                if (list.get(i25 - 1).j(i17) != list.get(i25).j(i17)) {
                    i24++;
                }
            }
            long jC2 = j10 + c(cVar) + ((long) 2) + ((long) (i24 * 2));
            cVar.writeInt(i24);
            cVar.writeInt(i14);
            for (int i26 = i13; i26 < i12; i26++) {
                byte bJ = list.get(i26).j(i17);
                if (i26 == i13 || bJ != list.get(i26 - 1).j(i17)) {
                    cVar.writeInt(bJ & 255);
                }
            }
            c cVar4 = new c();
            while (i13 < i12) {
                byte bJ2 = list.get(i13).j(i17);
                int i27 = i13 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bJ2 != list.get(i28).j(i17)) {
                            i15 = i28;
                            break;
                        }
                        i28++;
                    }
                }
                if (i27 == i15 && i17 + 1 == list.get(i13).F()) {
                    cVar.writeInt(list2.get(i13).intValue());
                    i16 = i15;
                    cVar2 = cVar4;
                } else {
                    cVar.writeInt(((int) (jC2 + c(cVar4))) * i19);
                    i16 = i15;
                    cVar2 = cVar4;
                    a(jC2, cVar4, i17 + 1, list, i13, i15, list2);
                }
                cVar4 = cVar2;
                i13 = i16;
                i19 = -1;
            }
            cVar.T(cVar4);
        }

        static /* synthetic */ void b(a aVar, long j10, c cVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.a((i13 & 1) != 0 ? 0L : j10, cVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(c cVar) {
            return cVar.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e9, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final hf.x d(hf.f... r17) {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.x.a.d(hf.f[]):hf.x");
        }
    }

    private x(f[] fVarArr, int[] iArr) {
        this.f12023b = fVarArr;
        this.f12024c = iArr;
    }

    public /* synthetic */ x(f[] fVarArr, int[] iArr, ae.j jVar) {
        this(fVarArr, iArr);
    }

    @Override // nd.a
    public int a() {
        return this.f12023b.length;
    }

    @Override // nd.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof f) {
            return d((f) obj);
        }
        return false;
    }

    public /* bridge */ boolean d(f fVar) {
        return super.contains(fVar);
    }

    @Override // nd.c, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f get(int i10) {
        return this.f12023b[i10];
    }

    @Override // nd.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof f) {
            return o((f) obj);
        }
        return -1;
    }

    public final f[] l() {
        return this.f12023b;
    }

    @Override // nd.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof f) {
            return r((f) obj);
        }
        return -1;
    }

    public final int[] n() {
        return this.f12024c;
    }

    public /* bridge */ int o(f fVar) {
        return super.indexOf(fVar);
    }

    public /* bridge */ int r(f fVar) {
        return super.lastIndexOf(fVar);
    }
}
