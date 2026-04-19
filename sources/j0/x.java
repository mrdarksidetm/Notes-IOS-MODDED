package j0;

import t0.f3;
import t0.k1;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class x implements p3<ge.i> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f13782e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k1 f13785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13786d;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ge.i b(int i10, int i11, int i12) {
            int i13 = (i10 / i11) * i11;
            return ge.o.t(Math.max(i13 - i12, 0), i13 + i11 + i12);
        }
    }

    public x(int i10, int i11, int i12) {
        this.f13783a = i11;
        this.f13784b = i12;
        this.f13785c = f3.i(f13782e.b(i10, i11, i12), f3.q());
        this.f13786d = i10;
    }

    private void f(ge.i iVar) {
        this.f13785c.setValue(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t0.p3
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ge.i getValue() {
        return (ge.i) this.f13785c.getValue();
    }

    public final void i(int i10) {
        if (i10 != this.f13786d) {
            this.f13786d = i10;
            f(f13782e.b(i10, this.f13783a, this.f13784b));
        }
    }
}
