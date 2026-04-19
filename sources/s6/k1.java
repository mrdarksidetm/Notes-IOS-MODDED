package s6;

import android.content.Context;
import s6.p1;

/* JADX INFO: loaded from: classes.dex */
public class k1 extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1 f20167d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20168a;

        static {
            int[] iArr = new int[p1.a.values().length];
            f20168a = iArr;
            try {
                iArr[p1.a.f20255a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20168a[p1.a.f20256b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20168a[p1.a.f20257c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20168a[p1.a.f20258d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public k1(Context context, w2 w2Var, u6.k kVar) {
        super(w2Var, kVar);
        this.f20167d = new p1(context);
    }

    @Override // s6.j1
    public void a(Context context) {
        d();
    }

    public void d() {
        p1.a aVarA = this.f20167d.a();
        int i10 = a.f20168a[aVarA.ordinal()];
        boolean z10 = false;
        if (i10 == 1 || i10 == 2) {
            z10 = true;
        } else if (i10 != 3 && i10 != 4) {
            f1.a("7C21167BBD2C5D44B4065244347F083BFA11");
            f1.b(f1.c("622A0A70B9264C5581101D4230610937A542"));
            aVarA.toString();
        }
        super.b(z10);
    }
}
