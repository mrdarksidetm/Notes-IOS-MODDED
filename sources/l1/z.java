package l1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final a Companion = new a(null);
    private final long intrinsicSize;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public static /* synthetic */ z d(a aVar, md.s[] sVarArr, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = k1.f.f14338b.b();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = x1.f14638a.a();
            }
            return aVar.c(sVarArr, j11, f11, i10);
        }

        public static /* synthetic */ z g(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = x1.f14638a.a();
            }
            return aVar.e(list, f10, f11, i10);
        }

        public static /* synthetic */ z h(a aVar, md.s[] sVarArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = x1.f14638a.a();
            }
            return aVar.f(sVarArr, f10, f11, i10);
        }

        public final z a(List<j0> list, long j10, long j11, int i10) {
            return new y0(list, null, j10, j11, i10, null);
        }

        public final z b(md.s<Float, j0>[] sVarArr, long j10, long j11, int i10) {
            ArrayList arrayList = new ArrayList(sVarArr.length);
            for (md.s<Float, j0> sVar : sVarArr) {
                arrayList.add(j0.m(sVar.d().E()));
            }
            ArrayList arrayList2 = new ArrayList(sVarArr.length);
            for (md.s<Float, j0> sVar2 : sVarArr) {
                arrayList2.add(Float.valueOf(sVar2.c().floatValue()));
            }
            return new y0(arrayList, arrayList2, j10, j11, i10, null);
        }

        public final z c(md.s<Float, j0>[] sVarArr, long j10, float f10, int i10) {
            ArrayList arrayList = new ArrayList(sVarArr.length);
            for (md.s<Float, j0> sVar : sVarArr) {
                arrayList.add(j0.m(sVar.d().E()));
            }
            ArrayList arrayList2 = new ArrayList(sVarArr.length);
            for (md.s<Float, j0> sVar2 : sVarArr) {
                arrayList2.add(Float.valueOf(sVar2.c().floatValue()));
            }
            return new k1(arrayList, arrayList2, j10, f10, i10, null);
        }

        public final z e(List<j0> list, float f10, float f11, int i10) {
            return a(list, k1.g.a(0.0f, f10), k1.g.a(0.0f, f11), i10);
        }

        public final z f(md.s<Float, j0>[] sVarArr, float f10, float f11, int i10) {
            return b((md.s[]) Arrays.copyOf(sVarArr, sVarArr.length), k1.g.a(0.0f, f10), k1.g.a(0.0f, f11), i10);
        }
    }

    private z() {
        this.intrinsicSize = k1.l.f14359b.a();
    }

    public /* synthetic */ z(ae.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public abstract void mo292applyToPq9zytI(long j10, d1 d1Var, float f10);

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo291getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }
}
