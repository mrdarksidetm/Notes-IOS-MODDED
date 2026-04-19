package uf;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<x> f21831a;

    public static y c() {
        return new y();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.List<uf.x> r8) {
        /*
            r7 = this;
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.List<uf.x> r0 = r7.f21831a
            if (r0 != 0) goto L12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.f21831a = r0
        L12:
            java.util.List<uf.x> r0 = r7.f21831a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
        L1a:
            java.util.List<uf.x> r0 = r7.f21831a
        L1c:
            r0.addAll(r8)
            goto L75
        L20:
            java.util.List<uf.x> r0 = r7.f21831a
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            java.util.List<uf.x> r2 = r7.f21831a
            java.lang.Object r2 = r2.get(r0)
            uf.x r2 = (uf.x) r2
            r3 = 0
            java.lang.Object r3 = r8.get(r3)
            uf.x r3 = (uf.x) r3
            int r4 = r2.c()
            int r5 = r3.c()
            if (r4 != r5) goto L1a
            int r4 = r2.a()
            int r5 = r2.b()
            int r4 = r4 + r5
            int r5 = r3.a()
            if (r4 != r5) goto L1a
            java.util.List<uf.x> r4 = r7.f21831a
            int r5 = r2.c()
            int r6 = r2.a()
            int r2 = r2.b()
            int r3 = r3.b()
            int r2 = r2 + r3
            uf.x r2 = uf.x.d(r5, r6, r2)
            r4.set(r0, r2)
            java.util.List<uf.x> r0 = r7.f21831a
            int r2 = r8.size()
            java.util.List r8 = r8.subList(r1, r2)
            goto L1c
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.y.a(java.util.List):void");
    }

    public void b(Iterable<? extends s> iterable) {
        Iterator<? extends s> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next().g());
        }
    }

    public List<x> d() {
        List<x> list = this.f21831a;
        return list != null ? list : Collections.emptyList();
    }
}
