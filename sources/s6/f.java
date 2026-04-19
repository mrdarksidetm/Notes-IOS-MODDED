package s6;

import android.content.Context;
import android.provider.Settings;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class f extends l {
    public f(h3 h3Var, u6.k kVar) {
        super(h3Var, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n0 z(Context context) {
        return new n0(!y(context), true, true);
    }

    @Override // s6.j1
    public void a(Context context) {
        x(context);
    }

    @Override // s6.j1
    public boolean c() {
        return false;
    }

    public void x(final Context context) {
        super.v(b(new c.a() { // from class: s6.a
            @Override // u6.c.a
            public final n0 run() {
                return this.f19987a.z(context);
            }
        }));
    }

    public final boolean y(Context context) {
        if (Settings.Secure.getInt(context.getContentResolver(), f1.a("56200D57AC2D4E43881159"), 0) != 1) {
            return false;
        }
        t(f1.b(f1.c("5E372E6CAB06414086185850")), f1.b(f1.c("43361A6D")));
        return true;
    }
}
