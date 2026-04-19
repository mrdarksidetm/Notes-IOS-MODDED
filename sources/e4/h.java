package e4;

import androidx.datastore.preferences.protobuf.n0;
import androidx.datastore.preferences.protobuf.z;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f10537a;

    public h(n0 n0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f10537a = null;
    }

    public z a() {
        return new z(getMessage());
    }
}
