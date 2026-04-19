package t0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Integer> f21040a;

    public x1(List<Integer> list) {
        this.f21040a = list;
    }

    public /* synthetic */ x1(List list, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }

    public final void a(int i10) {
        if (!this.f21040a.isEmpty()) {
            if (this.f21040a.get(0).intValue() == i10) {
                return;
            }
            if (this.f21040a.get(r0.size() - 1).intValue() == i10) {
                return;
            }
        }
        int size = this.f21040a.size();
        this.f21040a.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int iIntValue = this.f21040a.get(i11).intValue();
            if (i10 <= iIntValue) {
                break;
            }
            this.f21040a.set(size, Integer.valueOf(iIntValue));
            size = i11;
        }
        this.f21040a.set(size, Integer.valueOf(i10));
    }

    public final boolean b() {
        return !this.f21040a.isEmpty();
    }

    public final int c() {
        return ((Number) nd.c0.Y(this.f21040a)).intValue();
    }

    public final int d() {
        int iIntValue;
        if (!(this.f21040a.size() > 0)) {
            o.u("Set is empty".toString());
            throw new md.i();
        }
        int iIntValue2 = this.f21040a.get(0).intValue();
        while ((!this.f21040a.isEmpty()) && this.f21040a.get(0).intValue() == iIntValue2) {
            List<Integer> list = this.f21040a;
            list.set(0, (Integer) nd.c0.j0(list));
            List<Integer> list2 = this.f21040a;
            list2.remove(list2.size() - 1);
            int size = this.f21040a.size();
            int size2 = this.f21040a.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = this.f21040a.get(i10).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = this.f21040a.get(i12).intValue();
                if (i11 >= size || (iIntValue = this.f21040a.get(i11).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        this.f21040a.set(i10, Integer.valueOf(iIntValue4));
                        this.f21040a.set(i12, Integer.valueOf(iIntValue3));
                        i10 = i12;
                    }
                } else if (iIntValue > iIntValue3) {
                    this.f21040a.set(i10, Integer.valueOf(iIntValue));
                    this.f21040a.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                }
            }
        }
        return iIntValue2;
    }
}
