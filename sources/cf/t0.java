package cf;

import java.lang.annotation.Annotation;
import ye.j;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 {
    public static final void b(ye.j jVar) {
        ae.r.f(jVar, "kind");
        if (jVar instanceof j.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (jVar instanceof ye.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (jVar instanceof ye.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final String c(ye.f fVar, bf.a aVar) {
        ae.r.f(fVar, "<this>");
        ae.r.f(aVar, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof bf.e) {
                return ((bf.e) annotation).discriminator();
            }
        }
        return aVar.f().c();
    }

    public static final <T> T d(bf.g gVar, we.a<? extends T> aVar) {
        bf.w wVarO;
        ae.r.f(gVar, "<this>");
        ae.r.f(aVar, "deserializer");
        if (!(aVar instanceof af.b) || gVar.b().f().l()) {
            return aVar.deserialize(gVar);
        }
        String strC = c(aVar.getDescriptor(), gVar.b());
        bf.h hVarP = gVar.p();
        ye.f descriptor = aVar.getDescriptor();
        if (hVarP instanceof bf.u) {
            bf.u uVar = (bf.u) hVarP;
            bf.h hVar = (bf.h) uVar.get(strC);
            String strA = (hVar == null || (wVarO = bf.i.o(hVar)) == null) ? null : wVarO.a();
            we.a<T> aVarC = ((af.b) aVar).c(gVar, strA);
            if (aVarC != null) {
                return (T) a1.b(gVar.b(), strC, uVar, aVarC);
            }
            e(strA, uVar);
            throw new md.i();
        }
        throw e0.e(-1, "Expected " + ae.i0.b(bf.u.class) + " as the serialized body of " + descriptor.a() + ", but had " + ae.i0.b(hVarP.getClass()));
    }

    public static final Void e(String str, bf.u uVar) {
        String str2;
        ae.r.f(uVar, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw e0.f(-1, "Polymorphic serializer was not found for " + str2, uVar.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(we.h<?> hVar, we.h<Object> hVar2, String str) {
        if ((hVar instanceof we.e) && af.i0.a(hVar2.getDescriptor()).contains(str)) {
            String strA = hVar.getDescriptor().a();
            throw new IllegalStateException(("Sealed class '" + hVar2.getDescriptor().a() + "' cannot be serialized as base class '" + strA + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
