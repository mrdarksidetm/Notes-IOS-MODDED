package s6;

/* JADX INFO: loaded from: classes.dex */
public class z1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20422a;

    public z1(int i10, String str) {
        super(str);
        this.f20422a = i10;
    }

    public z1(int i10, String str, Throwable th) {
        super(str, th);
        this.f20422a = i10;
    }

    public int a() {
        return this.f20422a;
    }
}
