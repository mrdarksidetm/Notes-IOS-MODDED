package da;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c<?>> f9914a;

    public r(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f9914a = list;
    }
}
