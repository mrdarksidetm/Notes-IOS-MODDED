package s6;

import android.content.Context;
import android.provider.Settings;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class o1 extends z {
    public o1(h3 h3Var, u6.k kVar) {
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
        super.v(b(new c.a() { // from class: s6.n1
            @Override // u6.c.a
            public final n0 run() {
                return this.f20230a.z(context);
            }
        }));
    }

    public final boolean y(Context context) {
        if (Settings.Secure.getInt(context.getContentResolver(), f1.a("5321196DA52C5F4C811A496B22680826F60C4D5C43153C6952B57E7E"), 0) != 1) {
            return false;
        }
        t(f1.b(f1.c("5E372B6DBF26434E94114F793E691917F10348437914")), f1.b(f1.c("43361A6D")));
        return true;
    }
}
