package qe;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f19092a = new h0("CONDITION_FALSE");

    public static final Object a() {
        return f19092a;
    }

    public static final s b(Object obj) {
        s sVar;
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var != null && (sVar = b0Var.f19046a) != null) {
            return sVar;
        }
        ae.r.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (s) obj;
    }
}
