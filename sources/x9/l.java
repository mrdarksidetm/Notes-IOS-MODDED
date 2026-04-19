package x9;

/* JADX INFO: loaded from: classes2.dex */
public class l extends Exception {
    @Deprecated
    protected l() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(str);
        w8.m.f(str, "Detail message must not be empty");
    }
}
