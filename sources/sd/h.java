package sd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends kotlin.coroutines.jvm.internal.a {
    public h(qd.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == qd.h.f19040a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // qd.d
    public qd.g getContext() {
        return qd.h.f19040a;
    }
}
