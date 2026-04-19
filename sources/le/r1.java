package le;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 {
    public static final j0 a(Executor executor) {
        j0 j0Var;
        c1 c1Var = executor instanceof c1 ? (c1) executor : null;
        return (c1Var == null || (j0Var = c1Var.f14991a) == null) ? new q1(executor) : j0Var;
    }

    public static final p1 b(ExecutorService executorService) {
        return new q1(executorService);
    }
}
