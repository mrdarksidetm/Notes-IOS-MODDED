package le;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class a3 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient a2 f14981a;

    public a3(String str) {
        this(str, null);
    }

    public a3(String str, a2 a2Var) {
        super(str);
        this.f14981a = a2Var;
    }
}
