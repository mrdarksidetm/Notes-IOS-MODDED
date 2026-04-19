package le;

/* JADX INFO: loaded from: classes2.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final qe.h0 f15068a = new qe.h0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qe.h0 f15069b = new qe.h0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final qe.h0 f15070c = new qe.h0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final qe.h0 f15071d = new qe.h0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final qe.h0 f15072e = new qe.h0("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i1 f15073f = new i1(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i1 f15074g = new i1(true);

    public static final Object g(Object obj) {
        return obj instanceof u1 ? new v1((u1) obj) : obj;
    }

    public static final Object h(Object obj) {
        u1 u1Var;
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        return (v1Var == null || (u1Var = v1Var.f15121a) == null) ? obj : u1Var;
    }
}
