package af;

import ze.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements we.b<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T b(ze.c cVar) {
        return (T) c.a.c(cVar, getDescriptor(), 1, we.d.a(this, cVar, cVar.m(getDescriptor(), 0)), null, 8, null);
    }

    public we.a<T> c(ze.c cVar, String str) {
        ae.r.f(cVar, "decoder");
        return cVar.a().d(e(), str);
    }

    public we.h<T> d(ze.f fVar, T t10) {
        ae.r.f(fVar, "encoder");
        ae.r.f(t10, "value");
        return fVar.a().e(e(), t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we.a
    public final T deserialize(ze.e eVar) {
        T t10;
        ae.r.f(eVar, "decoder");
        ye.f descriptor = getDescriptor();
        ze.c cVarC = eVar.c(descriptor);
        ae.h0 h0Var = new ae.h0();
        if (cVarC.x()) {
            t10 = (T) b(cVarC);
        } else {
            t10 = null;
            while (true) {
                int iZ = cVarC.z(getDescriptor());
                if (iZ != -1) {
                    if (iZ == 0) {
                        h0Var.f712a = (T) cVarC.m(getDescriptor(), iZ);
                    } else {
                        if (iZ != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) h0Var.f712a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(iZ);
                            throw new we.g(sb2.toString());
                        }
                        T t11 = h0Var.f712a;
                        if (t11 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                        h0Var.f712a = t11;
                        t10 = (T) c.a.c(cVarC, getDescriptor(), iZ, we.d.a(this, cVarC, (String) t11), null, 8, null);
                    }
                } else {
                    if (t10 == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) h0Var.f712a)).toString());
                    }
                    ae.r.d(t10, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                }
            }
        }
        cVarC.d(descriptor);
        return t10;
    }

    public abstract he.c<T> e();

    @Override // we.h
    public final void serialize(ze.f fVar, T t10) {
        ae.r.f(fVar, "encoder");
        ae.r.f(t10, "value");
        we.h<? super T> hVarB = we.d.b(this, fVar, t10);
        ye.f descriptor = getDescriptor();
        ze.d dVarC = fVar.c(descriptor);
        dVarC.w(getDescriptor(), 0, hVarB.getDescriptor().a());
        ye.f descriptor2 = getDescriptor();
        ae.r.d(hVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarC.E(descriptor2, 1, hVarB, t10);
        dVarC.d(descriptor);
    }
}
