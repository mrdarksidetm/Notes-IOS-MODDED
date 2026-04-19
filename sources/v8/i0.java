package v8;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z.a f22252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z.a f22253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f22254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22256e;

    public final Set a() {
        return this.f22252a.keySet();
    }

    public final void b(b bVar, t8.b bVar2, String str) {
        this.f22252a.put(bVar, bVar2);
        this.f22253b.put(bVar, str);
        this.f22255d--;
        if (!bVar2.B()) {
            this.f22256e = true;
        }
        if (this.f22255d == 0) {
            if (!this.f22256e) {
                this.f22254c.setResult(this.f22253b);
            } else {
                this.f22254c.setException(new com.google.android.gms.common.api.c(this.f22252a));
            }
        }
    }
}
