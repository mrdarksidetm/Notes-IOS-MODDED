package a2;

import a2.q0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<q0.a> f242c;

    public m0(f0 f0Var, n nVar, List<q0.a> list) {
        this.f240a = f0Var;
        this.f241b = nVar;
        this.f242c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean b(a2.f0 r12) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.m0.b(a2.f0):boolean");
    }

    private final boolean c(f0 f0Var) {
        if (!b(f0Var)) {
            return false;
        }
        List<f0> listF = f0Var.F();
        int size = listF.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c(listF.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        ae.r.e(sb2, "append(value)");
        sb2.append('\n');
        ae.r.e(sb2, "append('\\n')");
        e(this, sb2, this.f240a, 0);
        return sb2.toString();
    }

    private static final void e(m0 m0Var, StringBuilder sb2, f0 f0Var, int i10) {
        String strF = m0Var.f(f0Var);
        if (strF.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(strF);
            ae.r.e(sb2, "append(value)");
            sb2.append('\n');
            ae.r.e(sb2, "append('\\n')");
            i10++;
        }
        List<f0> listF = f0Var.F();
        int size = listF.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(m0Var, sb2, listF.get(i12), i10);
        }
    }

    private final String f(f0 f0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f0Var);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(f0Var.U());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!f0Var.j()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + f0Var.d0() + ']');
        if (!b(f0Var)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }

    public final void a() {
        if (!c(this.f240a)) {
            System.out.println((Object) d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
