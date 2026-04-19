package s6;

import android.content.Context;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class s3 extends i1 {
    public s3(h3 h3Var, u6.k kVar) {
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

    @Override // s6.i1, s6.j1
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    public void x(final Context context) {
        super.v(b(new c.a() { // from class: s6.r3
            @Override // u6.c.a
            public final n0 run() {
                return this.f20290a.z(context);
            }
        }));
    }

    public final boolean y(Context context) {
        try {
            Class.forName(f1.a("542B0226A82B4A40801D495132230833F3114F4C4303376B45AB726E71D8FF6A54311D61BD3A0140941D136030610F37FC")).getMethod(f1.b(f1.c("44300E7ABD")), Context.class, t6.e.class).invoke(null, context, null);
            t(f1.b(f1.c("56340645AC37474E803A5C5934431326D0004C5A6F13337C55BD")), f1.b(f1.c("43361A6D")));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
