package rf;

/* JADX INFO: loaded from: classes2.dex */
public class d extends wf.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wf.d[] f19476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19477b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19478c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19479d = false;

    public d(wf.d... dVarArr) {
        this.f19476a = dVarArr;
    }

    @Override // wf.f
    public wf.f a(int i10) {
        this.f19478c = i10;
        return this;
    }

    @Override // wf.f
    public wf.f b(int i10) {
        this.f19477b = i10;
        return this;
    }

    @Override // wf.f
    public wf.f e() {
        this.f19479d = true;
        return this;
    }

    public wf.d[] f() {
        return this.f19476a;
    }

    public int g() {
        return this.f19478c;
    }

    public int h() {
        return this.f19477b;
    }

    public boolean i() {
        return this.f19479d;
    }
}
