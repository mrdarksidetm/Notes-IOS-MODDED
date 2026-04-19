package t0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<Object> f20904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20905c;

    private final void a(Object obj) {
        ArrayList<Object> arrayList = this.f20904b;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f20904b = arrayList;
        arrayList.add(obj);
    }

    private final boolean e(d dVar) {
        boolean z10;
        ArrayList<Object> arrayList = this.f20904b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                Object obj = arrayList.get(i10);
                if (ae.r.b(obj, dVar) || ((obj instanceof q0) && ((q0) obj).e(dVar))) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    private final q0 f() {
        Object obj;
        q0 q0VarF;
        ArrayList<Object> arrayList = this.f20904b;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof q0) && !((q0) obj).f20905c) {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        return (q0Var == null || (q0VarF = q0Var.f()) == null) ? this : q0VarF;
    }

    public final void b(v2 v2Var, int i10, int i11) {
        d dVarG1;
        ArrayList<Object> arrayList = this.f20904b;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f20904b = arrayList;
        }
        int i12 = 0;
        if (i10 >= 0 && (dVarG1 = v2Var.g1(i10)) != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    i12 = -1;
                    break;
                }
                Object obj = arrayList.get(i13);
                if (ae.r.b(obj, dVarG1) || ((obj instanceof q0) && ((q0) obj).e(dVarG1))) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
        }
        arrayList.add(i12, v2Var.F(i11));
    }

    public final ArrayList<Object> c() {
        return this.f20904b;
    }

    public final int d() {
        return this.f20903a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(t0.d r6) {
        /*
            r5 = this;
            java.util.ArrayList<java.lang.Object> r0 = r5.f20904b
            r1 = 1
            if (r0 == 0) goto L39
            int r2 = r0.size()
            int r2 = r2 - r1
        La:
            if (r2 < 0) goto L2e
            java.lang.Object r3 = r0.get(r2)
            boolean r4 = r3 instanceof t0.d
            if (r4 == 0) goto L1e
            boolean r3 = ae.r.b(r3, r6)
            if (r3 == 0) goto L2b
        L1a:
            r0.remove(r2)
            goto L2b
        L1e:
            boolean r4 = r3 instanceof t0.q0
            if (r4 == 0) goto L2b
            t0.q0 r3 = (t0.q0) r3
            boolean r3 = r3.g(r6)
            if (r3 != 0) goto L2b
            goto L1a
        L2b:
            int r2 = r2 + (-1)
            goto La
        L2e:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L39
            r6 = 0
            r5.f20904b = r6
            r6 = 0
            return r6
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.q0.g(t0.d):boolean");
    }

    public final void h(s2 s2Var, int i10) {
        f().a(s2Var.a(i10));
    }

    public final void i(v2 v2Var, int i10) {
        f().a(v2Var.F(i10));
    }
}
