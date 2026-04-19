package s6;

import android.content.Context;
import android.os.Debug;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class c1 extends u {
    public c1(h3 h3Var, w2 w2Var, u6.k kVar) {
        super(h3Var, w2Var, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n0 B(Context context) {
        return new n0(!(z(context) | E() | D()), !C(), true);
    }

    public void A(final Context context) {
        super.v(b(new c.a() { // from class: s6.b1
            @Override // u6.c.a
            public final n0 run() {
                return this.f20007a.B(context);
            }
        }));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (java.lang.Integer.decode(r3.substring(r0.length() + 1).trim()).intValue() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        x(s6.f1.b(s6.f1.c("5F251C5CBB224C4496245450")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C() {
        /*
            r6 = this;
            java.lang.String r0 = "63360E6BAC317F4880"
            java.lang.String r0 = s6.f1.a(r0)
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L66
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L66
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L66
            java.lang.String r5 = "18341D67AA6C5C4488121247256C0827EC"
            byte[] r5 = s6.f1.c(r5)     // Catch: java.lang.Exception -> L66
            java.lang.String r5 = s6.f1.b(r5)     // Catch: java.lang.Exception -> L66
            r4.<init>(r5)     // Catch: java.lang.Exception -> L66
            r3.<init>(r4)     // Catch: java.lang.Exception -> L66
            r4 = 1000(0x3e8, float:1.401E-42)
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> L66
        L22:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Exception -> L66
            if (r3 == 0) goto L66
            int r4 = r3.length()     // Catch: java.lang.Exception -> L66
            int r5 = r0.length()     // Catch: java.lang.Exception -> L66
            if (r4 <= r5) goto L22
            int r4 = r0.length()     // Catch: java.lang.Exception -> L66
            java.lang.String r4 = r3.substring(r1, r4)     // Catch: java.lang.Exception -> L66
            boolean r4 = r4.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L66
            if (r4 == 0) goto L22
            int r0 = r0.length()     // Catch: java.lang.Exception -> L66
            r2 = 1
            int r0 = r0 + r2
            java.lang.String r0 = r3.substring(r0)     // Catch: java.lang.Exception -> L66
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Exception -> L66
            java.lang.Integer r0 = java.lang.Integer.decode(r0)     // Catch: java.lang.Exception -> L66
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L66
            if (r0 <= 0) goto L66
            java.lang.String r0 = "5F251C5CBB224C4496245450"
            byte[] r0 = s6.f1.c(r0)     // Catch: java.lang.Exception -> L66
            java.lang.String r0 = s6.f1.b(r0)     // Catch: java.lang.Exception -> L66
            r6.x(r0)     // Catch: java.lang.Exception -> L66
            return r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c1.C():boolean");
    }

    public final boolean D() {
        return false;
    }

    public final boolean E() {
        if (!Debug.isDebuggerConnected()) {
            return false;
        }
        x(f1.a("5E372B6DAB36484681067E5B3F631931EB074E"));
        return true;
    }

    @Override // s6.j1
    public void a(Context context) {
        A(context);
    }

    @Override // s6.u, s6.j1
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    public final boolean z(Context context) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        x(f1.a("5E372E78B92F46428500545B3F4B1033F827444E7E1C376C"));
        return true;
    }
}
